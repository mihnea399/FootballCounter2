package com.example.android.footballcounter;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.android.footballcounter.R;

public class MainActivity extends AppCompatActivity {

    // The initial value when you open the app

    int newcastle = 0;
    int suderland = 0;
    int foulN = 0;
    int foulS = 0;
    int saveN = 0;
    int saveS = 0;

    // Displaying all the needed score fouls saves etc.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForNewcastle(newcastle);
        displayForSunderland(suderland);
        displayForNewcastleFoul(foulN);
        displayForSunderlandFoul(foulS);
        displayForNewcastleSave(saveN);
        displayForSunderlandSave(saveS);

    }


    // The coding that needed to display all the int

    public void ScoreN(View v) {
        newcastle = newcastle + 1;
        displayForNewcastle(newcastle);
    }

    public void ScoreS(View v) {
        suderland = suderland + 1;
        displayForSunderland(suderland);
    }

    public void FoulN(View v) {
        foulN = foulN + 1;
        displayForNewcastleFoul(foulN);
    }

    public void FoulS(View v) {
        foulS = foulS + 1;
        displayForSunderlandFoul(foulS);
    }

    public void SaveN(View v) {
        saveN = saveN + 1;
        displayForNewcastleSave(saveN);
    }

    public void SaveS(View v) {
        saveS = saveS + 1;
        displayForSunderlandSave(saveS);
    }

    // Displaying the if when newcastle or sunderland win

    public void Win(View v) {

        if (newcastle > suderland) {
            TextView newcastle = findViewById(R.id.newcastle);
            newcastle.setText("Win");

            TextView sunderland = findViewById(R.id.sunderland);
            sunderland.setText("Lose");


        } else if (suderland > newcastle) {
            TextView newcastle = findViewById(R.id.newcastle);
            newcastle.setText("Lose");

            TextView sunderland = findViewById(R.id.sunderland);
            sunderland.setText("Relegated");
        }
    }


    // Reseting every thing that you can see the other result

    public void resetAll (View v) {
        newcastle = 0;
        suderland = 0;
        foulN = 0;
        foulS = 0;
        saveN = 0;
        saveS = 0;
        displayForNewcastle(newcastle);
        displayForSunderland(suderland);
        displayForNewcastleFoul(foulN);
        displayForSunderlandFoul(foulS);
        displayForNewcastleSave(saveN);
        displayForSunderlandSave(saveS);
    }


    // displaying every thing that you can increse

    public void displayForNewcastle(int score) {
        TextView scoreView = (TextView) findViewById(R.id.newcastle);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForSunderland(int score) {
        TextView scoreView = (TextView) findViewById(R.id.sunderland);
        scoreView.setText(String.valueOf(score));

    }

    public void displayForNewcastleFoul(int foulN) {
        TextView scoreView = (TextView) findViewById(R.id.foulN);
        scoreView.setText(String.valueOf(foulN));

    }

    public void displayForSunderlandFoul(int foulN) {
        TextView scoreView = (TextView) findViewById(R.id.foulS);
        scoreView.setText(String.valueOf(foulN));

    }

    public void displayForNewcastleSave(int saveN) {
        TextView scoreView = (TextView) findViewById(R.id.saveN);
        scoreView.setText(String.valueOf(saveN));

    }

    public void displayForSunderlandSave(int saveS) {
        TextView scoreView = (TextView) findViewById(R.id.saveS);
        scoreView.setText(String.valueOf(saveS));
    }

}
