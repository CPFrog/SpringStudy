package polymorphism.chapter02;

public class User {
	public static void main(String[] args) {
//		SamsungTV tv = new SamsungTV();
//		TV tv = new SamsungTV(); // TV 인터페이스 타입의 변수로 SamsungTV 객체를 참고하고 있음.
		BeanFactory factory = new BeanFactory();
		TV tv=(TV)factory.getBean(args[0]);
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
	}

}
