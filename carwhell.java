// 타이어 휠 입력시 가격 이 출력되도록 하는 함수
import java.util.Scanner;

class Car2 {
	int[] whell = { 16, 18, 20 };
	int price[] = { 10000, 200000, 300000 };

	void select() {
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();

		if (x == whell[0]) {
			System.out.println(price[0]);
		} else if (x == whell[1]) {
			System.out.println(price[1]);
		} else if (x == whell[2]){
			System.out.println(price[2]);
		}
		else {
			System.out.println("잘못된값");
		}
	}
}

public class carwhell {
	public static void main(String[] args) {
		Car2 c = new Car2();
		c.select();
	}
}
