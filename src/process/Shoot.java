package process;

import data.Player;
import gui.Dashboard;

public class Shoot {

	@SuppressWarnings("unused")
	private static Player.position DEF = Enum.valueOf(Player.position.class, "DEFENSE");

	public Shoot() {
		super();
	}

	public void ShootBlue(Dashboard dash, int index_tireur, int aim_x, int aim_y, boolean goal) {

		int res_x = (dash.getBallon().getPositionx_Ball()) - aim_x;
		int res_y = (dash.getBallon().getPositiony_Ball()) - aim_y;

		int result_x = Math.abs(res_x);
		int result_y = Math.abs(res_y);

		if ((result_x < 6) && (result_y < 6)) {
			
			dash.setStop_action(true);
			dash.setStop_action_shoot(true);
			dash.setShoot(false);
			dash.getTeam1().getPlayers().get(index_tireur).setBall(false);
			
			if (goal == true) {

				dash.setGoal(true);

			}
		}

		if (dash.isStop_action_shoot() == false) {

			if (dash.getBallon().getPositionx_Ball() > aim_x) {

				if (dash.getBallon().getPositiony_Ball() <= aim_y) {

					dash.getBallon().setPositionx_Ball(dash.getBallon().getPositionx_Ball() - 5);
					dash.getBallon().setPositiony_Ball(dash.getBallon().getPositiony_Ball() + 5);

				} else if (dash.getBallon().getPositiony_Ball() > aim_y) {

					dash.getBallon().setPositionx_Ball(dash.getBallon().getPositionx_Ball() - 5);
					dash.getBallon().setPositiony_Ball(dash.getBallon().getPositiony_Ball() - 5);

				}

			} else if (dash.getBallon().getPositionx_Ball() <= aim_x) {

				if (dash.getBallon().getPositiony_Ball() <= aim_y) {

					dash.getBallon().setPositionx_Ball(dash.getBallon().getPositionx_Ball() + 5);
					dash.getBallon().setPositiony_Ball(dash.getBallon().getPositiony_Ball() + 5);

				} else if (dash.getBallon().getPositiony_Ball() > aim_y) {

					dash.getBallon().setPositionx_Ball(dash.getBallon().getPositionx_Ball() + 5);
					dash.getBallon().setPositiony_Ball(dash.getBallon().getPositiony_Ball() - 5);

				}

			}

		}

	}

	public void ShootRed(Dashboard dash, int index_tireur, int aim_x, int aim_y, boolean goal) {
		
		System.out.println("on rentre dans le tir");
		
		System.out.println("aim_x = " + aim_x );
		System.out.println("aim_y = " + aim_y );

		int res_x = (dash.getBallon().getPositionx_Ball()) - aim_x;
		int res_y = (dash.getBallon().getPositiony_Ball()) - aim_y;

		int result_x = Math.abs(res_x);
		int result_y = Math.abs(res_y);

		if ((result_x < 6) && (result_y < 6)) {
			
			dash.setStop_action(true);
			dash.setStop_action_shoot(true);
			dash.setShoot(false);
			dash.getTeam2().getPlayers().get(index_tireur).setBall(false);
			
			if (goal == true) {

				dash.setGoal(true);

			}
		}

		if (dash.isStop_action_shoot() == false) {
			
			System.out.println("on vise");

			if (dash.getBallon().getPositionx_Ball() > aim_x) {

				if (dash.getBallon().getPositiony_Ball() <= aim_y) {

					dash.getBallon().setPositionx_Ball(dash.getBallon().getPositionx_Ball() - 5);
					dash.getBallon().setPositiony_Ball(dash.getBallon().getPositiony_Ball() + 5);

				} else if (dash.getBallon().getPositiony_Ball() > aim_y) {

					dash.getBallon().setPositionx_Ball(dash.getBallon().getPositionx_Ball() - 5);
					dash.getBallon().setPositiony_Ball(dash.getBallon().getPositiony_Ball() - 5);

				}

			} else if (dash.getBallon().getPositionx_Ball() <= aim_x) {

				if (dash.getBallon().getPositiony_Ball() <= aim_y) {

					dash.getBallon().setPositionx_Ball(dash.getBallon().getPositionx_Ball() + 5);
					dash.getBallon().setPositiony_Ball(dash.getBallon().getPositiony_Ball() + 5);

				} else if (dash.getBallon().getPositiony_Ball() > aim_y) {

					dash.getBallon().setPositionx_Ball(dash.getBallon().getPositionx_Ball() + 5);
					dash.getBallon().setPositiony_Ball(dash.getBallon().getPositiony_Ball() - 5);

				}

			}

		}

	}

}
