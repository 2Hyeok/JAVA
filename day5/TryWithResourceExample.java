import java.io.FileInputStream;

public class TryWithResourceExample {
	public static void main(String[] args) {
		String path = "C:\\Users\\BIT\\Desktop\\java\\day5\\src\\";
		try (FileInputStream fis = new FileInputStream("file.txt")) {
			fis.read();
			// throw new Exception();
		} catch(Exception e) {
			System.out.println("예외 처리 코드가 실행되었습니다.");
		}
	}
}