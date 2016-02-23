
public class Square extends Rectangle{
	int side;
	
	public int getSide() {
		return side;
	}
	public void setSide(int side) {
		this.side = side;
	}
	public Square(){
		super();
	}
	public Square(int num){
		side=num;
	}
	public String toString() {
		return "("+ "변의길이는"+ width+")";
	}
	
	public double distance () {
		return Math.sqrt(Math.pow(width,2) + Math.pow(width,2));
	}
}
	