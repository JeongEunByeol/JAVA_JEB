import java.text.DecimalFormat;
import java.util.Scanner;
public class PtTest {
	public static void main(String[] argv) {
		Scanner scan = new Scanner(System.in);
		Pt[] points = new Pt[2];
	    
	    points[0] = new Pt();
	    points[1] = new Pt();
	    
	    System.out.print("첫번째 점의  x, y좌표  : ");
	    points[0].setX(scan.nextInt());
	    points[0].setY(scan.nextInt());

	    System.out.print("두번째 점의 x, y좌표  : ");
	    points[1].setX(scan.nextInt());
	    points[1].setY(scan.nextInt());

	    System.out.println("두점  " + points[0] + "과" + points[1] + "사이의 거리를 계산합니다.");
	    double dis = points[0].distance(points[1]);

	    DecimalFormat fmt = new DecimalFormat("0.###");
	    System.out.println("두 점간의 거리는"  + fmt.format(dis) + "입니다.");
      }
}