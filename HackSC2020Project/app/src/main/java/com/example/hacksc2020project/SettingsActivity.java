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

        button0 = findViewById(R.id.running_button); //5 miles, 25 miles, 100 miles
        button1 = findViewById(R.id.recycle_button); //50 bottles, 250 bottles, 500 bottles
        button2 = findViewById(R.id.carpool_button); //20 miles, 100, 250 miles
        button3 = findViewById(R.id.electricty_button); //5 hours, 15 hours, 50 hours
        button4 = findViewById(R.id.water_button); // 5 min, 10 min, 15 min
        button5 = findViewById(R.id.clean_button); // 30 min, 90 min, 180 min
        button6 = findViewById(R.id.coffeecup_button); // 1 time, 5 times, 15 times
        button7 = findViewById(R.id.bottle_button); //5 times, 15 times, 30 times
        button8 = findViewById(R.id.thrift_button); //1 times, 5 times, 20 times
        button9 = findViewById(R.id.bag_button); // 5 times, 25 times, 75 times
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
                question.setText("How many hours did you save electricity?");
                display.setText("Current Total: " + count3);
            }
        });
        button4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                buttonNumber = 4;
                question.setText("How many minutes shorter are your showers?");
                display.setText("Current Total: " + count4);
            }
        });
        button5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                buttonNumber = 5;
                question.setText("How many minutes did you spend cleaning the environment?");
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
                question.setText("How many times have you chosen to go thrift shopping?");
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
                        if(count0 >= 100){
                            button0.setImageResource(R.drawable.gold_running_medal);
                        }else if(count0 >=25){
                            button0.setImageResource(R.drawable.silver_running_medal);
                        }else if(count0 >= 5){
                            button0.setImageResource(R.drawable.bronze_running_medal);
                        }
                        break;
                    case 1:
                        count1 += Double.parseDouble(response.getText().toString());
                        display.setText("Current Total: " + count1);
                        if(count1 >= 500){
                            button1.setImageResource(R.drawable.gold_recycle_medal);
                        }else if(count1 >=250){
                            button1.setImageResource(R.drawable.silver_recycle_medal);
                        }else if(count1 >= 50){
                            button1.setImageResource(R.drawable.bronze_recycle_medal);
                        }
                        break;
                    case 2:
                        count2 += Double.parseDouble(response.getText().toString());
                        display.setText("Current Total: " + count2);
                        if(count2 >= 250){
                            button2.setImageResource(R.drawable.gold_medal_carpool);
                        }else if(count2 >=100){
                            button2.setImageResource(R.drawable.silver_medal_carpool);
                        }else if(count2 >= 20){
                            button2.setImageResource(R.drawable.bronze_medal_carpool);
                        }
                        break;
                    case 3:
                        count3 += Double.parseDouble(response.getText().toString());
                        display.setText("Current Total: " + count3);
                        if(count3 >= 50){
                            button3.setImageResource(R.drawable.gold_medal_electricity);
                        }else if(count3 >=15){
                            button3.setImageResource(R.drawable.silver_medal_electricity);
                        }else if(count3 > 5){
                            button3.setImageResource(R.drawable.bronze_medal_electricity);
                        }
                        break;
                    case 4:
                        count4 += Double.parseDouble(response.getText().toString());
                        display.setText("Current Total: " + count4);
                        if(count4 >= 15){
                            button4.setImageResource(R.drawable.gold_medal_water);
                        }else if(count4 >= 10){
                            button4.setImageResource(R.drawable.silver_medal_water);
                        }else if(count4 >= 5){
                            button4.setImageResource(R.drawable.bronze_medal_water);
                        }
                        break;
                    case 5:
                        count5 += Double.parseDouble(response.getText().toString());
                        display.setText("Current Total: " + count5);
                        if(count5 >= 180){
                            button5.setImageResource(R.drawable.gold_cleanup_medal);
                        }else if(count5 >= 90){
                            button5.setImageResource(R.drawable.silver_cleanup_medal);
                        }else if(count5 >= 30){
                            button5.setImageResource(R.drawable.bronze_cleanup_medal);
                        }
                        break;
                    case 6:
                        count6 += Double.parseDouble(response.getText().toString());
                        display.setText("Current Total: " + count6);
                        if(count6 >= 15){
                            button6.setImageResource(R.drawable.gold_medal_coffee);
                        }else if(count6 >= 5){
                            button6.setImageResource(R.drawable.silver_medal_coffee);
                        }else if(count6 >= 1){
                            button6.setImageResource(R.drawable.bronze_medal_coffee);
                        }
                        break;
                    case 7:
                        count7 += Double.parseDouble(response.getText().toString());
                        display.setText("Current Total: " + count7);
                        if(count7 >= 30){
                            button7.setImageResource(R.drawable.gold_bottle_medal);
                        }else if(count7 >= 15){
                            button7.setImageResource(R.drawable.silver_bottle_medal);
                        }else if(count7 >= 5){
                            button7.setImageResource(R.drawable.bronze_bottle_medal);
                        }
                        break;
                    case 8:
                        count8 += Double.parseDouble(response.getText().toString());
                        display.setText("Current Total: " + count8);
                        if(count8 >= 20){
                            button8.setImageResource(R.drawable.gold_medal_thrift);
                        }else if(count8 >= 5){
                            button8.setImageResource(R.drawable.silver_medal_thrift);
                        }else if(count8 >= 1){
                            button8.setImageResource(R.drawable.bronze_medal_thrift);
                        }
                        break;
                    case 9:
                        count9 += Double.parseDouble(response.getText().toString());
                        display.setText("Current Total: " + count9);
                        if(count9 >= 75){
                            button9.setImageResource(R.drawable.gold_bag_medal);
                        }else if(count9 >= 25){
                            button9.setImageResource(R.drawable.silver_bag_medal);
                        }else if(count9 >= 5){
                            button9.setImageResource(R.drawable.bronze_bag_medal);
                        }
                        break;
                }
                response.setText(" ");
            }
        });

    }
}

