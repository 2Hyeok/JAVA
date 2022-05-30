class CalcSum{
	int x;
	int sum(int x1, int x2) {
	x = x1 + x2;
	return(x);
	}
}
public class Met {
	public static void main(String[] args) {
		CalcSum c = new CalcSum();
		int hap = c.sum(3, 4);
		System.out.println(hap);
	}

}
