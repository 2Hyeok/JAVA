// ���� �̸��� �޼ҵ带 ������ ����
// ���ο� �޼ҵ带 ����
/*
class Parent01 {
	void display() {
		System.out.println("�θ�Ŭ����");
	}
}
class Child01 extends Parent01 {
	void display() {
		System.out.println("�ڽ�Ŭ����");
}
// �����ε�
void display(String str) {
	System.out.println(str);
	}
}
public class OverLoading01 {
	public static void main(String[] args) {
		Child01 c = new Child01();
		c.display();
		c.display("�����ε��� �޼ҵ�");
	}
}
*/

class Overloading02 {
	void method01() {
		System.out.println("�⺻ �޼ҵ� ȣ��");
	}

	void method01(int x, int y) {
		System.out.println("�Ű������� �ִ� �޼ҵ� ȣ��");
	}
}

public class overloadEx01 {
	public static void main(String[] args) {
		Overloading02 o = new Overloading02();
		o.method01();
		o.method01(3, 5);
	}

}