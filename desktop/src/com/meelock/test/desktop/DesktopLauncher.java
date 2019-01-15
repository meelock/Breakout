package com.meelock.test.desktop;


import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.meelock.test.MeeTestGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = MeeTestGame.APPLICATION_WIDTH;
		config.height = MeeTestGame.APPLICATION_HEIGHT;
		new LwjglApplication(new MeeTestGame(), config);
	}
}
