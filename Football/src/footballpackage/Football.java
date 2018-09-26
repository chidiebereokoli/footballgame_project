//The physical ball to be played during the game
package footballpackage;

public class Football {

	private int footballcolor;
	private int footballweight;
	private int footballxcoordinate;
	private int footballycoordinate;
	
	
	
	public Football(int footballcolor, int footballweight, int footballxcoordinate, int footballycoordinate) {
		super();
		this.footballcolor = footballcolor;
		this.footballweight = footballweight;
		this.footballxcoordinate = footballxcoordinate;
		this.footballycoordinate = footballycoordinate;
	}

	//Generated the setters and the getters for the parameters of the soccer ball.
	public int getFootballcolor() {
		return footballcolor;
	}

	public void setFootballcolor(int footballcolor) {
		this.footballcolor = footballcolor;
	}

	public int getFootballweight() {
		return footballweight;
	}

	public void setFootballweight(int footballweight) {
		this.footballweight = footballweight;
	}

	public int getFootballxcoordinate() {
		return footballxcoordinate;
	}

	public void setFootballxcoordinate(int footballxcoordinate) {
		this.footballxcoordinate = footballxcoordinate;
	}

	public int getFootballycoordinate() {
		return footballycoordinate;
	}

	public void setFootballycoordinate(int footballycoordinate) {
		this.footballycoordinate = footballycoordinate;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
