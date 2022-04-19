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
	public void initMethod() { // 객체 생성시 수행할 초기화 메소드
		System.out.println("삼성 TV 객체의 초기설정을 수행합니다.");
	}
	public void destroyMethod() { // 객체 제거시 수행할 메소드
		System.out.println("삼성 TV 객체의 제거 프로세스를 수행합니다.");
	}
}
