// ���� �ӵ��� ���� �ٸ��� ���
class Car6 {
	String model;
	int speed;

	Car6(String model) {
		this.model = model;
	}

	void setSpeed(int speed) {
		this.speed = speed;
	}

	void run() {
		for (int i = 10; i <= 50; i += 10) {
			this.setSpeed(i);
			System.out.println(this.model + "�� �޸��ϴ�.(�ü� : " + this.speed + "km/h)");
		}
	}
}
class Cara extends Car6 {
	Cara(String model) {
		super(model);
	}
	public void run() {
		for (int i = 10; i <= 110; i += 20) {
			this.setSpeed(i);
		System.out.println(this.model + "�� �޸��ϴ�.(�ü� : " + this.speed + "km/h)");
		}
	}
}
class Carb extends Car6 {
	Carb(String model) {
		super(model);
	}
	public void run() {
		for (int i = 10; i <= 50; i += 10) {
			this.setSpeed(i);
		System.out.println(this.model + "�� �޸��ϴ�.(�ü� : " + this.speed + "km/h)");	
		}
	}
}
public class CarEx03 {
	public static void main(String[] args) {
		Cara ram = new Cara("���������");
		Carb ben = new Carb("����");
		ram.run();
		ben.run();
	}
}