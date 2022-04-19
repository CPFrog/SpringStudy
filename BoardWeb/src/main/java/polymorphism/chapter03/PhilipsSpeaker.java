package polymorphism.chapter03;

public class PhilipsSpeaker implements Speaker {
	public PhilipsSpeaker() {
		System.out.println("PhilipsSpeaker 객체를 생성합니다.");
	}
	public void volumeUp() {
		System.out.println("PhilipsSpeaker의 볼륨을 올립니다.");
	}
	public void volumeDown() {
		System.out.println("PhilipsSpeaker의 볼륨을 내립니다.");
	}
}
