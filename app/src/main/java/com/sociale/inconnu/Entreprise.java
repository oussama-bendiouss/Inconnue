package com.sociale.inconnu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Entreprise extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entreprise);
    }

    public void inco(View view) {
        Intent incoun = new Intent();
        incoun.setClass(Entreprise.this , MainActivity.class);
        startActivity(incoun);
    }

    public void entre(View view) {
        Intent ent = new Intent();
        ent.setClass(Entreprise.this , Entreprise.class);
        startActivity(ent);
    }
}