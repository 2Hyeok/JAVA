package carTire;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		Car1 myCar1 = new Car1();
		
		myCar.run();
		
		myCar.frontLeftTire = new KumhoTire();
		myCar.frontRightTire = new KumhoTire();
		
		myCar.run();
		
		myCar.backLeftTire = new HankookTire();
		myCar.backRightTire = new HankookTire();
		
		
		myCar1.tires[0] = new KumhoTire();
		myCar1.tires[1] = new KumhoTire();
		
		myCar1.run();
	}
}
