package com.example.fitness;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import android.widget.Spinner;
import android.widget.TextView;

import com.example.fitness.model.Training;


public class TrainingActivity4 extends AppCompatActivity {
private Spinner GetDaySpinner;
private TextView Exercises;
  // private ListView Exercises;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_training4);
    GetDaySpinner=findViewById(R.id.getDay);
     Exercises=findViewById(R.id.Exercises);

        populateSpinner();

    }

    private void populateSpinner() {
        Training[] training=new Training[30];
        training[0]=new Training(1,60,"push up ,burpees exercise");
        training[1]=new Training(2,55,"push up 3 times");
        training[2]=new Training(3,70,"push up ,15 minute of run,BOSU Ball Planks ");
        training[3]=new Training(4,50,"BOSU Ball Planks ");
        training[4]=new Training(5,60,"push up ");
        training[5]=new Training(6,40,"push up ");
        training[6]=new Training(7,60,"push up ");
        training[7]=new Training(8,90,"push up ,burpees exercise,BOSU Ball Planks");
        training[8]=new Training(9,30,"push up ");
        training[9]=new Training(10,60,"burpees exercise,BOSU Ball Planks ");
        training[10]=new Training(11,60,"burpees exercise ");
        training[11]=new Training(12,60,"push up ,BOSU Ball Planks");
        training[12]=new Training(13,60,"push up ,burpees exercise");
        training[13]=new Training(14,60,"push up ");
        training[14]=new Training(15,60,"Running On an Incline  ");
        training[15]=new Training(16,60,"push up ,burpees exercise");
        training[16]=new Training(17,60,"burpees exercise,,BOSU Ball Planks ");
        training[17]=new Training(18,40,"push up,BOSU Ball Planks ");
        training[18]=new Training(19,90,"push up ");
        training[19]=new Training(20,30,"push up ");
        training[20]=new Training(21,60,"push up ");
        training[21]=new Training(22,80,"push up,BOSU Ball Planks ");
        training[22]=new Training(23,50,"burpees exercise ");
        training[23]=new Training(24,60,"push up ");
        training[24]=new Training(25,40,"Running On an Incline ");
        training[25]=new Training(26,70,"burpees exercise ");
        training[26]=new Training(27,90,"Running On an Incline ");
        training[27]=new Training(28,100,"push up ");
        training[28]=new Training(29,40,"burpees exercise");
        training[29]=new Training(30,50,"push up ");
       // SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        //SharedPreferences.Editor editor = prefs.edit();
       // Gson gson = new Gson();
        //String trainingData = gson.toJson(training);

       // editor.putString("123", trainingData);
        String[] days={"1","2","3","4","5","6","7","8","9","10",
                "11","12","13","14","15","16","17","18","19","20",
                "21","22","23","24","25","26","27","28","29","30"};
        ArrayAdapter<String> adapter=new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item,days);
        GetDaySpinner.setAdapter(adapter);

        GetDaySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                Exercises.setText(training[position].toString());
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

}