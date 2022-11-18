package com.example.jigsaw_puzzle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class IllustSelect extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_illust_select);

        ImageButton Gazounext1 = (ImageButton)findViewById(R.id.yuyake);
        ImageButton Gazounext2 = (ImageButton)findViewById(R.id.yama);
        ImageButton Gazounext3 = (ImageButton)findViewById(R.id.syasin);
        ImageButton Gazounext4 = (ImageButton)findViewById(R.id.tenkuusima);
        Button backButton = (Button)findViewById(R.id.back);

        Gazounext1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(IllustSelect.this,PlayPuzzle.class);
                startActivity(intent);
            }
        });

        Gazounext2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(IllustSelect.this,PlayPuzzle.class);
                startActivity(intent);
            }
        });

        Gazounext3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(IllustSelect.this,PlayPuzzle.class);
                startActivity(intent);
            }
        });

        Gazounext4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(IllustSelect.this,PlayPuzzle.class);
                startActivity(intent);
            }
        });

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(IllustSelect.this,PlaySelect.class);
                startActivity(intent);
            }
        });
    }
}