// 별 모래시계
public class Shourglass {
	public static void main(String[] args) {
		int num = 10;

		for (int i = 0; i < num; i++) {
			for (int k = 0; k <= i; k++)
				System.out.print(" ");
			for (int m = num - i; m > 0; m--)
				System.out.print("* ");
			if (i == num - 1)
				break;
			System.out.println();
		}
		for (int i = num; i >= 0; i--) {
			for (int k = 0; k <= i; k++)
				System.out.print(" ");
			for (int m = num - i; m > 0; m--)
				System.out.print("* ");
			if (i == 0)
				break;
			System.out.println();
		}

	}
}
