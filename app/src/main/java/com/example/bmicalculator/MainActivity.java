package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

   EditText height, weight;
   TextView display;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        height= findViewById(R.id.heightnum);
        weight= findViewById(R.id.weightnum);
        display= findViewById(R.id.result);
}

    public void btnfunction(View view) {

        float num1= Float.parseFloat(height.getText().toString());
        float num2 = Float.parseFloat(weight.getText().toString());

        float heightvalue = num1*num1;
        float total = num2 / heightvalue;

        display.setText("BMI Result: " + total);
    }
    }