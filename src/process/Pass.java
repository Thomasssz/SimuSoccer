package process;

import java.util.ArrayList;
import java.util.Random;

import data.Ball;
import data.Player;

public class Pass {

	private static int ball_player_x;
	private static int ball_player_y ;

	public static Player get_Player_Ball(Ball ballon, ArrayList<Player> players1, ArrayList<Player> players2) {

		int i = 0;
		boolean stop = false;

		while (i < players1.size() && (stop == false)) {

			System.out.println("cc1");

			if (players1.get(i).isBall() == true) {

				stop = true;

				System.out.println("cc2");

				ball_player_x = players1.get(i).getX();
				ball_player_y = players1.get(i).getY();

				ballon.setPositionx_Ball(players2.get(i).getX() + 10);
				ballon.setPositiony_Ball(players2.get(i).getY() + 10);

			}

			if (players2.get(i).isBall() == true) {

				stop = true;

				System.out.println("cc3");

				ball_player_x = players2.get(i).getX();
				ball_player_y = players2.get(i).getY();

				ballon.setPositionx_Ball(players2.get(i).getX() + 10);
				ballon.setPositiony_Ball(players2.get(i).getY() + 10);

				return players2.get(i);

			}

			i++;

		}

		return null;
	}

	public static void pass_sequence(Ball ballon, ArrayList<Player> players1, ArrayList<Player> players2) {

		Player ballPlayer = get_Player_Ball(ballon, players1, players2);

		int x_ballPlayer = ballPlayer.getX();
		int y_ballPlayer = ballPlayer.getY();

		for (int i = 0; i < players1.size(); i++) {

			if (players1.get(i).isBall() == true) {

				int inter_x1_neg = ball_player_x - 5;
				int inter_x1_plus = ball_player_x + 5;

				int inter_y1_neg = ball_player_y - 5;
				int inter_y1_plus = ball_player_y + 5;

				for (int x1 = 0; (x1 < 815) && (x1 > 75); x1 += 10) {

					for (int y1 = 0; (y1 < 815) && (y1 > 75); y1 += 10) {

						for (int i1 = 0; i < players1.size(); i++) {

							if (players1.get(i1).getX() <= inter_x1_neg || players1.get(i1).getX() <= inter_x1_plus
									|| players1.get(i1).getX() <= inter_y1_neg
									|| players1.get(i1).getX() <= inter_y1_plus) {

								players1.get(i1).setBall(true);

								ballon.setPositionx_Ball(players1.get(i1).getX() + 10);
								ballon.setPositiony_Ball(players1.get(i1).getY() + 10);

							}

						}

					}

				}
			}

		}
	}

}
