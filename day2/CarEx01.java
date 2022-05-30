class Car{
	String color;
	int cc;
	Car(String color, int cc){
		this.color = color;
		this.cc = cc;
	}
}
public class CarEx01 {
	public static void main(String[] args) {
		Car myCar = new Car("°ËÁ¤", 3000);
		System.out.println(myCar.color);
		System.out.println(myCar.cc);
	}
}
