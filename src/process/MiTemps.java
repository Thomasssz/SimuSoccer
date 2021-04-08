package process;

import java.util.ArrayList;

import data.Player;
import data.Team;
import gui.ChronometerGUI;
import gui.Dashboard;

public class MiTemps {

public void middletime(ChronometerGUI gui,Dashboard dashboard) {
	
int timeminute=	gui.getChronometer().getMinute().getValue();
int timeseconde=gui.getChronometer().getSecond().getValue();	
  	if((timeminute==2)&&(timeseconde==00)) {    
		System.out.println("boucle1");
		   
	ArrayList<Player> team1=dashboard. getTeam1().getPlayers();
	ArrayList<Player> team2=dashboard. getTeam2().getPlayers();
	Team teamblue	=new Team("blue",team1,"blue");
	Team teamred	=new Team("red",team2,"red");
	    

	   team1.get(0).setX(teamblue.getDefault_x_gardien_rouge());
		
	   team1.get(1).setX(teamblue.getDefault_x_defenseur1_rouge());
	   team1.get(2).setX(teamblue.getDefault_x_defenseur2_rouge());
	   team1.get(3).setX(teamblue.getDefault_x_defenseur3_rouge());
	   team1.get(4).setX(teamblue.getDefault_x_defenseur4_rouge());
	   
	   team1.get(5).setX(teamblue.getDefault_x_milieu1_rouge());
	   team1.get(6).setX(teamblue.getDefault_x_milieu2_rouge());
	   team1.get(7).setX(teamblue.getDefault_x_milieu3_rouge());
	   team1.get(8).setX(teamblue.getDefault_x_milieu4_rouge());   
	   
	   team1.get(9).setX(teamblue.getDefault_x_attaquant1_rouge());
	   team1.get(10).setX(teamblue.getDefault_x_attaquant2_rouge());  
	   
	   team2.get(0).setX(teamred.getDefault_x_gardien_bleu());
		
    	team2.get(1).setX(teamred.getDefault_x_defenseur1_bleu());
    	team2.get(2).setX(teamred.getDefault_x_defenseur2_bleu());
 	    team2.get(3).setX(teamred.getDefault_x_defenseur3_bleu());
 	    team2.get(4).setX(teamred.getDefault_x_defenseur4_bleu());
 	    
 	   team2.get(5).setX(teamred.getDefault_x_milieu1_bleu());
	   team2.get(6).setX(teamred.getDefault_x_milieu2_bleu());
	   team2.get(7).setX(teamred.getDefault_x_milieu3_bleu());
	   team2.get(8).setX(teamred.getDefault_x_milieu4_bleu());
	  
	   team2.get(9).setX(teamred.getDefault_x_attaquant1_bleu());
	   team2.get(10).setX(teamred.getDefault_x_attaquant2_bleu());
    	
		dashboard.repaint();  

	
  	
	}
	
  }
}
