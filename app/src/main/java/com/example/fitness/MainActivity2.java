package com.example.fitness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;

public class MainActivity2 extends AppCompatActivity {
        private EditText Name ,Age ,Weight , Height;
    private Button btnEnter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Name=findViewById(R.id.Name);
        Age=findViewById(R.id.Age);
        Weight=findViewById(R.id.Weight);
    btnEnter=findViewById(R.id.btnEnter);
   Height=findViewById(R.id.Height);

    }

    public void btnEnterData(View view) {
       if(Name.getText().toString().isEmpty()||Age.getText().toString().isEmpty()||Weight.getText().toString().isEmpty()){
           Toast.makeText(this, "Please fill in all the data !!!", Toast.LENGTH_SHORT).show();
       }
       else{


        String name=Name.getText().toString();
        String age=Age.getText().toString();
        String weight =Weight.getText().toString();
        String height=Height.getText().toString();
           UserData user =new UserData(name,Integer.parseInt(age),Integer.parseInt(weight),Integer.parseInt(height));
        SharedPreferences prefs= PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor=prefs.edit();
        Gson gson=new Gson();
        String UsersDaata=gson.toJson(user);
        editor.putString("userData",UsersDaata);
        editor.commit();
        Intent intent=new Intent(this , MainActivity3.class);
        intent.putExtra("data" ,user.getName());
        double BMI =(user.getWeight()*100*100)/(user.getHeight()*user.getHeight());
       String BMICategory="";
           if(BMI < 18.5) {
               BMICategory= " "+  user.getName() +" your BMI is :"+BMI+ " You are underweight";
           }else if (BMI < 25) {
               BMICategory=" " + user.getName() +" your BMI is :"+BMI+" You are normal";
           }else if (BMI < 30) {
               BMICategory= " "+user.getName() +" your BMI is :"+BMI+" You are overweight";
           }else {
               BMICategory=" "+ user.getName() +" your BMI is :"+ BMI+" You are obese";
           }

           intent.putExtra("bmi", BMICategory);
           startActivity(intent);

    }
    }
}