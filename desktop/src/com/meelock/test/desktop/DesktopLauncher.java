package com.meelock.test.desktop;


import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.meelock.test.BrickBreaker;
import com.meelock.test.utils.Constants;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = Constants.APPLICATION_WIDTH;
		config.height = Constants.APPLICATION_HEIGHT;
		new LwjglApplication(new BrickBreaker(), config);
	}
}
