package delimitations;

import java.util.ArrayList;
import java.util.Random;

import data.Ball;
import data.Player;

public class Corner {

	public static void CornerHautGauche (Ball ballon, ArrayList <Player> players ) {
		
		ballon.setPositionx_Ball(Sortie.getSortieHautGaucheX() +5) ;
		ballon.setPositiony_Ball(Sortie.getSortieHautGaucheY() +5) ;
		
		Random tirage = new Random();
		int borne = 6 ;
		
			borne = tirage.nextInt(5);
		
			borne += 5 ;
			
			Player p = players.get(borne);
			
			p.setX(Sortie.getSortieHautGaucheX());
			p.setY(Sortie.getSortieHautGaucheY());
		
	}

	public void CornerHautDroite(Ball ballon) {

		ballon.setPositionx_Ball(Sortie.getSortieHautDroiteX() - 5);
		ballon.setPositiony_Ball(Sortie.getSortieHautGaucheY() + 5);

	}

	public void CornerBasGauche(Ball ballon) {

		ballon.setPositionx_Ball(Sortie.getSortieBasGaucheX() + 5);
		ballon.setPositiony_Ball(Sortie.getSortieBasGaucheY() - 5);

	}

	public void CornerBasDroite(Ball ballon) {

		ballon.setPositionx_Ball(Sortie.getSortieBasDroiteX() - 5);
		ballon.setPositiony_Ball(Sortie.getSortieBasDroiteY() - 5);
	}

	public static void main(String[] args) {

		Ball ballon = new Ball(100, 200);
		//Corner.CornerHautGauche(ballon);
	}

}
