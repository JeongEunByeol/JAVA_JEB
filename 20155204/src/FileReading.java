import java.io.File;
import java.util.*;
public class FileReading {
	public static void main(String[] args){
		Scanner file;
		try{
			file=new Scanner(new File("src/aaa.txt"));
			while (file.hasNext()){
				System.out.println(file.next());
				System.out.println(file.nextInt());
			}
		
		}catch(Exception ex){
			System.out.println("������ ���µ� ������ ������ϴ�.");
		}
	}
}
