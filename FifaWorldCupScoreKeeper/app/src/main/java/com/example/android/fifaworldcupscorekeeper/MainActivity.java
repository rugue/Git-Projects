package com.example.android.fifaworldcupscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Initial Score for both France and Croatia
    int goalFrance = 0;
    int goalCroatia = 0;

    //Initial Shots for both France and Croatia
    int shotCountFrance = 0;
    int shotCountCroatia = 0;

    //Initial Shots On Target for both France and Croatia
    int shotsOnTargetCountFrance = 0;
    int shotsOnTargetCountCroatia = 0;

    //Initial Fouls for both France and Croatia
    int foulCountFrance = 0;
    int foulCountCroatia = 0;

    //Initial Yellow Cards for both France and Croatia
    int yellowCardCountFrance = 0;
    int yellowCardCountCroatia = 0;

    //Initial Red Cards for both France and Croatia
    int redCardCountFrance = 0;
    int redCardCountCroatia = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Add goal for France.
     */
    public void update_score_for_France(View v) {
        goalFrance += 1;
        displayScoreForFrance(goalFrance);
    }

    /**
     * Add goal for Croatia.
     */
    public void update_score_for_Croatia(View v) {
        goalCroatia += 1;
        displayScoreForCroatia(goalCroatia);
    }

    /**
     * This method displays scores for France.
     */
    private void displayScoreForFrance(int score) {
        TextView scoreView = findViewById(R.id.france_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This method displays scores for Croatia.
     */
    private void displayScoreForCroatia(int score) {
        TextView scoreView = findViewById(R.id.croatia_score);
        scoreView.setText(String.valueOf(score));
    }

    //    **********************************************************************************************

    /**
     * Add shot for France.
     */
    public void update_shot_for_France(View v) {
        shotCountFrance += 1;
        displayShotsForFrance(shotCountFrance);
    }

    /**
     * Add shot for Croatia.
     */
    public void update_shot_for_Croatia(View v) {
        shotCountCroatia += 1;
        displayShotsForCroatia(shotCountCroatia);
    }

    /**
     * This method displays shots for France.
     */
    private void displayShotsForFrance(int shot) {
        TextView shotView = findViewById(R.id.update_shots_france);
        shotView.setText(String.valueOf(shot));
    }

    /**
     * This method displays shots for Croatia.
     */
    private void displayShotsForCroatia(int shot) {
        TextView shotView = findViewById(R.id.update_shots_croatia);
        shotView.setText(String.valueOf(shot));
    }

    //    **********************************************************************************************

    /**
     * Add shots on target for France.
     */
    public void update_shots_on_target_for_France(View v) {
        shotsOnTargetCountFrance += 1;
        displayShotsOnTargetForFrance(shotsOnTargetCountFrance);
    }

    /**
     * Add shots on target for Croatia.
     */
    public void update_shots_on_target_for_Croatia(View v) {
        shotsOnTargetCountCroatia += 1;
        displayShotsOnTargetForCroatia(shotsOnTargetCountCroatia);
    }

    /**
     * This method displays shots for France.
     */
    private void displayShotsOnTargetForFrance(int shotOnTarget) {
        TextView shotOnTargetView = findViewById(R.id.update_shots_on_target_france);
        shotOnTargetView.setText(String.valueOf(shotOnTarget));
    }

    /**
     * This method displays shots for Croatia.
     */
    private void displayShotsOnTargetForCroatia(int shotOnTarget) {
        TextView shotOnTargetView = findViewById(R.id.update_shots_on_target_croatia);
        shotOnTargetView.setText(String.valueOf(shotOnTarget));
    }

    //    **********************************************************************************************

    /**
     * Add foul for France.
     */
    public void update_foul_for_France(View v) {
        foulCountFrance += 1;
        displayFoulsForFrance(foulCountFrance);
    }

    /**
     * Add foul for Croatia.
     */
    public void update_foul_for_Croatia(View v) {
        foulCountCroatia += 1;
        displayFoulsForCroatia(foulCountCroatia);
    }

    /**
     * This method displays fouls for France.
     */
    private void displayFoulsForFrance(int foul) {
        TextView foulView = findViewById(R.id.update_fouls_france);
        foulView.setText(String.valueOf(foul));
    }

    /**
     * This method displays foul for Croatia.
     */
    private void displayFoulsForCroatia(int foul) {
        TextView foulView = findViewById(R.id.update_fouls_croatia);
        foulView.setText(String.valueOf(foul));
    }

    //    **********************************************************************************************

    /**
     * Add yellow card for France.
     */
    public void update_yellow_card_for_France(View v) {
        yellowCardCountFrance += 1;
        displayYellowCardsForFrance(yellowCardCountFrance);
    }

    /**
     * Add yellow card for Croatia.
     */
    public void update_yellow_card_for_Croatia(View v) {
        yellowCardCountCroatia += 1;
        displayYellowCardsForCroatia(yellowCardCountCroatia);
    }

    /**
     * This method displays fouls for France.
     */
    private void displayYellowCardsForFrance(int yellowCard) {
        TextView yellowCardView = findViewById(R.id.update_yellow_cards_france);
        yellowCardView.setText(String.valueOf(yellowCard));
    }

    /**
     * This method displays foul for Croatia.
     */
    private void displayYellowCardsForCroatia(int yellowCard) {
        TextView yellowCardView = findViewById(R.id.update_yellow_cards_croatia);
        yellowCardView.setText(String.valueOf(yellowCard));
    }

    //    **********************************************************************************************

    /**
     * Add red card for France.
     */
    public void update_red_card_for_France(View v) {
        redCardCountFrance += 1;
        displayRedCardsForFrance(redCardCountFrance);
    }

    /**
     * Add red card for Croatia.
     */
    public void update_red_card_for_Croatia(View v) {
        redCardCountCroatia += 1;
        displayRedCardsForCroatia(redCardCountCroatia);
    }

    /**
     * This method displays red cards for France.
     */
    private void displayRedCardsForFrance(int redCard) {
        TextView redCardView = findViewById(R.id.update_red_cards_france);
        redCardView.setText(String.valueOf(redCard));
    }

    /**
     * This method displays red cards for Croatia.
     */
    private void displayRedCardsForCroatia(int redCard) {
        TextView redCardView = findViewById(R.id.update_red_cards_croatia);
        redCardView.setText(String.valueOf(redCard));
    }

    /**
     * This method Resets all Scores, Shots, Fouls, Yellow Cards and Red Cards for both France and Croatia.
     */
    public void reset_all(View v) {
        goalFrance = 0;
        goalCroatia = 0;

        shotCountFrance = 0;
        shotCountCroatia = 0;

        shotsOnTargetCountFrance = 0;
        shotsOnTargetCountCroatia = 0;

        foulCountFrance = 0;
        foulCountCroatia = 0;

        yellowCardCountFrance = 0;
        yellowCardCountCroatia = 0;

        redCardCountFrance = 0;
        redCardCountCroatia = 0;


        displayScoreForFrance(goalFrance);
        displayScoreForCroatia(goalCroatia);

        displayShotsForFrance(shotCountFrance);
        displayShotsForCroatia(shotCountCroatia);

        displayShotsOnTargetForFrance(shotsOnTargetCountFrance);
        displayShotsOnTargetForCroatia(shotsOnTargetCountCroatia);

        displayFoulsForFrance(foulCountFrance);
        displayFoulsForCroatia(foulCountCroatia);

        displayYellowCardsForFrance(yellowCardCountFrance);
        displayYellowCardsForCroatia(yellowCardCountCroatia);

        displayRedCardsForFrance(redCardCountFrance);
        displayRedCardsForCroatia(redCardCountCroatia);
    }
}
