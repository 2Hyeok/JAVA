class Car4 {
	int gas;

	void setGas(int gas) {
		this.gas = gas;
	}

	boolean isLeftGas() {
		if (gas == 0) {
			System.out.println("gas�� �����ϴ�");
			return false;
		}
		System.out.println("gas�� �ֽ��ϴ�");
		return true;
	}

	void run() {
		while (true) {
			if (gas > 0) {
				System.out.println("�޸��ϴ�.(gas�ܷ� : " + gas + ")");
				gas -= 1;
			} else {
				System.out.println("����ϴ�.(gas�ܷ� : " + gas + ")");
				return;
			}
		}
	}
}

public class GacEx {
	public static void main(String[] args) {
		Car4 myCar = new Car4();

		myCar.setGas(20);

		boolean gasState = myCar.isLeftGas();
		if (gasState) {
			System.out.println("����մϴ�");
			myCar.run();
		}
		if (myCar.isLeftGas()) {
			System.out.println("gas�� ������ �ʿ䰡 �����ϴ�");
		} else {
			System.out.println("gas�� �����ϼ���");
		}
	}
}