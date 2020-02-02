package com.example.hacksc2020project;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class SettingsActivity extends AppCompatActivity {

    ImageButton button0, button1, button2, button3, button4, button5, button6, button7, button8, button9;
    Button submitButton;
    TextView question;
    TextView display;
    EditText response;
    ArrayList<Double> count = new ArrayList<Double>(10);
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

        button0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                buttonNumber = 0;
                question.setText("How many miles did you run today?");
                display.setText("Current Total: " + count.get(buttonNumber));
            }
        });
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                buttonNumber = 1;
                question.setText("How many bottles did you recycle today?");
                display.setText("Current Total: " + count.get(buttonNumber));
            }
        });
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                buttonNumber = 2;
                question.setText("How many miles did you carpool today?");
                display.setText("Current Total: " + count.get(buttonNumber));
            }
        });
        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                buttonNumber = 3;
                question.setText("How many minutes did you leave your lights on for?");
                display.setText("Current Total: " + count.get(buttonNumber));
            }
        });
        button4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                buttonNumber = 4;
                question.setText("How many cups of water did you drink today?");
                display.setText("Current Total: " + count.get(buttonNumber));
            }
        });
        button5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                buttonNumber = 5;
                question.setText("How much time did you spend cleaning up?");
                display.setText("Current Total: " + count.get(buttonNumber));
            }
        });
        button6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                buttonNumber = 6;
                question.setText("How many times have you used a reusable cup?");
                display.setText("Current Total: " + count.get(buttonNumber));
            }
        });
        button7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                buttonNumber = 7;
                question.setText("How many times did you use a reusable bottle?");
                display.setText("Current Total: " + count.get(buttonNumber));
            }
        });
        button8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                buttonNumber = 8;
                question.setText("How many clothes did you buy thrift shopping?");
                display.setText("Current Total: " + count.get(buttonNumber));
            }
        });
        button9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                buttonNumber = 9;
                question.setText("How many times did you use a reusable bag today?");
                display.setText("Current Total: " + count.get(buttonNumber));
            }
        });
        submitButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                question.setText("Click Button Above");
                count.set(buttonNumber, count.get(buttonNumber) + Double.parseDouble(response.getText().toString()));
                display.setText("Current Total: " + count.get(buttonNumber));
            }
        });

    }



//    public static class SettingsFragment extends PreferenceFragmentCompat {
//        @Override
//        public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
//            setPreferencesFromResource(R.xml.root_preferences, rootKey);
//        }
//    }
}