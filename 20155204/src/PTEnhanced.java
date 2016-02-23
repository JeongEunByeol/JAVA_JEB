
public class PTEnhanced extends Pt{
	int radius;
	
	public PTEnhanced(){
		super();
		radius=1;
	}
	
	public PTEnhanced(int x, int y,int r){
		super.x=x;
		super.y=y;
		radius=r;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	public double area(){
		double area;
		area=Math.PI*(Math.pow(radius,2));
		return area;
	}
	public String toString() {
		return "(" + x + "," + y +"반지름은"+radius+")";
	}
}
