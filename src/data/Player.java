package data;

public class Player {
	
	private String name;
	private int speed;
	private int pass;
	private int dribbles;
	private int defense;
	private int shoot;
	private int number;
	private int endurance;
	private int energie;

	private int x;
	private int y;
	private boolean ball ;

	public enum position {
		ATTACK, DEFENSE, MIDDLE, GOALKEEPER;
	}

	private position player_position;

	public Player(String name, int speed, int pass, int dribbles, int defense, int shoot, int energie, int endurance, int number, position player_position,
			int x, int y, boolean ball) {

		this.speed = speed;
		this.pass = pass;
		this.dribbles = dribbles;
		this.defense = defense;
		this.shoot = shoot;
		this.energie = energie;
		this.endurance = endurance;
		this.number = number;
		this.player_position = player_position;
		this.x = x;
		this.y = y;
		this.name = name;
		this.ball = ball ;
	}

	public boolean isBall() {
		return ball;
	}

	public void setBall(boolean ball) {
		this.ball = ball;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPass() {
		return pass;
	}

	public void setPass(int pass) {
		this.pass = pass;
	}

	public int getDribbles() {
		return dribbles;
	}

	public void setDribbles(int dribbles) {
		this.dribbles = dribbles;
	}

	public int getDefense() {
		return defense;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}

	public int getShoot() {
		return shoot;
	}

	public void setShoot(int shoot) {
		this.shoot = shoot;
	}
	
	public int getEndurance() {
		return endurance;
	}
	
	public void setEndurance(int endurance) {
		this.endurance = endurance;
	}

	public int getNumber() {
		return number;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public position getPosition() {
		return player_position;
	}

	public void setPosition(position new_player_position) {
		player_position = new_player_position ;
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public int getEnergie() {
		return energie;
	}

	public void setEnergie(int energie) {
		this.energie = energie;
	}

	@Override
	public String toString() {
		return "Player " + name + "\n speed= "+ speed + "\n pass=" + pass + "\n dribbles=" + dribbles + "\n defense="
				+ defense + "\n shoot=" + shoot + "\n number=" + number + "\n x=" + x + "\n y=" + y + "\n ball=" + ball
				+ "\n player_position=" + player_position + "";
	}

}
