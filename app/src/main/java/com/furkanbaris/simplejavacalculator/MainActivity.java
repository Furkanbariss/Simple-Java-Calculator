package com.furkanbaris.simplejavacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
        EditText enterText1;
        EditText enterText2;
        TextView resultText;
        TextView date_Text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        enterText1=findViewById(R.id.editTextText);
        enterText2=findViewById(R.id.editTextText2);
        resultText=findViewById(R.id.textView);
    }
    public void sum (View view){
        if (enterText1.getText().toString().matches("") || enterText2.getText().toString().matches("")){
            resultText.setText("EROR=Enter Number!");
        }else{

        int number1=Integer.parseInt(enterText1.getText().toString());
        int number2=Integer.parseInt(enterText2.getText().toString());

        int result= number1 + number2;

        resultText.setText("RESULT="+result);}
    }

    public void min (View view){
        if (enterText1.getText().toString().matches("") || enterText2.getText().toString().matches("")){
            resultText.setText("Enter Number!");
        }else{

            int number1=Integer.parseInt(enterText1.getText().toString());
            int number2=Integer.parseInt(enterText2.getText().toString());

            int result= number1 - number2;

            resultText.setText("RESULT="+result);}

    }
    public void multiply (View view){
        if (enterText1.getText().toString().matches("") || enterText2.getText().toString().matches("")){
            resultText.setText("Enter Number!");
        }else{

            int number1=Integer.parseInt(enterText1.getText().toString());
            int number2=Integer.parseInt(enterText2.getText().toString());

            int result= number1 * number2;

            resultText.setText("RESULT="+result);}
    }
    public void divide (View view){
        if (enterText1.getText().toString().matches("") || enterText2.getText().toString().matches("")){
            resultText.setText("Enter Number!");
        }else{

            int number1=Integer.parseInt(enterText1.getText().toString());
            int number2=Integer.parseInt(enterText2.getText().toString());

            int result= number1 / number2;

            resultText.setText("RESULT="+result);}
    }
    public void dateButton(View view){
        String dateText="12/07/2023"; // ???????????????
    }
}