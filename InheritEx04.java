// ��� ���迡 �ִ� Ŭ���� �� ��� ����
// ����Ȯ���̶� ���x
class Person {
	private int weight;
	int age;
	protected int height;
	public String name;

	public void setWeight(int weight) { // set �� ������
		this.weight = weight;
	}

	public int getWeight() { // get�� ������
		return weight;
	}
}

class StudentA extends Person {
	public void set() {
		age = 30;
		name = "ȫ�浿";
		height = 175;
		// weight = 99;
		setWeight(99);

		// ��¹� �߰��� ��°���
		System.out.println(name);
	}
}

public class InheritEx04 {
	public static void main(String[] args) {
		StudentA s = new StudentA();
		s.set();
	}
}