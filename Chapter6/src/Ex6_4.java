
public class Ex6_4 {

	public static void main(String[] args) {
		MyMath mm = new MyMath();
		long result = mm.max(5, 3); // �� �߿� ū ���� ��ȯ�ϴ� �޼���
		long result1 = mm.add(5, 3); // add �޼��� ȣ��
		long result2 = mm.subtract(5L, 3L);
		long result3 = mm.multiply(5L, 3L);
		double result4 = mm.divide(5L, 3L);
		
		mm.printGugudan(3); // ������ 3���� ���
		
		System.out.println("max(5L. 3L) = " + result);
		System.out.println("add(5L. 3L) = " + result);
		System.out.println("subtract(5L. 3L) = " + result);
		System.out.println("multiply(5L. 3L) = " + result);
		System.out.println("divide(5L. 3L) = " + result);
	}

}

class MyMath{
	void printGugudan(int dan) {
		for(int i=1;i<=9;i++) {
			System.out.printf("%d * %d = %d\n", dan, i, dan * i);
		}
	}
	long add(long a, long b) {
		long result = a + b;
		return result;
	// return a + b;	// �� �� ���� �̿� ���� �� �ٷ� ������ �� �� �ִ�.
	}
	//  �� ���� �޾Ƽ� �� �߿� ū ���� ��ȯ�ϴ� �޼��带 �ۼ��Ͻÿ�.
	long max(long a, long b) {
		return a > b ? a : b;
	}
	long subtract(long a, long b) { return a - b; }
	long multiply(long a, long b) { return a * b; }
	double divide(double a, double b) { return a / b; }
}