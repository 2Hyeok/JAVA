interface PhoneInterface { // �������̽� ����
	final int TIMEOUT = 10000; // ��� �ʵ� ����
	void sendCall(); // �߻� �޼ҵ�
	void receiveCall(); // �߻� �޼ҵ�
	default void printLogo() { // default �޼ҵ�
		System.out.println("** Phone **");
	}
}
class SamsungPhone implements PhoneInterface { // �������̽� ����
	@Override
	public void sendCall() {
		System.out.println("�츮������");
}
	@Override
	public void receiveCall() {
		System.out.println("��ȭ�� �Խ��ϴ�.");
}

	public void flash() { System.out.println("��ȭ�⿡ ���� �������ϴ�."); 
	}
}
public class InterfaceEx {
	public static void main(String[] args) {
		SamsungPhone phone = new SamsungPhone();
		phone.printLogo();
		phone.sendCall();
		phone.receiveCall();
		phone.flash();
	}
}


