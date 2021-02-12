package data;

public class Ball {
	
	private int positionx_Ball = 440 ;
	private int positiony_Ball = 315 ;

	public int getPositionx_Ball() {
		return positionx_Ball;
	}
	
	public Ball() {
		super();
		this.positionx_Ball = 440 ;
		this.positiony_Ball = 315 ;
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
}
