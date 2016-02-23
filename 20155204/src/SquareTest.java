import java.util.Scanner;
import java.text.DecimalFormat;
public class SquareTest {
   public static void main(String[] args){
      Scanner scan = new Scanner (System.in);
      DecimalFormat fmt = new DecimalFormat("0.###");
      
      Square s1,s2,s3;

      System.out.println("ù��°���簢���� ���� ���̸� ���ϼ��� : ");
      s1 = new Square(scan.nextInt());

      System.out.println("�ι�° ���簢���� ���Ǳ����� ���ϼ��� : ");
      int side = scan.nextInt();
      s2 = new Square();
      s2.setSide(side);
      s3=new Square();
      System.out.println();
      System.out.println("ù��° �簢���� �� => " +s1);
      System.out.println("���� => " +fmt.format(s1.area()));
      System.out.println("�ѷ� => " +fmt.format(s1.circumference()));
      System.out.println("�밢����"+fmt.format(s1. distance()));
      if(s1.isSquare())
         System.out.println("���簢���Դϴ�.");
      else 
         System.out.println("���簢���ƴմϴ�.");
      System.out.println();
      System.out.println("�ι�° �簢���� �� => " +s2);
      System.out.println("���� => " +fmt.format(s2.area()));
      System.out.println("�ѷ� => " +fmt.format(s2.circumference()));
      System.out.println("�밢����"+fmt.format(s2. distance()));
      
      if(s2.isSquare())
         System.out.println("���簢���Դϴ�.");
      else
         System.out.println("���簢���ƴմϴ�.");
      System.out.println();
      System.out.println();
      System.out.println("����° �簢���� �� => " +s3);
      System.out.println("���� => " +fmt.format(s3.area()));
      System.out.println("�ѷ� => " +fmt.format(s3.circumference()));
      System.out.println("�밢����"+fmt.format(s3. distance()));
      if(s1.equals(s2))
    	  
         System.out.println("�� �簢���� �����մϴ�.");
      else
         System.out.println("�� �簢���� �������� �ʽ��ϴ�.");
   }

}