package com.example.syed.allbasicapps;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Syed on 03-Mar-2015.
 */
public class Calculator extends Activity {
    EditText number1;
    EditText number2;
    TextView answer;
    Button plus;
    Button minus;
    Button multiply;
    Button divide;
    int a,b,c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator);

        number1=(EditText)findViewById(R.id.number1);
        number2=(EditText) findViewById(R.id.number2);
        answer=(TextView)findViewById(R.id.Answer);
        plus=(Button)findViewById(R.id.plus);
        minus=(Button)findViewById(R.id.minus);
        multiply=(Button)findViewById(R.id.multiply);
        divide=(Button)findViewById(R.id.divide);

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = Integer.parseInt(number1.getText().toString());
                b = Integer.parseInt(number2.getText().toString());
                c=a+b;
                answer.setText(Integer.toString(c));
            }
        });


        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = Integer.parseInt(number1.getText().toString());
                b = Integer.parseInt(number2.getText().toString());
                c=a-b;
                answer.setText(Integer.toString(c));
            }
        });


        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = Integer.parseInt(number1.getText().toString());
                b = Integer.parseInt(number2.getText().toString());
                c=a*b;
                answer.setText(Integer.toString(c));
            }
        });


        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = Integer.parseInt(number1.getText().toString());
                b = Integer.parseInt(number2.getText().toString());
                c=a/b;
                answer.setText(Integer.toString(c));
            }
        });
    }
}
