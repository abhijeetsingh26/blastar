package me.dylanburton.blastarreborn.powerups;

import android.graphics.Bitmap;

/**
 * Created by Dylan on 8/3/2017.
 */

public class SlowTime extends Powerup {

    public SlowTime(Bitmap slowTime, float x, float y){
        powerupType = PowerupType.SLOWTIME;
        this.dy = 3;
        this.x = x;
        this.y = y;
        this.bmp = slowTime;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public Bitmap getBitmap() {
        return bmp;
    }

    public void setBitmap(Bitmap slowTime) {
        this.bmp = slowTime;
    }

    public float getDy() {
        return dy;
    }

    public void setDy(float dy) {
        this.dy = dy;
    }

    public PowerupType getPowerupType() {
        return powerupType;
    }

}
