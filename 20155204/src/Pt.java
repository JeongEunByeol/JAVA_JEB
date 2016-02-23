
public class Pt  {
	protected int x, y;
	
	public Pt() {
		this.x = 0;
		this.y = 0;
	}
	public Pt(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getX() {
		return x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	public int getY() {
		return y;
	}
	
	public double distance (Pt p2) {
		return Math.sqrt(Math.pow(x-p2.x,2) + Math.pow(y-p2.y,2));
	}

	public String toString() {
		return "(" + x + "," + y + ")";
	}
}
