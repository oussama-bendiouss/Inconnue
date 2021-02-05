package com.sociale.inconnu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {
    private EditText Pseudo;
    private EditText EtatEsprit;
    private ImageButton Man;
    private ImageButton Woman;
    private Button Next;
    private Button INCO;
    private Button ENTRE;
    private FirebaseAuth mAuth;
    private static final String TAG = "AnonymousAuth";
    private boolean access;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Pseudo = findViewById(R.id.pseudo);
        EtatEsprit = findViewById(R.id.etat_desprit);
        mAuth = FirebaseAuth.getInstance();
        Man = findViewById(R.id.man);
        Woman=findViewById(R.id.woman);
        Next = findViewById(R.id.suivant);
        INCO = findViewById(R.id.inco);
        ENTRE = findViewById(R.id.ent);
        access = false;
        Next.setOnClickListener(new View.OnClickListener() {
            /**
             * Called when a view has been clicked.
             *
             * @param v The view that was clicked.
             */
            @Override
            public void onClick(View v) {
                signInAnonymously();
                if (access){
                Intent next = new Intent();
                next.setClass(MainActivity.this,Chat.class);
                startActivity(next);
            }}
        }); }

        private void signInAnonymously() {

            // [START signin_anonymously]
            mAuth.signInAnonymously()
                    .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (task.isSuccessful()) {
                                // Sign in success, update UI with the signed-in user's information
                                Log.d(TAG, "signInAnonymously:success");
                                FirebaseUser user = mAuth.getCurrentUser();
                                updateUI(user);
                                access = true ;
                            } else {
                                // If sign in fails, display a message to the user.
                                Log.w(TAG, "signInAnonymously:failure", task.getException());
                                Toast.makeText(MainActivity.this, "Authentication failed.",
                                        Toast.LENGTH_SHORT).show();
                                updateUI(null);
                            }

                            // [START_EXCLUDE]

                            // [END_EXCLUDE]
                        }
                    });
            // [END signin_anonymously]
        }


    public void inco(View view) {
        Intent incoun = new Intent();
        incoun.setClass(MainActivity.this , MainActivity.class);
        startActivity(incoun);
    }
    @Override
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = mAuth.getCurrentUser();
        updateUI(currentUser);
    }

    public void entre(View view) {
        Intent ent = new Intent();
        ent.setClass(MainActivity.this , Entreprise.class);
        startActivity(ent);
    }
    private void updateUI(FirebaseUser user) {



        boolean isSignedIn = (user != null);

        // Status text
        if (isSignedIn) {


        } else {

            Pseudo.setText(null);
        }


    }

}