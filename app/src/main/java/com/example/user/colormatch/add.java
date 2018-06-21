package com.example.user.colormatch;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.pes.androidmaterialcolorpickerdialog.ColorPickerCallback;

public class add extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private ImageButton button1;
    private ImageButton button2;
    private ImageButton button3;
    private ImageButton button4;
    private ImageButton button5;
    private TextView R1;
    private TextView R2;
    private TextView R3;
    private TextView R4;
    private TextView R5;
    private TextView G1;
    private TextView G2;
    private TextView G3;
    private TextView G4;
    private TextView G5;
    private TextView B1;
    private TextView B2;
    private TextView B3;
    private TextView B4;
    private TextView B5;
    private TextView C1;
    private TextView C2;
    private TextView C3;
    private TextView C4;
    private TextView C5;
    private Button button;
    private String colorchange;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        final ColorPicker cp = new ColorPicker(add.this, 0, 0, 0, 0);
        button1 = (ImageButton) findViewById(R.id.ib1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cp.show();
                cp.enableAutoClose();
                cp.setCallback(new ColorPickerCallback() {
                    @Override
                    public void onColorChosen(int color) {
                        R1 = findViewById(R.id.r1);
                        G1 = findViewById(R.id.g1);
                        B1 = findViewById(R.id.b1);
                        C1 = findViewById(R.id.c1);
                        R1.setText("R : " + Integer.toString(Color.red(color)));
                        G1.setText("B : " + Integer.toString(Color.green(color)));
                        B1.setText("G : " + Integer.toString(Color.blue(color)));
                        C1.setText(String.format("#%06X", (0xFFFFFF & color)));

                        colorchange = String.format("#%06X", (0xFFFFFF & color));
                        ImageButton ib1 = findViewById(R.id.ib1);
                        ib1.setBackgroundColor(Color.parseColor(colorchange));
                    }
                });
            }
        });
        button2 = (ImageButton) findViewById(R.id.ib2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cp.show();
                cp.enableAutoClose();
                cp.setCallback(new ColorPickerCallback() {
                    @Override
                    public void onColorChosen(int color) {
                        R2 = findViewById(R.id.r2);
                        G2 = findViewById(R.id.g2);
                        B2 = findViewById(R.id.b2);
                        C2 = findViewById(R.id.c2);
                        R2.setText("R : " + Integer.toString(Color.red(color)));
                        G2.setText("B : " + Integer.toString(Color.green(color)));
                        B2.setText("G : " + Integer.toString(Color.blue(color)));
                        C2.setText(String.format("#%06X", (0xFFFFFF & color)));

                        colorchange = String.format("#%06X", (0xFFFFFF & color));
                        ImageButton ib2 = findViewById(R.id.ib2);
                        ib2.setBackgroundColor(Color.parseColor(colorchange));
                    }
                });
            }
        });
        button3 = (ImageButton) findViewById(R.id.ib3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cp.show();
                cp.enableAutoClose();
                cp.setCallback(new ColorPickerCallback() {
                    @Override
                    public void onColorChosen(int color) {
                        R3 = findViewById(R.id.r3);
                        G3 = findViewById(R.id.g3);
                        B3 = findViewById(R.id.b3);
                        C3 = findViewById(R.id.c3);
                        R3.setText("R : " + Integer.toString(Color.red(color)));
                        G3.setText("B : " + Integer.toString(Color.green(color)));
                        B3.setText("G : " + Integer.toString(Color.blue(color)));
                        C3.setText(String.format("#%06X", (0xFFFFFF & color)));

                        colorchange = String.format("#%06X", (0xFFFFFF & color));
                        ImageButton ib3 = findViewById(R.id.ib3);
                        ib3.setBackgroundColor(Color.parseColor(colorchange));
                    }
                });
            }
        });
        button4 = (ImageButton) findViewById(R.id.ib4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cp.show();
                cp.enableAutoClose();
                cp.setCallback(new ColorPickerCallback() {
                    @Override
                    public void onColorChosen(int color) {
                        R4 = findViewById(R.id.r4);
                        G4 = findViewById(R.id.g4);
                        B4 = findViewById(R.id.b4);
                        C4 = findViewById(R.id.c4);
                        R4.setText("R : " + Integer.toString(Color.red(color)));
                        G4.setText("B : " + Integer.toString(Color.green(color)));
                        B4.setText("G : " + Integer.toString(Color.blue(color)));
                        C4.setText(String.format("#%06X", (0xFFFFFF & color)));

                        colorchange = String.format("#%06X", (0xFFFFFF & color));
                        ImageButton ib4 = findViewById(R.id.ib4);
                        ib4.setBackgroundColor(Color.parseColor(colorchange));
                    }
                });
            }
        });
        button5 = (ImageButton) findViewById(R.id.ib5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cp.show();
                cp.enableAutoClose();
                cp.setCallback(new ColorPickerCallback() {
                    @Override
                    public void onColorChosen(int color) {
                        R5 = findViewById(R.id.r5);
                        G5 = findViewById(R.id.g5);
                        B5 = findViewById(R.id.b5);
                        C5 = findViewById(R.id.c5);
                        R5.setText("R : " + Integer.toString(Color.red(color)));
                        G5.setText("B : " + Integer.toString(Color.green(color)));
                        B5.setText("G : " + Integer.toString(Color.blue(color)));
                        C5.setText(String.format("#%06X", (0xFFFFFF & color)));

                        colorchange = String.format("#%06X", (0xFFFFFF & color));
                        ImageButton ib5 = findViewById(R.id.ib5);
                        ib5.setBackgroundColor(Color.parseColor(colorchange));
                    }
                });
            }
        });
        final EditText name = findViewById(R.id.name);
        final String Name = name.getText().toString();
        button = findViewById(R.id.add);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                final DatabaseReference myref = database.getReference("");
                myref.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        /*for(dataSnapshot : dataSnapshot.getChildren()){
                            DataSnapshot dsName = dataSnapshot.child("Name");
                            DataSnapshot dsR1 = dataSnapshot.child("R1");
                            DataSnapshot dsR2 = dataSnapshot.child("R2");
                            DataSnapshot dsR3 = dataSnapshot.child("R3");
                            DataSnapshot dsR4 = dataSnapshot.child("R4");
                            DataSnapshot dsR5 = dataSnapshot.child("R5");
                            DataSnapshot dsG1 = dataSnapshot.child("G1");
                            DataSnapshot dsG2 = dataSnapshot.child("G2");
                            DataSnapshot dsG3 = dataSnapshot.child("G3");
                            DataSnapshot dsG4 = dataSnapshot.child("G4");
                            DataSnapshot dsG5 = dataSnapshot.child("G5");
                            DataSnapshot dsB1 = dataSnapshot.child("B1");
                            DataSnapshot dsB2 = dataSnapshot.child("B2");
                            DataSnapshot dsB3 = dataSnapshot.child("B3");
                            DataSnapshot dsB4 = dataSnapshot.child("B4");
                            DataSnapshot dsB5 = dataSnapshot.child("B5");

                        }*/
                        String r1 = R1.getText().toString();
                        String r2 = R2.getText().toString();
                        String r3 = R3.getText().toString();
                        String r4 = R4.getText().toString();
                        String r5 = R5.getText().toString();
                        String g1 = G1.getText().toString();
                        String g2 = G2.getText().toString();
                        String g3 = G3.getText().toString();
                        String g4 = G4.getText().toString();
                        String g5 = G5.getText().toString();
                        String b1 = B1.getText().toString();
                        String b2 = B2.getText().toString();
                        String b3 = B3.getText().toString();
                        String b4 = B4.getText().toString();
                        String b5 = B5.getText().toString();
                        long n = dataSnapshot.getChildrenCount();
                        String num = String.valueOf(n);
                        /*DatabaseReference ref = myref.child(num);
                        colorData colorData = new colorData(Name,r1,r2,r3,r4,r5,g1,g2,g3,g4,g5,b1,b2,b3,b4,b5);
                        ref.setValue(colorData);*/
                        //Log.d("total",String.valueOf(n));
                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                });
            }
        });
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
        getMenuInflater().inflate(R.menu.add, menu);
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
            intent.setClass(add.this, app_home.class);
            startActivity(intent);
            /* 關閉當前的Activity */
            add.this.finish();
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
            intent.setClass(add.this, Collect.class);
            startActivity(intent);
            add.this.finish();
            // Handle the camera action
        }  else if (id == R.id.add) {
            Intent intent = new Intent();
            intent.setClass(add.this, add.class);
            startActivity(intent);
            add.this.finish();
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
