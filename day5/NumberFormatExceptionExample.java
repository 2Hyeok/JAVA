import java.util.Scanner;

/*
public class NumberFormatExceptionExample {
	public static void main(String[] args) {
		String data1 = "100";
		String data2 = "a100";
		
		int value1 = Integer.parseInt(data1);
		int value2 = Integer.parseInt(data2);
		
		int result = value1 + value2;
		System.out.println(data1 + "+" + data2 + "=" + result);
	}
}
*/

public class NumberFormatExceptionExample {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String data1, data2;
		
		int value1, value2;
		
		while(true) {
			System.out.print("숫자만 입력 : ");
			data1 = s.next();
			data2 = s.next();
			try {
				value1 = Integer.parseInt(data1);
				value2 = Integer.parseInt(data2);
				break;
			}catch (NumberFormatException e){
				System.out.println("숫자만 가능");
			}
		}
			int result = value1 + value2;
			System.out.println(data1 + "+" + data2 + "=" + result);
	}
}
