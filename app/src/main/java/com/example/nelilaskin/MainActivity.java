package com.example.nelilaskin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText inputOne;
    private EditText inputTwo;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputOne = findViewById(R.id.numberOne);
        inputTwo = findViewById(R.id.numberTwo);
        result = findViewById(R.id.output);
    }

    public void addition(View view) {
        int first = Integer.parseInt(inputOne.getText().toString());
        int second = Integer.parseInt(inputTwo.getText().toString());
        int addition = first + second;
        result.setText(Integer.toString(addition));
    }

    public void subtraction(View view) {
        int first = Integer.parseInt(inputOne.getText().toString());
        int second = Integer.parseInt(inputTwo.getText().toString());
        int subtraction = first - second;
        result.setText(Integer.toString(subtraction));
    }

    public void multiplication(View view) {
        int first = Integer.parseInt(inputOne.getText().toString());
        int second = Integer.parseInt(inputTwo.getText().toString());
        int multiplication = first * second;
        result.setText(Integer.toString(multiplication));
    }

    public void division(View view) {
        int first = Integer.parseInt(inputOne.getText().toString());
        int second = Integer.parseInt(inputTwo.getText().toString());
        int division = first / second;
        result.setText(Integer.toString(division));
    }
}