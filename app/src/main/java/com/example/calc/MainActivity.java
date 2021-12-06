package com.example.calc;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       final TextView tvrez =findViewById(R.id.tv_rez);
       final EditText number1 =findViewById(R.id.number1);
       final EditText number2 =findViewById(R.id.number2);

        Button btn_add = findViewById(R.id.btn_add);
        Button btn_sub = findViewById(R.id.btn_sub);

        Button btn_mult = findViewById(R.id.btn_mult);
        Button btn_div = findViewById(R.id.btn_div);

        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(number1.getText().toString());
                int num2 = Integer.parseInt(number2.getText().toString());
                 int rez = num1 +num2 ;
                 tvrez.setText(String.valueOf(rez));

            }
        });
        btn_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(number1.getText().toString());
                int num2 = Integer.parseInt(number2.getText().toString());
                int rez = num1 -num2 ;
                tvrez.setText(String.valueOf(rez));

            }
        });
        btn_mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(number1.getText().toString());
                int num2 = Integer.parseInt(number2.getText().toString());
                int rez = num1 *num2 ;
                tvrez.setText(String.valueOf(rez));


            }
        });

        btn_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(number1.getText().toString());
                int num2 = Integer.parseInt(number2.getText().toString());
                int rez = num1 /num2 ;
                tvrez.setText(String.valueOf(rez));


            }
        });

    }

}


