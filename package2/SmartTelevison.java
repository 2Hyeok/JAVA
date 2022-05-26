package packagetest;

public class SmartTelevison implements RemoteControl, Searchable {
	private int volume;
	
	public void turnon() {
		System.out.println("tv¸¦ Å´");
	}
	
	public void turnoff() {
		System.out.println("tv¸¦ ²û");
	}
	
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}
		else {
			this.volume = volume;
			}
		System.out.println("ÇöÀç tv º¼·ý: " + volume);
	}
	public void search(String url) {
		System.out.println(url + "¸¦ °Ë»ö");
	}

}