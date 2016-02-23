
public class dog extends Animal {
	int age;
	
	public dog(){
		super();
		age=0;
	}
	public dog(String name){
		super(name);
		age=0;
	}
	public dog(String name, int age){
		super(name);
		this.age=age;
	}
	public void makeNoise(){
		System.out.println(name+":¸Û¸Û");
	}
	
	public String toString(){
		if(age<=2)
			return"<°­¾ÆÁö"+super.toString()+"><³ªÀÌ:"+age+">";
		else
			return"<°³"+super.toString()+"><³ªÀÌ:"+age+">";
	}
}
