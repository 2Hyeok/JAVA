
public class SystemTimeExample {
	public static void main(String[] args) {
		long time1 = System.nanoTime();
		
		long sum = 0;
		for(long i = 1; i <= 2000000000L; i++) {
			sum += i;
		}
		
		long time2 = System.nanoTime();
		
		System.out.println("1~1000000������ �� : " + sum);
		System.out.println("��꿡" + (time2 - time1) + " �����ʰ� �ҿ�Ǿ����ϴ�") ;
		// System.out.println((time2-time1)/1000000000.0+"��");
		// �ּ� ���Ž� �ϳ��� �߰�
		
	}
}
