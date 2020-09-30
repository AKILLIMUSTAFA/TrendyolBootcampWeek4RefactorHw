package com.trendyol.toyrobot.domain.movement;

import com.trendyol.toyrobot.domain.Compass;

public class MovementControl {
    public Movement getMovement(Compass compass){
        if (Compass.NORTH.equals(compass)) {
            return new NortMovement();
        } else if (Compass.WEST.equals(compass)) {
            return new WestMovement();
        } else if (Compass.SOUTH.equals(compass)) {
            return new SouthMovement();
        } else{
            return new EastMovement();
        }
    }
}
