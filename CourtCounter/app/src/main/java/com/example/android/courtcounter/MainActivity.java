package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreBursaspor = 0;
    int scoreKasimpasa = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team Bursaspor.
     */
    public void displayForBursaspor(int score) {
        TextView scoreView = (TextView) findViewById(R.id.bursaspor_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * adds 3 points to the score for Bursaspor
     */
    public void bursasporAdd3(View view) {
        scoreBursaspor += 3;
        displayForBursaspor(scoreBursaspor);
    }

    /**
     * adds 2 points to the score for Bursaspor
     */
    public void bursasporAdd2(View view) {
        scoreBursaspor += 2;
        displayForBursaspor(scoreBursaspor);
    }

    /**
     * adds 1 points to the score for Bursaspor
     */
    public void bursasporAdd1(View view) {
        scoreBursaspor += 1;
        displayForBursaspor(scoreBursaspor);
    }

    /**
     * Displays the given score for Team Kasimpasa.
     */
    public void displayForKasimpasa(int score) {
        TextView scoreView = (TextView) findViewById(R.id.kasimpasa_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * adds 3 points to the score for Kasimpasa
     */
    public void kasimpasaAdd3(View view) {
        scoreKasimpasa += 3;
        displayForKasimpasa(scoreKasimpasa);
    }

    /**
     * adds 2 points to the score for team Kasmipasa
     */
    public void kasimpasaAdd2(View view) {
        scoreKasimpasa += 2;
        displayForKasimpasa(scoreKasimpasa);
    }

    /**
     * adds 1 points to the score for team Kasimpasa
     */
    public void kasimpasaAdd1(View view) {
        scoreKasimpasa += 1;
        displayForKasimpasa(scoreKasimpasa);
    }

    /**
     * resets score to 0 for team Bursaspor and Team Kasimpasa
     */
    public void Reset(View view) {
        int Reset = 0;
        displayForBursaspor(Reset);
        displayForKasimpasa(Reset);
    }
}
