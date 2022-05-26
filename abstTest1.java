abstract class Calc{
	public abstract int add(int a, int b);
}
class GoodCalc extends Calc{
	@Override
	public int add(int a, int b) {
		return a+ b;
	}
}
public class abstTest1 {
	public static void main(String[] args) {
		GoodCalc c = new GoodCalc();
		System.out.println(c.add(2, 3));
	}
}
