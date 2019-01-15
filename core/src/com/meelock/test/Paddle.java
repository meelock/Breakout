package com.meelock.test;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class Paddle {
    /**
     * Dimensions of the paddle
     */
    private static final int PADDLE_WIDTH = 60;
    private static final int PADDLE_HEIGHT = 10;
    /**
     * Offset of the paddle up from the bottom
     */
    private static final int PADDLE_Y_OFFSET = 30;

    static ShapeRenderer shapeRenderer = MeeTestGame.shapeRenderer;
    private static int paddleX = 0;

    public static void movePaddle() {
        if (Gdx.input.getX() > 0 && Gdx.input.getX() < MeeTestGame.APPLICATION_WIDTH - PADDLE_WIDTH)
            paddleX = Gdx.input.getX();
        if (Gdx.input.getX() > MeeTestGame.APPLICATION_WIDTH - PADDLE_WIDTH)
            paddleX = MeeTestGame.APPLICATION_WIDTH - PADDLE_WIDTH;
        shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
        shapeRenderer.setColor(Color.BLACK);
        shapeRenderer.rect(paddleX, PADDLE_Y_OFFSET, PADDLE_WIDTH, PADDLE_HEIGHT);
        shapeRenderer.end();
    }
}
