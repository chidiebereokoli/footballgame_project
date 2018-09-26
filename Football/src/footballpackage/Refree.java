//definition of the refree class
package footballpackage;

public class Refree {
	//Refree variables
	int refreejerseycolor;
	String refreename;
	
	
	//Constructor	
	public Refree(int refreejerseycolor, String refreename) {
		super();
		this.refreejerseycolor = refreejerseycolor;
		this.refreename = refreename;
	}
	//setters and getters for the refree
	

	public int getRefreejerseycolor() {
		return refreejerseycolor;
	}

	public void setRefreejerseycolor(int refreejerseycolor) {
		this.refreejerseycolor = refreejerseycolor;
	}

	public String getRefreename() {
		return refreename;
	}

	public void setRefreename(String refreename) {
		this.refreename = refreename;
	}

	//Methods for the refree;
	void timestart(){}
	void timestop()	{}
	void startgame(){}
	void stopgame(){}
	void pausegame(){}
	void awardgoalkick(){}
	void awardFreekick(){}
	void awardPenalty(){}
	void issueRedCard(){}
	void issueYellowCard(){}
	void issueWarning(){}
	void awardGoalKick(){}
	
	//setters and getters for the Linesman
	
}
