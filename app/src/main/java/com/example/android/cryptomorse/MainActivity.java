package com.example.android.cryptomorse;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Thread splash = new Thread() {
            public void run() {
                try {
                    //set sleep time
                    sleep(3 * 1000);
                    Intent i = new Intent(getBaseContext(), HomePage.class);
                    startActivity(i);
                    finish();
                } catch (Exception e) {
                }

            }


        };
        splash.start();
    }


}
