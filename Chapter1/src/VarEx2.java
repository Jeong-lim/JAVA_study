
public class VarEx2 {

	public static void main(String[] args) {
		int x = 10, y = 20;
		int tmp = 0;
		
		System.out.println("x: " + x + " y: " + y);
		
		tmp = x;
		x = y;
		y = tmp;
		
		System.out.println("x: " + x + " y: " + y);
		
		
		System.out.println("tmp의 값은?: " + tmp);
		// 빈 공간 tmp를 이용해서 x에 저장된 값과 y에 저장된 값을 바꾸기
	}

}
