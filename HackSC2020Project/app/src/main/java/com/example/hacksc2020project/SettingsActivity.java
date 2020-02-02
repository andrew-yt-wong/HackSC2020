package com.example.hacksc2020project;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SettingsActivity extends AppCompatActivity {

    ImageButton button0, button1, button2, button3, button4, button5, button6, button7, button8, button9;
    Button submitButton;
    TextView question;
    TextView display;
    EditText response;
    double count0 = 0, count1 = 0, count2 = 0, count3 = 0, count4 = 0, count5 = 0, count6 = 0, count7 = 0, count8 = 0, count9 = 0;
    int buttonNumber = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings_activity);

        button0 = findViewById(R.id.running_button);
        button1 = findViewById(R.id.recycle_button);
        button2 = findViewById(R.id.carpool_button);
        button3 = findViewById(R.id.electricty_button);
        button4 = findViewById(R.id.water_button);
        button5 = findViewById(R.id.clean_button);
        button6 = findViewById(R.id.coffeecup_button);
        button7 = findViewById(R.id.bottle_button);
        button8 = findViewById(R.id.thrift_button);
        button9 = findViewById(R.id.bag_button);
        submitButton = findViewById(R.id.submitButton);

        question = findViewById(R.id.question);
        display = findViewById(R.id.displayNumber);
        response = findViewById(R.id.response);

        button0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                buttonNumber = 0;
                question.setText("How many miles did you run today?");
                display.setText("Current Total: " + count0);
            }
        });
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                buttonNumber = 1;
                question.setText("How many bottles did you recycle today?");
                display.setText("Current Total: " + count1);
            }
        });
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                buttonNumber = 2;
                question.setText("How many miles did you carpool today?");
                display.setText("Current Total: " + count2);
            }
        });
        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                buttonNumber = 3;
                question.setText("How many minutes did you leave your lights on for?");
                display.setText("Current Total: " + count3);
            }
        });
        button4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                buttonNumber = 4;
                question.setText("How many cups of water did you drink today?");
                display.setText("Current Total: " + count4);
            }
        });
        button5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                buttonNumber = 5;
                question.setText("How many minutes did you spend cleaning up?");
                display.setText("Current Total: " + count5);
            }
        });
        button6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                buttonNumber = 6;
                question.setText("How many times have you used a reusable cup?");
                display.setText("Current Total: " + count6);
            }
        });
        button7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                buttonNumber = 7;
                question.setText("How many times did you use a reusable bottle?");
                display.setText("Current Total: " + count7);
            }
        });
        button8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                buttonNumber = 8;
                question.setText("How many clothes did you buy thrift shopping?");
                display.setText("Current Total: " + count8);
            }
        });
        button9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                buttonNumber = 9;
                question.setText("How many times did you use a reusable bag today?");
                display.setText("Current Total: " + count9);
            }
        });
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                question.setText("Click Button Above");
                switch(buttonNumber) {
                    case 0:
                        count0 += Double.parseDouble(response.getText().toString());
                        display.setText("Current Total: " + count0);
                        break;
                    case 1:
                        count1 += Double.parseDouble(response.getText().toString());
                        display.setText("Current Total: " + count1);
                        break;
                    case 2:
                        count2 += Double.parseDouble(response.getText().toString());
                        display.setText("Current Total: " + count2);
                        break;
                    case 3:
                        count3 += Double.parseDouble(response.getText().toString());
                        display.setText("Current Total: " + count3);
                        break;
                    case 4:
                        count4 += Double.parseDouble(response.getText().toString());
                        display.setText("Current Total: " + count4);
                        break;
                    case 5:
                        count5 += Double.parseDouble(response.getText().toString());
                        display.setText("Current Total: " + count5);
                        break;
                    case 6:
                        count6 += Double.parseDouble(response.getText().toString());
                        display.setText("Current Total: " + count6);
                        break;
                    case 7:
                        count7 += Double.parseDouble(response.getText().toString());
                        display.setText("Current Total: " + count7);
                        break;
                    case 8:
                        count8 += Double.parseDouble(response.getText().toString());
                        display.setText("Current Total: " + count8);
                        break;
                    case 9:
                        count9 += Double.parseDouble(response.getText().toString());
                        display.setText("Current Total: " + count9);
                        break;
                }
            }
        });
    }
}

