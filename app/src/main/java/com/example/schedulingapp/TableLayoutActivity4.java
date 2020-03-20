package com.example.schedulingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TableLayout;

public class TableLayoutActivity4 extends AppCompatActivity implements View.OnClickListener {

    private EditText quiz4,online4,offline4;
    private Button next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_layout4);

        quiz4= (EditText) findViewById(R.id.quizId);
        online4 =(EditText) findViewById(R.id.onlineId);
        offline4 =(EditText) findViewById(R.id.offlineId);
        next= (Button) findViewById(R.id.nextId);

        next.setOnClickListener(this);



        Intent intent =getIntent();

        String result1= intent.getStringExtra("statement1");
        quiz4.setText(result1);

        String result2= intent.getStringExtra("statement2");
        online4.setText(result2);

        String result3= intent.getStringExtra("statement3");
        offline4.setText(result3);


    }

    @Override
    public void onClick(View v) {

        if(v.getId()== R.id.nextId){

            Intent intent1= new Intent(TableLayoutActivity4.this,TimePickerActivity5.class);
            startActivity(intent1);
        }

    }
}
