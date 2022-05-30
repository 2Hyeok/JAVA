class Animal {} // 추상클래스
class Dog extends Animal {}
class Cat extends Animal {}

public class ClassCastExceptionExample {
	public static void main(String[] args) {
		Dog dog = new Dog();
		changeDog(dog);

		Cat cat = new Cat();
		changeDog(cat); // 주석시 오류 X
	}

	public static void changeDog(Animal animal) {
		if (animal instanceof Dog) {
			Dog dog = (Dog) animal; // ClassCastException 발생 가능
		}
	}
}