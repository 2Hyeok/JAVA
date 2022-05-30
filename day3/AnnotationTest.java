class Parent {
	void Mymethod() {
	}
}
class Child extends Parent {
	@Override // 사용시 에러메시지 출력 어논테이션
	void Mymethod() {	
		// 재정의
	}
}
public class AnnotationTest {
	public static void main(String[] args) {
		Parent p = new Parent();
		p.Mymethod();
	}

}
