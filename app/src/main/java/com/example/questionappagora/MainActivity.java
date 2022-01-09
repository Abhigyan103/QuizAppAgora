package com.example.questionappagora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText FirstName, LastName, RollNo;
    String fullName="",rollNo="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FirstName = findViewById(R.id.idFirstName);
        LastName = findViewById(R.id.idLastName);
        RollNo = findViewById(R.id.idRollNumber);
    }
    public void openQuestionPage(View view) {
        String firstName = FirstName.getText().toString();
        String lastName = LastName.getText().toString();
        rollNo = RollNo.getText().toString();
        if(firstName.trim().length() == 0 || lastName.trim().length() == 0){
            Toast.makeText(this, "Please Enter your name correctly", Toast.LENGTH_SHORT).show();
        } else if(rollNo.trim().length() == 0) {
            Toast.makeText(this, "Enter Your Roll  Number Correctly", Toast.LENGTH_SHORT).show();
        }else {
            fullName= firstName + " " + lastName;
            Intent intent = new Intent(this, QuestionPage.class);
            intent.putExtra("full_name", fullName);
            intent.putExtra("rollnumber", rollNo);
            startActivity(intent);
        }
    }
}