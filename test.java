import java.util.Scanner;
//public class test
//{
/*
	public static void main(String[] args)
	{
		
		-----------------------------------------------
		int a, b;
		double c;
		
		a = 40;
		b = 7;
		c = a/b;
		
		System.out.println(c);
		
		
		float d = 9 - 3 / (1/3.0f) + 1;
		
		System.out.println(d);
		---------------------------------------------
		int a, b ,c;
		
		a = 3;
		b = 5;
		c = a*a + b*b;
		
		System.out.println(c);
		
		----------------------------------------------
		char c;
		String name;
		
		c = '#';
		name = "Osan Univ";
		System.out.println(c + name);
		Scanner s = new Scanner(System.in);
		System.out.println("x=");
		
		int x = s.nextInt();
		System.out.println("Input value is" + x);
		
		-------------------------------------------------
		
		byte a, b; //7bits
		
		a = 0x10;
		b = (byte)(a << 1);
		
		System.out.format("%2x \n", b);
		----------------------------------------------------
		
		byte a, b, c;
		String d;
		
		a = 0b1100111;
		b = 0b1011110;
		c = (byte)(a & b);
		d= Integer.toBinaryString(c);
		
		System.out.format("%8s \n", d);
		-----------------------------------------------------
		int a;
	
		a = 10;
		
		if(a>0)
			System.out.println("greater than 0");
		------------------------------------------------------
		Scanner s = new Scanner(System.in);
		System.out.println("점수: ");
		
		int score = s.nextInt();
		
		if(score > 60)
			System.out.println("ok");
		-------------------------------------------------------
		
		String hi;
		hi = "Hi!!!!, BitCampus";
		for(int i = 0; i < 5; i++)
		{
			System.out.println(hi);
		}
		---------------------------------------------------------

		
		for(int i = 1; i <= 9; i++)
		{
			System.out.println("3 X " + i);
		}
		---------------------------------------------------------

		int dan;
		dan = 3;
		
		for(int i = 0; i < 10; i++)
		{
			System.out.println(dan + "X" + i +  "=" + dan*i);
		}
		-----------------------------------------------------------
		Scanner s = new Scanner(System.in);
		System.out.println("dan: ");
		
		int a = s.nextInt();
		for(int i = 1; i <= 9; i++)
		{
			System.out.println(a*i);
		}
		-----------------------------------------------------------
		Scanner s = new Scanner(System.in);
		System.out.println("dan: ");
		
		int dan = s.nextInt();
		for(int i = 0; i < 10; i++)
		{
			System.out.println(dan + "X" + (i+1) +  "=" + dan*(i+1));
		}
		--------------------------------------------------------------
		 
		char c;
		c = 'A';
		
		for (char a = c; a<c+26; a++)
		{
			System.out.println(a);
		}
		--------------------------------------------------------------
		
		int sum = 0;
		for (int i = 1; i <= 10; i++)
			sum = sum + i;
		System.out.println("sum=" + sum);
		--------------------------------------------------------------
		
		int[] nu = {65, 95, 34, 27, 90};
		int max = -99;
		
		for(int n=0; n < nu.length; n++)
		{
			if(max < nu[n])
				max = nu[n];
		}
		System.out.println("max = " + max);
		------------------------------------------------------------
		
		int[] nu= {3,1,9,4,5,3};
		
		System.out.println(nu[nu[3]] + nu[1]);
		
		---------------------------------------------------------
		
		for (int i = 0;i < 5; i++) {
	         for (int j = 0; j < i; j++) {
	            System.out.print(" ");
	         }
	         System.out.println("*");
		}
		------------------------------------------------------------
		
		int x;
		try {
			x = 1/0;
		}
		catch(ArithmeticException e) {
			System.out.println("Error divide by 0");
		}
		------------------------------------------------------------
		int x[] = new int[5];
		x[3] = 3;
		System.out.println(x[3]);
		
		try {
			x[5] = 2;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("error");
		}
	    -------------------------------------------------------------------
	    
	static void test() {
		System.out.println("Hi!!!!");
	}
		public static void main(String[] args)
		{
			test();
		}
		-----------------------------------------------------------------

		static int CalsSum(int x1, int x2) {
			int h;
			h = x1 + x2;
			return(h); // void값 추가시 print추가
		}
		
		public static void main(String[] args)
		{
			int hap = CalsSum(4, 9);
			System.out.println(hap);
	-----------------------------------------------------------------
	
	static void CalsSum(int x1, int x2) {
		int h;
		h = x1 + x2;
		System.out.println(h);
	}
	
	public static void main(String[] args)
	{
		CalsSum(4, 9);
		
	-------------------------------------------------------------------
	
	static void gugu(int i, int j) {
		for(i = 1; i <= 9; i++)
			for(j=1; j <=9; j++)
				System.out.println(i*j);
		}
		public static void main(String[] args) {
		gugu(1,1);
	}
	-------------------------------------------------------------------
	
	static void gugu(int dan) {
		for(int i = 1; i <= 9; i++)
				System.out.println(dan*i);
		}
		public static void main(String[] args) {
		gugu(3);
	--------------------------------------------------------------------
	
	static void guguCon(int x1) {

	 int i =x1;
	    int j= 0;
	    int  temp=0;
	       if(i>1  & i<10){
	             for(j=1;j<10;j++) {
	                temp =i*j;
	                System.out.println(x1+"*"+j+"="+temp);
	             }
	       }else{   
	             System.out.println("숫자가 너무 큽니다");   
	       }   
	   }
	   public static void main(String[]args  ) {
	      Scanner s = new Scanner(System.in);
	      int num = s.nextInt();
	       guguCon(num);
	---------------------------------------------------------------------
	static void gugu(int dan) {
		if(dan > 1 & dan < 10) {
			for(int i = 1; i <= 9; i++) {
				System.out.println(dan + "X" + i + "=" + dan*i);
			}
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	    int dan = s.nextInt();
	    gugu(dan);
	   ---------------------------------------------------------------------
class Car {
	int speed;

	void run() {
		System.out.println("자동차가 시속 " + speed + "km로 달린다");
	}
}

public class test {
	public static void main(String[] args) {
		Car c = new Car();

		c.speed = 30;
		c.run();
		---------------------------------------------------------------------
		*/
class Car {
	int speed;

	void run() {
		System.out.println("자동차가 시속 " + speed + "km로 달린다");
	}

	int speedup() {
		speed += 5;
		if (speed > 60) {
			System.out.println("속도가 너무 높습니다");
		}

		System.out.println("자동차가 시속 " + speed + "km로 달린다");
		return speed;
	}

	int speeddown() {
		speed -= 10;
		if (speed < 0) {
			speed = 0;
			System.out.println("차가 정지되었습니다.");
		}
		System.out.println("자동차가 시속 " + speed + "km로 달린다");
		return speed;
	}

}

public class test {
	public static void main(String[] args) {
		Car c = new Car();
		c.speed = 30;
		c.run();
		c.speedup();
		c.speeddown();
	}
}