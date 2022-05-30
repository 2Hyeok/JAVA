/*
class SayHello{
	void SayHello() {
		System.out.println("Hello");
	}
}
public class clas {
	public static void main(String[] args) {
		SayHello Say = new SayHello();
		Say.SayHello();
	}

}

*/
class SayHello{
	void SayHello(String what) {
		System.out.println(what);
	}
}
public class clas {
	public static void main(String[] args) {
		SayHello Say = new SayHello();
		Say.SayHello("Hello");
		Say.SayHello("Hi");
	}

}
