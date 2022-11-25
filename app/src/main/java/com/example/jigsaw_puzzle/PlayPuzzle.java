package com.example.jigsaw_puzzle;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TextView;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


import java.io.File;
import java.io.IOException;

public class PlayPuzzle<Graphics> extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_puzzle);

        Button Back = (Button)findViewById(R.id.back_button);
        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PlayPuzzle.this,Title.class);
                startActivity(intent);
            }
        });

        //画像の取得
        Resources resources = getResources();
        Bitmap image = BitmapFactory.decodeResource(resources, R.drawable.illust1); //画像の変更

        int imageHeight = image.getHeight();    //縦
        int imageWidth = image.getWidth();   //横

        //分割リストの作成
        int splitx = 4; //縦の分割数
        int splity = 4; //横の分割数
        int TotalImageNum = splitx * splity;
        int x = 0;  //x座標
        int y = 0;  //y座標

        //画像の画面表示
        Bitmap[] imageList = new Bitmap[TotalImageNum];

        TableLayout aaa = (TableLayout) findViewById(R.id.abc);

        int WC = ViewGroup.LayoutParams.WRAP_CONTENT;

        //画像の切り取り
        for(int i = 0; i < TotalImageNum; i++){
            //行の変更毎にx座標を0に戻す
            if(i > 0 && i % splitx == 0){
                x = 0;
                y += imageHeight / splity;
            }else if(i > 0){
                x += imageWidth / splitx;
            }
            imageList[i] = Bitmap.createBitmap(image, x, y, imageHeight/splitx, imageHeight/splity);

            ImageView splitImage = new ImageView(this);
            splitImage.setImageBitmap(imageList[i]);
            aaa.addView(splitImage, new TableLayout.LayoutParams(WC, 200));  //サイズの変更

        }

        //マス目の表示
        GridLayout layout = new GridLayout(this);
        layout.setColumnCount(splitx);  //縦マス目の確保
        layout.setRowCount(splity); //横マス目の確保


/*
        for(int j = 0; j < splitx; j++){
            for(int k = 0; k < splity; k++){
                //グリッドレイアウトの位置指定
                GridLayout.LayoutParams param = new GridLayout.LayoutParams(GridLayout.spec(j), GridLayout.spec(k));
                param.width = 10;
                param.height = 10;

                //配置文字
                //TextView tv = new TextView(this);
                //tv.setText(String.format("%4d", (j+1) * (k+1)));

                //グリッドレイアウトに追加
                //layout.addView(tv, param);
            }
        }
        //画面にグリッドレイアウトを表示
        setContentView(layout);
*/
    }



}
