package counter;

public class Counter {
	private int no;
	
	public Counter(int no) {
		this.no = no;
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println(no + "번 객체의 finalize()가 실행됨"); // 모든 쓰레기 객체를 소멸하지 않음
		// cnt++;
	}
}
