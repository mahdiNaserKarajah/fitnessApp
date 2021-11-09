package com.example.fitness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





        Thread thread=new Thread(){
            @Override
            public void run(){
                try {
                    sleep(2000);
                    Intent russplash=new Intent(getApplicationContext(),MainActivity2.class);
                    startActivities(new Intent[]{russplash});
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }}};
        thread.start();

    }


}