package com.example.andorid.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.example.andorid.scorekeeper.R;

import java.time.temporal.TemporalAmount;

public class MainActivity extends AppCompatActivity {

    int scoreJosh = 0;
    int scoreLerry = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * Increase the score for Josh by 7 point.
     */
    public void sevenJosh(View v) {
        scoreJosh = scoreJosh + 7;
        displayForJosh(scoreJosh);
    }

    /**
     * Increase the score for Josh by 2 points.
     */
    public void twoJosh(View v) {
        scoreJosh = scoreJosh + 2;
        displayForJosh(scoreJosh);
    }

    /**
     * Increase the score for Josh by 3 points.
     */
    public void threeJosh(View v) {
        scoreJosh = scoreJosh + 3;
        displayForJosh(scoreJosh);
    }

    /**
     * Increase the score for Lerry by 7 point.
     */
    public void sevenLerry(View v) {
        scoreLerry = scoreLerry + 7;
        displayForLerry(scoreLerry);
    }

    /**
     * Increase the score for Lerry by 2 points.
     */
    public void twoLerry(View v) {
        scoreLerry = scoreLerry + 2;
        displayForLerry(scoreLerry);
    }

    /**
     * Increase the score for Lerry by 3 points.
     */
    public void threeLerry(View v) {
        scoreLerry = scoreLerry + 3;
        displayForLerry(scoreLerry);
    }

    /**
     * decribes Reset button
     */
    public void resetScore(View v) {
        scoreJosh = 0;
        scoreLerry = 0;
        displayForJosh(scoreJosh);
        displayForLerry(scoreLerry);
    }


    /**
     * Displays the given score for Josh.
     */
    public void displayForJosh(int score) {
        TextView scoreView = (TextView) findViewById(R.id.josh);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Lerry.
     */
    public void displayForLerry(int score) {
        TextView scoreView = (TextView) findViewById(R.id.lerry);
        scoreView.setText(String.valueOf(score));
    }
}

