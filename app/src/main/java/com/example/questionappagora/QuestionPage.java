package com.example.questionappagora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class QuestionPage extends AppCompatActivity {
    private ArrayList<QuizModal> questions;
    private TextView QuestionTV, QuestionNumberTV, option1TV,option2TV,option3TV,option4TV;
    private Button btnA, btnB, btnC, btnD, btnSubmit;
    int marks=0, current=1, numberOfQuestions=0;
    String Name,Roll;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_page);
        questions= new ArrayList<>();
        setQuestions();
        QuestionTV = findViewById(R.id.idTextQuestionTV);
        QuestionNumberTV = findViewById(R.id.idTextQuestionNumberTV);
        option1TV = findViewById(R.id.idoA);
        option2TV = findViewById(R.id.idoB);
        option3TV = findViewById(R.id.idoC);
        option4TV = findViewById(R.id.idoD);
        btnA = findViewById(R.id.idBtnA);
        btnB = findViewById(R.id.idBtnB);
        btnC = findViewById(R.id.idBtnC);
        btnD = findViewById(R.id.idBtnD);
        btnSubmit = findViewById(R.id.idBtnSubmit);
        setDataToViews();
        btnA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(questions.get(current-1).getAnswer()==1) {
                    marks +=2;
                }else {
                    marks-=1;
                }
                current++;
                setDataToViews();
            }
        });
        btnB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(questions.get(current-1).getAnswer()==2) {
                    marks +=2;
                }else {
                    marks-=1;
                }
                current++;
                setDataToViews();
            }
        });

        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(questions.get(current-1).getAnswer()==3) {
                    marks +=2;
                }else {
                    marks-=1;
                }
                current++;
                setDataToViews();
            }
        });

        btnD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(questions.get(current-1).getAnswer()==4) {
                    marks +=2;
                }else {
                    marks-=1;
                }
                current++;
                setDataToViews();
            }
        });



    }
    public void setDataToViews() {
        if(numberOfQuestions+1== current){
            btnSubmit.performClick();
        }
        QuestionNumberTV.setText("Q"+current+"");
        QuestionTV.setText(questions.get(current-1).getQuestion());
        option1TV.setText("A :" + questions.get(current-1).getOptionA());
        option2TV.setText("B :" + questions.get(current-1).getOptionB());
        option3TV.setText("C :" + questions.get(current-1).getOptionC());
        option4TV.setText("D :" + questions.get(current-1).getOptionD());
    }
    public void setQuestions() {
        questions.add(new QuizModal("\n\nWhich is the lowest energy conformation of butane?","anti","gauche","partially eclipsed","fully eclipsed",1));
        questions.add(new QuizModal("\n\nAcetic acid has a pKa of 4.8. Ethanol has a pKa of 16.0. What are the major species present, when acetic acid and ethanol are added to water and the pH is adjusted to 7.0?","acetic acid and peracetic acid","ethoxide ion and ethanol","acetic acid and ethoxide ion","acetate ion and ethanol",4));
        questions.add(new QuizModal("\n\n1-methyl cyclopentene is reacted with HBr and CCl4. Comment upon the optical reactivity of the product.", "Racemic mixture","Diastereomers","Optically inactive","Meso",3));
        questions.add(new QuizModal("\n\nWhich of the following is not cleaved by Periodic acid?", "glycol","1,3-propenediol","glycerol","all of the above",2));
        questions.add(new QuizModal("\n\nWhich of the following will form stable Hydrate?", "chloral","ninhydrin","Hexafluoroacetone","all of these",4));
        questions.add(new QuizModal("\n\nAn increase in the conductivity equivalent of a solid electrolyte with dilution is primarily due to", "increased ionic mobility of ions","increase in both ion numbers and ionic mobility","100 percent electrolyte ionisation with natural dilution","A rise in ion counts",1));
        questions.add(new QuizModal("\n\nThe average rate and instantaneous rate of a reaction are equal","at the start","at the end","when two rates have a time interval equal to zero","in the middle",3));
        questions.add(new QuizModal("\n\nIn the Haber process for the manufacture of ammonia the following catalyst is used","Platinized asbestos","Iron with molybdenum as a promoter","Copper oxide","Alumina",2));
        questions.add(new QuizModal("\n\nWhich is the first man-made element?","Sc","Os","Tc","Zr",3));
        questions.add(new QuizModal("\n\nRutile is an ore of which of the following metals?","Scandium","Titanium","Manganese","Chromium",2));

        numberOfQuestions=questions.size();
    }
    public void openMarksScreen(View view) {
        Name = getIntent().getStringExtra("full_name");
        Roll = getIntent().getStringExtra("rollnumber");
        String yourMarks = String.valueOf(marks);
        String yourTotalMarks = String.valueOf(numberOfQuestions*2);
        Intent intent = new Intent(QuestionPage.this, Marks_Screen.class);
        intent.putExtra("fullname", Name);
        intent.putExtra("rollnumber", Roll);
        intent.putExtra("marks", yourMarks);
        intent.putExtra("totalmarks", yourTotalMarks);
        startActivity(intent);
    }
}