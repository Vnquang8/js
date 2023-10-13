package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    String a = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.textView);
    }

    public void Listener(View view) {
        String tag = view.getTag().toString();
        switch (tag){
            case "0":
                a += 0;
                tv.setText(a);
                break;
            case "1":
                a += 1;
                tv.setText(a);
                break;
            case "2":;
            case "3":;
            case "4":;
            case "5":;
            case "6":;
            case "7":;
            case "8":;
            case "9":;
            case "+":;
            case "-":;
            case "*":;
            case "/":;
            case ".":;
            case "M+":;
            case "M-":;
            case "Mc":;
            case "AC":;
        }
    }
}