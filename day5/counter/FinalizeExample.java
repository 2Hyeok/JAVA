package counter;

public class FinalizeExample {
	public static void main(String[] args) {
		Counter counter = null;
		for(int i = 1; i <= 50; i++) {
			counter = new Counter(i);
			counter = null;
			System.out.printf("%d", i);
			System.gc();
		}
		// System.out.println("¼Ò¸êµÈ °´Ã¼ count=" + Counter.cnt);
	}
}