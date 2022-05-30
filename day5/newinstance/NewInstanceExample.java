package newinstance;

// Action interface
// Send, Teceive, override
// 동적 객체 연결

public class NewInstanceExample {
	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("newinstance.SendAction");
			//Class clazz = Class.forName("sec06.exam03_newinstance.ReceiveAction");
			Action action = (Action) clazz.newInstance();
			action.execute();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}
}