import java.util.ArrayList;
import java.util.Scanner;

public class CRUD {
	public static void main(String[] args) {
		ArrayList<String> bang = new ArrayList<>();
		int index;
		String what,cmd, tmp;
		while (true) {
			Scanner key = new Scanner(System.in);
			// Ű���� �Է� �ޱ����� ������Ʈ �ʼ�
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
				System.out.print("������ �߰��Ͻðڽ��ϱ�? : ");
				what = key.nextLine();
				while (true) {
					System.out.print("��� insert? : ");
					index = key.nextInt();
					tmp = key.nextLine();
					if (index <= bang.size())
						break;
					else
						System.out.print("������ ������ϴ�.");
				}
				bang.add(index, what);
			} else if (cmd.equals("A") || cmd.equals("a") || cmd.equals("2")) {
				System.out.print("������ �߰��Ͻðڽ��ϱ�? : ");
				what = key.nextLine();
				bang.add(what);
			} else if (cmd.equals("U") || cmd.equals("U") || cmd.equals("3")) {
				System.out.print("�������� ������Ʈ �Ͻðڽ��ϱ�? : ");
				what = key.nextLine();
				while (true) {
					System.out.print("���°�� ������Ʈ �Ͻðڽ��ϱ�? : ");
					index = key.nextInt();
					tmp = key.nextLine();
					if (index <= bang.size())
						break;
					else
						System.out.print("������ ������ϴ�.");
				}
				bang.set(index, what);
			}
			else if (cmd.equals("D") || cmd.equals("d") || cmd.equals("4")) {
				System.out.print("������ ����ðڽ��ϱ�?");
				what = key.nextLine();
				bang.remove(what);
			}
		}
		System.out.println("�����ϼ̽��ϴ�");
	}
}