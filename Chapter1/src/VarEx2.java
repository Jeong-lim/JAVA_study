
public class VarEx2 {

	public static void main(String[] args) {
		int x = 10, y = 20;
		int tmp = 0;
		
		System.out.println("x: " + x + " y: " + y);
		
		tmp = x;
		x = y;
		y = tmp;
		
		System.out.println("x: " + x + " y: " + y);
		
		
		System.out.println("tmp�� ����?: " + tmp);
		// �� ���� tmp�� �̿��ؼ� x�� ����� ���� y�� ����� ���� �ٲٱ�
	}

}
