package gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.ImageIcon;

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
	
	private int test_dimension_x = 800;
	private int test_dimension_y = 561;
	
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
		
		/*Test dimension*/
		
		g.setColor(Color.BLACK);
		g.drawRect(test_dimension_x, test_dimension_y, 10, 10);
		
		
		/*Equipe bleu*/
		
		// Attaquants
		
		g.setColor(Color.BLUE);
		
		g.drawRect(default_x_attaquant1_bleu, default_y_attaquant1_bleu, 10, 10);
		g.drawRect(default_x_attaquant2_bleu, default_y_attaquant2_bleu, 10, 10);
		
		//Milieux
		
		g.drawRect(default_x_milieu3_bleu, default_y_milieu3_bleu, 10, 10);
		g.drawRect(default_x_milieu2_bleu, default_y_milieu2_bleu, 10, 10);
		g.drawRect(default_x_milieu1_bleu, default_y_milieu1_bleu, 10, 10);
		g.drawRect(default_x_milieu4_bleu, default_y_milieu4_bleu, 10, 10);
		
		// Defenseurs
		
		g.drawRect(default_x_defenseur3_bleu, default_y_defenseur3_bleu, 10, 10);
		g.drawRect(default_x_defenseur2_bleu, default_y_defenseur2_bleu, 10, 10);
		g.drawRect(default_x_defenseur1_bleu, default_y_defenseur1_bleu, 10, 10);
		g.drawRect(default_x_defenseur4_bleu, default_y_defenseur4_bleu, 10, 10);
		
		//Gardien
		
		g.drawRect(default_x_gardien_bleu, default_y_gardien_bleu, 10, 10);

		/*Equipe rouge*/
		
		// Attaquants
		
				g.setColor(Color.RED);
				
				g.drawRect(default_x_attaquant1_rouge, default_y_attaquant1_rouge, 10, 10);
				g.drawRect(default_x_attaquant2_rouge, default_y_attaquant2_rouge, 10, 10);
				
				//Milieux
				
				g.drawRect(default_x_milieu3_rouge, default_y_milieu3_rouge, 10, 10);
				g.drawRect(default_x_milieu2_rouge, default_y_milieu2_rouge, 10, 10);
				g.drawRect(default_x_milieu1_rouge, default_y_milieu1_rouge, 10, 10);
				g.drawRect(default_x_milieu4_rouge, default_y_milieu4_rouge, 10, 10);
				
				// Defenseurs
				
				g.drawRect(default_x_defenseur3_rouge, default_y_defenseur3_rouge, 10, 10);
				g.drawRect(default_x_defenseur2_rouge, default_y_defenseur2_rouge, 10, 10);
				g.drawRect(default_x_defenseur1_rouge, default_y_defenseur1_rouge, 10, 10);
				g.drawRect(default_x_defenseur4_rouge, default_y_defenseur4_rouge, 10, 10);
				
				//Gardien
				
				g.drawRect(default_x_gardien_rouge, default_y_gardien_rouge, 10, 10) ;

	}

	public int getDefault_x_gardien_bleu() {
		return default_x_gardien_bleu;
	}

	public void setDefault_x_gardien_bleu(int default_x_gardien_bleu) {
		this.default_x_gardien_bleu = default_x_gardien_bleu;
	}

	public int getDefault_y_gardien_bleu() {
		return default_y_gardien_bleu;
	}

	public void setDefault_y_gardien_bleu(int default_y_gardien_bleu) {
		this.default_y_gardien_bleu = default_y_gardien_bleu;
	}

	public int getDefault_x_defenseur1_bleu() {
		return default_x_defenseur1_bleu;
	}

	public void setDefault_x_defenseur1_bleu(int default_x_defenseur1_bleu) {
		this.default_x_defenseur1_bleu = default_x_defenseur1_bleu;
	}

	public int getDefault_y_defenseur1_bleu() {
		return default_y_defenseur1_bleu;
	}

	public void setDefault_y_defenseur1_bleu(int default_y_defenseur1_bleu) {
		this.default_y_defenseur1_bleu = default_y_defenseur1_bleu;
	}

	public int getDefault_x_defenseur2_bleu() {
		return default_x_defenseur2_bleu;
	}

	public void setDefault_x_defenseur2_bleu(int default_x_defenseur2_bleu) {
		this.default_x_defenseur2_bleu = default_x_defenseur2_bleu;
	}

	public int getDefault_y_defenseur2_bleu() {
		return default_y_defenseur2_bleu;
	}

	public void setDefault_y_defenseur2_bleu(int default_y_defenseur2_bleu) {
		this.default_y_defenseur2_bleu = default_y_defenseur2_bleu;
	}

	public int getDefault_x_defenseur3_bleu() {
		return default_x_defenseur3_bleu;
	}

	public void setDefault_x_defenseur3_bleu(int default_x_defenseur3_bleu) {
		this.default_x_defenseur3_bleu = default_x_defenseur3_bleu;
	}

	public int getDefault_y_defenseur3_bleu() {
		return default_y_defenseur3_bleu;
	}

	public void setDefault_y_defenseur3_bleu(int default_y_defenseur3_bleu) {
		this.default_y_defenseur3_bleu = default_y_defenseur3_bleu;
	}

	public int getDefault_x_defenseur4_bleu() {
		return default_x_defenseur4_bleu;
	}

	public void setDefault_x_defenseur4_bleu(int default_x_defenseur4_bleu) {
		this.default_x_defenseur4_bleu = default_x_defenseur4_bleu;
	}

	public int getDefault_y_defenseur4_bleu() {
		return default_y_defenseur4_bleu;
	}

	public void setDefault_y_defenseur4_bleu(int default_y_defenseur4_bleu) {
		this.default_y_defenseur4_bleu = default_y_defenseur4_bleu;
	}

	public int getDefault_x_milieu1_bleu() {
		return default_x_milieu1_bleu;
	}

	public void setDefault_x_milieu1_bleu(int default_x_milieu1_bleu) {
		this.default_x_milieu1_bleu = default_x_milieu1_bleu;
	}

	public int getDefault_y_milieu1_bleu() {
		return default_y_milieu1_bleu;
	}

	public void setDefault_y_milieu1_bleu(int default_y_milieu1_bleu) {
		this.default_y_milieu1_bleu = default_y_milieu1_bleu;
	}

	public int getDefault_x_milieu2_bleu() {
		return default_x_milieu2_bleu;
	}

	public void setDefault_x_milieu2_bleu(int default_x_milieu2_bleu) {
		this.default_x_milieu2_bleu = default_x_milieu2_bleu;
	}

	public int getDefault_y_milieu2_bleu() {
		return default_y_milieu2_bleu;
	}

	public void setDefault_y_milieu2_bleu(int default_y_milieu2_bleu) {
		this.default_y_milieu2_bleu = default_y_milieu2_bleu;
	}

	public int getDefault_x_milieu3_bleu() {
		return default_x_milieu3_bleu;
	}

	public void setDefault_x_milieu3_bleu(int default_x_milieu3_bleu) {
		this.default_x_milieu3_bleu = default_x_milieu3_bleu;
	}

	public int getDefault_y_milieu3_bleu() {
		return default_y_milieu3_bleu;
	}

	public void setDefault_y_milieu3_bleu(int default_y_milieu3_bleu) {
		this.default_y_milieu3_bleu = default_y_milieu3_bleu;
	}

	public int getDefault_x_milieu4_bleu() {
		return default_x_milieu4_bleu;
	}

	public void setDefault_x_milieu4_bleu(int default_x_milieu4_bleu) {
		this.default_x_milieu4_bleu = default_x_milieu4_bleu;
	}

	public int getDefault_y_milieu4_bleu() {
		return default_y_milieu4_bleu;
	}

	public void setDefault_y_milieu4_bleu(int default_y_milieu4_bleu) {
		this.default_y_milieu4_bleu = default_y_milieu4_bleu;
	}

	public int getDefault_y_attaquant1_bleu() {
		return default_y_attaquant1_bleu;
	}

	public void setDefault_y_attaquant1_bleu(int default_y_attaquant1_bleu) {
		this.default_y_attaquant1_bleu = default_y_attaquant1_bleu;
	}

	public int getDefault_x_attaquant2_bleu() {
		return default_x_attaquant2_bleu;
	}

	public void setDefault_x_attaquant2_bleu(int default_x_attaquant2_bleu) {
		this.default_x_attaquant2_bleu = default_x_attaquant2_bleu;
	}

	public int getDefault_y_attaquant2_bleu() {
		return default_y_attaquant2_bleu;
	}

	public void setDefault_y_attaquant2_bleu(int default_y_attaquant2_bleu) {
		this.default_y_attaquant2_bleu = default_y_attaquant2_bleu;
	}

	public int getDefault_x_gardien_rouge() {
		return default_x_gardien_rouge;
	}

	public void setDefault_x_gardien_rouge(int default_x_gardien_rouge) {
		this.default_x_gardien_rouge = default_x_gardien_rouge;
	}

	public int getDefault_y_gardien_rouge() {
		return default_y_gardien_rouge;
	}

	public void setDefault_y_gardien_rouge(int default_y_gardien_rouge) {
		this.default_y_gardien_rouge = default_y_gardien_rouge;
	}

	public int getDefault_x_defenseur1_rouge() {
		return default_x_defenseur1_rouge;
	}

	public void setDefault_x_defenseur1_rouge(int default_x_defenseur1_rouge) {
		this.default_x_defenseur1_rouge = default_x_defenseur1_rouge;
	}

	public int getDefault_y_defenseur1_rouge() {
		return default_y_defenseur1_rouge;
	}

	public void setDefault_y_defenseur1_rouge(int default_y_defenseur1_rouge) {
		this.default_y_defenseur1_rouge = default_y_defenseur1_rouge;
	}

	public int getDefault_x_defenseur2_rouge() {
		return default_x_defenseur2_rouge;
	}

	public void setDefault_x_defenseur2_rouge(int default_x_defenseur2_rouge) {
		this.default_x_defenseur2_rouge = default_x_defenseur2_rouge;
	}

	public int getDefault_y_defenseur2_rouge() {
		return default_y_defenseur2_rouge;
	}

	public void setDefault_y_defenseur2_rouge(int default_y_defenseur2_rouge) {
		this.default_y_defenseur2_rouge = default_y_defenseur2_rouge;
	}

	public int getDefault_x_defenseur3_rouge() {
		return default_x_defenseur3_rouge;
	}

	public void setDefault_x_defenseur3_rouge(int default_x_defenseur3_rouge) {
		this.default_x_defenseur3_rouge = default_x_defenseur3_rouge;
	}

	public int getDefault_y_defenseur3_rouge() {
		return default_y_defenseur3_rouge;
	}

	public void setDefault_y_defenseur3_rouge(int default_y_defenseur3_rouge) {
		this.default_y_defenseur3_rouge = default_y_defenseur3_rouge;
	}

	public int getDefault_x_defenseur4_rouge() {
		return default_x_defenseur4_rouge;
	}

	public void setDefault_x_defenseur4_rouge(int default_x_defenseur4_rouge) {
		this.default_x_defenseur4_rouge = default_x_defenseur4_rouge;
	}

	public int getDefault_y_defenseur4_rouge() {
		return default_y_defenseur4_rouge;
	}

	public void setDefault_y_defenseur4_rouge(int default_y_defenseur4_rouge) {
		this.default_y_defenseur4_rouge = default_y_defenseur4_rouge;
	}

	public int getDefault_x_milieu1_rouge() {
		return default_x_milieu1_rouge;
	}

	public void setDefault_x_milieu1_rouge(int default_x_milieu1_rouge) {
		this.default_x_milieu1_rouge = default_x_milieu1_rouge;
	}

	public int getDefault_y_milieu1_rouge() {
		return default_y_milieu1_rouge;
	}

	public void setDefault_y_milieu1_rouge(int default_y_milieu1_rouge) {
		this.default_y_milieu1_rouge = default_y_milieu1_rouge;
	}

	public int getDefault_x_milieu2_rouge() {
		return default_x_milieu2_rouge;
	}

	public void setDefault_x_milieu2_rouge(int default_x_milieu2_rouge) {
		this.default_x_milieu2_rouge = default_x_milieu2_rouge;
	}

	public int getDefault_y_milieu2_rouge() {
		return default_y_milieu2_rouge;
	}

	public void setDefault_y_milieu2_rouge(int default_y_milieu2_rouge) {
		this.default_y_milieu2_rouge = default_y_milieu2_rouge;
	}

	public int getDefault_x_milieu3_rouge() {
		return default_x_milieu3_rouge;
	}

	public void setDefault_x_milieu3_rouge(int default_x_milieu3_rouge) {
		this.default_x_milieu3_rouge = default_x_milieu3_rouge;
	}

	public int getDefault_y_milieu3_rouge() {
		return default_y_milieu3_rouge;
	}

	public void setDefault_y_milieu3_rouge(int default_y_milieu3_rouge) {
		this.default_y_milieu3_rouge = default_y_milieu3_rouge;
	}

	public int getDefault_x_milieu4_rouge() {
		return default_x_milieu4_rouge;
	}

	public void setDefault_x_milieu4_rouge(int default_x_milieu4_rouge) {
		this.default_x_milieu4_rouge = default_x_milieu4_rouge;
	}

	public int getDefault_y_milieu4_rouge() {
		return default_y_milieu4_rouge;
	}

	public void setDefault_y_milieu4_rouge(int default_y_milieu4_rouge) {
		this.default_y_milieu4_rouge = default_y_milieu4_rouge;
	}

	public int getDefault_x_attaquant1_rouge() {
		return default_x_attaquant1_rouge;
	}

	public void setDefault_x_attaquant1_rouge(int default_x_attaquant1_rouge) {
		this.default_x_attaquant1_rouge = default_x_attaquant1_rouge;
	}

	public int getDefault_y_attaquant1_rouge() {
		return default_y_attaquant1_rouge;
	}

	public void setDefault_y_attaquant1_rouge(int default_y_attaquant1_rouge) {
		this.default_y_attaquant1_rouge = default_y_attaquant1_rouge;
	}

	public int getDefault_x_attaquant2_rouge() {
		return default_x_attaquant2_rouge;
	}

	public void setDefault_x_attaquant2_rouge(int default_x_attaquant2_rouge) {
		this.default_x_attaquant2_rouge = default_x_attaquant2_rouge;
	}

	public int getDefault_y_attaquant2_rouge() {
		return default_y_attaquant2_rouge;
	}

	public void setDefault_y_attaquant2_rouge(int default_y_attaquant2_rouge) {
		this.default_y_attaquant2_rouge = default_y_attaquant2_rouge;
	}

	public int getDefault_x_attaquant1_bleu() {
		return default_x_attaquant1_bleu;
	}



	public void setDefault_x_attaquant1_bleu(int default_x_attaquant1_bleu) {
		this.default_x_attaquant1_bleu = default_x_attaquant1_bleu;
	}

}