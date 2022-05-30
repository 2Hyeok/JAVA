import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamEx {
	public static void main(String[] args) throws IOException {
		String path = "C:\\Users\\BIT\\Desktop\\java\\day5\\src\\";
		FileInputStream fis;
		fis = null;
		
		try {
			File file = new File(path + "file.txt");
			fis = new FileInputStream(file);
			// throw new Exception();
		} catch(FileNotFoundException e) {
			System.out.println("예외 처리 코드가 실행되었습니다.");
		}
		finally {
			int read = 0;
			while((read=fis.read()) != -1) {
				System.out.print((char)read);
			}
			fis.close();
		}
	}
}