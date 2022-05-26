public class Programming {
	public static void main(String[] args) {
		Programming p = new Programming();
		Java java = new Java();
		Python python = new Python();

		
		/*java.study(java);
		  python.study(python);
		*/
		p.study(java);
		p.study(python);
	}

	/*
	 * public void study(Java java) {
	 * 	System.out.println("Java is a programming language"); 
	 * } 
	 * public void study(Python python) {
	 * 	System.out.println("Python is a programming language");
	 * }
	 */
	public void study(Language lang) {
		System.out.println(lang.getName() + "is a program language.");
	}
}
