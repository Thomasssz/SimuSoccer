package process;

import java.util.ArrayList;
import java.util.Random;

import data.Player;
import data.Player.position;
import gui.Dashboard;

public class Move {

	private ArrayList<Player> team1 = null;
	private ArrayList<Player> team2 = null;

	public void Movement(Dashboard dash, String ball, Player player_ball) {

		team1 = dash.getTeam1();
		team2 = dash.getTeam2();

		if (ball.equals("blue")) {

			for (int i = 1; i <= 10; i++) {

				Player player = team1.get(i);

				boolean limit_x = blueCheckForwardLimit(player);

				if (limit_x == true) {
					player.setX(player.getX() + 10);
				}

				Random choice = new Random();
				int direction = choice.nextInt(2);
				direction += 1;

				boolean limit_up = blueCheckUpLimit(player);
				boolean limit_down = blueCheckDownLimit(player);

				if (direction == 1) {

					if (limit_up == true) {

						player.setY(player.getY() - 20);

					}

				} else if (direction == 2) {

					if (limit_down == true) {

						player.setY(player.getY() + 20);

					}

				}

			if (player.equals(player_ball)) {
				dash.getBallon().setPositionx_Ball(player_ball.getX());
			}
			
			}

			for (int i = 1; i <= 10; i++) {

				Player player = team2.get(i);

				boolean limit = redCheckBackwardLimit(player);

				if (limit == true) {
					player.setX(player.getX() + 10);
				}

				Random choice = new Random();
				int direction = choice.nextInt(2);
				direction += 1;

				boolean limit_up = redCheckUpLimit(player);
				boolean limit_down = redCheckDownLimit(player);

				if (direction == 1) {

					if (limit_up == true) {

						player.setY(player.getY() - 20);

					}

				} else if (direction == 2) {

					if (limit_down == true) {

						player.setY(player.getY() + 20);

					}

				}
			}

		} else if (ball.equals("red")) {

			for (int i = 1; i <= 10; i++) {

				Player player = team2.get(i);

				boolean limit = redCheckForwardLimit(player);

				if (limit == true) {
					player.setX(player.getX() - 10);
				}

				Random choice = new Random();
				int direction = choice.nextInt(2);
				direction += 1;

				boolean limit_up = redCheckUpLimit(player);
				boolean limit_down = redCheckDownLimit(player);

				if (direction == 1) {

					if (limit_up == true) {

						player.setY(player.getY() - 20);

					}

				} else if (direction == 2) {

					if (limit_down == true) {

						player.setY(player.getY() + 20);

					}

				}

				if (player.equals(player_ball)) {
					dash.getBallon().setPositionx_Ball(player_ball.getX());
				}
			}

			for (int i = 1; i <= 10; i++) {

				Player player = team1.get(i);

				boolean limit = blueCheckBackwardLimit(player);

				if (limit == true) {
					player.setX(player.getX() - 10);
				}

				Random choice = new Random();
				int direction = choice.nextInt(2);
				direction += 1;

				boolean limit_up = blueCheckUpLimit(player);
				boolean limit_down = blueCheckDownLimit(player);

				if (direction == 1) {

					if (limit_up == true) {

						player.setY(player.getY() - 20);

					}

				} else if (direction == 2) {

					if (limit_down == true) {

						player.setY(player.getY() + 20);

					}

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
			return false;
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

			if ((player.getX() - 10) > 210) {
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
			return false;
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
			return false;
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
			return false;
		}
	}

	public boolean blueCheckUpLimit(Player player) {

		if ((player.getNumber() == 2) || (player.getNumber() == 6)) {

			if ((player.getY() - 10) > 60) {
				return true;
			} else {
				return false;
			}

		} else if ((player.getNumber() == 5) || (player.getNumber() == 9)) {

			if ((player.getY() - 10) > 442) {
				return true;
			} else {
				return false;
			}

		} else if ((player.getNumber() == 3) || (player.getNumber() == 7) || (player.getNumber() == 10)) {

			if ((player.getY() - 10) > 181) {
				return true;
			} else {
				return false;
			}

		} else if ((player.getNumber() == 4) || (player.getNumber() == 8) || (player.getNumber() == 11)) {

			if ((player.getY() - 10) > 311) {
				return true;
			} else {
				return false;
			}
		} else {
			return false ;
		}
	}

	public boolean blueCheckDownLimit(Player player) {

		if ((player.getNumber() == 2) || (player.getNumber() == 6)) {

			if ((player.getY() + 10) < 181) {
				return true;
			} else {
				return false;
			}

		} else if ((player.getNumber() == 5) || (player.getNumber() == 9)) {

			if ((player.getY() + 10) < 563) {
				return true;
			} else {
				return false;
			}

		} else if ((player.getNumber() == 3) || (player.getNumber() == 7) || (player.getNumber() == 10)) {

			if ((player.getY() + 10) < 311) {
				return true;
			} else {
				return false;
			}

		} else if ((player.getNumber() == 4) || (player.getNumber() == 8) || (player.getNumber() == 11)) {

			if ((player.getY() + 10) < 442) {
				return true;
			} else {
				return false;
			}
		} else {
			return false ;
		}
	}

	public boolean redCheckUpLimit(Player player) {

		if ((player.getNumber() == 13) || (player.getNumber() == 17)) {

			if ((player.getY() - 10) > 60) {
				return true;
			} else {
				return false;
			}

		} else if ((player.getNumber() == 16) || (player.getNumber() == 20)) {

			if ((player.getY() - 10) > 442) {
				return true;
			} else {
				return false;
			}

		} else if ((player.getNumber() == 14) || (player.getNumber() == 18) || (player.getNumber() == 22)) {

			if ((player.getY() - 10) > 181) {
				return true;
			} else {
				return false;
			}

		} else if ((player.getNumber() == 15) || (player.getNumber() == 19) || (player.getNumber() == 21)) {

			if ((player.getY() - 10) > 311) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	public boolean redCheckDownLimit(Player player) {

		if ((player.getNumber() == 13) || (player.getNumber() == 17)) {

			if ((player.getY() + 10) < 181) {
				return true;
			} else {
				return false;
			}

		} else if ((player.getNumber() == 16) || (player.getNumber() == 20)) {

			if ((player.getY() + 10) < 563) {
				return true;
			} else {
				return false;
			}

		} else if ((player.getNumber() == 14) || (player.getNumber() == 18) || (player.getNumber() == 22)) {

			if ((player.getY() + 10) < 311) {
				return true;
			} else {
				return false;
			}

		} else if ((player.getNumber() == 15) || (player.getNumber() == 19) || (player.getNumber() == 21)) {

			if ((player.getY() + 10) < 442) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
}