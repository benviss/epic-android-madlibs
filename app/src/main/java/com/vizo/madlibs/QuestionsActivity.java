package com.vizo.madlibs;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

public class QuestionsActivity extends AppCompatActivity {
    @Bind(R.id.submitWordButton)
    Button mSubmitWordButton;
    @Bind(R.id.wordRequest)
    EditText mWordRequest;
    @Bind(R.id.questionsBackground)
    RelativeLayout mBackground;
    private CrazyLibDictionary mCrazyLibDictionary = new CrazyLibDictionary();
    private ArrayList<String> mUserWords = new ArrayList<String>();
    private String mUserStoryChoice = "";

    private int mCurrentWord = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        mUserStoryChoice = intent.getStringExtra("userStoryChoice");
        setContentView(R.layout.activity_questions);

        ButterKnife.bind(this);
        if(mUserStoryChoice.equals("Space")) {
            mBackground.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.space));
        } else if(mUserStoryChoice.equals("Adventure")) {
            mBackground.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable
                    .adventure));
        }

        final String[] mNewWordRequests = mCrazyLibDictionary.getWordRequests(mUserStoryChoice);

        final Intent sendIntent = new Intent(QuestionsActivity.this, CrazyLibParaActivity.class);

        mWordRequest.setHint("Choose a " + mNewWordRequests[mCurrentWord]);
        mSubmitWordButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mUserWords.add(mWordRequest.getText().toString());
                mCurrentWord += 1;
                if(mCurrentWord > (mNewWordRequests.length - 1)) {
                    mCurrentWord = 0;
                    Toast.makeText(QuestionsActivity.this, "All words have been recorded", Toast
                            .LENGTH_LONG).show();
                    String newCrazyLibParagraph = mCrazyLibDictionary.getCrazyParagraph(mUserStoryChoice,
                            mUserWords);
                    sendIntent.putExtra("madLibbedParagraph", newCrazyLibParagraph);
                    startActivity(sendIntent);

                } else {
                    mWordRequest.setText("");
                    mWordRequest.setHint("Choose a " + mNewWordRequests[mCurrentWord]);
                }

            }
        });
    }
}
