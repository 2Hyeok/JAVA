// 추상화
// abstract class Shape { }

/*
// 1. 추상 메소드를 포함하는 추상 클래스
abstract class Shape { // 추상 클래스 선언
	public Shape() { }
	public void paint() { draw(); }
	abstract public void draw(); // 추상 메소드
}

// 2. 추상 메소드 없는 추상 클래스
abstract class MyComponent { // 추상 클래스 선언
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

	abstract void printA(); // 하위에 구현
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

		// A a = new A(); - 추상적이기때문에 애매해서 객체 생성불가
		A a = new B();
		a.print();
		a.printA(); // 추상메소드
	}

}
