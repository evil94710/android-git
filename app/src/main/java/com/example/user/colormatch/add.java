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
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.pes.androidmaterialcolorpickerdialog.ColorPickerCallback;

public class add extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private ImageButton button1;
    private ImageButton button2;
    private ImageButton button3;
    private ImageButton button4;
    private ImageButton button5;
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
                        TextView red = findViewById(R.id.r1);
                        TextView green = findViewById(R.id.g1);
                        TextView blue = findViewById(R.id.b1);
                        TextView colorcode = findViewById(R.id.c1);
                        red.setText("R : " + Integer.toString(Color.red(color)));
                        blue.setText("G : " + Integer.toString(Color.blue(color)));
                        green.setText("B : " + Integer.toString(Color.green(color)));
                        colorcode.setText(String.format("#%06X", (0xFFFFFF & color)));

                        colorchange = String.format("#%06X", (0xFFFFFF & color));
                        ImageButton ib1 = findViewById(R.id.ib1);
                        ib1.setBackgroundColor(Color.parseColor(colorchange));

                        /*String red = Integer.toString(Color.red(color));
                        String blue = Integer.toString(Color.blue(color));
                        String green = Integer.toString(Color.green(color));
                        Log.d("Alpha", Integer.toString(Color.alpha(color)));
                        Log.d("Red", red);
                        Log.d("Blue", green);
                        Log.d("Green", blue);

                        Log.d("Pure Hex", Integer.toHexString(color));
                        Log.d("#Hex no alpha", String.format("#%06X", (0xFFFFFF & color)));
                        Log.d("#Hex with alpha", String.format("#%08X", (0xFFFFFFFF & color)));*/
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
                        TextView red = findViewById(R.id.r2);
                        TextView green = findViewById(R.id.g2);
                        TextView blue = findViewById(R.id.b2);
                        TextView colorcode = findViewById(R.id.c2);
                        red.setText("R : " + Integer.toString(Color.red(color)));
                        blue.setText("G : " + Integer.toString(Color.blue(color)));
                        green.setText("B : " + Integer.toString(Color.green(color)));
                        colorcode.setText(String.format("#%06X", (0xFFFFFF & color)));

                        colorchange = String.format("#%06X", (0xFFFFFF & color));
                        ImageButton ib2 = findViewById(R.id.ib2);
                        ib2.setBackgroundColor(Color.parseColor(colorchange));
                        /*String red = Integer.toString(Color.red(color));
                        String blue = Integer.toString(Color.blue(color));
                        String green = Integer.toString(Color.green(color));
                        Log.d("Alpha", Integer.toString(Color.alpha(color)));
                        Log.d("Red", red);
                        Log.d("Blue", green);
                        Log.d("Green", blue);

                        Log.d("Pure Hex", Integer.toHexString(color));
                        Log.d("#Hex no alpha", String.format("#%06X", (0xFFFFFF & color)));
                        Log.d("#Hex with alpha", String.format("#%08X", (0xFFFFFFFF & color)));*/
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
                        TextView red = findViewById(R.id.r3);
                        TextView green = findViewById(R.id.g3);
                        TextView blue = findViewById(R.id.b3);
                        TextView colorcode = findViewById(R.id.c3);
                        red.setText("R : " + Integer.toString(Color.red(color)));
                        blue.setText("G : " + Integer.toString(Color.blue(color)));
                        green.setText("B : " + Integer.toString(Color.green(color)));
                        colorcode.setText(String.format("#%06X", (0xFFFFFF & color)));

                        colorchange = String.format("#%06X", (0xFFFFFF & color));
                        ImageButton ib3 = findViewById(R.id.ib3);
                        ib3.setBackgroundColor(Color.parseColor(colorchange));
                        /*String red = Integer.toString(Color.red(color));
                        String blue = Integer.toString(Color.blue(color));
                        String green = Integer.toString(Color.green(color));
                        Log.d("Alpha", Integer.toString(Color.alpha(color)));
                        Log.d("Red", red);
                        Log.d("Blue", green);
                        Log.d("Green", blue);

                        Log.d("Pure Hex", Integer.toHexString(color));
                        Log.d("#Hex no alpha", String.format("#%06X", (0xFFFFFF & color)));
                        Log.d("#Hex with alpha", String.format("#%08X", (0xFFFFFFFF & color)));*/
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
                        TextView red = findViewById(R.id.r4);
                        TextView green = findViewById(R.id.g4);
                        TextView blue = findViewById(R.id.b4);
                        TextView colorcode = findViewById(R.id.c4);
                        red.setText("R : " + Integer.toString(Color.red(color)));
                        blue.setText("G : " + Integer.toString(Color.blue(color)));
                        green.setText("B : " + Integer.toString(Color.green(color)));
                        colorcode.setText(String.format("#%06X", (0xFFFFFF & color)));

                        colorchange = String.format("#%06X", (0xFFFFFF & color));
                        ImageButton ib4 = findViewById(R.id.ib4);
                        ib4.setBackgroundColor(Color.parseColor(colorchange));
                        /*String red = Integer.toString(Color.red(color));
                        String blue = Integer.toString(Color.blue(color));
                        String green = Integer.toString(Color.green(color));
                        Log.d("Alpha", Integer.toString(Color.alpha(color)));
                        Log.d("Red", red);
                        Log.d("Blue", green);
                        Log.d("Green", blue);

                        Log.d("Pure Hex", Integer.toHexString(color));
                        Log.d("#Hex no alpha", String.format("#%06X", (0xFFFFFF & color)));
                        Log.d("#Hex with alpha", String.format("#%08X", (0xFFFFFFFF & color)));*/
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
                        TextView red = findViewById(R.id.r5);
                        TextView green = findViewById(R.id.g5);
                        TextView blue = findViewById(R.id.b5);
                        TextView colorcode = findViewById(R.id.c5);
                        red.setText("R : " + Integer.toString(Color.red(color)));
                        blue.setText("G : " + Integer.toString(Color.blue(color)));
                        green.setText("B : " + Integer.toString(Color.green(color)));
                        colorcode.setText(String.format("#%06X", (0xFFFFFF & color)));

                        colorchange = String.format("#%06X", (0xFFFFFF & color));
                        ImageButton ib5 = findViewById(R.id.ib5);
                        ib5.setBackgroundColor(Color.parseColor(colorchange));
                        /*String red = Integer.toString(Color.red(color));
                        String blue = Integer.toString(Color.blue(color));
                        String green = Integer.toString(Color.green(color));
                        Log.d("Alpha", Integer.toString(Color.alpha(color)));
                        Log.d("Red", red);
                        Log.d("Blue", green);
                        Log.d("Green", blue);

                        Log.d("Pure Hex", Integer.toHexString(color));
                        Log.d("#Hex no alpha", String.format("#%06X", (0xFFFFFF & color)));
                        Log.d("#Hex with alpha", String.format("#%08X", (0xFFFFFFFF & color)));*/
                    }
                });
            }
        });
        button = findViewById(R.id.add);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
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
