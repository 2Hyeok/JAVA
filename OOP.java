/*
 * [��ü ���� ����� Ư¡]
 * 1.��Ӽ�  2. ������  3. ĸ��ȭ  4. ��������
 * 
 * [��ü���� ����� ����]
 * ���α׷� �ۼ��� ����
 * ���α׷��� ������
 * �ϻ��Ȱ ���� �𵨸�
 * ���� �����
 * ���������� ����
 * 
 * ��ü�� ������ ���繰, ��ü�� �̷�� ���� �Ӽ��� �ൿ
 * 
 * �̷��� ��ü�� ������� Ʋ�� �־�� �ϴµ� �� Ʋ�� Ŭ��������Ѵ�.
 */
class Animal{
	String name, att;
	void setName(String name) {
		this.name = name; // this�� ��ü �ڱ� �ڽ��� �ǹ�(������� ��Ȯ)
	}
	void setatt(String att) {
		this.att = att;
	}
}
public class OOP {
	public static void main(String[] args) {
		Animal cat = new Animal();
		cat.setName("�߿�");
		cat.setatt("����");
		System.out.println(cat.name);
	}
}
