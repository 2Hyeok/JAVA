// 랜덤 숫자 찾기
import java.util.Random;
import java.util.Scanner;

public class RnumFind {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		Random r = new Random();
		int x = r.nextInt(100+1);
		int t, cnt = 0, s=1, e=100;
		while(true) {
			System.out.print("number(" + s + " ~ " + e + ") : ");
			t = key.nextInt();
			cnt++;
			if(t==x) {
				System.out.println("OK");
				System.out.println("Count" + cnt);
				break;
			}
			if(t>x) {
				e=t;
				System.out.println("Down");
			}else {
				s=t;
				System.out.println("Up");
			}
		}
		System.out.println("End...");
	}
}
