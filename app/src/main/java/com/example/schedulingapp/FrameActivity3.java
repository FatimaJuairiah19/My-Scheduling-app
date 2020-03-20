
package com.example.schedulingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class FrameActivity3 extends AppCompatActivity implements View.OnClickListener {


    private ImageView quiz,online,offline;
    private Button btn11, btn12,btn21,btn22,btn31,btn32;
    private String str1,str2,str3;
    private LinearLayout linear1,linear2,linear3 ;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame3);

        quiz= (ImageView) findViewById(R.id.quizView);
        online =(ImageView) findViewById(R.id.onlineView);
        offline =(ImageView) findViewById(R.id.offlineView);

        linear1= (LinearLayout)findViewById(R.id.linearId1);
        linear2= (LinearLayout)findViewById(R.id.linearId2);
        linear3= (LinearLayout)findViewById(R.id.linearId3);

        btn11 = (Button) findViewById(R.id.yesbutton);
        btn12 =(Button)findViewById(R.id.nobutton);
        btn21 = (Button) findViewById(R.id.yesbutton2);
        btn22 =(Button)findViewById(R.id.nobutton2);
        btn31 = (Button) findViewById(R.id.yesbutton3);
        btn32 =(Button)findViewById(R.id.nobutton3);

        quiz.setOnClickListener(this);
        online.setOnClickListener(this);
        offline.setOnClickListener(this);
        btn11.setOnClickListener(this);
        btn12.setOnClickListener(this);
        btn21.setOnClickListener(this);
        btn22.setOnClickListener(this);
        btn31.setOnClickListener(this);
        btn32.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        if(v.getId()== R.id.yesbutton ){

            str1="Yes";
            Toast.makeText(getApplicationContext(),"Please click on the pic",Toast.LENGTH_SHORT).show();
            //intent.putExtra("statement1",str1);
        }

        if(v.getId()==R.id.nobutton){

            str1="No";
            Toast.makeText(getApplicationContext(),"Please click on the pic",Toast.LENGTH_SHORT).show();


        }
      //////
        if(v.getId()== R.id.yesbutton2 ){

            str2="Yes";
            Toast.makeText(getApplicationContext(),"Please click on the pic",Toast.LENGTH_SHORT).show();
            //intent.putExtra("statement1",str1);
        }

        if(v.getId()==R.id.nobutton2){

            str2="No";
            Toast.makeText(getApplicationContext(),"Please click on the pic",Toast.LENGTH_SHORT).show();


        }



        if(v.getId()== R.id.yesbutton3 ){

            str3="Yes";
            Toast.makeText(getApplicationContext(),"Please click on the pic",Toast.LENGTH_SHORT).show();
            //intent.putExtra("statement1",str1);
        }

        if(v.getId()==R.id.nobutton3){

            str3="No";
            Toast.makeText(getApplicationContext(),"Please click on the pic",Toast.LENGTH_SHORT).show();


        }



        if(v.getId()==R.id.quizView){

            quiz.setVisibility(View.GONE);
            online.setVisibility(View.VISIBLE);
            linear1.setVisibility(LinearLayout.GONE);
            linear2.setVisibility(LinearLayout.VISIBLE);


        }

        if(v.getId()== R.id.onlineView){

            //linear3.setVisibility(LinearLayout.VISIBLE);

            online.setVisibility(View.GONE);
            offline.setVisibility(View.VISIBLE);
            //linear1.setVisibility(LinearLayout.INVISIBLE);
            linear2.setVisibility(LinearLayout.GONE);
            linear3.setVisibility(LinearLayout.VISIBLE);

        }

        if(v.getId()==R.id.offlineView){

            intent = new Intent(FrameActivity3.this, TableLayoutActivity4.class);

            intent.putExtra("statement1",str1);
            intent.putExtra("statement2",str2);
            intent.putExtra("statement3",str3);


           startActivity(intent);
        }


    }
}
