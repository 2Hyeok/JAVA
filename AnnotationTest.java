class Parent {
	void Mymethod() {
	}
}
class Child extends Parent {
	@Override // ���� �����޽��� ��� ������̼�
	void Mymethod() {	
		// ������
	}
}
public class AnnotationTest {
	public static void main(String[] args) {
		Parent p = new Parent();
		p.Mymethod();
	}

}
