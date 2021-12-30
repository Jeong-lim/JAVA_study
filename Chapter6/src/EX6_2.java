class EX6_2 {
	public static void main(String[] args) {
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		System.out.println("현재 채널은 " + t1.channel + "입니다."); // 0
		System.out.println("현재 채널은 " + t2.channel + "입니다."); // 0
		
		t1.channel = 7;
		System.out.println("t1의 채널의 값을 7로 변경하였습니다.");
		
		t2 = t1;
		System.out.println("현재 채널은 " + t1.channel + "입니다."); // 7
		System.out.println("현재 채널은 " + t2.channel + "입니다."); // 7
		

	}
}