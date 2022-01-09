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
    private TextView TotalQuestionTV, QuestionTV, QuestionNumberTV, option1TV,option2TV,option3TV,option4TV;
    private Button btnA, btnB, btnC, btnD, btnSubmit;
    int marks=0, current=1, numberOfQuestions=0;
    String Name,Roll;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_page);
        questions= new ArrayList<>();
        setQuestions();
        TotalQuestionTV = findViewById(R.id.idTextTotalQuestionTV);
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
        TotalQuestionTV.setText("Total Questions : "+numberOfQuestions);
        QuestionNumberTV.setText("Q"+current+"");
        QuestionTV.setText(questions.get(current-1).getQuestion());
        option1TV.setText("A :" + questions.get(current-1).getOptionA());
        option2TV.setText("B :" + questions.get(current-1).getOptionB());
        option3TV.setText("C :" + questions.get(current-1).getOptionC());
        option4TV.setText("D :" + questions.get(current-1).getOptionD());
    }
    public void setQuestions() {
        questions.add(new QuizModal("\nWhich is the lowest energy conformation of butane?"," Anti"," Gauche"," Partially eclipsed"," Fully eclipsed",1));
        questions.add(new QuizModal("\nAcetic acid has a pKa of 4.8. Ethanol has a pKa of 16.0. What are the major species present, when acetic acid and ethanol are added to water and the pH is adjusted to 7.0?"," Acetic acid and Peracetic acid"," Ethoxide ion and Ethanol"," Acetic acid and Ethoxide ion"," Acetate ion and Ethanol",4));
        questions.add(new QuizModal("\n1-methyl cyclopentene is reacted with HBr and CCl4. Comment upon the optical reactivity of the product.", " Racemic mixture"," Diastereomers"," Optically inactive"," Meso",3));
        questions.add(new QuizModal("\nWhich of the following is not cleaved by Periodic acid?", " Glycol","1,3-propenediol"," Glycerol"," All of the above",2));
        questions.add(new QuizModal("\nWhich of the following will form stable Hydrate?", " Chloral"," Ninhydrin"," Hexafluoroacetone"," All of these",4));
        questions.add(new QuizModal("\nAn increase in the conductivity equivalent of a solid electrolyte with dilution is primarily due to", " Increased ionic mobility of ions"," Increase in both ion numbers and ionic mobility"," 100 percent electrolyte ionisation with natural dilution"," A rise in ion counts",1));
        questions.add(new QuizModal("\nThe average rate and instantaneous rate of a reaction are equal"," At the start"," At the end"," When two rates have a time interval equal to zero"," In the middle",3));
        questions.add(new QuizModal("\nIn the Haber process for the manufacture of ammonia the following catalyst is used"," Platinized asbestos"," Iron with molybdenum as a promoter"," Copper oxide"," Alumina",2));
        questions.add(new QuizModal("\nWhich is the first man-made element?"," Sc"," Os"," Tc"," Zr",3));
        questions.add(new QuizModal("\nRutile is an ore of which of the following metals?"," Scandium"," Titanium"," Manganese"," Chromium",2));
        questions.add(new QuizModal("\nA cart moves with a constant speed along a horizontal circular\n" +
                "path. From the cart, a particle is thrown up vertically with\n" +
                "respect to the cart."," The particle will land somewhere on the circular path."," The particle will land outside the circular path."," The particle will follow an elliptical path"," The particle will follow a parabolic path.",4));
        questions.add(new QuizModal("\nA man who can swim at a speed v relative to the water wants to\n" +
                "cross a river of width d, flowing with a speed u. The point\n" +
                "opposite him across the river is P"," The minimum time in which he can cross the river is d/v" ," He can reach the point P in time d/v\n" ," He can reach the point P in time d/(v^2-u^2)^0.5"," He cannot reach P if u>v",1));
        questions.add(new QuizModal("\n A charged particle X moves directly towards another charged\n" +
                "particle Y. For the ‘X plus Y’ system, the total momentum is p\n" +
                "and the total energy is E."," P and E are conserved if both X and Y are free to move." ," (a) is true only if X and Y have similar charges. \n" ," If Y is not fixed, E is conserved but not p."," If Y is fixed, neither E nor p is conserved.\n",1));
        questions.add(new QuizModal("A sphere A moving with a speed u and rotating with an angular\n" +
                "velocity w, makes a head-on elastic collision with an identical\n" +
                "stationary sphere B. There is no friction between the surfaces of A\n" +
                "and B. Disregard gravity."," A will stop moving and rotating with an angular\n" +
                "velocity w."," A will come to rest and stop rotating."," B will move with a speed u without rotating."," B will move with a speed u and rotate with an angular\n" +
                "velocity w.",3));
        questions.add(new QuizModal("\nA cannon shell is fired to hit a target at a horizontal distance R.\n" +
                "However, it breaks into two equal parts at its highest point. One\n" +
                "part (A) returns to the cannon. The other part"," Will fall at a distance of R beyond the target\n"," Will fall at a distance of 3R beyond the target"," Will hit the target"," Have eight times the kinetic energy of A",1));


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