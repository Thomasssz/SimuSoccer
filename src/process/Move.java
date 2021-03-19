package process;

import java.util.ArrayList;

import data.Player;
import data.Player.position;
import gui.Dashboard;

public class Move {

	private ArrayList<Player> team1 = null;
	private ArrayList<Player> team2 = null;

	private Player player = null ;
	

	public void Movement(Dashboard dash, String ball, Player player_ball) {

		team1 = dash.getTeam1();
		team2 = dash.getTeam2();

		if (ball.equals("blue")) {

			for (int i = 1; i <= 10; i++) {

				Player player = team1.get(i);

				boolean limit = blueCheckForwardLimit(player);

				if (limit == true) {
					player.setX(player.getX() + 10);
					
					if (player.equals(player_ball)) {
						dash.getBallon().setPositionx_Ball(player_ball.getX()+10);
					}
				}
			}

			for (int i = 1; i <= 10; i++) {

				Player player = team2.get(i);

				boolean limit = redCheckBackwardLimit(player);

				if (limit == true) {
					player.setX(player.getX() + 10);
				}
			}

		} else if (ball.equals("red")) {

			for (int i = 1; i <= 10; i++) {

				Player player = team2.get(i);

				boolean limit = redCheckForwardLimit(player);

				if (limit == true) {
					player.setX(player.getX() - 10);
					if (player.equals(player_ball)) {
						dash.getBallon().setPositionx_Ball(player_ball.getX()-10);
					}
				}
			}

			for (int i = 1; i <= 10; i++) {

				Player player = team1.get(i);

				boolean limit = blueCheckBackwardLimit(player);

				if (limit == true) {
					player.setX(player.getX() - 10);
				}
			}

		}
	}

	public boolean blueCheckForwardLimit(Player player) {

		position poste = player.getPosition();
		
		if (poste == position.DEFENSE) {
			
			if ((player.getX() + 10) < 440) {
				return true;
			} else {
				return false;
			}
			
		} else if (poste == position.MIDDLE) {
			
			if ((player.getX() + 10) < 600) {
				return true;
			} else {
				return false;
			}
			
		} else if (poste == position.ATTACK) {
			
			if ((player.getX() + 10) < 760) {
				return true;
			} else {
				return false;
			}
		} else {
			return false ;
		}
	}
	
	public boolean blueCheckBackwardLimit(Player player) {

		position poste = player.getPosition();
		
		if (poste == position.DEFENSE) {
			
			if ((player.getX() - 10) > 120) {
				return true;
			} else {
				return false;
			}
			
		} else if (poste == position.MIDDLE) {
			
			if ((player.getX() - 10) > 2100) {
				return true;
			} else {
				return false;
			}
			
		} else if (poste == position.ATTACK) {
			
			if ((player.getX() - 10) > 440) {
				return true;
			} else {
				return false;
			}
		} else {
			return false ;
		}
	}
	
	public boolean redCheckBackwardLimit(Player player) {

		position poste = player.getPosition();
		
		if (poste == position.DEFENSE) {
			
			if ((player.getX() + 10) < 760) {
				return true;
			} else {
				return false;
			}
			
		} else if (poste == position.MIDDLE) {
			
			if ((player.getX() + 10) < 650) {
				return true;
			} else {
				return false;
			}
			
		} else if (poste == position.ATTACK) {
			
			if ((player.getX() + 10) < 440) {
				return true;
			} else {
				return false;
			}
		} else {
			return false ;
		}
	}
	
	public boolean redCheckForwardLimit(Player player) {

		position poste = player.getPosition();
		
		if (poste == position.DEFENSE) {
			
			if ((player.getX() - 10) > 440) {  
				return true;
			} else {
				return false;
			}
			
		} else if (poste == position.MIDDLE) {
			
			if ((player.getX() - 10) > 280) { 
				return true;
			} else {
				return false;
			}
			
		} else if (poste == position.ATTACK) {
			
			if ((player.getX() - 10) > 120) { 
				return true;
			} else {
				return false;
			}
		} else {
			return false ;
		}
	}

}
