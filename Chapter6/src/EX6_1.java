class EX6_1 {
	public static void main(String[] args) {
		Tv t;				// Tv 인스턴스를 참조하기 위한 변수 t를 선언(리모콘의 역할)
		t = new Tv();		// Tv 인스턴스를 생성
		t.channel = 7;		// Tv인스턴스의 멤버변수 channel의 값을 7로 함
		t.channelDown();	// Tv인스턴스의 메서드 channelDOWN()을 호출
		t.channelUp();
		System.out.println("현재 채널은 " + t.channel + "입니다.");
		

	}
}
	
class Tv {
	// Tv의 속성(멤버 변수)
	String color;	// 색상
	boolean power;	// 전원 상태(on/off)
	int channel;	// 채널
	
	void power() { power = !power; }
	void channelUp() { ++channel; }
	void channelDown() { --channel; }
}
