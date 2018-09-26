//Class demonstrating a  player and his profile
package footballpackage;

import java.util.*;

public class Player {
	String name;
	Boolean leftFoot;
	Boolean rightfoot;
	int jerseyNumber;
	int jerseycolor;
	int age;
	int x, y;
	int team;
	int playerRating;
	
//constructor	

	public Player(String name, Boolean leftFoot, Boolean rightfoot, int jerseyNumber, int jerseycolor, int age, int x,
			int y, int team, int playerRating) {
		super();
		this.name = name;
		this.leftFoot = leftFoot;
		this.rightfoot = rightfoot;
		this.jerseyNumber = jerseyNumber;
		this.jerseycolor = jerseycolor;
		this.age = age;
		this.x = x;
		this.y = y;
		this.team = team;
		this.playerRating = playerRating;
	}
	
	//getters and setters for the variables
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getLeftFoot() {
		return leftFoot;
	}

	public void setLeftFoot(Boolean leftFoot) {
		this.leftFoot = leftFoot;
	}

	public Boolean getRightfoot() {
		return rightfoot;
	}

	public void setRightfoot(Boolean rightfoot) {
		this.rightfoot = rightfoot;
	}

	public int getJerseyNumber() {
		return jerseyNumber;
	}

	public void setJerseyNumber(int jerseyNumber) {
		this.jerseyNumber = jerseyNumber;
	}

	public int getJerseycolor() {
		return jerseycolor;
	}

	public void setJerseycolor(int jerseycolor) {
		this.jerseycolor = jerseycolor;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
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

	public int getTeam() {
		return team;
	}

	public void setTeam(int team) {
		this.team = team;
	}

	public int getPlayerRating() {
		return playerRating;
	}

	public void setPlayerRating(int playerRating) {
		this.playerRating = playerRating;
	}

//Methods/functions for the player class
	void pass(Player player){}
	void tackle(Player player){}
	void shoot(){}
	void headpass(){}
	void headshot(){}
	void dribble(Player player){}
	void ballthrow(Player player){}
	void run(){}
	void yellowCardsSuffered(){}
	void redCardsSuffered(){}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
