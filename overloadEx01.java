// 같은 이름의 메소드를 여러개 정의
// 새로운 메소드를 정의
/*
class Parent01 {
	void display() {
		System.out.println("부모클래스");
	}
}
class Child01 extends Parent01 {
	void display() {
		System.out.println("자식클래스");
}
// 오버로딩
void display(String str) {
	System.out.println(str);
	}
}
public class OverLoading01 {
	public static void main(String[] args) {
		Child01 c = new Child01();
		c.display();
		c.display("오버로딩된 메소드");
	}
}
*/

class Overloading02 {
	void method01() {
		System.out.println("기본 메소드 호출");
	}

	void method01(int x, int y) {
		System.out.println("매개변수가 있는 메소드 호출");
	}
}

public class overloadEx01 {
	public static void main(String[] args) {
		Overloading02 o = new Overloading02();
		o.method01();
		o.method01(3, 5);
	}

}