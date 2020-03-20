package com.example.schedulingapp;

import androidx.appcompat.app.AppCompatActivity;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.text.Layout;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Calendar;

import android.os.Bundle;


public class TimePickerActivity5 extends AppCompatActivity {

    TextView time,time2,time3;
    TimePicker simpleTimePicker,simpleTimePicker2,simpleTimePicker3;
    private Button next,setTime,setTime2;
    private String str1,str2,str3;
    private RelativeLayout relative1,relative2,relative3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_picker5);

        next = (Button) findViewById(R.id.nextId);

        time = (TextView) findViewById(R.id.time);
        time2= (TextView) findViewById(R.id.time2);
        time3= (TextView) findViewById(R.id.time3);

        relative1 = (RelativeLayout) findViewById(R.id.quizId);
        relative2 = (RelativeLayout) findViewById(R.id.onlineId);
        relative3 = (RelativeLayout) findViewById(R.id.offlineId);

        setTime =(Button)findViewById(R.id.button1);
        setTime2 =(Button)findViewById(R.id.button2);

        simpleTimePicker = (TimePicker) findViewById(R.id.simpleTimePicker);
        simpleTimePicker.setIs24HourView(false); // used to display AM/PM mode
        // perform set on time changed listener event
        simpleTimePicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
                // display a toast with changed values of time picker
                Toast.makeText(getApplicationContext(), hourOfDay + "  " + minute, Toast.LENGTH_SHORT).show();
                time.setText("Time is :: " + hourOfDay + " : " + minute); // set the current time in text view
                str1=time.getText().toString();


            }
        });

        setTime.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                relative1.setVisibility(RelativeLayout.GONE);
                relative2.setVisibility(RelativeLayout.VISIBLE);
            }
        });

        simpleTimePicker2 = (TimePicker) findViewById(R.id.simpleTimePicker2);
        simpleTimePicker2.setIs24HourView(false); // used to display AM/PM mode
        // perform set on time changed listener event
        simpleTimePicker2.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
                // display a toast with changed values of time picker
                Toast.makeText(getApplicationContext(), hourOfDay + "  " + minute, Toast.LENGTH_SHORT).show();
                time2.setText("Time is :: " + hourOfDay + " : " + minute); // set the current time in text view
                str2=time2.getText().toString();


            }
        });

        setTime2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                relative2.setVisibility(RelativeLayout.GONE);
                relative3.setVisibility(RelativeLayout.VISIBLE);
            }
        });

        simpleTimePicker3 = (TimePicker) findViewById(R.id.simpleTimePicker3);
        simpleTimePicker3.setIs24HourView(false); // used to display AM/PM mode
        // perform set on time changed listener event
        simpleTimePicker3.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
                // display a toast with changed values of time picker
                Toast.makeText(getApplicationContext(), hourOfDay + "  " + minute, Toast.LENGTH_SHORT).show();
                time3.setText("Time is :: " + hourOfDay + " : " + minute); // set the current time in text view
                str3=time3.getText().toString();


            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent1= new Intent(TimePickerActivity5.this,AbsoluteActivity6.class);
                intent1.putExtra("QuizTime",str1);
                intent1.putExtra("OnlineTime",str2);
                intent1.putExtra("OfflineTime",str3);
                startActivity(intent1);
            }
        });
    }
}
