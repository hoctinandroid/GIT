package com.example.phuong.helicopter;

import android.graphics.Bitmap;
import android.graphics.Canvas;

import java.util.Random;

/**
 * Created by Phuong on 02/05/2015.
 */
public class MoveableItem extends GameObject {
    protected int score;
    protected int speed;
    protected Random rd = new Random();
    protected Animation animate = new Animation();
    protected Bitmap spritesheet;
    public MoveableItem(int x, int y, int w, int h){
        super.x = x;
        super.y = y;
        width = w;
        height = h;
    }
    public void initSprites(int s, int numFrames, Bitmap res){

    }
    public void update(){
        x -= speed;
        animate.update();
    }
    public void draw(Canvas canvas){
        try{
            canvas.drawBitmap(animate.getImage(), x, y, null);
        }catch(Exception e){}
    }

    @Override
    public int getWidth() {
        return width-10;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
