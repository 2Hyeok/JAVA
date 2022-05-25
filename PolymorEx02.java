// 오버라이딩
class Parent {
	void display() {
		System.out.println("부모클래스 메소드");
	}
}
class Child extends Parent {
	void display() {
		System.out.println("자식클래스 메소드");
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