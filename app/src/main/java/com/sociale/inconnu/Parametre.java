package com.sociale.inconnu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Parametre extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parametre);
    }

    public void inco(View view) {
        Intent incoun = new Intent();
        incoun.setClass(Parametre.this , Chat.class);
        startActivity(incoun);
    }

    public void psych(View view) {
        Intent psychi = new Intent();
        psychi.setClass(Parametre.this , Psycho.class);
        startActivity(psychi);
    }

    public void param(View view) {
        Intent para = new Intent();
        para.setClass(Parametre.this , Parametre.class);
        startActivity(para);
    }
}