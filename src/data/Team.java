package data;

import java.util.ArrayList;

public class Team {
	public String nameTeam;
	public String color;
	
	
	private static int default_x_gardien_bleu = 100;
	private static int default_y_gardien_bleu = 305;

	private static int default_x_defenseur1_bleu = 200;
	private static int default_y_defenseur1_bleu = 100;

	private static int default_x_defenseur2_bleu = 200;
	private static int default_y_defenseur2_bleu = 265;

	private static int default_x_defenseur3_bleu = 200;
	private static int default_y_defenseur3_bleu = 350;

	private static int default_x_defenseur4_bleu = 200;
	private static int default_y_defenseur4_bleu = 500;

	private static int default_x_milieu1_bleu = 270;
	private static int default_y_milieu1_bleu = 100;

	private static int default_x_milieu2_bleu = 270;
	private static int default_y_milieu2_bleu = 265;

	private static int default_x_milieu3_bleu = 270;
	private static int default_y_milieu3_bleu = 350;

	private static int default_x_milieu4_bleu = 270;
	private static int default_y_milieu4_bleu = 500;

	private static int default_x_attaquant1_bleu = 360;
	private static int default_y_attaquant1_bleu = 260;

	private static int default_x_attaquant2_bleu = 360;
	private static int default_y_attaquant2_bleu = 350;

	private static int default_x_gardien_rouge = 790;
	private static int default_y_gardien_rouge = 305;

	private static int default_x_defenseur1_rouge = 690;
	private static int default_y_defenseur1_rouge = 100;

	private static int default_x_defenseur2_rouge = 690;
	private static int default_y_defenseur2_rouge = 265;

	private static int default_x_defenseur3_rouge = 690;
	private static int default_y_defenseur3_rouge = 350;

	private static int default_x_defenseur4_rouge = 690;
	private static int default_y_defenseur4_rouge = 500;

	private static int default_x_milieu1_rouge = 620;
	private static int default_y_milieu1_rouge = 100;

	private static int default_x_milieu2_rouge = 620;
	private static int default_y_milieu2_rouge = 265;

	private static int default_x_milieu3_rouge = 620;
	private static int default_y_milieu3_rouge = 350;

	private static int default_x_milieu4_rouge = 620;
	private static int default_y_milieu4_rouge = 500;

	private static int default_x_attaquant1_rouge = 530;
	private static int default_y_attaquant1_rouge = 265;

	private static int default_x_attaquant2_rouge = 530;
	private static int default_y_attaquant2_rouge = 350;

	public String getNameTeam() {

		return nameTeam;
	}

	public void setNameTeam(String nameTeam) {
		this.nameTeam = nameTeam;
	}

	public ArrayList<Player> getPlayers() {
		return players;
	}

	public void setPlayers(ArrayList<Player> players) {
		this.players = players;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public ArrayList<Player> players = new ArrayList<Player>();

	@Override
	public String toString() {
		return "Team [nameTeam=" + nameTeam + ", players=" + players + ", color=" + color + "]";
	}

	public Team(String nameTeam, ArrayList<Player> players, String color) {
		super();
		this.nameTeam = nameTeam;
		this.players = players;
		this.color = color;
		createteams();

	}

	public static ArrayList<Player> players1 = new ArrayList<>();
	public static ArrayList<Player> players2 = new ArrayList<>();

	public Team team2 = new Team("2", players2, "blue");
	public Team team1 = new Team("1", players1, "red");

	private static Player.position GOAL = Enum.valueOf(Player.position.class, "GOALKEEPER");

	private static Player.position DEF = Enum.valueOf(Player.position.class, "DEFENSE");

	private static Player.position MID = Enum.valueOf(Player.position.class, "MIDDLE");

	private static Player.position ATT = Enum.valueOf(Player.position.class, "ATTACK");
	
	
	
	
			
	

	public static void createteams() {
		

		Player p1 = new Player(20, 30, 40, 80, 90, 1, GOAL, default_x_gardien_bleu, default_y_gardien_bleu);
		Player p2 = new Player(30, 50, 40, 70, 60, 2, DEF, default_x_defenseur1_bleu, default_y_defenseur1_bleu);
		Player p3 = new Player(20, 40, 40, 70, 60, 3, DEF, default_x_defenseur2_bleu, default_y_defenseur2_bleu);
		Player p4 = new Player(30, 30, 40, 70, 70, 4, DEF, default_x_defenseur3_bleu, default_y_defenseur3_bleu);
		Player p5 = new Player(30, 40, 40, 70, 60, 5, DEF, default_x_defenseur4_bleu, default_y_defenseur4_bleu);

		Player p6 = new Player(60, 40, 60, 20, 70, 7, MID, default_x_milieu1_bleu, default_y_milieu1_bleu);
		Player p7 = new Player(60, 50, 70, 30, 60, 8, MID, default_x_milieu2_bleu, default_y_milieu2_bleu);
		Player p8 = new Player(50, 30, 50, 40, 80, 9, MID, default_x_milieu3_bleu, default_y_milieu3_bleu);
		Player p9 = new Player(60, 40, 60, 20, 70, 7, MID, default_x_milieu4_bleu, default_y_milieu4_bleu);

		Player p10 = new Player(80, 80, 50, 40, 80, 10, ATT, default_x_attaquant1_bleu, default_y_attaquant1_bleu);
		Player p11 = new Player(100, 90, 100, 50, 100, 11, ATT, default_x_attaquant2_bleu, default_y_attaquant2_bleu);

		players1.add(p1);

		players1.add(p2);
		players1.add(p3);
		players1.add(p4);
		players1.add(p5);

		players1.add(p6);
		players1.add(p7);
		players1.add(p8);
		players1.add(p9);

		players1.add(p10);
		players1.add(p11);

		Player p21 = new Player(40, 50, 30, 40, 60, 1, DEF, default_x_defenseur1_rouge, default_y_defenseur1_rouge);
		Player p22 = new Player(30, 45, 40, 30, 65, 2, DEF, default_x_defenseur2_rouge, default_y_defenseur2_rouge);
		Player p23 = new Player(35, 40, 50, 45, 70, 3, DEF, default_x_defenseur3_rouge, default_y_defenseur3_rouge);
		Player p24 = new Player(45, 40, 45, 35, 70, 4, DEF, default_x_defenseur4_rouge, default_y_defenseur4_rouge);

		Player p25 = new Player(60, 30, 60, 80, 0, 5, MID, default_x_milieu1_rouge, default_y_milieu1_rouge);
		Player p26 = new Player(65, 40, 50, 85, 0, 6, MID, default_x_milieu2_rouge, default_y_milieu2_rouge);
		Player p27 = new Player(70, 45, 65, 90, 0, 7, MID, default_x_milieu3_rouge, default_y_milieu3_rouge);
		Player p28 = new Player(75, 50, 55, 70, 0, 8, MID, default_x_milieu4_rouge, default_y_milieu4_rouge);

		Player p29 = new Player(90, 85, 85, 55, 90, 9, ATT, default_x_attaquant1_rouge, default_y_attaquant1_rouge);
		Player p210 = new Player(95, 90, 80, 50, 100, 10, ATT, default_x_attaquant2_rouge, default_y_attaquant2_rouge);

		Player p211 = new Player(50, 60, 30, 90, 90, 11, GOAL, default_x_gardien_rouge, default_y_gardien_rouge);

		players2.add(p211);
		players2.add(p21);
		players2.add(p22);
		players2.add(p23);
		players2.add(p24);
		players2.add(p25);
		players2.add(p26);
		players2.add(p27);
		players2.add(p28);
		players2.add(p29);
		players2.add(p210);
		

	//	Team.parcoursListPlayer(players1);
	//	Team.parcoursListPlayer(players2);

	}

	public static void parcoursListPlayer(ArrayList<Player> list) {

		for (Player p : list) {

			p.toString();
			System.out.println(p);

		}

	}

}
