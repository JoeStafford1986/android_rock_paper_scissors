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

    private void play(ChoiceType playerChoice) {
        playerTextView.setText("Player's choice: " + playerChoice.toString().toLowerCase());

        ChoiceType androidChoice = ChoiceType.random();
        androidTextView.setText("Android's choice: " + androidChoice.toString().toLowerCase());

        ResultType result = Game.getResult(playerChoice, androidChoice);
        textResult.setText("Player " + result.getResult());
    }

    public void onMakeButtonChoice(View view) {
        switch (view.getId()) {
            case R.id.rock_button:
                play(ChoiceType.ROCK);
                break;
            case R.id.paper_button:
                play(ChoiceType.PAPER);
                break;
            case R.id.scissors_button:
                play(ChoiceType.SCISSORS);
                break;
        }
    }
}
