package process;

import java.util.Random;

import data.Match;
import delimitations.Corner;
import delimitations.Sortie;
import delimitations.Touche;
import gui.Dashboard;
import test.TestPrototype;

public class MatchManager {

	private boolean begin = false;
	private boolean corner = false;
	private boolean touche = false;

	private int first_choice_corner = 0;

	private Corner cornertest = null;
	private Touche touchetest = null;

	private Passe testPasse = new Passe();

	public void matchProcess(Dashboard dash) {

		if (begin == false) {

			Match match = new Match();

			match.engagement(dash);
			begin = true;

		}

		// conditions pour decider de quelle action effectuer type corner, touche, 6
		// metres, passes, frappe etc

		// doTestPrototype(dash);

		 doTestPasse(dash);
		// doCorner(dash);
		// doTouche(dash);

	}

	public void doTestPrototype(Dashboard dash) {
		TestPrototype.testMovement(dash);
	}

	public void doTestPasse(Dashboard dash) {

		testPasse.testPass(dash);

	}

	public void doCorner(Dashboard dash) {

		if (corner == false) {

			cornertest = dash.getTestcorner();

			if (first_choice_corner == 0) {

				Random rand = new Random();
				int choix_corner = rand.nextInt(4);

				choix_corner += 1;
				
				first_choice_corner = choix_corner ;

			}

			System.out.println(first_choice_corner);

			if (first_choice_corner == 1) {

				cornertest.CornerHautGauche(dash);

			} else if (first_choice_corner == 2) {

				cornertest.CornerHautDroite(dash);

			} else if (first_choice_corner == 3) {

				cornertest.CornerBasGauche(dash);

			} else if (first_choice_corner == 4) {

				cornertest.CornerBasDroite(dash);

			}

			if (dash.isStop_action() == true) {

				corner = true;

			}

		}
	}

	public void doTouche(Dashboard dash) {

		if (touche == false) {

			touchetest = dash.getTesttouche();

			touchetest.runTouche(Sortie.getSortieHautGaucheX() + 350, Sortie.getSortieHautGaucheY(), dash);

			if (dash.isStop_action() == true) {

				touche = true;

			}

		}

	}

	public boolean isCorner() {
		return corner;
	}

	public void setCorner(boolean corner) {
		this.corner = corner;
	}

}
