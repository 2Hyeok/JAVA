/* 연습문제
 * 클래스를 사용하여 a=3 b=5 를 대입후
 *  c= a*a + b*b 를 처리했을때 c를 화면에 출력
 */
/*class num{
	int a = 3;
	int b = 5;
	int c = a*a + b*b;
	void sum() {
		System.out.println(c);
	}
}
public class classEx {
	public static void main(String[] args) {
		num c = new num();
		c.sum();
	}
}
*/
/*
class num{
	int c;
	void sum(int a, int b) {
		c = a*a + b*b;
		System.out.println(c);
	}
}
public class classEx {
	public static void main(String[] args) {
		num c = new num();
		c.sum(3, 5);
	}
}
*/
/* 클래스를 사용하여 프로그래밍
	name 이라는 변수에 이름을 대입하고 age라는 변수에 나이를 대입시킨 후 결과가 나오도록
*/
/*
class Classage{
	void print(String name, int age) {
	System.out.println(name+"의 나이는" + age + "살 입니다");
		
	}
}
public class classEx {
	public static void main(String[] args) {
		name c = new neme();
		c.print("홍길동",21);
	}
}
*/

// 클래스사용 1부터 n까지의 합 구하기
/*
class Classsum{
	int sum;
	int hap(int n) {
		sum = 0; // 초기화
		for(int i = 1; i <= n; i++) {
			sum += i;
		}
		return(sum);
	}
}
public class classEx {
	public static void main(String[] args) {
		Classsum c = new Classsum();
		int s = c.hap(100);
		System.out.println(s);
	}
}
*/
// 1또는 3이면 남자 2또는 4이면 여자 출력 그외 숫자는 오류
class num {
	void number(int a) {
		if (a == 1 || a == 3) {
			System.out.println("남자");
		} else if (a == 2 || a == 4) {
			System.out.println("여자");
		} else
			System.out.println("입력오류");
	}
}

public class classEx {
	public static void main(String[] args) {
		num c = new num();
		c.number(4);
	}
}