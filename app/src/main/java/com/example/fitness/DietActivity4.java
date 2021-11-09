package com.example.fitness;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.fitness.model.Diet;

import java.util.ArrayList;

public class DietActivity4 extends AppCompatActivity {
//private Spinner getDiet;
private ListView DietList1;
private TextView textView1;

    private ListView DietList2;
    private TextView textView2;

    private ListView DietList3;
    private TextView textView3;

    private ListView DietList4;
    private TextView textView4;

    private ListView DietList5;
    private TextView textView5;

    private ListView DietList6;
    private TextView textView6;

    private ListView DietList7;
    private TextView textView7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diet4);
   //getDiet=findViewById(R.id.getDiet);
  DietList1=findViewById(R.id.DietList1);
textView1=findViewById(R.id.textView1);

        DietList2=findViewById(R.id.DietList2);
        textView2=findViewById(R.id.textView2);

        DietList3=findViewById(R.id.DietList3);
        textView3=findViewById(R.id.textView3);

        DietList4=findViewById(R.id.DietList4);
        textView4=findViewById(R.id.textView4);

        DietList5=findViewById(R.id.DietList5);
        textView5=findViewById(R.id.textView5);

        DietList6=findViewById(R.id.DietList6);
        textView6=findViewById(R.id.textView6);


        DietList7=findViewById(R.id.DietList7);
        textView7=findViewById(R.id.textView7);


 // populateSpinner();
   populateListView();
    }
    private void populateSpinner() {

        String[] cats={
        };
        ArrayAdapter<String> adapter=new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item,cats);
        //getDiet.setAdapter(adapter);
    }
    private void populateListView(){
        Diet diet[] =new Diet[7];
       ArrayList<String> details1 =new ArrayList<>();
       details1.add("two egg in first meals");
       details1.add("in second meal bowl of rice and juice");
       details1.add("piece of chicken");

        ArrayList<String> details2 =new ArrayList<>();
        details2.add("two egg in first meals");
        details2.add("in second meal bowl of rice and juice");
        details2.add("piece of chicken");

        ArrayList<String> details3 =new ArrayList<>();
        details3.add("two egg in first meals");
        details3.add("in second meal bowl of rice and juice");
        details3.add("piece of chicken");

        ArrayList<String> details4 =new ArrayList<>();
        details4.add("two egg in first meals");
        details4.add("in second meal bowl of rice and juice");
        details4.add("piece of chicken");

        ArrayList<String> details5 =new ArrayList<>();
        details5.add("two egg in first meals");
        details5.add("in second meal bowl of rice and juice");
        details5.add("piece of chicken");

        ArrayList<String> details6 =new ArrayList<>();
        details6.add("two egg in first meals");
        details6.add("in second meal bowl of rice and juice");
        details6.add("piece of chicken");

        ArrayList<String> details7 =new ArrayList<>();
        details7.add("two egg in first meals");
        details7.add("in second meal bowl of rice and juice");
        details7.add("piece of chicken");
        diet[0]=new Diet("first",3,details1);
       diet[1]=new Diet("second",3,details2);
        diet[2]=new Diet("third",3,details3);
        diet[3]=new Diet("fourth",3,details4);
        diet[4]=new Diet("fifth",3,details5);
        diet[5]=new Diet("sixth",3,details6);
        diet[6]=new Diet("seventh",3,details7);
    //    ArrayList<Diet> diets =new ArrayList<>();

    //    diets.add(new Diet(1,3,"2 egg ,milk"));
    //    diets.add(new Diet(2,3,"banana ,botato"));String[] cats=diet[0].getDetails();
        ArrayAdapter<String> adapter1=new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item,diet[0].getDetails());
        DietList1.setAdapter(adapter1);
textView1.setText( diet[0].getDay() +"                    "+" Number Of Meals :"+ diet[0].getNumberOfMeals());

        ArrayAdapter<String> adapter2=new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item,diet[1].getDetails());
        DietList2.setAdapter(adapter2);
        textView2.setText( diet[1].getDay()+"                    " +" Number Of Meals :"+ diet[1].getNumberOfMeals());

        ArrayAdapter<String> adapter3=new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item,diet[2].getDetails());
        DietList3.setAdapter(adapter3);
        textView3.setText( diet[2].getDay()+"                    " +" Number Of Meals :"+ diet[2].getNumberOfMeals());

        ArrayAdapter<String> adapter4=new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item,diet[3].getDetails());
        DietList4.setAdapter(adapter4);
        textView4.setText( diet[3].getDay()+"                    " +" Number Of Meals :"+ diet[3].getNumberOfMeals());

        ArrayAdapter<String> adapter5=new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item,diet[4].getDetails());
        DietList5.setAdapter(adapter5);
        textView5.setText( diet[4].getDay()+"                    " +" Number Of Meals :"+ diet[4].getNumberOfMeals());

        ArrayAdapter<String> adapter6=new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item,diet[5].getDetails());
        DietList6.setAdapter(adapter6);
        textView6.setText( diet[5].getDay()+"                    " +" Number Of Meals :"+ diet[5].getNumberOfMeals());

        ArrayAdapter<String> adapter7=new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item,diet[6].getDetails());
        DietList7.setAdapter(adapter6);
        textView7.setText( diet[6].getDay()+"                    " +" Number Of Meals :"+ diet[6].getNumberOfMeals());
    }

}