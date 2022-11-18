package com.example.jigsaw_puzzle;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;


import java.io.File;
import java.io.IOException;

public class PlayPuzzle<Graphics> extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_puzzle);

        //画像の取得
        Resources resources = getResources();
        Bitmap image = BitmapFactory.decodeResource(resources, R.drawable.free_illustration);

        int imageHeight = image.getHeight();    //縦
        int imageWidth = image.getWidth();   //横

        //分割リストの作成
        int splitx = 3; //縦の分割
        int splity = 4; //横の分割
        int TotalImageNum = splitx * splity;
        int x = 0;  //x座標
        int y = 0;  //y座標

        Bitmap[] imageList = new Bitmap[TotalImageNum];

        for(int i = 0; i < TotalImageNum; i++){
            //行の変更毎にx座標を0に戻す
            if(i > 0 && i % splitx == 0){
                x = 0;
                y += imageHeight / splity;
            }else if(i > 0){
                x += imageWidth / splitx;
            }
            imageList[i] = Bitmap.createBitmap(image, x, y, imageHeight/splitx, imageHeight/splity);

        }

    }

}