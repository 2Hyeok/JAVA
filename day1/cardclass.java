class Card{
	int total;
	void use(int money) {
		total = total + money;
		System.out.println("use" + money);
	}
	void printTotal() {
		System.out.println("total:" + total);
	}
}
public class cardclass {
	public static void main(String[] args) {
		Card c = new Card();
		c.use(1000);
		c.use(2000);
		c.use(1500);
		c.printTotal();
	}
}
