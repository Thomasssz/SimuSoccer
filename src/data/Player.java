package data;

public class Player {
	
	private String name;
	private int speed;
	private int pass;
	private int dribbles;
	private int defense;
	private int shoot;
	private int number;

	private int x;
	private int y;
	private boolean ball ;

	enum position {
		ATTACK, DEFENSE, MIDDLE, GOALKEEPER;
	}

	private position player_position;

	public Player(String name, int speed, int pass, int dribbles, int defense, int shoot, int number, position player_position,
			int x, int y, boolean ball) {

		this.speed = speed;
		this.pass = pass;
		this.dribbles = dribbles;
		this.defense = defense;
		this.shoot = shoot;
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
		return "Player " +name+ " :\n speed=" + speed + "\n pass=" + pass + "\n dribbles=" + dribbles + "\n defense=" + defense
				+ "\n shoot=" + shoot + "\n number=" + number + "\n player_position="
				+ player_position + "";
	}

}
