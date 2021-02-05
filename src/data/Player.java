package data;

public class Player {

	private int speed;
	private int pass;
	private int dribbles;
	private int defense;
	private int shoot;
	private int number;

	private int x;
	private int y;

	enum position {
		ATTACK, DEFENSE, MIDDLE, GOALKEEPER;
	}

	private position player_position;

	public Player(int speed, int pass, int dribbles, int defense, int shoot, int number, position player_position,
			int x, int y) {

		this.speed = speed;
		this.pass = pass;
		this.dribbles = dribbles;
		this.defense = defense;
		this.shoot = shoot;
		this.number = number;
		this.player_position = player_position;
		this.x = x;
		this.y = y;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
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

	@Override
	public String toString() {
		return "Player [speed=" + speed + ", pass=" + pass + ", dribbles=" + dribbles + ", defense=" + defense
				+ ", shoot=" + shoot + ", number=" + number + ", x=" + x + ", y=" + y + ", player_position="
				+ player_position + "]";
	}

}
