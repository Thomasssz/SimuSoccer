package process;

import java.util.ArrayList;

import data.Player;
import gui.Dashboard;

public class Passe {

	private int index_of_ball_player;

	private static Player.position DEF = Enum.valueOf(Player.position.class, "DEFENSE");

	private Player passeur = new Player("2", 30, 50, 40, 70, 60, 100, 50, 2, DEF, 200, 100, false);
	private Player receveur = new Player("3", 20, 40, 40, 70, 60, 100, 60, 3, DEF, 200, 265, false);

	public Passe() {
		super();
	}

	public void testPass(Dashboard dash) {

		ArrayList<Player> team1 = dash.getTeam1();
		ArrayList<Player> team2 = dash.getTeam2();

		ArrayList<Player> team_of_ball_player = null;

		for (int i = 0; i < team1.size(); i++) {
			if (team1.get(i).isBall() == true) {
				passeur = team1.get(i);

				index_of_ball_player = i;
				team_of_ball_player = team1;
			}
		}

		for (int i = 0; i < team2.size(); i++) {
			if (team2.get(i).isBall() == true) {
				passeur = team2.get(i);

				index_of_ball_player = i;
				team_of_ball_player = team2;
			}
		}

		for (int i = 0; i < team_of_ball_player.size(); i++) {

			if (index_of_ball_player != i) {

				int res = (passeur.getX() - (team_of_ball_player.get(i).getX()));
				int result = Math.abs(res);

				if (result > 50) {
					receveur = team_of_ball_player.get(i);

				}
			}
		}

		int res_x = (dash.getBallon().getPositionx_Ball()) - receveur.getX();
		int res_y = (dash.getBallon().getPositiony_Ball()) - receveur.getY();

		int result_x = Math.abs(res_x);
		int result_y = Math.abs(res_y);

		if ((result_x < 6) && (result_y < 6)) {
			dash.setStop_action(true);
		}

		if (dash.isStop_action() == false) {

			if (dash.getBallon().getPositionx_Ball() > receveur.getX()) {

				if (dash.getBallon().getPositiony_Ball() <= receveur.getY()) {

					dash.getBallon().setPositionx_Ball(dash.getBallon().getPositionx_Ball() - 5);
					dash.getBallon().setPositiony_Ball(dash.getBallon().getPositiony_Ball() + 5);

				} else if (dash.getBallon().getPositiony_Ball() > receveur.getY()) {

					dash.getBallon().setPositionx_Ball(dash.getBallon().getPositionx_Ball() - 5);
					dash.getBallon().setPositiony_Ball(dash.getBallon().getPositiony_Ball() - 5);

				}

			} else if (dash.getBallon().getPositionx_Ball() <= receveur.getX()) {

				if (dash.getBallon().getPositiony_Ball() <= receveur.getY()) {

					dash.getBallon().setPositionx_Ball(dash.getBallon().getPositionx_Ball() + 5);
					dash.getBallon().setPositiony_Ball(dash.getBallon().getPositiony_Ball() + 5);

				} else if (dash.getBallon().getPositiony_Ball() > receveur.getY()) {

					dash.getBallon().setPositionx_Ball(dash.getBallon().getPositionx_Ball() + 5);
					dash.getBallon().setPositiony_Ball(dash.getBallon().getPositiony_Ball() - 5);

				}

			}

		}

	}

	public void pass(Dashboard dash,Player passeur,Player receveur) {

		int res_x = (dash.getBallon().getPositionx_Ball()) - receveur.getX();
		int res_y = (dash.getBallon().getPositiony_Ball()) - receveur.getY();

		int result_x = Math.abs(res_x);
		int result_y = Math.abs(res_y);

		if ((result_x < 6) && (result_y < 6)) {
			
			dash.setStop_action(true);
			
			passeur.setBall(false);
			receveur.setBall(true);
		}

		if (dash.isStop_action() == false) {

			if (dash.getBallon().getPositionx_Ball() > receveur.getX()) {

				if (dash.getBallon().getPositiony_Ball() <= receveur.getY()) {

					dash.getBallon().setPositionx_Ball(dash.getBallon().getPositionx_Ball() - 5);
					dash.getBallon().setPositiony_Ball(dash.getBallon().getPositiony_Ball() + 5);

				} else if (dash.getBallon().getPositiony_Ball() > receveur.getY()) {

					dash.getBallon().setPositionx_Ball(dash.getBallon().getPositionx_Ball() - 5);
					dash.getBallon().setPositiony_Ball(dash.getBallon().getPositiony_Ball() - 5);

				}

			} else if (dash.getBallon().getPositionx_Ball() <= receveur.getX()) {

				if (dash.getBallon().getPositiony_Ball() <= receveur.getY()) {

					dash.getBallon().setPositionx_Ball(dash.getBallon().getPositionx_Ball() + 5);
					dash.getBallon().setPositiony_Ball(dash.getBallon().getPositiony_Ball() + 5);

				} else if (dash.getBallon().getPositiony_Ball() > receveur.getY()) {

					dash.getBallon().setPositionx_Ball(dash.getBallon().getPositionx_Ball() + 5);
					dash.getBallon().setPositiony_Ball(dash.getBallon().getPositiony_Ball() - 5);

				}

			}

		}

	}

}
