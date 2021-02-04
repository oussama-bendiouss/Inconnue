package com.sociale.inconnu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.ToggleButton;

public class Communication extends AppCompatActivity {
    private ToggleButton Filtre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_communication);
    }

    public void onToogleClick(View view) {
        if (Filtre.isChecked())
            Toast.makeText(Communication.this,"Limitation de parole activer",Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(Communication.this,"Limitation de parole désactiver",Toast.LENGTH_SHORT).show();
    }
}