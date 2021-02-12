package testAircraft;

import guiAircraft.MainGUI;

public class TestGame {
	public static void main(String[] args) {

		MainGUI gameMainGUI = new MainGUI("Aircraft game");

		Thread gameThread = new Thread(gameMainGUI);
		gameThread.start();
	}
}
