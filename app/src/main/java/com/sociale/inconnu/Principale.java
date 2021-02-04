package com.sociale.inconnu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Principale extends AppCompatActivity {
    private TextView Tintro;
    private TextView Dem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principale);
        Tintro = findViewById(R.id.intro);
        Dem = findViewById(R.id.dema);
        Tintro.setText("Bonjour, et bienvenu dans notre app.Cette application est une plate forme d'un réseau sociale anonyme,où vous pouvez parler, discuter, jouer et meme rencontrer des nouveaux personnes.\nEn plus vous etes inconnu, du coup vous pouvez parler comme vous voulez et sans avoir aucune contrainte de peur où timidité");
        Dem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dem = new Intent();
                dem.setClass(Principale.this,MainActivity.class);
                startActivity(dem );
            }
        });
    }
}