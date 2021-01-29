package data;

import java.util.ArrayList;

public class Team {
	public String nameTeam;

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

	public String color;
	
	
	
	

	public Team(String nameTeam, ArrayList<Player> players, String color) {
		super();
		this.nameTeam = nameTeam;
		this.players = players;
		this.color = color;
		createteams();
	
	}
	
	
	
	
	public ArrayList<Player> players1= new ArrayList<>();
	public ArrayList<Player> players2= new ArrayList<>();
	
	public Team team2=new Team("2",players2,"blue");
	public Team team1=new Team("1",players1,"red");

	private void createteams() {

		
		
		
		
		
		
		

			Player p1=new Player(20,30,40,80,90,1);
			
			Player p2=new Player(30,50,40,70,60,2);
			Player p3=new Player(20,40,40,70,60,3);
		    Player p4=new Player(30,30,40,70,70,4);
		    Player p5=new Player(30,40,40,70,60,5);
		    
		    Player p6=new Player(50,60,50,30,70,6);
		    Player p7=new Player(60,40,60,20,70,7);
		    Player p8=new Player(60,50,70,30,60,8);
		    Player p9=new Player(50,30,50,40,80,9);
		    
		    Player p10=new Player(80,80,50,40,80,10);
		    Player p11=new Player(100,90,100,50,100,11);
		    
		    
			
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
	/*4 défense 4 millieu 2 attaqµ*/

//	players1.toString();
	
/*	for(Player p:players1) {
		
	p.toString();

	
		
	}
*/	
	
	Player p21 = new Player (40,50,30,40,60,1);
	Player p22 = new Player (30,45,40,30,65,2);
	Player p23 = new Player (35,40,50,45,70,3);
	Player p24 = new Player (45,40,45,35,70,4);
	
	Player p25 = new Player (60,30,60,80,0,5);
	Player p26 = new Player (65,40,50,85,0,6);
	Player p27 = new Player (70,45,65,90,0,7);
	Player p28 = new Player (75,50,55,70,0,8);
	
	Player p29 = new Player (90,85,85,55,90,9);
	Player p210 = new Player (95,90,80,50,100,10);
	
	Player p211 = new Player (50,60,30,90,90,11);
	
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
	players2.add(p211);
	
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
