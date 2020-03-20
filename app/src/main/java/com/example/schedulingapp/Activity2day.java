package com.example.schedulingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class Activity2day extends AppCompatActivity implements View.OnClickListener {

   private CheckBox saturady,sunday,monday,tuesday,wednesday,thursday,friday;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity2day);

        saturady =(CheckBox) findViewById(R.id.checkBoxSaturday);
        sunday = (CheckBox) findViewById(R.id.checkBoxSunday);
        monday = (CheckBox) findViewById(R.id.checkBoxMonday);
        tuesday = (CheckBox) findViewById(R.id.checkBoxTuesday);
        wednesday= (CheckBox) findViewById(R.id.checkBoxWednesday);
        thursday =(CheckBox)findViewById(R.id.checkBoxThursday);
        friday =(CheckBox)findViewById(R.id.checkBoxFriday);

        saturady.setOnClickListener(this);
        sunday.setOnClickListener(this);
        monday.setOnClickListener(this);
        tuesday.setOnClickListener(this);
        wednesday.setOnClickListener(this);
        thursday.setOnClickListener(this);
        friday.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {



        if(saturady.isChecked()){

            Toast.makeText(getApplicationContext(),"You have selected Saturday",Toast.LENGTH_SHORT).show();
            Intent intent =new Intent(Activity2day.this,FrameActivity3.class);
            startActivity(intent);
        }

        if(sunday.isChecked()){

            Toast.makeText(getApplicationContext(),"You have selected Sunday",Toast.LENGTH_SHORT).show();
            Intent intent =new Intent(Activity2day.this,FrameActivity3.class);
            startActivity(intent);
        }

        if(monday.isChecked()){

            Toast.makeText(getApplicationContext(),"You have selected monday",Toast.LENGTH_SHORT).show();
            Intent intent =new Intent(Activity2day.this,FrameActivity3.class);
            startActivity(intent);
        }

        if(tuesday.isChecked()){

            Toast.makeText(getApplicationContext(),"You have selected tuesday",Toast.LENGTH_SHORT).show();
            Intent intent =new Intent(Activity2day.this,FrameActivity3.class);
            startActivity(intent);
        }

        if(wednesday.isChecked()){

            Toast.makeText(getApplicationContext(),"You have selected wednesday",Toast.LENGTH_SHORT).show();
            Intent intent =new Intent(Activity2day.this,FrameActivity3.class);
            startActivity(intent);
        }
        if(thursday.isChecked()){

            Toast.makeText(getApplicationContext(),"You have selected thursday",Toast.LENGTH_SHORT).show();
            Intent intent =new Intent(Activity2day.this,FrameActivity3.class);
            startActivity(intent);
        }
        if(friday.isChecked()){

            Toast.makeText(getApplicationContext(),"You have selected friday",Toast.LENGTH_SHORT).show();
            Intent intent =new Intent(Activity2day.this,FrameActivity3.class);
            startActivity(intent);
        }
    }

}
