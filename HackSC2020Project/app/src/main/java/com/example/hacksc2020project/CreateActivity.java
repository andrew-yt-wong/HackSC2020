package com.example.hacksc2020project;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class CreateActivity extends AppCompatActivity {

    EditText newEmail, password;
    Button createAcc;
    FirebaseAuth firebaseAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create);

        newEmail = findViewById(R.id.newEmail);
        password = findViewById(R.id.newPassword);
        createAcc = findViewById(R.id.createButton);

        firebaseAuth = firebaseAuth.getInstance();

        createAcc.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                firebaseAuth.createUserWithEmailAndPassword(newEmail.getText().toString(),
                        password.getText().toString()).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){
                            Toast.makeText(CreateActivity.this, "Registered Successfully",
                                    Toast.LENGTH_LONG).show();
                        }else{
                            Toast.makeText(CreateActivity.this, task.getException().getMessage(),
                                    Toast.LENGTH_LONG).show();
                        }
                    }
                });
            }
        });
    }

}
