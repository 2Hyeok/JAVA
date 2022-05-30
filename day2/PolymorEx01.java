/* overriding vs overloading
   overriding - 같은 이름의 메소드를 재정의(기존 기능 수정)
   overloading - 이름은 같지만 다른 기능(새로운 메소드의 정의)
   
   when inheritance,
   @overriding, @overloading
*/
/*
오버로딩
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
----------------------------------------------
오버라이딩
class Parent {
	void display() {
		System.out.println("부모클래스");
	}
}
	class Child extends Parent {
		void display() {
			System.out.println("자식클래스");
	}
// 오버로딩
		void display(String str) {
			System.out.println(str);
		}
}
	*/
// 메소드 오버라이딩 사례
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
