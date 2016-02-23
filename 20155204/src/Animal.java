
public class Animal {
	String name;
	
	public Animal(){
		name="무명";
	}
	public Animal(String name){
	this.name=name;
	}
	public void makeNoise(){
		System.out.println(name+":뭐지?");
	}
	public String toString(){
		return"이름:"+name;
	}
}
