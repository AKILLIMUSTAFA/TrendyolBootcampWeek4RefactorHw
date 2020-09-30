package com.trendyol.toyrobot.domain.movement;

import com.trendyol.toyrobot.domain.Compass;

public interface Movement {
    int moveX(int x);
    int moveY(int y);
    Compass turnLeft();
    Compass turnRight();
}
