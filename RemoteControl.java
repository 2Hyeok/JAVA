package packagetest;

public interface RemoteControl{
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	void turnon();
	void turnoff();
	void setVolume(int volume);
	
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("���� ó���մϴ�");
		}else {
			System.out.println("������ �����մϴ�");
		}
	}
	static void changeBattery() {
		System.out.println("������ ��ȯ�մϴ�.");
	}
}
