import java.util.Scanner;
import java.text.DecimalFormat;
public class SquareTest {
   public static void main(String[] args){
      Scanner scan = new Scanner (System.in);
      DecimalFormat fmt = new DecimalFormat("0.###");
      
      Square s1,s2,s3;

      System.out.println("첫번째정사각형의 변의 길이를 구하세요 : ");
      s1 = new Square(scan.nextInt());

      System.out.println("두번째 정사각형의 변의길이을 구하세요 : ");
      int side = scan.nextInt();
      s2 = new Square();
      s2.setSide(side);
      s3=new Square();
      System.out.println();
      System.out.println("첫번째 사각형의 명세 => " +s1);
      System.out.println("면적 => " +fmt.format(s1.area()));
      System.out.println("둘레 => " +fmt.format(s1.circumference()));
      System.out.println("대각선은"+fmt.format(s1. distance()));
      if(s1.isSquare())
         System.out.println("정사각형입니다.");
      else 
         System.out.println("정사각형아닙니다.");
      System.out.println();
      System.out.println("두번째 사각형의 명세 => " +s2);
      System.out.println("면적 => " +fmt.format(s2.area()));
      System.out.println("둘레 => " +fmt.format(s2.circumference()));
      System.out.println("대각선은"+fmt.format(s2. distance()));
      
      if(s2.isSquare())
         System.out.println("정사각형입니다.");
      else
         System.out.println("정사각형아닙니다.");
      System.out.println();
      System.out.println();
      System.out.println("세번째 사각형의 명세 => " +s3);
      System.out.println("면적 => " +fmt.format(s3.area()));
      System.out.println("둘레 => " +fmt.format(s3.circumference()));
      System.out.println("대각선은"+fmt.format(s3. distance()));
      if(s1.equals(s2))
    	  
         System.out.println("두 사각형은 동일합니다.");
      else
         System.out.println("두 사각형은 동일하지 않습니다.");
   }

}