// question : Box11ÀÇ ¼ýÀÚ´Â?
public class morning {
	public static void main(String[] args) {
		int[] bang = { 0, 2, 1, 1, 4, 6, 5, 2, 12, 5, 19, 1, 0 };

		bang[4] = bang[3] + bang[bang[8]]; // command1
		while (1 == 1) {
			bang[7] = bang[7] * bang[7]; // command2

			if (bang[4] == bang[9]) // command3
				break;

			bang[4] = bang[4] + bang[1]; // command4
			bang[7] = bang[7] - bang[2]; // command5
		}
		bang[10] = bang[3] + bang[9]; // command6
		bang[11] = bang[7] - bang[10]; // command7
		System.out.println(bang[11]);
	}
}
