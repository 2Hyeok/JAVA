// 생성자 초기화
// package = folder
/*
class Calc {
	int a;
	int b;
	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	void sum() {
		System.out.println(this.a + this.b);
	}
}

public class InheritEx03 {
	public static void main(String[] args) {
		Calc c = new Calc();
		c.setValue(2, 3);
		c.sum();
	}
}
 */

class Calc {
	int a;
	int b;

	public Calc(int a, int b) {
		this.a = a;
		this.b = b;
	}

	void sum() {
		System.out.println(this.a + this.b);
	}
}

public class InheritEx03 {
	public static void main(String[] args) {
		Calc c = new Calc(2, 3); // 객체생성시 호출
		c.sum();
	}
}