package com.example.user.colormatch;

import android.content.ClipData;
import android.content.ClipData.Item;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Collect extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {


    private static final int LIST_COLOR = 1;
    private ColorArrayAdapter adapter = null;
    private Handler handler = new Handler() {
        public void handleMessage(Message msg) {
            switch (msg.what) {
                case LIST_COLOR: {
                    List<color> colors = (List<color>)msg.obj;
                    refreshColorList(colors);
                    break;
                }
            }
        }
    };


    private void refreshColorList(List<color> colors) {
        adapter.clear();
        adapter.addAll(colors);

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collect);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /*FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


        ListView lv = (ListView)findViewById(R.id.lv_collect);

        adapter = new ColorArrayAdapter(this, new ArrayList<color>());
        lv.setAdapter(adapter);

        getColorFromFirebase();


    }

    class FirebaseThread extends Thread {

        private DataSnapshot dataSnapshot;

        public FirebaseThread(DataSnapshot dataSnapshot) {

            this.dataSnapshot = dataSnapshot;
        }

        @Override
        public void run() {
            List<color> lsColor = new ArrayList<>();
            for (DataSnapshot ds : dataSnapshot.getChildren()) {
                DataSnapshot dsName = ds.child("name");
                DataSnapshot dsCode1 = ds.child("c1");
                DataSnapshot dsCode2 = ds.child("c2");
                DataSnapshot dsCode3 = ds.child("c3");
                DataSnapshot dsCode4 = ds.child("c4");
                DataSnapshot dsCode5 = ds.child("c5");

                String Name = (String)dsName.getValue();
                String code1 = (String)dsCode1.getValue();
                String code2 = (String)dsCode2.getValue();
                String code3 = (String)dsCode3.getValue();
                String code4 = (String)dsCode4.getValue();
                String code5 = (String)dsCode5.getValue();



                color aColor = new color();
                aColor.setName(Name);
                aColor.setCode1(code1);
                aColor.setCode2(code1);
                aColor.setCode3(code1);
                aColor.setCode4(code1);
                aColor.setCode5(code1);
                lsColor.add(aColor);
                //Log.v("hotel", Name + ";" + address);

            }
            Message msg = new Message();
            msg.what = LIST_COLOR;
            msg.obj = lsColor;
            handler.sendMessage(msg);
        }
    }

    private void getColorFromFirebase() {
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("");
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                new FirebaseThread(dataSnapshot).start();
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                //Log.v("color", databaseError.getMessage());
            }
        });
    }


    class ColorArrayAdapter extends ArrayAdapter<color> {
        Context context;

        public ColorArrayAdapter(Context context, List<color> items) {
            super(context, 0, items);
            this.context = context;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater inflater = LayoutInflater.from(context);
            LinearLayout itemlayout = null;
            if (convertView == null) {
                itemlayout = (LinearLayout) inflater.inflate(R.layout.listitem, null);
            } else {
                itemlayout = (LinearLayout) convertView;
            }
            color item = (color) getItem(position);
            TextView tvName = (TextView) itemlayout.findViewById(R.id.tv_name);
            tvName.setText(item.getName());
            TextView tvCode1 = (TextView) itemlayout.findViewById(R.id.tv_code1);
            tvCode1.setText(item.getCode1());
            TextView tvCode2 = (TextView) itemlayout.findViewById(R.id.tv_code2);
            tvCode2.setText(item.getCode2());
            TextView tvCode3 = (TextView) itemlayout.findViewById(R.id.tv_code3);
            tvCode3.setText(item.getCode3());
            TextView tvCode4 = (TextView) itemlayout.findViewById(R.id.tv_code4);
            tvCode4.setText(item.getCode4());
            TextView tvCode5 = (TextView) itemlayout.findViewById(R.id.tv_code5);
            tvCode5.setText(item.getCode5());
            return itemlayout;
        }
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.collect, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Intent intent = new Intent();
            intent.setClass(Collect.this, app_home.class);
            startActivity(intent);
            /* 關閉當前的Activity */
            Collect.this.finish();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.favorite) {
            Intent intent = new Intent();
            intent.setClass(Collect.this, Collect.class);
            startActivity(intent);
            Collect.this.finish();
            // Handle the camera action
        } else if (id == R.id.add) {
            Intent intent = new Intent();
            intent.setClass(Collect.this, add.class);
            startActivity(intent);
            Collect.this.finish();
        } else if (id==R.id.about){
            AlertDialog.Builder ad = new AlertDialog.Builder(this);
            ad.setTitle("關於卡樂");
            ad.setMessage("Author:\n" +  " 李香蘭\n" + " 張天音\n " + "蔣亞恬\n");

            DialogInterface.OnClickListener listener = new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                }
            };
            ad.setPositiveButton("OK",listener);
            ad.show();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}