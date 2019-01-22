package com.meelock.test.utils;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.physics.box2d.Box2DDebugRenderer;
import com.badlogic.gdx.physics.box2d.World;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.meelock.test.Ball;
import com.meelock.test.CreateBricks;

public class GameWorld extends Stage {

    public static World world;

    private final float TIME_STEP = 1 / 300f;
    private float accumulator = 0f;

    private OrthographicCamera camera;
    private Box2DDebugRenderer renderer;
    public static ShapeRenderer shapeRenderer;

    public GameWorld() {
        world = WorldUtils.createWorld();
        renderer = new Box2DDebugRenderer();
        shapeRenderer = new ShapeRenderer();
        Ball.moveBall();
        setupCamera();
    }

    private void setupCamera() {
        camera = new OrthographicCamera(Constants.APPLICATION_WIDTH, Constants.APPLICATION_HEIGHT);
        camera.position.set(camera.viewportWidth / 2, camera.viewportHeight / 2, 0f);
        camera.update();
    }

    @Override
    public void act(float delta) {
        super.act(delta);

        // Fixed timestep
        accumulator += delta;

        while (accumulator >= delta) {
            world.step(TIME_STEP, 6, 2);
            accumulator -= TIME_STEP;
        }

        CreateBricks.createBricks();


        //TODO: Implement interpolation

    }

    @Override
    public void draw() {
        super.draw();
        renderer.render(world, camera.combined);
    }
}
