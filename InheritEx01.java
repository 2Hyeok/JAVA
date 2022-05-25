//클래스의 상속 연습
class Employee {
	String id;
	String name;
	int age;
}

class Manager extends Employee {
	String job;
}

public class InheritEx01 {
	public static void main(String[] args) {
		Manager m = new Manager();
		m.name = "홍길동";
		m.job = "팀장";
		System.out.println(m.name + "은" + m.job + "입니다");
	}
}