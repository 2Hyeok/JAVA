class Calculator1 {
	double aregRectangle(double width) {
		return width * width;
	}

	double aregRectangle(double width, double height) {
		return width * height;
	}
}

public class CalcuEx {
	public static void main(String[] args) {
		Calculator1 myCalc = new Calculator1();

		double result1 = myCalc.aregRectangle(10.5);

		double result2 = myCalc.aregRectangle(10, 20);

		System.out.println(result1);
		System.out.println(result2);
	}

}
