package com.vizo.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class CrazyLibParaActivity extends AppCompatActivity {
    @Bind(R.id.textViewParagraph) TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crazy_lib_para);

        ButterKnife.bind(this);

        Intent intent = getIntent();
        String paragraph = intent.getStringExtra("madLibbedParagraph");
        mTextView.setText(paragraph);

    }
}
