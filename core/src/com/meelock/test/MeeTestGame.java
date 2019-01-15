package com.meelock.test;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

import java.util.Random;

public class MeeTestGame extends ApplicationAdapter {

    private ShapeRenderer shapeRenderer;

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
     * Dimensions of the paddle
     */
    private static final int PADDLE_WIDTH = 60;
    private static final int PADDLE_HEIGHT = 10;

    /**
     * Offset of the paddle up from the bottom
     */
    private static final int PADDLE_Y_OFFSET = 30;

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
     * Radius of the ball in pixels
     */
    private static final int BALL_RADIUS = 10;

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
     * Velocity of ball.
     */
    private double vx, vy = 3;

    /**
     * Sets the speed of the game.
     */
    private int gameSpeed = 5;


    private int paddleX = 0;
    private int ballX = APPLICATION_WIDTH/2;
    private int ballY = APPLICATION_HEIGHT/2;

    /* Method: run() */

    /**
     * Runs the Breakout program.
     */

    @Override
    public void create() {
        shapeRenderer = new ShapeRenderer();


    }

    @Override
    public void render() {
        Gdx.gl.glClearColor(0, 0, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        drawBall();
        drawPaddle();
    }

    private void drawBall() {
        Random rn = new Random();
        shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
        shapeRenderer.circle(ballX, ballY, BALL_RADIUS);
        shapeRenderer.end();
        ballX += vx; ballY += vy;
        if (ballY <= 0) {
            ballX = 0;
            vx = 1.0 + (3.0 - 1.0) * rn.nextDouble();
            if (rn.nextBoolean()) vx = -vx;
            if (rn.nextBoolean()) vy = -vy;
        } else if (ballX <= 0) {
            ballX = 0;
            vx = 1.0 + (3.0 - 1.0) * rn.nextDouble();
            if (rn.nextBoolean()) vx = -vx;
            if (rn.nextBoolean()) vy = -vy;
        }
        if (ballX + BALL_RADIUS * 2 >= ACTUAL_APPLICATION_WIDTH - BALL_RADIUS * 2
        ) {
            vx = -1.0 + (3.0 - 1.0) * rn.nextDouble();
            if (rn.nextBoolean()) vy = -vy;
        }
    }

    private void drawPaddle() {
        if (Gdx.input.getX() > 0 && Gdx.input.getX() < APPLICATION_WIDTH - PADDLE_WIDTH) paddleX = Gdx.input.getX();
        if (Gdx.input.getX() > APPLICATION_WIDTH - PADDLE_WIDTH) paddleX = APPLICATION_WIDTH - PADDLE_WIDTH;
        shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
        shapeRenderer.setColor(Color.BLACK);
        shapeRenderer.rect(paddleX, PADDLE_Y_OFFSET, 60, 10);
        shapeRenderer.end();
    }

    @Override
    public void dispose() {
        shapeRenderer.dispose();
    }
}
