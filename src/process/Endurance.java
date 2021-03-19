package process;

import java.util.ArrayList;

import chrono.Chronometer;
import chrono.CyclicCounter;
import data.Player;
import gui.ChronometerGUI;
import gui.Dashboard;

public class Endurance {
	
	private static ArrayList<Player> team1 = new ArrayList<Player>();
	private static ArrayList<Player> team2 = new ArrayList<Player>();
	
	
	public void baisse(Dashboard dash, ChronometerGUI gui) {
		int timeminute= gui.getChronometer().getMinute().getValue();
		int timeseconde= gui.getChronometer().getSecond().getValue();
		while(timeminute <= 90 && timeseconde == 0) {
			if(timeminute % 10 == 0) {
				for(int i = 0; i < team1.size(); i++) { 
					int endurance = team1.get(0).getEndurance();
					if(endurance >= 80) {
						team1.get(i).setEnergie(team1.get(i).getEnergie()-9);
						System.out.println(team1.get(i).getEnergie());
					}
					else if((endurance >= 60)  && (endurance < 80) ) {
						team1.get(i).setEnergie(team1.get(i).getEnergie()-10);
						System.out.println(team1.get(i).getEnergie());
					}
					else if(endurance < 60 ) {
						team1.get(i).setEnergie(team1.get(0).getEnergie()-11);
						System.out.println(team1.get(i).getEnergie());
					}
					if(team1.get(i).getEnergie() <= 50) {
						team1.get(i).setSpeed(team1.get(i).getSpeed()-10);
						team1.get(i).setPass(team1.get(i).getPass()-10);
						team1.get(i).setDefense(team1.get(i).getEnergie()-10);
						team1.get(i).setShoot(team1.get(i).getShoot()-10);
						team1.get(i).setDribbles(team1.get(i).getDribbles()-10);
					}
				}
			
			
				for(int i = 0; i < team2.size(); i++) { 
					int endurance = team2.get(i).getEnergie();
					if(endurance >= 80) {
						team2.get(i).setEnergie(team2.get(i).getEnergie()-9);
						System.out.println(team1.get(i).getEnergie());
					}
					else if((endurance >= 60)  && (endurance < 80) ) {
						team2.get(i).setEnergie(team2.get(i).getEnergie()-10);
						System.out.println(team1.get(i).getEnergie());
					}
					else if(endurance < 60 ) {
						team2.get(i).setEnergie(team2.get(i).getEnergie()-11);
						System.out.println(team1.get(i).getEnergie());
					}
					if(team2.get(i).getEnergie() <= 50) {
						team2.get(i).setSpeed(team2.get(i).getSpeed()-10);
						team2.get(i).setPass(team2.get(i).getPass()-10);
						team2.get(i).setDefense(team2.get(i).getEnergie()-10);
						team2.get(i).setShoot(team2.get(i).getShoot()-10);
						team2.get(i).setDribbles(team2.get(i).getDribbles()-10);
					}
				
				}
			}
		}
	 
	}
	
	
}
