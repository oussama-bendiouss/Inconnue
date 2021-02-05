package com.sociale.inconnu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.InstanceIdResult;

import java.util.Calendar;

public class Entreprise extends AppCompatActivity {
    private FirebaseAuth mAuth;
    private EditText INEMAIL , INPASS;
    private TextView FPASS;
    private Button Login;
    private TextView NewUser;
    private static final String TAG = "login";
    FirebaseAuth.AuthStateListener mAuthStateListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entreprise);
        mAuth = FirebaseAuth.getInstance();
        INEMAIL = findViewById(R.id.email);
        Login = findViewById(R.id.login);
        NewUser = findViewById(R.id.sign);
        INPASS  = findViewById(R.id.password);
        FPASS = findViewById(R.id.motdepasseoublie);
        mAuthStateListener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                FirebaseUser mfirebaseUser = mAuth.getCurrentUser();
                if (mfirebaseUser != null) {
                    FirebaseInstanceId.getInstance().getInstanceId().addOnCompleteListener(new OnCompleteListener<InstanceIdResult>(){
                        @Override
                        public void onComplete(@NonNull Task<InstanceIdResult> task ) {
                            if (!task.isSuccessful()){
                                Log.w(TAG , "getInstanced fail",task.getException());
                                return ;

                            }
                            String token=task.getResult().getToken();


                        }
                    });
                    Toast.makeText(Entreprise.this,"Welcome Back",Toast.LENGTH_SHORT).show();
                    Intent i1=new Intent(Entreprise.this,Chat.class);
                    startActivity(i1);
                }else { Toast.makeText(Entreprise.this,"Please Login",Toast.LENGTH_SHORT).show();

                }
            }
        };
        Login.setOnClickListener(new View.OnClickListener() {
            /**
             * Called when a view has been clicked.
             *
             * @param v The view that was clicked.
             */
            @Override
            public void onClick(View v) {
                String mail = INEMAIL.getText().toString().trim();
                String pass = INPASS.getText().toString().trim();
                if (mail.isEmpty()){
                    INEMAIL.setError("Email is required");
                    INEMAIL.requestFocus();
                }else if (mail.isEmpty() && pass.isEmpty()){
                    Toast.makeText(Entreprise.this,"Fields are empty",Toast.LENGTH_SHORT).show();
                }else if (pass.isEmpty()){
                    INPASS.setError("Password is required");
                    INPASS.requestFocus();
                }else if (!Patterns.EMAIL_ADDRESS.matcher(mail).matches()){
                    INEMAIL.setError("Please Entre a valid email");
                    INEMAIL.requestFocus();
                }else if (pass.length()<8){
                    INPASS.setError("Minimum lenght of password should be 6");
                    INPASS.requestFocus();
                }else if (!(mail.isEmpty()&&pass.isEmpty())){
                    NewUser.setVisibility(View.INVISIBLE);
                    FPASS.setVisibility(View.INVISIBLE);
                    mAuth.signInWithEmailAndPassword(mail,pass).addOnCompleteListener(new OnCompleteListener<AuthResult>(){

                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (!task.isSuccessful()){
                                Toast.makeText(Entreprise.this,"Password or Email are not correct",Toast.LENGTH_SHORT).show();
                                NewUser.setVisibility(View.VISIBLE);
                                FPASS.setVisibility(View.VISIBLE);
                            }
                            else{
                                Intent i2 = new Intent(Entreprise.this,Communication.class);
                                startActivity(i2);
                                finish();
                            }
                        }
                    });
                }else{
                    Toast.makeText(Entreprise.this,"Password or Email are not correct",Toast.LENGTH_SHORT).show();}
            }
        });
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