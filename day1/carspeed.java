/*
class Car1{
	String model;
	String color;
	int speed;
	void speedDown() {
		--speed;
	}
	void speedUp() {
		++speed;
	}
	void speedDisplay() {
		System.out.println(speed);
	}
}
public class carspeed {
	public static void main(String[] args) {
		Car1 c = new Car1();
		c.speed = 10;
		c.speedDown();
		c.speedDisplay();
	}
}
*/
class Car1{
	String model;
	String color;
	int speed;
	public Car1() {
		speed = 10;
	}
	void speedDown() {
		--speed;
	}
	void speedUp() {
		++speed;
	}
	void speedDisplay() {
		System.out.println(speed);
	}
}
	public class carspeed {
		public static void main(String[] args) {
			Car1 c = new Car1();
			c.speedDown();
			c.speedDisplay();
		}
	}
