class EX6_1 {
	public static void main(String[] args) {
		Tv t;				// Tv �ν��Ͻ��� �����ϱ� ���� ���� t�� ����(�������� ����)
		t = new Tv();		// Tv �ν��Ͻ��� ����
		t.channel = 7;		// Tv�ν��Ͻ��� ������� channel�� ���� 7�� ��
		t.channelDown();	// Tv�ν��Ͻ��� �޼��� channelDOWN()�� ȣ��
		t.channelUp();
		System.out.println("���� ä���� " + t.channel + "�Դϴ�.");
		

	}
}
	
class Tv {
	// Tv�� �Ӽ�(��� ����)
	String color;	// ����
	boolean power;	// ���� ����(on/off)
	int channel;	// ä��
	
	void power() { power = !power; }
	void channelUp() { ++channel; }
	void channelDown() { --channel; }
}
