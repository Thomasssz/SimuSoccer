package guiAircraft;

import java.awt.Graphics;

import javax.swing.JPanel;

import engine.map.Map;
import engine.mobile.Aircraft;
import engine.mobile.Enemy;
import engine.mobile.Missile;
import engine.process.MobileElementManager;

public class GameDisplay extends JPanel {

	private static final long serialVersionUID = 1L;

	private Map map;
	private MobileElementManager manager;
	private PaintStrategy paintStrategy = new PaintStrategy();

	public GameDisplay(Map map, MobileElementManager manager) {
		this.map = map;
		this.manager = manager;
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		paintStrategy.paint(map, g);

		Aircraft aircraft = manager.getAircraft();
		paintStrategy.paint(aircraft, g);

		for (Enemy enemy : manager.getEnemies()) {
			paintStrategy.paint(enemy, g);
		}

		for (Missile missile : manager.getMissiles()) {
			paintStrategy.paint(missile, g);
		}
	}

}
