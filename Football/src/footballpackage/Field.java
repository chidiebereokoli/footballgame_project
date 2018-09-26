package footballpackage;

public class Field {
	
	int color_field;
	int length;
	int width;
	int post1;
	int post2;
	int color_post1;
	int color_post2;
	
	//Constructors
	
	public Field(int color_field, int length, int width, int post1, int post2, int color_post1, int color_post2) {
		super();
		this.color_field = color_field;
		this.length = length;
		this.width = width;
		this.post1 = post1;
		this.post2 = post2;
		this.color_post1 = color_post1;
		this.color_post2 = color_post2;
	}
	
	//setters and getters
	public int getColor_field() {
		return color_field;
	}

	public void setColor_field(int color_field) {
		this.color_field = color_field;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getPost1() {
		return post1;
	}
	public void setPost1(int post1) {
		this.post1 = post1;
	}
	public int getPost2() {
		return post2;
	}
	public void setPost2(int post2) {
		this.post2 = post2;
	}
	public int getColor_post1() {
		return color_post1;
	}
	public void setColor_post1(int color_post1) {
		this.color_post1 = color_post1;
	}
	public int getColor_post2() {
		return color_post2;
	}
	public void setColor_post2(int color_post2) {
		this.color_post2 = color_post2;
	}
	

	
}
/**
 * 
 */