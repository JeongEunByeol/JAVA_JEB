import java.text.DecimalFormat;
import java.util.Scanner;
public class PtTest {
	public static void main(String[] argv) {
		Scanner scan = new Scanner(System.in);
		Pt[] points = new Pt[2];
	    
	    points[0] = new Pt();
	    points[1] = new Pt();
	    
	    System.out.print("ù��° ����  x, y��ǥ  : ");
	    points[0].setX(scan.nextInt());
	    points[0].setY(scan.nextInt());

	    System.out.print("�ι�° ���� x, y��ǥ  : ");
	    points[1].setX(scan.nextInt());
	    points[1].setY(scan.nextInt());

	    System.out.println("����  " + points[0] + "��" + points[1] + "������ �Ÿ��� ����մϴ�.");
	    double dis = points[0].distance(points[1]);

	    DecimalFormat fmt = new DecimalFormat("0.###");
	    System.out.println("�� ������ �Ÿ���"  + fmt.format(dis) + "�Դϴ�.");
      }
}