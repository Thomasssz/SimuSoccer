package gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import data.Ball;
import data.Team;
import delimitations.Sortie;
import delimitations.Surface;

/**
 * This class manages the dashboard (minute, second) of chronometer GUI.
 * 
 * This class is only responsible of graphical result printing.
 * 
 * There is no algorithmic processing in this class.
 * 
 * @author simu soccer
 * 
 */
public class Dashboard extends JPanel {
	public Dashboard() {
	}

	private static final long serialVersionUID = 1L;

	/**
	 * Hour, minute and second have their initial positions.
	 */

	private ImageIcon icon = new ImageIcon("src/img/stade.jpg");
	Image pitch = icon.getImage();


	/**
	 * Defines what to do when the repaint() method is called.
	 */
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		g.drawImage(pitch, 20, 20, 850, 590, null);

		/* Test dimension */

		g.setColor(Color.BLACK);
		
		Ball ballon = new Ball(250,150) ;
		
		g.drawOval(ballon.getPositionx_Ball(), ballon.getPositiony_Ball(), 10, 10);
		g.fillOval(ballon.getPositionx_Ball(), ballon.getPositiony_Ball(), 10, 10);
		
		g.setColor(Color.PINK);
		
		g.drawLine(Sortie.getSortieHautGaucheX(), Sortie.getSortieHautGaucheY(), Sortie.getSortieHautDroiteX(), Sortie.getSortieHautDroiteY());
		g.drawLine(Sortie.getSortieHautGaucheX(), Sortie.getSortieHautGaucheY(), Sortie.getSortieBasGaucheX(), Sortie.getSortieBasGaucheY());
		g.drawLine(Sortie.getSortieBasDroiteX(), Sortie.getSortieBasDroiteY(), Sortie.getSortieHautDroiteX(), Sortie.getSortieHautDroiteY());
		g.drawLine(Sortie.getSortieBasGaucheX(), Sortie.getSortieBasGaucheY(), Sortie.getSortieBasDroiteX(), Sortie.getSortieBasDroiteY());
		
		g.setColor(Color.CYAN);
		
		g.drawLine(Surface.getSurfacegaucheHautGaucheX(), Surface.getSurfacegaucheHautGaucheY(), Surface.getSurfacegaucheHautDroiteX(), Surface.getSurfacegaucheHautDroiteY());
		g.drawLine(Surface.getSurfacegaucheHautGaucheX(), Surface.getSurfacegaucheHautGaucheY(), Surface.getSurfacegaucheBasGaucheX(), Surface.getSurfacegaucheBasGaucheY());
		g.drawLine(Surface.getSurfacegaucheBasDroiteX(), Surface.getSurfacegaucheBasDroiteY(), Surface.getSurfacegaucheHautDroiteX(), Surface.getSurfacegaucheHautDroiteY());
		g.drawLine(Surface.getSurfacegaucheBasGaucheX(), Surface.getSurfacegaucheBasGaucheY(), Surface.getSurfacegaucheBasDroiteX(), Surface.getSurfacegaucheBasDroiteY());
		
		g.drawLine(Surface.getSurfacedroiteHautGaucheX(), Surface.getSurfacedroiteHautGaucheY(), Surface.getSurfacedroiteHautDroiteX(), Surface.getSurfacedroiteHautDroiteY());
		g.drawLine(Surface.getSurfacedroiteHautGaucheX(), Surface.getSurfacedroiteHautGaucheY(), Surface.getSurfacedroiteBasGaucheX(), Surface.getSurfacedroiteBasGaucheY());
		g.drawLine(Surface.getSurfacedroiteBasDroiteX(), Surface.getSurfacedroiteBasDroiteY(), Surface.getSurfacedroiteHautDroiteX(), Surface.getSurfacedroiteHautDroiteY());
		g.drawLine(Surface.getSurfacedroiteBasGaucheX(), Surface.getSurfacedroiteBasGaucheY(), Surface.getSurfacedroiteBasDroiteX(), Surface.getSurfacedroiteBasDroiteY());
		
		g.setColor(Color.ORANGE);
		
		Team.createteams();

		/* Equipe bleu */

		
        // Attaquants

        g.setColor(Color.BLUE);

        g.drawRect(Team.players1.get(10).getX(), Team.players1.get(10).getY(), 10, 10);
        g.drawRect(Team.players1.get(9).getX(), Team.players1.get(9).getY(), 10, 10);

        g.fillRect(Team.players1.get(10).getX(), Team.players1.get(10).getY(), 10, 10);
        g.fillRect(Team.players1.get(9).getX(), Team.players1.get(9).getY(), 10, 10);

        // Milieux

        g.drawRect(Team.players1.get(8).getX(), Team.players1.get(8).getY(), 10, 10);
        g.drawRect(Team.players1.get(7).getX(), Team.players1.get(7).getY(), 10, 10);
        g.drawRect(Team.players1.get(6).getX(), Team.players1.get(6).getY(), 10, 10);
        g.drawRect(Team.players1.get(5).getX(), Team.players1.get(5).getY(), 10, 10);

        g.fillRect(Team.players1.get(8).getX(), Team.players1.get(8).getY(), 10, 10);
        g.fillRect(Team.players1.get(7).getX(), Team.players1.get(7).getY(), 10, 10);
        g.fillRect(Team.players1.get(6).getX(), Team.players1.get(6).getY(), 10, 10);
        g.fillRect(Team.players1.get(5).getX(), Team.players1.get(5).getY(), 10, 10);

        // Defenseurs

        g.drawRect(Team.players1.get(4).getX(), Team.players1.get(4).getY(), 10, 10);
        g.drawRect(Team.players1.get(3).getX(), Team.players1.get(3).getY(), 10, 10);
        g.drawRect(Team.players1.get(2).getX(), Team.players1.get(2).getY(), 10, 10);
        g.drawRect(Team.players1.get(1).getX(), Team.players1.get(1).getY(), 10, 10);

        g.fillRect(Team.players1.get(4).getX(), Team.players1.get(4).getY(), 10, 10);
        g.fillRect(Team.players1.get(3).getX(), Team.players1.get(3).getY(), 10, 10);
        g.fillRect(Team.players1.get(2).getX(), Team.players1.get(2).getY(), 10, 10);
        g.fillRect(Team.players1.get(1).getX(), Team.players1.get(1).getY(), 10, 10);
        // Gardien

        g.drawRect(Team.players1.get(0).getX(), Team.players1.get(0).getY(), 10, 10);
        g.fillRect(Team.players1.get(0).getX(), Team.players1.get(0).getY(), 10, 10);

        /* Equipe rouge */

        // Attaquants

        g.setColor(Color.RED);

        g.drawRect(Team.players2.get(10).getX(), Team.players2.get(10).getY(), 10, 10);
        g.drawRect(Team.players2.get(9).getX(), Team.players2.get(9).getY(), 10, 10);

        g.fillRect(Team.players2.get(10).getX(), Team.players2.get(10).getY(), 10, 10);
        g.fillRect(Team.players2.get(9).getX(), Team.players2.get(9).getY(), 10, 10);

        // Milieux

        g.drawRect(Team.players2.get(8).getX(), Team.players2.get(8).getY(), 10, 10);
        g.drawRect(Team.players2.get(7).getX(), Team.players2.get(7).getY(), 10, 10);
        g.drawRect(Team.players2.get(6).getX(), Team.players2.get(6).getY(), 10, 10);
        g.drawRect(Team.players2.get(5).getX(), Team.players2.get(5).getY(), 10, 10);

        g.fillRect(Team.players2.get(8).getX(), Team.players2.get(8).getY(), 10, 10);
        g.fillRect(Team.players2.get(7).getX(), Team.players2.get(7).getY(), 10, 10);
        g.fillRect(Team.players2.get(6).getX(), Team.players2.get(6).getY(), 10, 10);
        g.fillRect(Team.players2.get(5).getX(), Team.players2.get(5).getY(), 10, 10);

        // Defenseurs

        g.drawRect(Team.players2.get(4).getX(), Team.players2.get(4).getY(), 10, 10);
        g.drawRect(Team.players2.get(3).getX(), Team.players2.get(3).getY(), 10, 10);
        g.drawRect(Team.players2.get(2).getX(), Team.players2.get(2).getY(), 10, 10);
        g.drawRect(Team.players2.get(1).getX(), Team.players2.get(1).getY(), 10, 10);

        g.fillRect(Team.players2.get(4).getX(), Team.players2.get(4).getY(), 10, 10);
        g.fillRect(Team.players2.get(3).getX(), Team.players2.get(3).getY(), 10, 10);
        g.fillRect(Team.players2.get(2).getX(), Team.players2.get(2).getY(), 10, 10);
        g.fillRect(Team.players2.get(1).getX(), Team.players2.get(1).getY(), 10, 10);
        
        // Gardien

        g.drawRect(Team.players2.get(0).getX(), Team.players2.get(0).getY(), 10, 10);
        g.fillRect(Team.players2.get(0).getX(), Team.players2.get(0).getY(), 10, 10);
	
	}
}
