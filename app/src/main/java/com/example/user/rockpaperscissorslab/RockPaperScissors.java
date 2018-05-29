package com.example.user.rockpaperscissorslab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class RockPaperScissors extends AppCompatActivity {
    TextView playerTextView;
    TextView androidTextView;
    TextView textResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rock_paper_scissors);
        playerTextView = findViewById(R.id.text_player_choice);
        androidTextView = findViewById(R.id.text_android_choice);
        textResult = findViewById(R.id.text_result);
    }

    public void onRockButtonClick(View view) {
        ResultType result = play(ChoiceType.ROCK);
        textResult.setText("Player " + result.getResult());
    }

    private ResultType play(ChoiceType player_choice) {
        ChoiceType androidChoice = ChoiceType.random();
        return Game.getResult(player_choice, androidChoice);
    }
}
