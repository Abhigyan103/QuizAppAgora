package com.example.questionappagora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Marks_Screen extends AppCompatActivity {
    TextView message, name, roll;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marks_screen);
        message = findViewById(R.id.marksText);
        Intent intent =  getIntent();
        String Name = intent.getStringExtra("fullname").toString();
        String Roll = intent.getStringExtra("rollnumber").toString();
        String yourMarks = intent.getStringExtra("marks").toString();
        String yourTotalMarks = intent.getStringExtra("totalmarks").toString();
        name= findViewById(R.id.idName);
        roll= findViewById(R.id.idRoll);
        name.setText("Name : "+Name);
        roll.setText("Roll   : "+Roll);
        message.setText(yourMarks+ " out of "+yourTotalMarks+" marks.");

    }
    public void openHomeScreen(View v) {
        Intent intent= new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}