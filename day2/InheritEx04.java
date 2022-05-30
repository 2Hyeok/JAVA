// 상속 관계에 있는 클래스 간 멤버 접근
// 오류확인이라 출력x
class Person {
	private int weight;
	int age;
	protected int height;
	public String name;

	public void setWeight(int weight) { // set 은 설정자
		this.weight = weight;
	}

	public int getWeight() { // get은 접근자
		return weight;
	}
}

class StudentA extends Person {
	public void set() {
		age = 30;
		name = "홍길동";
		height = 175;
		// weight = 99;
		setWeight(99);

		// 출력문 추가시 출력가능
		System.out.println(name);
	}
}

public class InheritEx04 {
	public static void main(String[] args) {
		StudentA s = new StudentA();
		s.set();
	}
}
