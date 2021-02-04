package com.sociale.inconnu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Chat extends AppCompatActivity implements View.OnClickListener {
     private TextView T1;
    private TextView T2;
    private TextView T3;
    private TextView T4;
    private TextView T5;
    private TextView T6;
    private TextView T7;
    private TextView T8;
    private TextView T9;
    private TextView T10;
    private TextView T11;
    private TextView T12;
    private TextView T13;
    private TextView T14;
    private TextView T15;
    private TextView T16;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);
        T1 = findViewById(R.id.perso1);
        T2 = findViewById(R.id.perso2);
        T3 = findViewById(R.id.perso3);
        T4 = findViewById(R.id.perso4);
        T5 = findViewById(R.id.perso5);
        T6 = findViewById(R.id.perso6);
        T7 = findViewById(R.id.perso7);
        T8 = findViewById(R.id.perso8);
        T9 = findViewById(R.id.perso9);
        T10 = findViewById(R.id.perso10);
        T11 = findViewById(R.id.perso11);
        T12 = findViewById(R.id.perso12);
        T13 = findViewById(R.id.perso13);
        T14 = findViewById(R.id.perso14);
        T15 = findViewById(R.id.perso15);
        T16 = findViewById(R.id.perso16);

        T1.setOnClickListener(this);
        T2.setOnClickListener(this);
        T3.setOnClickListener(this);
        T4.setOnClickListener(this);
        T5.setOnClickListener(this);
        T6.setOnClickListener(this);
        T7.setOnClickListener(this);
        T8.setOnClickListener(this);
        T9.setOnClickListener(this);
        T10.setOnClickListener(this);
        T11.setOnClickListener(this);
        T12.setOnClickListener(this);
        T13.setOnClickListener(this);
        T14.setOnClickListener(this);
        T15.setOnClickListener(this);
        T16.setOnClickListener(this);


    }

    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case  R.id.perso1 :
                Intent P1 = new Intent();
                P1.setClass(Chat.this, Communication.class);
                startActivity(P1);
            case R.id.perso2 :
                Intent P2 = new Intent();
                P2.setClass(Chat.this,Communication.class);
                startActivity(P2);
            case R.id.perso3 :
                Intent P3 = new Intent();
                P3.setClass(Chat.this, Communication.class);
                startActivity(P3);
            case R.id.perso4 :
                Intent P4 = new Intent();
                P4.setClass(Chat.this, Communication.class);
                startActivity(P4);
            case R.id.perso5 :
                Intent P5 = new Intent();
                P5.setClass(Chat.this, Communication.class);
                startActivity(P5);
            case R.id.perso6 :
                Intent P6 = new Intent();
                P6.setClass(Chat.this, Communication.class);
                startActivity(P6);
            case R.id.perso7 :
                Intent P7 = new Intent();
                P7.setClass(Chat.this, Communication.class);
                startActivity(P7);
            case R.id.perso8 :
                Intent P8 = new Intent();
                P8.setClass(Chat.this, Communication.class);
                startActivity(P8);
            case R.id.perso9 :
                Intent P9 = new Intent();
                P9.setClass(Chat.this, Communication.class);
                startActivity(P9);
            case R.id.perso10 :
                Intent P10 = new Intent();
                P10.setClass(Chat.this, Communication.class);
                startActivity(P10);
            case R.id.perso11 :
                Intent P11 = new Intent();
                P11.setClass(Chat.this, Communication.class);
                startActivity(P11);
            case R.id.perso12 :
                Intent P12 = new Intent();
                P12.setClass(Chat.this, Communication.class);
                startActivity(P12);
            case R.id.perso13 :
                Intent P13 = new Intent();
                P13.setClass(Chat.this, Communication.class);
                startActivity(P13);
            case R.id.perso14 :
                Intent P14 = new Intent();
                P14.setClass(Chat.this, Communication.class);
                startActivity(P14);
            case R.id.perso15 :
                Intent P15 = new Intent();
                P15.setClass(Chat.this, Communication.class);
                startActivity(P15);
            case R.id.perso16 :
                Intent P16 = new Intent();
                P16.setClass(Chat.this, Communication.class);
                startActivity(P16);

    }
}

    public void inco(View view) {
        Intent incoun = new Intent();
        incoun.setClass(Chat.this , Chat.class);
        startActivity(incoun);
    }

    public void psych(View view) {
        Intent psychi = new Intent();
        psychi.setClass(Chat.this , Psycho.class);
        startActivity(psychi);
    }

    public void param(View view) {
        Intent para = new Intent();
        para.setClass(Chat.this , Parametre.class);
        startActivity(para);
    }

}