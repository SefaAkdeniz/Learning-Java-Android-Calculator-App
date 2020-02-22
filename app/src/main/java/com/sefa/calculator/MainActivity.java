package com.sefa.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText number1;
    EditText number2;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number1=findViewById(R.id.number1);
        number2=findViewById(R.id.number2);
        result=findViewById(R.id.result);
    }

    public void plus(View view){

        if (number1.getText().toString().matches("")|| number2.getText().toString().matches("")){
            result.setText("Enter Number!");
        }
        else{
            int n1 = Integer.parseInt(number1.getText().toString());
            int n2 = Integer.parseInt(number2.getText().toString());
            int finaly = n1 + n2;
            result.setText("Result : " + finaly);
        }
    }

    public void minus(View view){

        if (number1.getText().toString().matches("")|| number2.getText().toString().matches("")){
            result.setText("Enter Number!");
        }
        else{
            int n1 = Integer.parseInt(number1.getText().toString());
            int n2 = Integer.parseInt(number2.getText().toString());
            int finaly = n1 - n2;
            result.setText("Result : " + finaly);
        }
    }

    public void times(View view){

        if (number1.getText().toString().matches("")|| number2.getText().toString().matches("")){
            result.setText("Enter Number!");
        }
        else{
            int n1 = Integer.parseInt(number1.getText().toString());
            int n2 = Integer.parseInt(number2.getText().toString());
            int finaly = n1 * n2;
            result.setText("Result : " + finaly);
        }
    }

    public void divided(View view){

        if (number1.getText().toString().matches("")|| number2.getText().toString().matches("")){
            result.setText("Enter Number!");
        }
        else{
            int n1 = Integer.parseInt(number1.getText().toString());
            int n2 = Integer.parseInt(number2.getText().toString());
            int finaly = n1 / n2;
            result.setText("Result : " + finaly);
        }
    }
}
