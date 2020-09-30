package com.trendyol.toyrobot.domain.movement;

import com.trendyol.toyrobot.domain.Compass;

public class WestMovement implements Movement{
    @Override
    public int moveX(int x) {
        return x - 1;
    }

    @Override
    public int moveY(int y) {
        return y;
    }

    @Override
    public Compass turnLeft() {
        return Compass.SOUTH;
    }

    @Override
    public Compass turnRight() {
        return Compass.NORTH;
    }
}
