package javatest;

import java.util.Scanner;
/*
public class test
{

	public static void main(String[] args)
	{
	-------------------------------------------------------
	//������1
		
		int a, b;
		double c;
		
		a = 40;
		b = 7;
		c = a/b;
		
		System.out.println(c);
		
		
		float d = 9 - 3 / (1/3.0f) + 1;
		
		System.out.println(d);
		---------------------------------------------
		//������2
		int a, b ,c;
		
		a = 3;
		b = 5;
		c = a*a + b*b;
		
		System.out.println(c);
		
		----------------------------------------------
		//������3
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
		//��Ʈ����Ʈ������
		byte a, b; //7bits
		
		a = 0x10;
		b = (byte)(a << 1);
		
		System.out.format("%2x \n", b);
		----------------------------------------------------
		//and or
		byte a, b, c;
		String d;
		
		a = 0b1100111;
		b = 0b1011110;
		c = (byte)(a & b);
		d= Integer.toBinaryString(c);
		
		System.out.format("%8s \n", d);
		-----------------------------------------------------
		//if��
		int a;
	
		a = 10;
		
		if(a>0)
			System.out.println("greater than 0");
		------------------------------------------------------
		// if �� �Է°� scanner �̿�
		Scanner s = new Scanner(System.in);
		System.out.println("����: ");
		
		int score = s.nextInt();
		
		if(score > 60)
			System.out.println("ok");
		-------------------------------------------------------
		//�ݺ���
		String hi;
		hi = "Hi!!!!, BitCampus";
		for(int i = 0; i < 5; i++)
		{
			System.out.println(hi);
		}
		---------------------------------------------------------
		//3�� ����
		for(int i = 1; i <= 9; i++)
		{
			System.out.println("3 X " + i);
		}
		---------------------------------------------------------
		// 3�� ����
		int dan;
		dan = 3;
		
		for(int i = 0; i < 10; i++)
		{
			System.out.println(dan + "X" + i +  "=" + dan*i);
		}
		-----------------------------------------------------------
		// �� �Է� �����ܿ���
		Scanner s = new Scanner(System.in);
		System.out.println("dan: ");
		
		int a = s.nextInt();
		for(int i = 1; i <= 9; i++)
		{
			System.out.println(a*i);
		}
		-----------------------------------------------------------
		// �� �Է� �����ܿ���
		Scanner s = new Scanner(System.in);
		System.out.println("dan: ");
		
		int dan = s.nextInt();
		for(int i = 0; i < 10; i++)
		{
			System.out.println(dan + "X" + (i+1) +  "=" + dan*(i+1));
		}
		--------------------------------------------------------------
		 // ���ڿ� ������� ���
		char c;
		c = 'A';
		
		for (char a = c; a<c+26; a++)
		{
			System.out.println(a);
		}
		--------------------------------------------------------------
		// 1���� 10������ �� ����
		int sum = 0;
		for (int i = 1; i <= 10; i++)
			sum = sum + i;
		System.out.println("sum=" + sum);
		--------------------------------------------------------------
		// Ʃ��
		int[] nu = {65, 95, 34, 27, 90};
		int max = -99;
		
		for(int n=0; n < nu.length; n++)
		{
			if(max < nu[n])
				max = nu[n];
		}
		System.out.println("max = " + max);
		------------------------------------------------------------
		// Ʃ�þ��� �� ������ �̿��� ����
		int[] nu= {3,1,9,4,5,3};
		
		System.out.println(nu[nu[3]] + nu[1]);
		
		---------------------------------------------------------
		// ����for��
		for (int i = 0;i < 5; i++) {
	         for (int j = 0; j < i; j++) {
	            System.out.print(" ");
	         }
	         System.out.println("*");
		}
		------------------------------------------------------------
		// ����ó��
		int x;
		try {
			x = 1/0;
		}
		catch(ArithmeticException e) {
			System.out.println("Error divide by 0");
		}
		------------------------------------------------------------
		// ����ó��
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
	    // �޼ҵ�1
	static void test() {
		System.out.println("Hi!!!!");
	}
		public static void main(String[] args)
		{
			test();
		}
		-----------------------------------------------------------------
		// �޼ҵ�2
		static int CalsSum(int x1, int x2) {
			int h;
			h = x1 + x2;
			return(h); // void�� �߰��� print�߰�
		}
		
		public static void main(String[] args)
		{
			int hap = CalsSum(4, 9);
			System.out.println(hap);
	-----------------------------------------------------------------
	// �޼ҵ�3
	static void CalsSum(int x1, int x2) {
		int h;
		h = x1 + x2;
		System.out.println(h);
	}
	
	public static void main(String[] args)
	{
		CalsSum(4, 9);
		
	-------------------------------------------------------------------
	// �޼ҵ�4
	static void gugu(int i, int j) {
		for(i = 1; i <= 9; i++)
			for(j=1; j <=9; j++)
				System.out.println(i*j);
		}
		public static void main(String[] args) {
		gugu(1,1);
	}
	-------------------------------------------------------------------
	// �޼ҵ�5
	static void gugu(int dan) {
		for(int i = 1; i <= 9; i++)
				System.out.println(dan*i);
		}
		public static void main(String[] args) {
		gugu(3);
	--------------------------------------------------------------------
	// �޼ҵ�6
	static void guguCon(int x1) {
	 int i =x1;
	    int j= 0;
	    int  temp=0;
	       if(i>1  & i<10){
	             for(j=1;j<10;j++) {
	                temp =i*j;
	                System.out.println(x1+"*"+j+"="+temp);
	             }
	       }
	       else
	       {   
	             System.out.println("���ڰ� �ʹ� Ů�ϴ�");   
	       }   
	   }
	   public static void main(String[] args) {
	      Scanner s = new Scanner(System.in);
	      int num = s.nextInt();
	       guguCon(num);
	---------------------------------------------------------------------
	// �޼ҵ�7
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
	   // Ŭ���� ���� ��ü����
class Car {
	int speed;
	void run() {
		System.out.println("�ڵ����� �ü� " + speed + "km�� �޸���");
	}
}
public class test {
	public static void main(String[] args) {
		Car c = new Car();
		c.speed = 30;
		c.run();
		---------------------------------------------------------------------
		// Ŭ���� ���� ��ü����
class Car {
	int speed;

	void run() {
		System.out.println("�ڵ����� �ü� " + speed + "km�� �޸���");
	}

	int speedup() {
		speed += 5;
		if (speed > 60) {
			System.out.println("�ӵ��� �ʹ� �����ϴ�");
		}

		System.out.println("�ڵ����� �ü� " + speed + "km�� �޸���");
		return speed;
	}

	int speeddown() {
		speed -= 10;
		if (speed < 0) {
			speed = 0;
			System.out.println("���� �����Ǿ����ϴ�.");
		}
		System.out.println("�ڵ����� �ü� " + speed + "km�� �޸���");
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
		*/
	}
}