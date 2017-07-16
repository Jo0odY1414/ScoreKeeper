package com.example.android.scorekeeper;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Tracks the ponits for Team A
    int ponitsTeamA = 0;

    // Tracks the fouls for Team A
    int foulsTeamA = 0;

    // Tracks the ponits for Team B
    int ponitsTeamB = 0;

    // Tracks the fouls for Team B
    int foulsTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Increase the ponits for Team A by 1 point.
     */
    public void addOnePonitForTeamA(View v) {
        ponitsTeamA += 1;
        displayPonitsForTeamA(ponitsTeamA);
    }

    /**
     * Decrease the ponits for Team A by 1 point.
     */
    public void removeOnePonitFromTeamA(View v) {
        if (ponitsTeamA > 0)
            ponitsTeamA -= 1;
        displayPonitsForTeamA(ponitsTeamA);
    }

    /**
     * Displays the given Ponits for Team A.
     */
    public void displayPonitsForTeamA(int ponitsOfTeamA) {
        TextView ponitView = (TextView) findViewById(R.id.team_a_ponits);
        ponitView.setText(String.valueOf(ponitsOfTeamA));
        if (ponitsOfTeamA > 0)
            ponitView.setTextColor(Color.rgb(31, 140, 63));
        else
            ponitView.setTextColor(Color.rgb(0, 0, 0));
    }

    /**
     * Increase the fouls for Team A by 1 foul.
     */
    public void addOneFoulForTeamA(View v) {
        foulsTeamA += 1;
        displayFoulsForTeamA(foulsTeamA);
    }

    /**
     * Displays the given Fouls for Team A.
     */
    public void displayFoulsForTeamA(int foulsOfTeamA) {
        TextView foulView = (TextView) findViewById(R.id.team_a_fouls);
        foulView.setText(String.valueOf(foulsOfTeamA));
        if (foulsOfTeamA > 0)
            foulView.setTextColor(Color.rgb(155, 44, 38));
        else
            foulView.setTextColor(Color.rgb(0, 0, 0));
    }

    /**
     * Increase the ponits for Team B by 1 point.
     */
    public void addOnePonitForTeamB(View v) {
        ponitsTeamB += 1;
        displayPonitsForTeamB(ponitsTeamB);
    }

    /**
     * Decrease the ponits for Team B by 1 point.
     */
    public void removeOnePonitFromTeamB(View v) {
        if (ponitsTeamB > 0)
            ponitsTeamB -= 1;
        displayPonitsForTeamB(ponitsTeamB);
    }

    /**
     * Displays the given Ponits for Team B.
     */
    public void displayPonitsForTeamB(int ponitsOfTeamB) {
        TextView ponitView = (TextView) findViewById(R.id.team_b_ponits);
        ponitView.setText(String.valueOf(ponitsOfTeamB));
        if (ponitsOfTeamB > 0)
            ponitView.setTextColor(Color.rgb(31, 140, 63));
        else
            ponitView.setTextColor(Color.rgb(0, 0, 0));
    }

    /**
     * Increase the fouls for Team B by 1 foul.
     */
    public void addOneFoulForTeamB(View v) {
        foulsTeamB += 1;
        displayFoulsForTeamB(foulsTeamB);
    }

    /**
     * Displays the given Fouls for Team B.
     */
    public void displayFoulsForTeamB(int foulsOfTeamB) {
        TextView foulView = (TextView) findViewById(R.id.team_b_fouls);
        foulView.setText(String.valueOf(foulsOfTeamB));
        if (foulsOfTeamB > 0)
            foulView.setTextColor(Color.rgb(155, 44, 38));
        else
            foulView.setTextColor(Color.rgb(0, 0, 0));

    }

    /**
     * Reset all ponits and fouls in both teams
     */
    public void resetALL(View v) {
        ponitsTeamA = 0;
        ponitsTeamB = 0;
        foulsTeamA = 0;
        foulsTeamB = 0;
        displayPonitsForTeamA(ponitsTeamA);
        displayFoulsForTeamA(foulsTeamA);
        displayPonitsForTeamB(ponitsTeamB);
        displayFoulsForTeamB(foulsTeamB);
    }
}
