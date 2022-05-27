import java.util.ArrayList;
import java.util.Scanner;

public class CRUD {
	public static void main(String[] args) {
		ArrayList<String> bang = new ArrayList<>();
		int index;
		String what,cmd, tmp;
		while (true) {
			Scanner key = new Scanner(System.in);
			// 키보드 입력 받기전에 프롬프트 필수
			System.out.println("commend(1.Input|2.Append|3.Update|4.Delete|5.Print|9.Quit) :  ");
			cmd = key.nextLine();
			if (cmd.equals("Q") || cmd.equals("q") || cmd.equals("9"))
				break;
			else if (cmd.equals("P") || cmd.equals("p") || cmd.equals("5")) {
				System.out.println("Bang================");
				for (String room : bang) {
					System.out.print(room + " ");
				}
			} else if (cmd.equals("I") || cmd.equals("i") || cmd.equals("1")) {
				System.out.print("무엇을 추가하시겠습니까? : ");
				what = key.nextLine();
				while (true) {
					System.out.print("어디에 insert? : ");
					index = key.nextInt();
					tmp = key.nextLine();
					if (index <= bang.size())
						break;
					else
						System.out.print("범위를 벗어났습니다.");
				}
				bang.add(index, what);
			} else if (cmd.equals("A") || cmd.equals("a") || cmd.equals("2")) {
				System.out.print("무엇을 추가하시겠습니까? : ");
				what = key.nextLine();
				bang.add(what);
			} else if (cmd.equals("U") || cmd.equals("U") || cmd.equals("3")) {
				System.out.print("무엇으로 업데이트 하시겠습니까? : ");
				what = key.nextLine();
				while (true) {
					System.out.print("몇번째를 업데이트 하시겠습니까? : ");
					index = key.nextInt();
					tmp = key.nextLine();
					if (index <= bang.size())
						break;
					else
						System.out.print("범위를 벗어났습니다.");
				}
				bang.set(index, what);
			}
			else if (cmd.equals("D") || cmd.equals("d") || cmd.equals("4")) {
				System.out.print("무엇을 지우시겠습니까?");
				what = key.nextLine();
				bang.remove(what);
			}
		}
		System.out.println("수고하셨습니다");
	}
}