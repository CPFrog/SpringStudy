package polymorphism.chapter02;

public class SamsungTV implements TV{
	public SamsungTV() {
		System.out.println("--> 삼성TV 객체 생성됨.");
	}
	public void powerOn() {
		System.out.println("삼성 TV의 전원을 켭니다.");
	}
	public void powerOff() {
		System.out.println("삼성 TV의 전원을 끕니다.");
	}
	public void volumeUp() {
		System.out.println("삼성 TV의 볼륨을 올립니다.");
	}
	public void volumeDown() {
		System.out.println("삼성 TV의 볼륨을 내립니다.");
	}
}
