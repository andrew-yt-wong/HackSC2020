package com.example.hacksc2020project;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SettingsActivity extends AppCompatActivity {

    ImageButton button1, button2, button3, button4, button5, button6, button7, button8, button9, button10;
    Button submitButton;
    TextView question;
    EditText response;
    double count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings_activity);

        button1 = findViewById(R.id.running_button);
        button2 = findViewById(R.id.recycle_button);
        button3 = findViewById(R.id.carpool_button);
        button4 = findViewById(R.id.electricty_button);
        button5 = findViewById(R.id.water_button);
        button6 = findViewById(R.id.clean_button);
        button7 = findViewById(R.id.coffeecup_button);
        button8 = findViewById(R.id.bottle_button);
        button9 = findViewById(R.id.thrift_button);
        button10 = findViewById(R.id.bag_button);
        submitButton = findViewById(R.id.submitButton);


        question = findViewById(R.id.question);

        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                question.setText("How many miles did you run today?");
            }
        });
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                question.setText("How many bottles did you recycle today?");
            }
        });
        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                question.setText("How many miles did you carpool today?");
            }
        });
        button4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                question.setText("How many minutes did you leave your lights on for?");
            }
        });
        button5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                question.setText("How many cups of water did you drink today?");
            }
        });
        button6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                question.setText("How much time did you spend cleaning up?");
            }
        });
        button7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                question.setText("How many times have you used a reusable cup?");
            }
        });
        button8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                question.setText("How many times did you use a reusable bottle?");
            }
        });
        button9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                question.setText("How many clothes did you buy thrift shopping?");
            }
        });
        button10.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                question.setText("How many times did you use a reusable bag today?");
            }
        });
        submitButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                question.setText("Click Button Above");
                count += Double.parseDouble(response.getText().toString());
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