/* ��������
 * Ŭ������ ����Ͽ� a=3 b=5 �� ������
 *  c= a*a + b*b �� ó�������� c�� ȭ�鿡 ���
 */
/*class num{
	int a = 3;
	int b = 5;
	int c = a*a + b*b;
	void sum() {
		System.out.println(c);
	}
}
public class classEx {
	public static void main(String[] args) {
		num c = new num();
		c.sum();
	}
}
*/
/*
class num{
	int c;
	void sum(int a, int b) {
		c = a*a + b*b;
		System.out.println(c);
	}
}
public class classEx {
	public static void main(String[] args) {
		num c = new num();
		c.sum(3, 5);
	}
}
*/
/* Ŭ������ ����Ͽ� ���α׷���
	name �̶�� ������ �̸��� �����ϰ� age��� ������ ���̸� ���Խ�Ų �� ����� ��������
*/
/*
class Classage{
	void print(String name, int age) {
	System.out.println(name+"�� ���̴�" + age + "�� �Դϴ�");
		
	}
}
public class classEx {
	public static void main(String[] args) {
		name c = new neme();
		c.print("ȫ�浿",21);
	}
}
*/

// Ŭ������� 1���� n������ �� ���ϱ�
/*
class Classsum{
	int sum;
	int hap(int n) {
		sum = 0; // �ʱ�ȭ
		for(int i = 1; i <= n; i++) {
			sum += i;
		}
		return(sum);
	}
}
public class classEx {
	public static void main(String[] args) {
		Classsum c = new Classsum();
		int s = c.hap(100);
		System.out.println(s);
	}
}
*/
// 1�Ǵ� 3�̸� ���� 2�Ǵ� 4�̸� ���� ��� �׿� ���ڴ� ����
class num {
	void number(int a) {
		if (a == 1 || a == 3) {
			System.out.println("����");
		} else if (a == 2 || a == 4) {
			System.out.println("����");
		} else
			System.out.println("�Է¿���");
	}
}

public class classEx {
	public static void main(String[] args) {
		num c = new num();
		c.number(4);
	}
}