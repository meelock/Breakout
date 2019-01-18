package com.meelock.test;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.PolygonShape;
import com.meelock.test.utils.Constants;
import com.meelock.test.utils.GameWorld;

public class CreateBricks {

    private static final float x = 0f;
    private static final float y = 0f;

    /**
     * Offset of the top brick row from the top
     */
    private static final int BRICK_Y_OFFSET = 70;

    public static void createBricks () {
        BodyDef bodyDef = new BodyDef();
        bodyDef.position.set( new Vector2( x + Constants.APPLICATION_WIDTH / 2, y + Constants.APPLICATION_HEIGHT / 2));

        PolygonShape shape = new PolygonShape();
        shape.setAsBox( Constants.APPLICATION_WIDTH / 2, Constants.APPLICATION_HEIGHT / 2 );

        Body body = GameWorld.world.createBody(bodyDef);
        body.createFixture(shape, 1f);

    }


//for (int row = 0; row < NBRICK_ROWS; row++) {
//            for (int xBrick = 1; xBrick < NBRICKS_PER_ROW; xBrick++) {
//                BrickBreaker.shapeRenderer.rect((xBrick - 1) * (BRICK_WIDTH + BRICK_SEP) + BRICK_SEP + BRICK_WIDTH / 2,
//                 BrickBreaker.APPLICATION_HEIGHT - row * (BRICK_HEIGHT + BRICK_SEP) - BRICK_Y_OFFSET, BRICK_WIDTH, BRICK_HEIGHT);
//                switch (row + 1) {
//                    case 1:
//                    case 2:
//                        BrickBreaker.shapeRenderer.setColor(Color.RED);
//                        break;
//                    case 3:
//                    case 4:
//                        BrickBreaker.shapeRenderer.setColor(Color.ORANGE);
//                        break;
//                    case 5:
//                    case 6:
//                        BrickBreaker.shapeRenderer.setColor(Color.YELLOW);
//                        break;
//                    case 7:
//                    case 8:
//                        BrickBreaker.shapeRenderer.setColor(Color.GREEN);
//                        break;
//                    case 9:
//                    case 10:
//                        BrickBreaker.shapeRenderer.setColor(Color.BLUE);
//                        break;
//                }
//            }
//        }
}
