package process;

import java.util.ArrayList;

import data.Ball;
import data.Match;
import data.Player;
import data.Team;
import delimitations.Corner;
import delimitations.Touche;
import gui.ChronometerGUI;
import gui.Dashboard;

public class Endurance {
	      private Dashboard dash;  
	      private ChronometerGUI gui;
	      private Team team1;
	      private Team team2;
	public Endurance(Dashboard dash, ChronometerGUI gui,Team team1, Team team2) {
		this.dash=dash;
		this.gui=gui;
		this.team1=team1;
		this.team2=team2;
	}
	public void baisse(Dashboard dash, ChronometerGUI gui, ArrayList<Player> players1, ArrayList<Player> players2) {
		int timeminute= gui.getChronometer().getMinute().getValue();
		int timeseconde= gui.getChronometer().getSecond().getValue();
			if(timeminute % 10 == 0 && timeseconde == 0 && timeminute!=0) {
				for(int i = 0; i < players1.size(); i++) { 
					int endurance = players1.get(i).getEndurance();
					System.out.println(endurance);
					if(endurance >= 80) {
						players1.get(i).setEnergie(players1.get(i).getEnergie()-9);
					}
					else if((endurance >= 60)  && (endurance < 80) ) {
						players1.get(i).setEnergie(players1.get(i).getEnergie()-10);
					}
					else if(endurance < 60 ) {
						players1.get(i).setEnergie(players1.get(0).getEnergie()-11);
					}
					if(players1.get(i).getEnergie() <= 50) {
						players1.get(i).setSpeed(players1.get(i).getSpeed()-10);
						players1.get(i).setPass(players1.get(i).getPass()-10);
						players1.get(i).setDefense(players1.get(i).getEnergie()-10);
						players1.get(i).setShoot(players1.get(i).getShoot()-10);
						players1.get(i).setDribbles(players1.get(i).getDribbles()-10);
					}
				}
			
			
				for(int i = 0; i < players2.size(); i++) { 
					int endurance = players2.get(i).getEnergie();
					if(endurance >= 80) {
						players2.get(i).setEnergie(players2.get(i).getEnergie()-9);
					}
					else if((endurance >= 60)  && (endurance < 80) ) {
						players2.get(i).setEnergie(players2.get(i).getEnergie()-10);
					}
					else if(endurance < 60 ) {
						players2.get(i).setEnergie(players2.get(i).getEnergie()-11);
					}
					if(players2.get(i).getEnergie() <= 50) {
						players2.get(i).setSpeed(players2.get(i).getSpeed()-10);
						players2.get(i).setPass(players2.get(i).getPass()-10);
						players2.get(i).setDefense(players2.get(i).getEnergie()-10);
						players2.get(i).setShoot(players2.get(i).getShoot()-10);
						players2.get(i).setDribbles(players2.get(i).getDribbles()-10);
					}

		
				}
	 
			}
	
	}	
}