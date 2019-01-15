package com.meelock.test;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

import java.util.Random;

public class Ball {
    static ShapeRenderer shapeRenderer = MeeTestGame.shapeRenderer;

    public static int ballX = MeeTestGame.APPLICATION_WIDTH/2;
    public static int ballY = MeeTestGame.APPLICATION_HEIGHT/2;
    /**
     * Radius of the ball in pixels
     */
    public static final int BALL_RADIUS = 10;


    /**
     * Velocity of ball.
     */
    public static double vx, vy = 3;

    static Random rn = new Random();
    public static void moveBall() {
        shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
        shapeRenderer.circle(ballX, ballY, BALL_RADIUS);
        shapeRenderer.end();
    }
}
