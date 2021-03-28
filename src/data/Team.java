package data;

import java.util.ArrayList;

public class Team {

	private String nameTeam;
	private ArrayList<Player> players = new ArrayList<>();
	private String color;
	
	private static int default_x_gardien_bleu = 90;
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
	
	public  int getDefault_x_gardien_bleu() {
		return default_x_gardien_bleu;
	}

	public  void setDefault_x_gardien_bleu(int default_x_gardien_bleu) {
		Team.default_x_gardien_bleu = default_x_gardien_bleu;
	}

	public  int getDefault_y_gardien_bleu() {
		return default_y_gardien_bleu;
	}

	public  void setDefault_y_gardien_bleu(int default_y_gardien_bleu) {
		Team.default_y_gardien_bleu = default_y_gardien_bleu;
	}

	public  int getDefault_x_defenseur1_bleu() {
		return default_x_defenseur1_bleu;
	}

	public  void setDefault_x_defenseur1_bleu(int default_x_defenseur1_bleu) {
		Team.default_x_defenseur1_bleu = default_x_defenseur1_bleu;
	}

	public  int getDefault_y_defenseur1_bleu() {
		return default_y_defenseur1_bleu;
	}

	public  void setDefault_y_defenseur1_bleu(int default_y_defenseur1_bleu) {
		Team.default_y_defenseur1_bleu = default_y_defenseur1_bleu;
	}

	public  int getDefault_x_defenseur2_bleu() {
		return default_x_defenseur2_bleu;
	}

	public  void setDefault_x_defenseur2_bleu(int default_x_defenseur2_bleu) {
		Team.default_x_defenseur2_bleu = default_x_defenseur2_bleu;
	}

	public  int getDefault_y_defenseur2_bleu() {
		return default_y_defenseur2_bleu;
	}

	public  void setDefault_y_defenseur2_bleu(int default_y_defenseur2_bleu) {
		Team.default_y_defenseur2_bleu = default_y_defenseur2_bleu;
	}

	public  int getDefault_x_defenseur3_bleu() {
		return default_x_defenseur3_bleu;
	}

	public  void setDefault_x_defenseur3_bleu(int default_x_defenseur3_bleu) {
		Team.default_x_defenseur3_bleu = default_x_defenseur3_bleu;
	}

	public  int getDefault_y_defenseur3_bleu() {
		return default_y_defenseur3_bleu;
	}

	public  void setDefault_y_defenseur3_bleu(int default_y_defenseur3_bleu) {
		Team.default_y_defenseur3_bleu = default_y_defenseur3_bleu;
	}

	public  int getDefault_x_defenseur4_bleu() {
		return default_x_defenseur4_bleu;
	}

	public  void setDefault_x_defenseur4_bleu(int default_x_defenseur4_bleu) {
		Team.default_x_defenseur4_bleu = default_x_defenseur4_bleu;
	}

	public  int getDefault_y_defenseur4_bleu() {
		return default_y_defenseur4_bleu;
	}

	public  void setDefault_y_defenseur4_bleu(int default_y_defenseur4_bleu) {
		Team.default_y_defenseur4_bleu = default_y_defenseur4_bleu;
	}

	public  int getDefault_x_milieu1_bleu() {
		return default_x_milieu1_bleu;
	}

	public  void setDefault_x_milieu1_bleu(int default_x_milieu1_bleu) {
		Team.default_x_milieu1_bleu = default_x_milieu1_bleu;
	}

	public  int getDefault_y_milieu1_bleu() {
		return default_y_milieu1_bleu;
	}

	public  void setDefault_y_milieu1_bleu(int default_y_milieu1_bleu) {
		Team.default_y_milieu1_bleu = default_y_milieu1_bleu;
	}

	public  int getDefault_x_milieu2_bleu() {
		return default_x_milieu2_bleu;
	}

	public  void setDefault_x_milieu2_bleu(int default_x_milieu2_bleu) {
		Team.default_x_milieu2_bleu = default_x_milieu2_bleu;
	}

	public  int getDefault_y_milieu2_bleu() {
		return default_y_milieu2_bleu;
	}

	public  void setDefault_y_milieu2_bleu(int default_y_milieu2_bleu) {
		Team.default_y_milieu2_bleu = default_y_milieu2_bleu;
	}

	public  int getDefault_x_milieu3_bleu() {
		return default_x_milieu3_bleu;
	}

	public  void setDefault_x_milieu3_bleu(int default_x_milieu3_bleu) {
		Team.default_x_milieu3_bleu = default_x_milieu3_bleu;
	}

	public  int getDefault_y_milieu3_bleu() {
		return default_y_milieu3_bleu;
	}

	public  void setDefault_y_milieu3_bleu(int default_y_milieu3_bleu) {
		Team.default_y_milieu3_bleu = default_y_milieu3_bleu;
	}

	public  int getDefault_x_milieu4_bleu() {
		return default_x_milieu4_bleu;
	}

	public  void setDefault_x_milieu4_bleu(int default_x_milieu4_bleu) {
		Team.default_x_milieu4_bleu = default_x_milieu4_bleu;
	}

	public  int getDefault_y_milieu4_bleu() {
		return default_y_milieu4_bleu;
	}

	public  void setDefault_y_milieu4_bleu(int default_y_milieu4_bleu) {
		Team.default_y_milieu4_bleu = default_y_milieu4_bleu;
	}

	public  int getDefault_x_attaquant1_bleu() {
		return default_x_attaquant1_bleu;
	}

	public  void setDefault_x_attaquant1_bleu(int default_x_attaquant1_bleu) {
		Team.default_x_attaquant1_bleu = default_x_attaquant1_bleu;
	}

	public  int getDefault_y_attaquant1_bleu() {
		return default_y_attaquant1_bleu;
	}

	public  void setDefault_y_attaquant1_bleu(int default_y_attaquant1_bleu) {
		Team.default_y_attaquant1_bleu = default_y_attaquant1_bleu;
	}

	public  int getDefault_x_attaquant2_bleu() {
		return default_x_attaquant2_bleu;
	}

	public  void setDefault_x_attaquant2_bleu(int default_x_attaquant2_bleu) {
		Team.default_x_attaquant2_bleu = default_x_attaquant2_bleu;
	}

	public  int getDefault_y_attaquant2_bleu() {
		return default_y_attaquant2_bleu;
	}

	public  void setDefault_y_attaquant2_bleu(int default_y_attaquant2_bleu) {
		Team.default_y_attaquant2_bleu = default_y_attaquant2_bleu;
	}

	public  int getDefault_x_gardien_rouge() {
		return default_x_gardien_rouge;
	}

	public  void setDefault_x_gardien_rouge(int default_x_gardien_rouge) {
		Team.default_x_gardien_rouge = default_x_gardien_rouge;
	}

	public  int getDefault_y_gardien_rouge() {
		return default_y_gardien_rouge;
	}

	public  void setDefault_y_gardien_rouge(int default_y_gardien_rouge) {
		Team.default_y_gardien_rouge = default_y_gardien_rouge;
	}

	public  int getDefault_x_defenseur1_rouge() {
		return default_x_defenseur1_rouge;
	}

	public  void setDefault_x_defenseur1_rouge(int default_x_defenseur1_rouge) {
		Team.default_x_defenseur1_rouge = default_x_defenseur1_rouge;
	}

	public  int getDefault_y_defenseur1_rouge() {
		return default_y_defenseur1_rouge;
	}

	public  void setDefault_y_defenseur1_rouge(int default_y_defenseur1_rouge) {
		Team.default_y_defenseur1_rouge = default_y_defenseur1_rouge;
	}

	public  int getDefault_x_defenseur2_rouge() {
		return default_x_defenseur2_rouge;
	}

	public  void setDefault_x_defenseur2_rouge(int default_x_defenseur2_rouge) {
		Team.default_x_defenseur2_rouge = default_x_defenseur2_rouge;
	}

	public  int getDefault_y_defenseur2_rouge() {
		return default_y_defenseur2_rouge;
	}

	public  void setDefault_y_defenseur2_rouge(int default_y_defenseur2_rouge) {
		Team.default_y_defenseur2_rouge = default_y_defenseur2_rouge;
	}

	public  int getDefault_x_defenseur3_rouge() {
		return default_x_defenseur3_rouge;
	}

	public  void setDefault_x_defenseur3_rouge(int default_x_defenseur3_rouge) {
		Team.default_x_defenseur3_rouge = default_x_defenseur3_rouge;
	}

	public  int getDefault_y_defenseur3_rouge() {
		return default_y_defenseur3_rouge;
	}

	public  void setDefault_y_defenseur3_rouge(int default_y_defenseur3_rouge) {
		Team.default_y_defenseur3_rouge = default_y_defenseur3_rouge;
	}

	public  int getDefault_x_defenseur4_rouge() {
		return default_x_defenseur4_rouge;
	}

	public  void setDefault_x_defenseur4_rouge(int default_x_defenseur4_rouge) {
		Team.default_x_defenseur4_rouge = default_x_defenseur4_rouge;
	}

	public  int getDefault_y_defenseur4_rouge() {
		return default_y_defenseur4_rouge;
	}

	public  void setDefault_y_defenseur4_rouge(int default_y_defenseur4_rouge) {
		Team.default_y_defenseur4_rouge = default_y_defenseur4_rouge;
	}

	public  int getDefault_x_milieu1_rouge() {
		return default_x_milieu1_rouge;
	}

	public  void setDefault_x_milieu1_rouge(int default_x_milieu1_rouge) {
		Team.default_x_milieu1_rouge = default_x_milieu1_rouge;
	}

	public  int getDefault_y_milieu1_rouge() {
		return default_y_milieu1_rouge;
	}

	public  void setDefault_y_milieu1_rouge(int default_y_milieu1_rouge) {
		Team.default_y_milieu1_rouge = default_y_milieu1_rouge;
	}

	public  int getDefault_x_milieu2_rouge() {
		return default_x_milieu2_rouge;
	}

	public  void setDefault_x_milieu2_rouge(int default_x_milieu2_rouge) {
		Team.default_x_milieu2_rouge = default_x_milieu2_rouge;
	}

	public  int getDefault_y_milieu2_rouge() {
		return default_y_milieu2_rouge;
	}

	public  void setDefault_y_milieu2_rouge(int default_y_milieu2_rouge) {
		Team.default_y_milieu2_rouge = default_y_milieu2_rouge;
	}

	public  int getDefault_x_milieu3_rouge() {
		return default_x_milieu3_rouge;
	}

	public  void setDefault_x_milieu3_rouge(int default_x_milieu3_rouge) {
		Team.default_x_milieu3_rouge = default_x_milieu3_rouge;
	}

	public  int getDefault_y_milieu3_rouge() {
		return default_y_milieu3_rouge;
	}

	public  void setDefault_y_milieu3_rouge(int default_y_milieu3_rouge) {
		Team.default_y_milieu3_rouge = default_y_milieu3_rouge;
	}

	public  int getDefault_x_milieu4_rouge() {
		return default_x_milieu4_rouge;
	}

	public  void setDefault_x_milieu4_rouge(int default_x_milieu4_rouge) {
		Team.default_x_milieu4_rouge = default_x_milieu4_rouge;
	}

	public  int getDefault_y_milieu4_rouge() {
		return default_y_milieu4_rouge;
	}

	public  void setDefault_y_milieu4_rouge(int default_y_milieu4_rouge) {
		Team.default_y_milieu4_rouge = default_y_milieu4_rouge;
	}

	public  int getDefault_x_attaquant1_rouge() {
		return default_x_attaquant1_rouge;
	}

	public  void setDefault_x_attaquant1_rouge(int default_x_attaquant1_rouge) {
		Team.default_x_attaquant1_rouge = default_x_attaquant1_rouge;
	}

	public  int getDefault_y_attaquant1_rouge() {
		return default_y_attaquant1_rouge;
	}

	public  void setDefault_y_attaquant1_rouge(int default_y_attaquant1_rouge) {
		Team.default_y_attaquant1_rouge = default_y_attaquant1_rouge;
	}

	public  int getDefault_x_attaquant2_rouge() {
		return default_x_attaquant2_rouge;
	}

	public  void setDefault_x_attaquant2_rouge(int default_x_attaquant2_rouge) {
		Team.default_x_attaquant2_rouge = default_x_attaquant2_rouge;
	}

	public  int getDefault_y_attaquant2_rouge() {
		return default_y_attaquant2_rouge;
	}

	public  void setDefault_y_attaquant2_rouge(int default_y_attaquant2_rouge) {
		Team.default_y_attaquant2_rouge = default_y_attaquant2_rouge;
	}


	private static Player.position GOAL = Enum.valueOf(Player.position.class, "GOALKEEPER");
	private static Player.position DEF = Enum.valueOf(Player.position.class, "DEFENSE");
	private static Player.position MID = Enum.valueOf(Player.position.class, "MIDDLE");
	private static Player.position ATT = Enum.valueOf(Player.position.class, "ATTACK");
	private static Player.temps PL=Enum.valueOf(Player.temps.class, "PLUIE");
	private static Player.temps NE=Enum.valueOf(Player.temps.class, "NEIGE");
	private static Player.temps SO=Enum.valueOf(Player.temps.class, "SOLEIL");

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

	@Override
	public String toString() {
		return "Team [nameTeam=" + nameTeam + ", players=" + players + ", color=" + color + "]";
	}

	public Team(String nameTeam, ArrayList<Player> players, String color) {

		super();
		this.nameTeam = nameTeam;
		this.players = players;
		this.color = color;

	}

	public void createteams(Team equipe) {

		if (equipe.getColor().equals("blue")) {

			Player p1 = new Player("1", 20, 30, 40, 80, 90, 100, 70, 1, GOAL, default_x_gardien_bleu, default_y_gardien_bleu,
					false,PL);
			Player p2 = new Player("2", 30, 50, 40, 70, 60, 100, 50, 2, DEF, default_x_defenseur1_bleu,
					default_y_defenseur1_bleu, false,SO);
			Player p3 = new Player("3", 20, 40, 40, 70, 60, 100, 60, 3, DEF, default_x_defenseur2_bleu,
					default_y_defenseur2_bleu, false,NE);
			Player p4 = new Player("4", 30, 30, 40, 70, 70, 100, 40, 4, DEF, default_x_defenseur3_bleu,
					default_y_defenseur3_bleu, false,NE);
			Player p5 = new Player("5", 30, 40, 40, 70, 60, 100, 80, 5, DEF, default_x_defenseur4_bleu,
					default_y_defenseur4_bleu, false,SO);

			Player p6 = new Player("6", 60, 40, 60, 20, 70, 100, 70, 6, MID, default_x_milieu1_bleu, default_y_milieu1_bleu,
					false,SO);
			Player p7 = new Player("7", 60, 50, 70, 30, 60, 100, 90, 7, MID, default_x_milieu2_bleu, default_y_milieu2_bleu,
					false,SO);
			Player p8 = new Player("8", 50, 30, 50, 40, 80, 100, 40, 8, MID, default_x_milieu3_bleu, default_y_milieu3_bleu,
					false,SO);
			Player p9 = new Player("9", 60, 40, 60, 20, 70, 100, 50, 9, MID, default_x_milieu4_bleu, default_y_milieu4_bleu,
					false,NE);

			Player p10 = new Player("10", 80, 80, 50, 40, 80, 100, 60, 10, ATT, default_x_attaquant1_bleu,
					default_y_attaquant1_bleu, false,PL);
			Player p11 = new Player("11", 100, 90, 100, 50, 100, 100, 70, 11, ATT, default_x_attaquant2_bleu,
					default_y_attaquant2_bleu, false,PL);

			players.add(p1);

			players.add(p2);
			players.add(p3);
			players.add(p4);
			players.add(p5);

			players.add(p6);
			players.add(p7);
			players.add(p8);
			players.add(p9);

			players.add(p10);
			players.add(p11);

		} else if (equipe.getColor().equals("red")) {
			
			Player p12 = new Player("12", 50, 60, 30, 90, 90, 100, 70, 12, GOAL, default_x_gardien_rouge,
					default_y_gardien_rouge, false,PL);

			Player p13 = new Player("13", 40, 50, 30, 40, 60, 100, 60, 13, DEF, default_x_defenseur1_rouge,
					default_y_defenseur1_rouge, false,NE);
			Player p14 = new Player("14", 30, 45, 40, 30, 65, 100, 50, 14, DEF, default_x_defenseur2_rouge,
					default_y_defenseur2_rouge, false,SO);
			Player p15 = new Player("15", 35, 40, 50, 45, 70, 100, 40, 15, DEF, default_x_defenseur3_rouge,
					default_y_defenseur3_rouge, false,PL);
			Player p16 = new Player("16", 45, 40, 45, 35, 70, 100, 80, 16, DEF, default_x_defenseur4_rouge,
					default_y_defenseur4_rouge, false,SO);

			Player p17 = new Player("17", 60, 30, 60, 80, 0, 100, 90, 17, MID, default_x_milieu1_rouge, default_y_milieu1_rouge,
					false,SO);
			Player p18 = new Player("18", 65, 40, 50, 85, 0, 100, 60, 18, MID, default_x_milieu2_rouge, default_y_milieu2_rouge,
					false,SO);
			Player p19 = new Player("19", 70, 45, 65, 90, 0, 100, 70, 19, MID, default_x_milieu3_rouge, default_y_milieu3_rouge,
					false,SO);
			Player p20 = new Player("20", 75, 50, 55, 70, 0, 100, 50, 20, MID, default_x_milieu4_rouge, default_y_milieu4_rouge,
					false,SO);

			Player p21 = new Player("21", 90, 85, 85, 55, 90, 100, 40, 21, ATT, default_x_attaquant1_rouge,
					default_y_attaquant1_rouge, false,PL);
			Player p22 = new Player("22", 95, 90, 80, 50, 100, 100, 80, 22, ATT, default_x_attaquant2_rouge,
					default_y_attaquant2_rouge, false,SO);

			players.add(p12);
			players.add(p13);
			players.add(p14);
			players.add(p15);
			players.add(p16);
			players.add(p17);
			players.add(p18);
			players.add(p19);
			players.add(p20);
			players.add(p21);
			players.add(p22);
			
		}

	}

	public Player recherchenom(ArrayList<Player> players1, String name) {
		for (int i = 0; i < players1.size(); i++) {
			if (players1.get(i).getName().equals(name)) {
				return players1.get(i);
			}
		}
		return null;
	}

	public static void parcoursListPlayer(ArrayList<Player> list) {

		for (Player p : list) {

			p.toString();
			System.out.println(p);

		}

	}

}
