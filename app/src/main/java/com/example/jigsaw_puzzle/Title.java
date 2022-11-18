package com.example.jigsaw_puzzle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class Title extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_title);

        Button newgameButton = (Button)findViewById(R.id.newgame);
        Button continueButton = (Button)findViewById(R.id.cont);
    }
}