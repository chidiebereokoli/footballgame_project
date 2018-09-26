//Class used to demonstrate a football team
package footballpackage;

import java.util.*;

public class Team {
	
	Player player;
	int nosofplayers =11;
	String Teamname;
	int goalscored;
	int goalsconceded;
	int jerseycolor;
	String country;
	String teamStadium;
	int formation;
	
	Boolean home;
	Boolean away;
	
	//setters and getters for the team.
	
	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public int getNosofplayers() {
		return nosofplayers;
	}

	public void setNosofplayers(int nosofplayers) {
		this.nosofplayers = nosofplayers;
	}

	public String getTeamname() {
		return Teamname;
	}

	public void setTeamname(String teamname) {
		Teamname = teamname;
	}

	public int getGoalscored() {
		return goalscored;
	}

	public void setGoalscored(int goalscored) {
		this.goalscored = goalscored;
	}

	public int getGoalsconceded() {
		return goalsconceded;
	}

	public void setGoalsconceded(int goalsconceded) {
		this.goalsconceded = goalsconceded;
	}

	public int getJerseycolor() {
		return jerseycolor;
	}

	public void setJerseycolor(int jerseycolor) {
		this.jerseycolor = jerseycolor;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getTeamStadium() {
		return teamStadium;
	}

	public void setTeamStadium(String teamStadium) {
		this.teamStadium = teamStadium;
	}

	public int getFormation() {
		return formation;
	}

	public void setFormation(int formation) {
		this.formation = formation;
	}

	public Boolean getHome() {
		return home;
	}

	public void setHome(Boolean home) {
		this.home = home;
	}

	public Boolean getAway() {
		return away;
	}

	public void setAway(Boolean away) {
		this.away = away;
	}


	
	//Constructor
	public Team(Player player, int nosofplayers, String teamname, int goalscored, int goalsconceded, int jerseycolor,
			String country, String teamStadium, int formation) {
		super();
		this.player = player;
		this.nosofplayers = nosofplayers;
		Teamname = teamname;
		this.goalscored = goalscored;
		this.goalsconceded = goalsconceded;
		this.jerseycolor = jerseycolor;
		this.country = country;
		this.teamStadium = teamStadium;
		this.formation = formation;
	}
	
	//Actions that can be performed by the team as a whole
	void defendFreeKick(){}
	void attackFreekick(){}
	void takeGoalKick(){}

	void yellowCardsSuffered(){}
	void redCardsSuffered(){}
	void defendThrowIn(){}
	void attackThrowin(){}
	
	
}



 