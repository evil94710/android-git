package com.example.user.colormatch;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class app_home extends AppCompatActivity {
    Button logobutton;
    Button pptbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_home);
        //設定隱藏標題
        getSupportActionBar().hide();
        //設定隱藏狀態
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_FULLSCREEN);
        logobutton = (Button)findViewById(R.id.logobutton);
        logobutton.setOnClickListener(logobutton);
        pptbutton = (Button)findViewById(R.id.pptbutton);
        pptbutton.setOnClickListener(pptbutton);
    }

    private View.OnClickListener logo = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent();
            intent.setClass(app_home.this,Logo.class);
            startActivity(intent);
        }
    };

}
