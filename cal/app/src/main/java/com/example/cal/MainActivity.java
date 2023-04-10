package com.example.cal;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    int n0=0, n1=0, n2=0, n3=0, n4=0, n5=0, n6=0, n7=0, n8=0, n9=0, ans;
    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnAdd, btnMulti, btnSub, btnDivide, btmPoint, btnPercentage, btnAc, btnClear;
    TextView txtAns;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button_0t09();

    }

    private void Button_0t09() {

        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnAdd = findViewById(R.id.btnAdd);
        btnSub = findViewById(R.id.btnSub);
        btnMulti = findViewById(R.id.btnMulti);
        btnDivide = findViewById(R.id.btnDivide);
        btnPercentage = findViewById(R.id.btnPercentage);
        btmPoint = findViewById(R.id.btnPoint);
        btnAc = findViewById(R.id.btnAc);
        btnClear = findViewById(R.id.btnClear);
        txtAns = findViewById(R.id.txtAns);

        number();

    }

    private void number() {

        btn0.setOnClickListener(v0 -> {
            n0 = 0;
        });
        btn1.setOnClickListener(v1 -> {
            n1 = 1;
        });
        btn2.setOnClickListener(v2 -> {
            n2 = 2;
        });
        btn3.setOnClickListener(v3 -> {
            n3 = 3;
        });
        btn4.setOnClickListener(v4 -> {
            n4 = 4;
        });
        btn5.setOnClickListener(v5 -> {
            n5 = 5;
        });
        btn6.setOnClickListener(v6 -> {
            n6 = 6;
        });
        btn7.setOnClickListener(v7 -> {
            n7 = 7;
        });
        btn8.setOnClickListener(v8 -> {
            n8 = 8;
        });
        btn9.setOnClickListener(V9 -> {
            n9 = 9;
        });


        Addition();
        Clear();


    }


    private void Addition() {

        btnAdd.setOnClickListener(d -> {
            ans = n0+n1+n2+n3+n4+n5+n6+n7+n8+n9;
            txtAns.setText(ans + "");

        });
    }

    private void Clear() {

        btnClear.setOnClickListener(C -> {
            n0=0;
            n1=0;
            n2=0;
            n3=0;
            n4=0;
            n5=0;
            n6=0;
            n7=0;
            n8=0;
            n9=0;

            txtAns.setText("");
        });
    }

}
