package com.trendyol.toyrobot.domain.movement;

import com.trendyol.toyrobot.domain.Compass;

public class EastMovement implements Movement{
    @Override
    public int moveX(int x) {
        return x + 1;
    }

    @Override
    public int moveY(int y) {
        return y;
    }

    @Override
    public Compass turnLeft() {
        return Compass.NORTH;
    }

    @Override
    public Compass turnRight() {
        return Compass.SOUTH;
    }
}
