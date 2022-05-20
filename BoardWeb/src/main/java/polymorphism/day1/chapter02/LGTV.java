package polymorphism.day1.chapter02;

public class LGTV implements TV{
	// public void turnOn()
	public void powerOn() {
		System.out.println("LG TV를 켭니다.");
	}
	// public void turnOff()
	public void powerOff() {
		System.out.println("LG TV를 끕니다.");
	}
	// public void soundUp()
	public void volumeUp() {
		System.out.println("LG TV의 소리를 크게합니다.");
	}
	// public void soundDown()
	public void volumeDown() {
		System.out.println("LG TV의 소리를 작게합니다.");
	}
}
