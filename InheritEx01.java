//Ŭ������ ��� ����
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
		m.name = "ȫ�浿";
		m.job = "����";
		System.out.println(m.name + "��" + m.job + "�Դϴ�");
	}
}