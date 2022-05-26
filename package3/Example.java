package InterfaceEx;

public class Example {
	public static void main(String[] args) {
		ImplementationC inp1 = new ImplementationC();
		
		InterfaceA ia = inp1;
		ia.methodA();
		System.out.println();
		
		InterfaceB ib = inp1;
		ib.methodB();
		System.out.println();
		
		InterfaceC ic = inp1;
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}
}
