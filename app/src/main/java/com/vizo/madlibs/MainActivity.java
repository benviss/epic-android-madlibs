package com.vizo.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @Bind(R.id.radioButtonSpace) RadioButton mRadioButtonSpace;
    @Bind(R.id.radioButtonAdventure) RadioButton mRadioButtonAdventure;
    @Bind(R.id.radioButtonHorror) RadioButton mRadioButtonHorror;
    @Bind(R.id.radioButtonGroup) RadioGroup mRadioButtonGroup;

    public String userStoryChoice = "";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }

    public void onRadioButtonChange(View v) {
        if(mRadioButtonSpace.isChecked()) {
            userStoryChoice = "Space";
        } else if (mRadioButtonAdventure.isChecked()) {
            userStoryChoice = "Adventure";
        } else {
            userStoryChoice = "Horror";
        }
    }
    public void onSubmitStoryChoice(View v) {
        Intent intent = new Intent(MainActivity.this, QuestionsActivity.class);
        intent.putExtra("userStoryChoice", userStoryChoice);
        startActivity(intent);
    }
}
