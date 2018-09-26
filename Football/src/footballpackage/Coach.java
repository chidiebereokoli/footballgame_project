//Class for the coach
package footballpackage;

public class Coach {

	String coachname;
	String Teamname;
	
	//constructor
	public Coach(String coachname, String teamname) {
		super();
		this.coachname = coachname;
		Teamname = teamname;
	}

	
	//setters and getters
	
	public String getCoachname() {
		return coachname;
	}

	public void setCoachname(String coachname) {
		this.coachname = coachname;
	}

	public String getTeamname() {
		return Teamname;
	}

	public void setTeamname(String teamname) {
		Teamname = teamname;
	}
	
}
