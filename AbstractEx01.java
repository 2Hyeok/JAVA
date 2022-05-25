// �߻�ȭ
// abstract class Shape { }

/*
// 1. �߻� �޼ҵ带 �����ϴ� �߻� Ŭ����
abstract class Shape { // �߻� Ŭ���� ����
	public Shape() { }
	public void paint() { draw(); }
	abstract public void draw(); // �߻� �޼ҵ�
}

// 2. �߻� �޼ҵ� ���� �߻� Ŭ����
abstract class MyComponent { // �߻� Ŭ���� ����
	String name;
	public void load(String name) {
	this.name = name;
	}
}
 */
abstract class A {
	public int a = 3;

	public void print() {
		System.out.println("Calss A");
	}

	abstract void printA(); // ������ ����
}

class B extends A {
	void printA() {
		System.out.println("Calss B");
	}
}

public class AbstractEx01 {
	public static void main(String[] args) {
		B b = new B();
		b.print();
		b.printA();

		// A a = new A(); - �߻����̱⶧���� �ָ��ؼ� ��ü �����Ұ�
		A a = new B();
		a.print();
		a.printA(); // �߻�޼ҵ�
	}

}