package process;

import java.util.ArrayList;

import data.Ball;
import data.Player;
import gui.Dashboard;

public class Passe {

	private int index_of_ball_player;

	private Player passeur = new Player("2", 30, 50, 40, 70, 60, 100, 50, 2,Player.position.DEFENSE, 200, 100, false,Player.temps.SOLEIL);
	private Player receveur = new Player("3", 20, 40, 40, 70, 60, 100, 60, 3,Player.position.DEFENSE, 200, 265, false,Player.temps.SOLEIL);
	
	private Player player_zero = new Player("0", 0, 0, 0, 0, 0, 0, 0, 0,Player.position.MIDDLE, 500, 500, false, Player.temps.PLUIE);

	private ArrayList<Player> players1 = null;
	private ArrayList<Player> players2 = null;
	private ArrayList<Player> ball_team = null;

	private Player player_ball = null;

	private Player intercepteur = new Player("30", 20, 40, 40, 70, 60, 100, 60, 30,Player.position.DEFENSE, 200, 265, false, Player.temps.SOLEIL);

	public Passe() {
		super();
	}

/*	public void testPass(Dashboard dash) {

		ArrayList<Player> team1 = dash.getTeam1().getPlayers();
		ArrayList<Player> team2 = dash.getTeam2().getPlayers();

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

	} */

	public void pass(Dashboard dash, Player passeur, Player receveur) {

		if (dash.isIntercepteur() == true) {
			receveur = intercepteur;
		}
		
		System.out.println("\nPASSEUR = " + passeur.getNumber()) ;
		
		System.out.println("\nINTERCEPTEUR = " + intercepteur.getNumber()) ;
		
		System.out.println("\nRECEVEUR = " + receveur.getNumber()) ;

		int res_x = (dash.getBallon().getPositionx_Ball()) - receveur.getX();
		int res_y = (dash.getBallon().getPositiony_Ball()) - receveur.getY();

		int result_x = Math.abs(res_x);
		int result_y = Math.abs(res_y);

		if ((result_x < 6) && (result_y < 6)) {

			System.out.println("passe fini");

			dash.setStop_action(true);
			dash.setIntercepteur(false);

			passeur.setBall(false);
			receveur.setBall(true);
		}

		if (dash.isStop_action() == false) {

			if ( (player_receipt_ball(dash) == false) && (dash.isIntercepteur() == false) ) { // passe intercepte

				System.out.println("\n\n\\n\\n\\n\\n") ;
				System.out.println("INTERCEPTION") ;
				System.out.println("\n\n\\n\\n\\n\\n") ;
				dash.setIntercepteur(true);

				receveur = intercepteur;
				
			} else { // passe normal

			//	System.out.println("passe en cours");

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
	
	public void pass_failed(Dashboard dash, Player passeur, Player receveur) {

		if (dash.isIntercepteur() == true) {
			receveur = intercepteur;
		}
		
		System.out.println("\nPASSEUR = " + passeur.getNumber()) ;
		
		System.out.println("\nINTERCEPTEUR = " + intercepteur.getNumber()) ;
		
		System.out.println("\nRECEVEUR = " + receveur.getNumber()) ;

		int res_x = (dash.getBallon().getPositionx_Ball()) - receveur.getX();
		int res_y = (dash.getBallon().getPositiony_Ball()) - receveur.getY();

		int result_x = Math.abs(res_x);
		int result_y = Math.abs(res_y);

		if ((result_x < 6) && (result_y < 6)) {

			System.out.println("passe fini");

			dash.setStop_action(true);
			dash.setIntercepteur(false);

			passeur.setBall(false);
			receveur.setBall(true);
		}

		if (dash.isStop_action() == false) {

			if ( (player_receipt_ball(dash) == false) && (dash.isIntercepteur() == false) ) { // passe intercepte

				System.out.println("\n\n\\n\\n\\n\\n") ;
				System.out.println("INTERCEPTION") ;
				System.out.println("\n\n\\n\\n\\n\\n") ;
				dash.setIntercepteur(true);

				receveur = intercepteur;
				
			} else { // passe ratée

			//	System.out.println("passe en cours");
				int failed_x=receveur.getX();
				int failed_y=receveur.getY();
				
				
				
				
				
				int passeur_x=passeur.getX();
			//	int passeur_y=passeur.getY();
				if( receveur.getY()< 261) { 
		
				//failed_x=receveur.getX()+30;
				failed_y=receveur.getY()-30;
				}
				else if( receveur.getY() > 261) {
				 //failed_x=receveur.getX()-30;
				 failed_y=receveur.getY()+30;
				}
				
				if( receveur.getX()< passeur_x) { 
					
					//failed_x=receveur.getX()+30;
					failed_y=receveur.getX()-30;
					}
					else if( receveur.getX() > passeur_x) {
					 //failed_x=receveur.getX()-30;
					 failed_y=receveur.getX()+30;
					} else if(receveur.getX() == passeur_x) {
						
						 failed_y=receveur.getX();
						
					}
				
				
				
				if (dash.getBallon().getPositionx_Ball() > failed_x) {

					if (dash.getBallon().getPositiony_Ball() <= failed_y) {

						dash.getBallon().setPositionx_Ball(dash.getBallon().getPositionx_Ball() - 5);
						dash.getBallon().setPositiony_Ball(dash.getBallon().getPositiony_Ball() + 5);

					} else if (dash.getBallon().getPositiony_Ball() > receveur.getY()) {

						dash.getBallon().setPositionx_Ball(dash.getBallon().getPositionx_Ball() - 5);
						dash.getBallon().setPositiony_Ball(dash.getBallon().getPositiony_Ball() - 5);

					}

				} else if (dash.getBallon().getPositionx_Ball() <= failed_x) {

					if (dash.getBallon().getPositiony_Ball() <= failed_y) {

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

	

	public boolean player_receipt_ball(Dashboard dash) {

		players1 = dash.getTeam1().getPlayers();
		players2 = dash.getTeam2().getPlayers();

		boolean sucesspass = false;

		ball_team = TeamBall(players1, players2);

		int index_passeur = PlayerBall(ball_team);

		player_ball = ball_team.get(index_passeur);
		
		Player close_player = null ;

		if (ball_team.equals(players1)) {

			for (int i = 0; i < players2.size(); i++) {

				close_player = player_near_ball(dash, players2);
				
				if ( !(close_player.equals(null)) ) {
					
					int defense = close_player.getDefense();
					int pass = player_ball.getPass();

					if (pass > defense) {

					//	System.out.println("passe bleu reussi");
						sucesspass = true;

					} else {

						sucesspass = false;
						
						intercepteur = close_player ;

						System.out.println("passe bleu raté et intercepte par le " + close_player.getNumber() + "");

					}

				} else {

					sucesspass = true; 
				}

			}

		} else if (ball_team.equals(players2)) {

			for (int i = 0; i < players1.size(); i++) {

				 close_player = player_near_ball(dash, players1);

				if ( !(close_player.equals(null)) ) {

					int defense = close_player.getDefense();
					int pass = player_ball.getPass();

					if (pass > defense) {

					//	System.out.println("passe rouge reussi");
						sucesspass = true;

					} else {

						sucesspass = false;

						intercepteur = close_player;

						System.out.println("passe rouge raté et intercepte par le " + close_player.getNumber() );

					}

				} else {

					sucesspass = true; 
				}

			}

		}

		return sucesspass;
	}
	
	public boolean player_receipt2_ball(Dashboard dash) {

		players1 = dash.getTeam1().getPlayers();
		players2 = dash.getTeam2().getPlayers();

		boolean sucesspass = false;

		ball_team = TeamBall(players1, players2);

		int index_passeur = PlayerBall(ball_team);

		player_ball = ball_team.get(index_passeur);

		if (ball_team.equals(players1)) {

			for (int i = 0; i < players2.size(); i++) {

				Player p = players2.get(i);
				Player possible_intercepteur = player_near_ball(dash, players2);

				if (possible_intercepteur.equals(p) ) {
					
					int defense = p.getDefense();
					int pass = player_ball.getPass();

					if (pass > defense) {

					//	System.out.println("passe bleu reussi");
						sucesspass = true;

					} else {

						sucesspass = false;
						
						intercepteur = p ;

						System.out.println("passe bleu raté et intercepte par le " + p.getNumber() + "");

					}

				} else {

					sucesspass = true; 
				}

			}

		} else if (ball_team.equals(players2)) {

			for (int i = 0; i < players1.size(); i++) {

				Player p = players1.get(i);
				Player possible_intercepteur = player_near_ball(dash, players1);

				if (possible_intercepteur.equals(p) ) {

					int defense = p.getDefense();
					int pass = player_ball.getPass();

					if (pass > defense) {

					//	System.out.println("passe rouge reussi");
						sucesspass = true;

					} else {

						sucesspass = false;

						intercepteur = p;

						System.out.println("passe rouge raté et intercepte par le " + p.getNumber() );

					}

				} else {

					sucesspass = true; 
				}

			}

		}

		return sucesspass;
	}

	public Player player_near_ball(Dashboard dash, ArrayList<Player> team) {

		Ball ball = dash.getBallon();

		int ballon_x = ball.getPositionx_Ball();
		int ballon_y = ball.getPositiony_Ball();

		Player possible_intercepteur = player_zero ;

		for (int i = 0; i < team.size(); i++) {

			int player_x = team.get(i).getX();
			int player_y = team.get(i).getY();

			Player player = team.get(i);

			int distance_x = Math.abs(player_x - ballon_x);
			int distance_y = Math.abs(player_y - ballon_y);

			// System.out.println(" x= " + xp + " y=" + yp + " ");
			// System.out.println(" " + ecart1 + "<10 " + ecart2 + "<10 ");

			if ((distance_x < 7) && (distance_y < 7)) {

				possible_intercepteur = player ;
			
				System.out.println("possible intercepteur : " + possible_intercepteur.getNumber());
			}

		}

		return possible_intercepteur;

	}

	public ArrayList<Player> TeamBall(ArrayList<Player> players1, ArrayList<Player> players2) {

		int i = 0;

		boolean stop = false;

		while (i < players1.size() && (stop == false)) {

			if (players1.get(i).isBall() == true) {

			//	System.out.println("Blue got the BALL");
				stop = true;
				return players1;

			}

			if (players2.get(i).isBall() == true) {

			//	System.out.println("Red got the BALL");
				stop = true;
				return players2;

			}

			i++;

		}

		return null;

	}
	

	public int PlayerBall(ArrayList<Player> players1) {

		int res = 12;

		boolean stop = false;
		int i = 0;

		while (i < players1.size() && (stop == false)) {

			if (players1.get(i).isBall() == true) {

				stop = true;
				res = i;

			}
			i++;

		}

		return res;

	}

/*	public Player getIntercepteur() {
		return intercepteur;
	} 

	public void setIntercepteur(Player intercepteur) {
		this.intercepteur = intercepteur;
	}
*/
}
