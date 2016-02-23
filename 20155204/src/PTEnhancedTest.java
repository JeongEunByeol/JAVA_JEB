
import java.text.DecimalFormat;
import java.util.Scanner;
public class PTEnhancedTest {
	public static void main(String[] argv) {
		Scanner scan = new Scanner(System.in);
		PTEnhanced[] points = new PTEnhanced[2];
	    
	    points[0] = new PTEnhanced();
	    points[1] = new PTEnhanced(5,5,5);
	    
	    System.out.print("ù��° ���� ����  x, y��ǥ �� ������ : ");
	    points[0].setX(scan.nextInt());
	    points[0].setY(scan.nextInt());
	    points[0].setRadius(scan.nextInt());


	    System.out.println("����  " + points[0] + "��" + points[1] + "������ �Ÿ��� ����մϴ�.");
	    double dis = points[0].distance(points[1]);

	    DecimalFormat fmt = new DecimalFormat("0.###");
	    System.out.println("�� ������ �Ÿ���"  + fmt.format(dis) + "�Դϴ�.");
	    
	    System.out.println("������ ���� ������ �����ϴ�.");
	    System.out.println(points[0]+"\t"+fmt.format(points[0].area()));
	    System.out.println(points[1]+"\t"+fmt.format(points[1].area()));
	    
      }
}