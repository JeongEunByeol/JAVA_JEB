
public class Rectangle {
	int width;			// 사각형의 폭
	int height;			// 사각형의 높이
	
	public Rectangle () {		// 매개변수 없는 구성자
		width = 1;
		height = 1;
	}
	
	public Rectangle (int x, int y) {	// 매개변수로 폭과 높이를 제공하는 구성자
		width = x;
		height = y;
	}
	
	public void setWidth(int w) {
		width = w;
	}
	
	public int getWidth() {
		return width;
	}
	
	public void setHeight(int h) {
		height = h;
	}
	
	public int getHeight() {
		return height;
	}
	
	public int circumference() {
		return 2*width + 2*height;
	}
	
	public int area() {
		return width * height;
	}
	
	public boolean isSquare() {
		return width == height;
	}
	
	public boolean equals (Rectangle s) {
		return (width == s.getWidth() && height == s.getHeight());
	}

	public String toString() {
		return "폭 : " + width + " 높이 : " + height;
	}
}
