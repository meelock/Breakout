package com.meelock.test;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.physics.box2d.World;

public class BrickBreaker extends Game {

    /**
     * Score of the game.
     */
    private int gameScore = 0;

    /**
     * Turn of game.
     */
    private int turn = 0;

    /**
     * Sets the speed of the game.
     */
    private int gameSpeed = 5;

    /* Method: run() */

    /**
     * Runs the Breakout program.
     */
    public World world;
    private final float worldGravity = 0f;

    @Override
    public void create() {
        setScreen(new gameScreen());


    }
}
