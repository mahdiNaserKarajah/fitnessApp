package com.example.fitness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;

public class MainActivity3 extends AppCompatActivity {
private Button btnDiet,btnTraining,btnInfo;
private TextView BMI;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
btnDiet=findViewById(R.id.btnDiet);
btnTraining=findViewById(R.id.btnTraining);
       BMI=findViewById(R.id.BMI);
      btnInfo=findViewById(R.id.btnInfo);
        Intent intent=getIntent();
       String msg=intent.getStringExtra("data");
        String bmi= intent.getStringExtra("bmi");
        Toast.makeText(this,"Welcome "+msg+" To Fitness App",Toast.LENGTH_LONG).show();
BMI.setText(bmi);

    }

    public void btnDiet(View view) {
        Intent intent2=new Intent(this,DietActivity4.class);
        startActivity(intent2);
    }

    public void btnTraining(View view) {

        Intent intent3=new Intent(this,TrainingActivity4.class);
        startActivity(intent3);
    }

    public void btnInfo(View view) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        Gson gson = new Gson();
        String str = prefs.getString("userData", "");
        UserData User = gson.fromJson(str, UserData.class);

        Toast.makeText(this, User.toString()
                , Toast.LENGTH_SHORT).show();

    }
}