package polymorphism.chapter02;

import polymorphism.chapter03.*;

public class SamsungTV implements TV {
	private Speaker speaker; // 외장스피커에서 소리 관련 설정 수행하기 위해 멤버변수로 외장 스피커 객체 가짐.
	private int price;

	public SamsungTV() {
		System.out.println("--> 삼성 TV 객체 생성됨.");
	}

	public SamsungTV(Speaker speaker) {
		this.speaker = speaker;
		System.out.println("--> 삼성 TV + 외장스피커 객체가 생성되었습니다.");
	}

	public SamsungTV(Speaker speaker, int price) {
		this.speaker = speaker;
		this.price = price;
		System.out.println("--> 가격이 명시된 삼성 TV + 필립스 외장스피커 객체가 생성되었습니다.");
	}

	public void powerOn() {
		System.out.println("삼성 TV의 전원을 켭니다. (가격: " + price + ")");
	}

	public void powerOff() {
		System.out.println("삼성 TV의 전원을 끕니다.");
	}

	public void volumeUp() {
//		System.out.println("삼성 TV의 볼륨을 올립니다.");
//		speaker=new PhilipsSpeaker();
		speaker.volumeUp();
	}

	public void volumeDown() {
//		System.out.println("삼성 TV의 볼륨을 내립니다.");
//		speaker=new PhilipsSpeaker();
		speaker.volumeDown();
	}
	// 4-1장에서 사용자가 어떤 볼륨 조절 옵션을 먼저 명령할지 몰라서 두 메소드에 모두 스피커 객체를 지정하는 코드 넣었다는데..
	// 굳이 그럴 필요 없이 그냥 생성자 만들때 넣어도 되지 않나? 물론 스피커의 종류가 하나일때만 가능하겠지만.

//	public void initMethod() { // 객체 생성시 수행할 초기화 메소드
//		System.out.println("삼성 TV 객체의 초기설정을 수행합니다.");
//	}
//	public void destroyMethod() { // 객체 제거시 수행할 메소드
//		System.out.println("삼성 TV 객체의 제거 프로세스를 수행합니다.");
//	}
}
