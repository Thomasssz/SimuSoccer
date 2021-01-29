package data;



public class Player {
private int speed;
private int pass;
private int dribbles;
private int defense;
private enum position{ 
    ATTACK,
    DEFENSE,
    MIDDLE,

    
   };
   

public Player(int speed, int pass, int dribbles, int defense, int shoot, int number) {

	this.speed = speed;
	this.pass = pass;
	this.dribbles = dribbles;
	this.defense = defense;
	this.shoot = shoot;
	this.number = number;
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
private int shoot;
private int number;

	
	
	
	
	
	
	
	
	
}
