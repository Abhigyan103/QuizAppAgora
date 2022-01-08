package com.example.questionappagora;

public class QuizModal {
    private String question, optionA,optionB,optionC,optionD;
    private Integer answer;

    public QuizModal(String question, String optionA, String optionB, String optionC, String optionD, Integer answer) {
        this.question = question;
        this.optionA = optionA;
        this.optionB = optionB;
        this.optionC = optionC;
        this.optionD = optionD;
        this.answer = answer;
    }
    public String getQuestion() {
        return question;
    }

    public String getOptionA() {
        return optionA;
    }

    public String getOptionB() {
        return optionB;
    }


    public String getOptionC() {
        return optionC;
    }

    public String getOptionD() {
        return optionD;
    }
    public Integer getAnswer() {
        return answer;
    }
}
