package com.meelock.test;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class MeeTestGame extends ApplicationAdapter {

    public static ShapeRenderer shapeRenderer;

    /**
     * Width and height of application window in pixels
     */
    public static final int APPLICATION_WIDTH = 400;
    public static final int APPLICATION_HEIGHT = 600;
    public static final int ACTUAL_APPLICATION_WIDTH = 419;

    /**
     * Dimensions of game board (usually the same)
     */
    private static final int WIDTH = APPLICATION_WIDTH;
    private static final int HEIGHT = APPLICATION_HEIGHT;

    /**
     * Number of bricks per row
     */
    private static final int NBRICKS_PER_ROW = 10;

    /**
     * Number of rows of bricks
     */
    private static final int NBRICK_ROWS = 10;

    /**
     * Separation between bricks
     */
    private static final int BRICK_SEP = 4;

    /**
     * Width of a brick
     */
    private static final int BRICK_WIDTH =
            (WIDTH - (NBRICKS_PER_ROW - 1) * BRICK_SEP) / NBRICKS_PER_ROW;

    /**
     * Height of a brick
     */
    private static final int BRICK_HEIGHT = 8;

    /**
     * Offset of the top brick row from the top
     */
    private static final int BRICK_Y_OFFSET = 70;

    /**
     * Number of turns
     */
    private static final int NTURNS = 3;

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

    @Override
    public void create() {
        shapeRenderer = new ShapeRenderer();
        CreateBricks.createBricks();

    }

    @Override
    public void render() {
        Gdx.gl.glClearColor(0, 0, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        Ball.moveBall();
        Paddle.movePaddle();
        Collisions.collide();
    }

    @Override
    public void dispose() {
        shapeRenderer.dispose();
    }
}
