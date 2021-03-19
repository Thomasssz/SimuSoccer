package data;

public class Ball {
	
	private int positionx_Ball ;
	private int positiony_Ball ;

	public int getPositionx_Ball() {
		return positionx_Ball;
	}
	
	public Ball() {
		
		positionx_Ball = 440;
		positiony_Ball = 305 ;
	}

	public Ball(int positionx_Ball, int positiony_Ball) {
		super();
		this.positionx_Ball = positionx_Ball;
		this.positiony_Ball = positiony_Ball;
	}

	public void setPositionx_Ball(int positionx_Ball) {
		this.positionx_Ball = positionx_Ball;
	}

	public int getPositiony_Ball() {
		return positiony_Ball;
	}

	public void setPositiony_Ball(int positiony_Ball) {
		this.positiony_Ball = positiony_Ball;
	}
		
	public void setBallPositionxWithBluePlayer (Player blue_ball_player) {
		positionx_Ball = blue_ball_player.getX()+5 ;
	}
	
	public void setBallPositionyWithBluePlayer (Player blue_ball_player) {
		positiony_Ball = blue_ball_player.getY() ;
	}
	
	public void setBallPositionxWithRedPlayer (Player red_ball_player) {
		positionx_Ball = red_ball_player.getX()-5 ;
	}
	
	public void setBallPositionyWithRedPlayer (Player red_ball_player) {
		positiony_Ball = red_ball_player.getY() ;
	}
}