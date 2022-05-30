class Parent{}
class Child extends Parent{}

public class InstanceTest {
	public static void main(String[] args) {
		Parent p = new Parent();
		Child c = new Child();
		
		System.out.println(p instanceof Parent);
		System.out.println(c instanceof Parent);
		System.out.println(p instanceof Child);
		System.out.println(c instanceof Child);
	}

}
