// 인덱스 데이터 처리
import java.util.ArrayList;
import java.util.Scanner;

public class BangCRUD {
	public static void main(String[] args) {
		ArrayList<String> bang = new ArrayList<>();
		int cmd, index;
		String what, cmd1, tmp;
		while (true) {
			Scanner key = new Scanner(System.in);
			// 키보드 입력 받기전에 프롬프트 필수
			System.out.println("commend(1.Input|2.Append|3.Update|4.Delete|5.Print|9.Quit) :  ");
			cmd = key.nextInt();
			tmp = key.nextLine();
			if (cmd == 9)
				break;

			else if (cmd == 5) {
				System.out.println("Bang================");
				for (String room : bang) {
					System.out.print(room + " ");
				}
			} else if (cmd == 1) {
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
			} else if (cmd == 2) {
				System.out.print("무엇을 추가하시겠습니까? : ");
				what = key.nextLine();
				bang.add(what);
			} else if (cmd == 3) {
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
			else if (cmd == 4) {
				System.out.print("무엇을 지우시겠습니까?");
				what = key.nextLine();
				bang.remove(what);
			}
		}
		System.out.println("수고하셨습니다");
	}
}
