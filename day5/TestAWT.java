import java.awt.Button;
import java.awt.Frame;
public class TestAWT {
	public static void main(java.lang.String[] args) {
		Frame frame = new Frame("My First Frame");
		frame.setSize(640, 480);
		frame.setVisible(true);
		frame.add(new Button("Button 1"));
	}
}