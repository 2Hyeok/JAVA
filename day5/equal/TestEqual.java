package equal;
import java.util.Objects;

class A {
	int a;
}

class B {
	int b;
}
public class TestEqual {
	public static void main(String[] args) {
		Integer[] arr1 = {1, 2};
		Integer[] arr2 = {1, 2};
		System.out.println(Objects.equals(arr1, arr2));
		
		A a = new A();
		A b = new A();
		System.out.println(a.equals(a));
		System.out.println(a.equals(b));
	}
}
