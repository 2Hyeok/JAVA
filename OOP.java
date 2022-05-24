/*
 * [객체 지향 언어의 특징]
 * 1.상속성  2. 다형성  3. 캡술화  4. 정보은닉
 * 
 * [객체지향 언어의 장점]
 * 프로그램 작성의 편리성
 * 프로그램의 안전성
 * 일상생활 속의 모델링
 * 높은 재사용률
 * 유지보수의 용이
 * 
 * 객체란 세상의 모든사물, 객체를 이루는 것은 속성과 행동
 * 
 * 이러한 객체를 만들려면 틀이 있어야 하는데 그 틀을 클래스라고한다.
 */
class Animal{
	String name, att;
	void setName(String name) {
		this.name = name; // this는 객체 자기 자신을 의미(멤버변수 명확)
	}
	void setatt(String att) {
		this.att = att;
	}
}
public class OOP {
	public static void main(String[] args) {
		Animal cat = new Animal();
		cat.setName("야옹");
		cat.setatt("공격");
		System.out.println(cat.name);
	}
}
