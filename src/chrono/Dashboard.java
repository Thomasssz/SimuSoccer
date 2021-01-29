package chrono;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.ImageIcon;

/**
 * This class manages the dashboard (hour, minute, second) of chronometer GUI.
 * 
 * This class is only responsible of graphical result printing.
 * 
 * There is no algorithmic processing in this class.
 * 
 * @author tliu@u-cergy.fr
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
	
	private int default_x_gardien_bleu = 100 ;
	private int default_y_gardien_bleu = 305 ;
	
	private int default_x_defenseur1_bleu = 200 ;
	private int default_y_defenseur1_bleu = 100 ;
	
	private int default_x_defenseur2_bleu = 200 ;
	private int default_y_defenseur2_bleu = 265 ;
	
	private int default_x_defenseur3_bleu = 200 ;
	private int default_y_defenseur3_bleu = 350 ;
	
	private int default_x_defenseur4_bleu = 200 ;
	private int default_y_defenseur4_bleu = 500 ;
	
	private int default_x_milieu1_bleu = 300 ;
	private int default_y_milieu1_bleu = 100 ;
	
	private int default_x_milieu2_bleu = 300 ;
	private int default_y_milieu2_bleu = 265 ;
	
	private int default_x_milieu3_bleu = 300 ;
	private int default_y_milieu3_bleu = 350 ;
	
	private int default_x_milieu4_bleu = 300 ;
	private int default_y_milieu4_bleu = 500 ;
	
	private int default_x_attaquant1_bleu = 415 ;
	private int default_y_attaquant1_bleu = 265 ;
	
	private int default_x_attaquant2_bleu = 415 ;
	private int default_y_attaquant2_bleu = 350 ;
	
	
	
	private int default_x_gardien_rouge = 790 ;
	private int default_y_gardien_rouge = 305 ;
	
	private int default_x_defenseur1_rouge = 690 ;
	private int default_y_defenseur1_rouge = 100 ;
	
	private int default_x_defenseur2_rouge = 690 ;
	private int default_y_defenseur2_rouge = 265 ;
	
	private int default_x_defenseur3_rouge = 690 ;
	private int default_y_defenseur3_rouge = 350 ;
	
	private int default_x_defenseur4_rouge = 690 ;
	private int default_y_defenseur4_rouge = 500 ;
	
	private int default_x_milieu1_rouge = 590 ;
	private int default_y_milieu1_rouge = 100 ;
	
	private int default_x_milieu2_rouge = 590 ;
	private int default_y_milieu2_rouge = 265 ;
	
	private int default_x_milieu3_rouge = 590 ;
	private int default_y_milieu3_rouge = 350 ;
	
	private int default_x_milieu4_rouge = 590 ;
	private int default_y_milieu4_rouge = 500 ;
	
	private int default_x_attaquant1_rouge = 475 ;
	private int default_y_attaquant1_rouge = 265 ;
	
	private int default_x_attaquant2_rouge = 475 ;
	private int default_y_attaquant2_rouge = 350 ;
	


	/**
	 * Defines what to do when the repaint() method is called.
	 */
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.drawImage(pitch,20,20,850,590,null);
		
		/*Equipe bleu*/
		
		// Attaquants
		
		g.setColor(Color.BLUE);
		
		g.drawRect(default_x_attaquant1_bleu, default_y_attaquant1_bleu, 10, 10);
		g.drawRect(default_x_attaquant2_bleu, default_y_attaquant2_bleu, 10, 10);
		
		//Milieux
		
		g.drawRect(300, 350, 10, 10);
		g.drawRect(300, 265, 10, 10);
		g.drawRect(300, 100, 10, 10);
		g.drawRect(300, 500, 10, 10);
		
		// Defenseurs
		
		g.drawRect(200, 350, 10, 10);
		g.drawRect(200, 265, 10, 10);
		g.drawRect(200, 100, 10, 10);
		g.drawRect(200, 500, 10, 10);
		
		//Gardien
		
		g.drawRect(default_x_gardien_bleu, 305, 10, 10);

		/*Equipe rouge*/
		
		// Attaquants
		
		
		
		g.setColor(Color.RED);

		g.drawRect(475, 350, 10, 10);
		g.drawRect(475, 265, 10, 10);
		
		//Milieux
		
		g.drawRect(590, 350, 10, 10);
		g.drawRect(590, 265, 10, 10);
		g.drawRect(590, 100, 10, 10);
		g.drawRect(590, 500, 10, 10);
		
		// Defenseurs
		
		g.drawRect(690, 350, 10, 10);
		g.drawRect(690, 265, 10, 10);
		g.drawRect(690, 100, 10, 10);
		g.drawRect(690, 500, 10, 10);
		
		//Gardien
		
		g.drawRect(790, 305, 10, 10); 
		
	}



	public int getDefault_x_attaquant1_bleu() {
		return default_x_attaquant1_bleu;
	}



	public void setDefault_x_attaquant1_bleu(int default_x_attaquant1_bleu) {
		this.default_x_attaquant1_bleu = default_x_attaquant1_bleu;
	}
	
	
	
	

}