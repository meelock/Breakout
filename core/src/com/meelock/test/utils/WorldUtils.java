package com.meelock.test.utils;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.World;

public class WorldUtils {
    public static World createWorld() {
        return new World(new Vector2(0,0), true);
    }
}
