
public class Animal {
	String name;
	
	public Animal(){
		name="����";
	}
	public Animal(String name){
	this.name=name;
	}
	public void makeNoise(){
		System.out.println(name+":����?");
	}
	public String toString(){
		return"�̸�:"+name;
	}
}
