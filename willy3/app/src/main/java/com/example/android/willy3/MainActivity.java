
package com.example.android.willy3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import com.example.android.willy3.R;

public class MainActivity extends AppCompatActivity {
    int totalRight;
    int score1;
    int score2;
    int score3;
    int score4;
    int score5;
    int score6;
    CheckBox scrumpdiddlyumtious = findViewById(R.id.scrumpdiddlyumtious);
    CheckBox wonkaBar = findViewById(R.id.wonkaBar);
    RadioButton radioGroup1D = findViewById(R.id.radioGroup1D);
    RadioButton radioGroup2A = findViewById(R.id.radioGroup2A);
    RadioButton radioGroup3A = findViewById(R.id.radioGroup3A);
    EditText gene = (EditText)findViewById(R.id.gene);
    CheckBox answer_joe = findViewById(R.id.answer_joe);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);}


    public void submitQuiz(View view) {
        //question 1 correct answer
        boolean answer0 = scrumpdiddlyumtious.isChecked();
        boolean answer1 = wonkaBar.isChecked();
        if (answer1 || answer0) {
            score1 = 1;
        } else {
            score1 = 0;
        }

        //question 2 correct answer
        boolean answer2 = radioGroup1D.isChecked();
        if (answer2) {
            score2 = 1;
        } else {
            score2 = 0;
        }

        //question 3 correct answer
        boolean answer3 = radioGroup2A.isChecked();
        if (answer3) {
            score3 = 1;
        } else {
            score3 = 0;
        }

        //question 4 correct answer
        boolean answer4 = radioGroup3A.isChecked();
        if (answer4) {
            score4 = 1;
        } else {
            score4 = 0;
        }

        //question 5 correct answer
        String answer5 = gene.getText().toString();
        if (answer5.equalsIgnoreCase("Gene Wilder")) {
            score5 = 1;
        } else {
            score5 = 0;
        }
        //question 6 correct answer
        boolean answer6 = answer_joe.isChecked();
        if (answer6) {
            score6 = 1;
        } else {
            score6 = 0;
        }

        //final score
        totalRight = score1 + score2 + score3 + score4 + score5 + score6;
        //Toast message for submit button that calculates the amount of questions answered correctly
        Toast.makeText(this, "Congratulations! \nYou got " + totalRight + " out of 6 answers right!", Toast.LENGTH_LONG).show();
    }
}