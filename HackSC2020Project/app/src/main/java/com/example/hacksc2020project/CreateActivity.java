package com.example.hacksc2020project;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.hacksc2020project.ui.login.LoginActivity;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.firestore.auth.User;

public class CreateActivity extends AppCompatActivity {

    FirebaseDatabase database;
    DatabaseReference users;

    EditText newEmail, newPassword;
    Button btnCreateAcc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create);

        database = FirebaseDatabase.getInstance();
        users = database.getReference("Users");

        newEmail = (EditText) findViewById(R.id.newEmail);
        newPassword = (EditText) findViewById(R.id.newPassword);

        btnCreateAcc = (Button) findViewById(R.id.createButton);

        btnCreateAcc.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                signIn(newEmail.getText().toString(), newPassword.getText().toString());
            }
        });
    }
    private void signIn(final String email, final String password){
        users.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if(dataSnapshot.child(email).exists()){
                    if(!email.isEmpty()){
                        User login = dataSnapshot.child(email).getValue(User.class);
                        if(login.getPassword().equals(password)){
                            Toast.makeText(CreateActivity.this, "Success", Toast.LENGTH_SHORT).show();
                        }
                        else{
                            Toast.makeText(CreateActivity.this, "Password is wrong", Toast.LENGTH_SHORT).show();
                        }
                    }else{
                        Toast.makeText(CreateActivity.this, "Username not registered", Toast.LENGTH_SHORT).show();
                    }
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }
}
