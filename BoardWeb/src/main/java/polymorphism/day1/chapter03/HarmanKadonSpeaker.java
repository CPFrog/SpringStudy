package polymorphism.day1.chapter03;

public class HarmanKadonSpeaker implements Speaker{
	public HarmanKadonSpeaker() {
		System.out.println("하만카돈 스피커 객체를 생성합니다.");
	}
	public void volumeUp() {
		System.out.println("하만카돈 스피커의 볼륨을 올립니다.");
	}
	public void volumeDown() {
		System.out.println("하만카돈 스피커의 볼륨을 낮춥니다.");
	}
}
