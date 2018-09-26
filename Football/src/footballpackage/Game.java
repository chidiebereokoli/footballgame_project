package footballpackage;

public class Game {


	int hometeamoffsides;
	int awayteamoffsides;
	int hometeamredcards;
	int hometeamyellowcards;
	String homeTeam;
	String awayTeam;
	LinesMan linesman1;
	double gametime;
	double injurytime;
	Football football;
	Refree refree;
	LinesMan linesman2;
	
	//Constructor
	public Game(int hometeamoffsides, int awayteamoffsides, int hometeamredcards, int hometeamyellowcards,
			String homeTeam, String awayTeam, LinesMan linesman1, double gametime, double injurytime, Football football,
			Refree refree, LinesMan linesman2) {
		super();
		this.hometeamoffsides = hometeamoffsides;
		this.awayteamoffsides = awayteamoffsides;
		this.hometeamredcards = hometeamredcards;
		this.hometeamyellowcards = hometeamyellowcards;
		this.homeTeam = homeTeam;
		this.awayTeam = awayTeam;
		this.linesman1 = linesman1;
		this.gametime = gametime;
		this.injurytime = injurytime;
		this.football = football;
		this.refree = refree;
		this.linesman2 = linesman2;
	}
	
	//Setters and getters for the variables
	
	public int getHometeamoffsides() {
		return hometeamoffsides;
	}

	public void setHometeamoffsides(int hometeamoffsides) {
		this.hometeamoffsides = hometeamoffsides;
	}

	public int getAwayteamoffsides() {
		return awayteamoffsides;
	}

	public void setAwayteamoffsides(int awayteamoffsides) {
		this.awayteamoffsides = awayteamoffsides;
	}

	public int getHometeamredcards() {
		return hometeamredcards;
	}

	public void setHometeamredcards(int hometeamredcards) {
		this.hometeamredcards = hometeamredcards;
	}

	public int getHometeamyellowcards() {
		return hometeamyellowcards;
	}

	public void setHometeamyellowcards(int hometeamyellowcards) {
		this.hometeamyellowcards = hometeamyellowcards;
	}

	public String getHomeTeam() {
		return homeTeam;
	}

	public void setHomeTeam(String homeTeam) {
		this.homeTeam = homeTeam;
	}

	public String getAwayTeam() {
		return awayTeam;
	}

	public void setAwayTeam(String awayTeam) {
		this.awayTeam = awayTeam;
	}

	public LinesMan getLinesman1() {
		return linesman1;
	}

	public void setLinesman1(LinesMan linesman1) {
		this.linesman1 = linesman1;
	}

	public double getGametime() {
		return gametime;
	}

	public void setGametime(double gametime) {
		this.gametime = gametime;
	}

	public double getInjurytime() {
		return injurytime;
	}

	public void setInjurytime(double injurytime) {
		this.injurytime = injurytime;
	}

	public Football getFootball() {
		return football;
	}

	public void setFootball(Football football) {
		this.football = football;
	}

	public Refree getRefree() {
		return refree;
	}

	public void setRefree(Refree refree) {
		this.refree = refree;
	}

	public LinesMan getLinesman2() {
		return linesman2;
	}

	public void setLinesman2(LinesMan linesman2) {
		this.linesman2 = linesman2;
	}


	
}

 