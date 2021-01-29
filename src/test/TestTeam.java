package test;
import java.util.ArrayList;

import data.Player;
import data.Team;
public class TestTeam {

	

	
	
	/*int speed, int pass, int dribbles, int defense, int shoot, int number*/
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
	
	}

	public static void main(String[] args) {
		
		TestTeam test=new TestTeam();
		test.createteams();
		
	}
	
	
	
	
	}

	
	

