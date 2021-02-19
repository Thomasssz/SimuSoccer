package delimitations;

import java.util.ArrayList;
import java.util.Random;

import data.Ball;
import data.Player;

public class Touche {
	
	public void runTouche (int x, int y, Ball ball, ArrayList<Player> players) {
		
		ball.setPositionx_Ball(x);
		ball.setPositiony_Ball(y);
		
		Random tirage = new Random();
		int borne = 2;

		borne = tirage.nextInt(8);


		Player p = players.get(borne);
		
	}
	

}
