class Car{
	@MyAnnotation
	private String myField = null;
	void run() {
		System.out.println("Running...");
	}
}
public class MyAnnotationExample {
	public static void main(String[] args) {
	Car c = new Car();
	c.run();
	}
}
