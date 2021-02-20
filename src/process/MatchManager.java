package process;

import data.Match;
import delimitations.Corner;
import gui.Dashboard;

public class MatchManager {

	private boolean begin = false;
	boolean corner = false;
	
	private Corner cornertest = null ;

	public void beginMatch(Dashboard dash) {

		if (begin == false) {

			Match match = new Match();

			match.engagement(dash);
			begin = true;

		}

		matchProcess(dash);
	}

	private void matchProcess(Dashboard dash) {
		// conditions pour decider de quelle action effectuer type corner, touche, 6
		// metres, passes, frappe etc
		
		System.out.println(corner);
		
		if (corner == false) {
			
			cornertest = dash.getTestcorner();
			
			cornertest.CornerHautGauche(dash);
			
			corner = true ;
			
		}
		
		// TestPrototype.testMovement(dash);

	}

	public boolean isCorner() {
		return corner;
	}

	public void setCorner(boolean corner) {
		this.corner = corner;
	}

}
