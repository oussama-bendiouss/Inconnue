package com.sociale.inconnu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText Pseudo;
    private EditText EtatEsprit;
    private ImageButton Man;
    private ImageButton Woman;
    private Button Next;
    private Button INCO;
    private Button ENTRE;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Pseudo = findViewById(R.id.pseudo);
        EtatEsprit = findViewById(R.id.etat_desprit);
        Man = findViewById(R.id.man);
        Woman=findViewById(R.id.woman);
        Next = findViewById(R.id.suivant);
        INCO = findViewById(R.id.inco);
        ENTRE = findViewById(R.id.ent);
        Next.setOnClickListener(new View.OnClickListener() {
            /**
             * Called when a view has been clicked.
             *
             * @param v The view that was clicked.
             */
            @Override
            public void onClick(View v) {
                Intent next = new Intent();
                next.setClass(MainActivity.this,Chat.class);
                startActivity(next);
            }
        });



    }

    public void inco(View view) {
        Intent incoun = new Intent();
        incoun.setClass(MainActivity.this , MainActivity.class);
        startActivity(incoun);
    }

    public void entre(View view) {
        Intent ent = new Intent();
        ent.setClass(MainActivity.this , Entreprise.class);
        startActivity(ent);
    }
}