package com.example.android.scorekeeper;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Tracks the points for Team A
    int pointsTeamA = 0;

    // Tracks the fouls for Team A
    int foulsTeamA = 0;

    // Tracks the points for Team B
    int pointsTeamB = 0;

    // Tracks the fouls for Team B
    int foulsTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Increase the points for Team A by 1 point.
     */
    public void addOnePointForTeamA(View v) {
        pointsTeamA += 1;
        displayPointsForTeamA(pointsTeamA);
    }

    /**
     * Decrease the points for Team A by 1 point.
     */
    public void removeOnePointFromTeamA(View v) {
        if (pointsTeamA > 0)
            pointsTeamA -= 1;
        displayPointsForTeamA( pointsTeamA );
    }

    /**
     * Displays the given points for Team A.
     */
    public void displayPointsForTeamA(int pointsOfTeamA) {
        TextView pointView = (TextView) findViewById(R.id.team_a_points);
        pointView.setText(String.valueOf(pointsOfTeamA));
        if (pointsOfTeamA > 0)
            pointView.setTextColor(Color.rgb(31, 140, 63));
        else
            pointView.setTextColor(Color.rgb(0, 0, 0));
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
     * Increase the points for Team B by 1 point.
     */
    public void addOnePointForTeamB(View v) {
        pointsTeamB += 1;
        displayPointsForTeamB(pointsTeamB);
    }

    /**
     * Decrease the points for Team B by 1 point.
     */
    public void removeOnePointFromTeamB(View v) {
        if (pointsTeamB > 0)
            pointsTeamB -= 1;
        displayPointsForTeamB(pointsTeamB);
    }

    /**
     * Displays the given points for Team B.
     */
    public void displayPointsForTeamB(int pointsOfTeamB) {
        TextView pointView = (TextView) findViewById(R.id.team_b_points);
        pointView.setText(String.valueOf(pointsOfTeamB));
        if (pointsOfTeamB > 0)
            pointView.setTextColor(Color.rgb(31, 140, 63));
        else
            pointView.setTextColor(Color.rgb(0, 0, 0));
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
     * Reset all points and fouls in both teams
     */
    public void resetALL(View v) {
        pointsTeamA = 0;
        pointsTeamB = 0;
        foulsTeamA = 0;
        foulsTeamB = 0;
        displayPointsForTeamA(pointsTeamA);
        displayFoulsForTeamA(foulsTeamA);
        displayPointsForTeamB(pointsTeamB);
        displayFoulsForTeamB(foulsTeamB);
    }
}
