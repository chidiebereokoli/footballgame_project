//Definition of the linesman class
package footballpackage;

public class LinesMan {

	int jerseycolor;
	String linesmanname;
	
	
	//Constructor
	public LinesMan(int jerseycolor, String linesmanname) {
		super();
		this.jerseycolor = jerseycolor;
		this.linesmanname = linesmanname;
	}
	
	//Setters and Getters for the linesman
	
	public int getJerseycolor() {
		return jerseycolor;
	}

	public void setJerseycolor(int jerseycolor) {
		this.jerseycolor = jerseycolor;
	}

	public String getLinesmanname() {
		return linesmanname;
	}

	public void setLinesmanname(String linesmanname) {
		this.linesmanname = linesmanname;
	}
	
	//Methods for the LinesMan



	void run(){};
	void calloffside(){};
	
}

/*











 * */
