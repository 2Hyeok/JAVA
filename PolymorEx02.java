// �������̵�
class Parent {
	void display() {
		System.out.println("�θ�Ŭ���� �޼ҵ�");
	}
}
class Child extends Parent {
	void display() {
		System.out.println("�ڽ�Ŭ���� �޼ҵ�");
	}
}

public class PolymorEx02 {
	public static void main(String[] args) {
		Parent p = new Parent();
		p.display();
		Child c = new Child();
		c.display();
		Parent p1 = new Child();
		p1.display(); 
	}
}