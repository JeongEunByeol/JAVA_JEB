
public class Rectangle {
	int width;			// �簢���� ��
	int height;			// �簢���� ����
	
	public Rectangle () {		// �Ű����� ���� ������
		width = 1;
		height = 1;
	}
	
	public Rectangle (int x, int y) {	// �Ű������� ���� ���̸� �����ϴ� ������
		width = x;
		height = y;
	}
	
	public void setWidth(int w) {
		width = w;
	}
	
	public int getWidth() {
		return width;
	}
	
	public void setHeight(int h) {
		height = h;
	}
	
	public int getHeight() {
		return height;
	}
	
	public int circumference() {
		return 2*width + 2*height;
	}
	
	public int area() {
		return width * height;
	}
	
	public boolean isSquare() {
		return width == height;
	}
	
	public boolean equals (Rectangle s) {
		return (width == s.getWidth() && height == s.getHeight());
	}

	public String toString() {
		return "�� : " + width + " ���� : " + height;
	}
}
