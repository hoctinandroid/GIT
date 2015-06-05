package com.example.phuong.helicopter;

import android.graphics.Bitmap;
import android.graphics.Canvas;

import java.util.Random;

/**
 * Created by Phuong on 30/04/2015.
 */
public class Missile extends MoveableItem {
    public Missile(int x, int y, int w, int h){
        super(x, y, w, h);
    }

    @Override
    public void initSprites(int s, int numFrames, Bitmap res) {
        score = s;
        speed = 10 + (int) (rd.nextDouble()*score/10);
        //cap missile speed
        if(speed>50) speed = 50;
        Bitmap[] images = new Bitmap[numFrames];
        spritesheet = res;
        for(int i=0; i<images.length; i++){
            images[i] = Bitmap.createBitmap(spritesheet, 0, i*height, width, height);
        }
        animate.setFrames(images);
        animate.setDelay(100-speed);
    }

    @Override
    public void setSpeed(int speed) {
        super.setSpeed(speed);
    }
}

