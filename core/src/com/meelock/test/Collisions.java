package com.meelock.test;

public class Collisions {
    public static void collide() {
        ballCollisons();
    }
    private static void ballCollisons() {
        Ball.ballX += Ball.vx; Ball.ballY += Ball.vy;
        if (Ball.ballY <= 0) {
            Ball.ballX = 0;
            Ball.vx = 1.0 + (3.0 - 1.0) * Ball.rn.nextDouble();
            if (Ball.rn.nextBoolean()) Ball.vx = -Ball.vx;
            if (Ball.rn.nextBoolean()) Ball.vy = -Ball.vy;
        } else if (Ball.ballX <= 0) {
            Ball.ballX = 0;
            Ball.vx = 1.0 + (3.0 - 1.0) * Ball.rn.nextDouble();
            if (Ball.rn.nextBoolean()) Ball.vx = -Ball.vx;
            if (Ball.rn.nextBoolean()) Ball.vy = -Ball.vy;
        }
        if (Ball.ballX + Ball.BALL_RADIUS * 2 >= MeeTestGame.ACTUAL_APPLICATION_WIDTH - Ball.BALL_RADIUS * 2
        ) {
            Ball.vx = -1.0 + (3.0 - 1.0) * Ball.rn.nextDouble();
            if (Ball.rn.nextBoolean()) Ball.vy = -Ball.vy;
        }
    }
}
