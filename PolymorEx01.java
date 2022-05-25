/* overriding vs overloading
   overriding - ���� �̸��� �޼ҵ带 ������(���� ��� ����)
   overloading - �̸��� ������ �ٸ� ���(���ο� �޼ҵ��� ����)
   
   when inheritance,
   @overriding, @overloading
*/
/*
�����ε�
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
----------------------------------------------
�������̵�
class Parent {
	void display() {
		System.out.println("�θ�Ŭ����");
	}
}
	class Child extends Parent {
		void display() {
			System.out.println("�ڽ�Ŭ����");
	}
// �����ε�
		void display(String str) {
			System.out.println(str);
		}
}
	*/
// �޼ҵ� �������̵� ���
class Shape {
	public void draw() {
		System.out.println("shape");
	}
}

class Line extends Shape {
	public void draw() {
		System.out.println("Line");
	}
}

class Rect extends Shape {
	public void draw() {
		System.out.println("Rectangle");
	}
}

class Tri extends Shape {
	public void draw() {
		System.out.println("Tri");
	}
}

public class PolymorEx01 {
	public static void main(String[] args) {
		Tri t = new Tri();
		t.draw();
		Rect r = new Rect();
		r.draw();
	}

}
