class EX6_2 {
	public static void main(String[] args) {
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		System.out.println("���� ä���� " + t1.channel + "�Դϴ�."); // 0
		System.out.println("���� ä���� " + t2.channel + "�Դϴ�."); // 0
		
		t1.channel = 7;
		System.out.println("t1�� ä���� ���� 7�� �����Ͽ����ϴ�.");
		
		t2 = t1;
		System.out.println("���� ä���� " + t1.channel + "�Դϴ�."); // 7
		System.out.println("���� ä���� " + t2.channel + "�Դϴ�."); // 7
		

	}
}