class EX6_1 {
	public static void main(String[] args) {
		Tv t;
		t = new Tv();
		t.channel = 7;
		t.channelDOWN();
		System.out.println("���� ä���� " + t.channel + "�Դϴ�.");
		

	}
}
	
class Tv {
	String color;
	boolean power;
	int channel;
	
	void power() {power = !power; }
	void channelUP() { ++channel; }
	void channelDOWN() { --channel; }
}
