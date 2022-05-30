class Outer {
	public void method(int age) {
		final int localVar = 12;
		class Inner{
			void method() {
				int result = age + localVar;
				System.out.println(result);
			}
		}
		Inner in = new Inner();
		in.method();
	}
}

public class TestOuter {
	public static void main(String[] args) {
		Outer out = new Outer();
		out.method(13);
	}
}