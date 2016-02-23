
import java.text.DecimalFormat;
import java.util.Scanner;
public class PTEnhancedTest {
	public static void main(String[] argv) {
		Scanner scan = new Scanner(System.in);
		PTEnhanced[] points = new PTEnhanced[2];
	    
	    points[0] = new PTEnhanced();
	    points[1] = new PTEnhanced(5,5,5);
	    
	    System.out.print("첫번째 점의 정보  x, y좌표 및 반지름 : ");
	    points[0].setX(scan.nextInt());
	    points[0].setY(scan.nextInt());
	    points[0].setRadius(scan.nextInt());


	    System.out.println("두점  " + points[0] + "과" + points[1] + "사이의 거리를 계산합니다.");
	    double dis = points[0].distance(points[1]);

	    DecimalFormat fmt = new DecimalFormat("0.###");
	    System.out.println("두 점간의 거리는"  + fmt.format(dis) + "입니다.");
	    
	    System.out.println("면적은 각각 다음과 같습니다.");
	    System.out.println(points[0]+"\t"+fmt.format(points[0].area()));
	    System.out.println(points[1]+"\t"+fmt.format(points[1].area()));
	    
      }
}