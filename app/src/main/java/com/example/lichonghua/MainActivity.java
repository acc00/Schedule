package com.example.lichonghua;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.lichonghua.com.example.schedule.activity.ScheduleActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button et = findViewById(R.id.et);
        et.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
       if( view.getId()==R.id.et){
           Intent intent = new Intent(this, ScheduleActivity.class);
           startActivity(intent);
       }
    }
}
