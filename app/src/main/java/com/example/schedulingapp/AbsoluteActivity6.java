package com.example.schedulingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class AbsoluteActivity6 extends AppCompatActivity implements View.OnClickListener {

    private EditText quiz6,online6,offline6;
    String quiz,online,offline;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_absolute6);

         quiz6 =(EditText) findViewById(R.id.quizTime);
         online6=(EditText)findViewById(R.id.onlineTime);
         offline6=(EditText)findViewById(R.id.offlineTime);

        Intent intent = getIntent();
        quiz= intent.getStringExtra("QuizTime");
        online= intent.getStringExtra("OnlineTime");
        offline= intent.getStringExtra("OfflineTime");

        quiz6.setText(quiz);
        online6.setText(online);
        offline6.setText(offline);




       }

    @Override
    public void onClick(View v) {

    }
}
