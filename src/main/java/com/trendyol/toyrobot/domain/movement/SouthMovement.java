package com.trendyol.toyrobot.domain.movement;

import com.trendyol.toyrobot.domain.Compass;

public class SouthMovement implements Movement{
    @Override
    public int moveX(int x) {
        return x;
    }

    @Override
    public int moveY(int y) {
        return y - 1;
    }

    @Override
    public Compass turnLeft() {
        return Compass.EAST;
    }

    @Override
    public Compass turnRight() {
        return Compass.WEST;
    }
}
