package com.meelock.test;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.PolygonShape;
import com.meelock.test.utils.Constants;
import com.meelock.test.utils.GameWorld;

public class Paddle {

    private static boolean paddleCreated = false;


    public static void movePaddle() {

        if (Gdx.input.getX() > 0 && Gdx.input.getX() < Constants.APPLICATION_WIDTH - Constants.PADDLE_WIDTH)
            definePaddle(Gdx.input.getX());
        if (Gdx.input.getX() > Constants.APPLICATION_WIDTH - Constants.PADDLE_WIDTH)
            definePaddle(Gdx.input.getX());

    }

    public static void definePaddle(int paddleX) {
        if (!paddleCreated) {
            BodyDef bodyDef = new BodyDef();
            PolygonShape shape = new PolygonShape();
            shape.setAsBox(Constants.PADDLE_WIDTH / 2, Constants.PADDLE_HEIGHT / 2);
            bodyDef.position.set(new Vector2(Constants.WIDTH/2, Constants.PADDLE_Y_OFFSET));
            Body body = GameWorld.world.createBody(bodyDef);
            body.createFixture(shape, 1f);
            paddleCreated = true;
        }


    }
}
