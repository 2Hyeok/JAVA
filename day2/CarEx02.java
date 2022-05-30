class Car2{
	String company = "Á¦³×½Ã½º";
	String model = "GV80";
	String color = "°ËÁ¤";
	int maxSpeed = 300;
	
	Car2(){
		
	}
	Car2(String model){
		this.model = model;
	}
	Car2(String model, String color){
		this.model = model;
		this.color = color;
	}
	Car2(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
public class CarEx02 {
	public static void main(String[] args) {
		Car2 c1 = new Car2();
		System.out.println(c1.company);
		
		Car2 c2 = new Car2();
		System.out.println(c2.company);
		System.out.println(c2.model);
		
		Car2 c3 = new Car2();
		System.out.println(c3.company);
		System.out.println(c3.model);
		System.out.println(c3.color);
		
		Car2 c4 = new Car2();
		System.out.println(c4.company);
		System.out.println(c4.model);
		System.out.println(c4.color);
		System.out.println(c4.maxSpeed);
	} 
}
