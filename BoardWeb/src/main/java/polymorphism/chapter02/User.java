package polymorphism.chapter02;

import org.springframework.context.support.*;

public class User {
	public static void main(String[] args) {
//		SamsungTV tv = new SamsungTV();
//		TV tv = new SamsungTV(); // TV 인터페이스 타입의 변수로 SamsungTV 객체를 참고하고 있음.
		// 1. Spring 컨테이너 구동
		AbstractApplicationContext factory=new GenericXmlApplicationContext("applicationContext.xml");
		
		// 2. Spring 컨테이너로부터 필요한 객체 요청
		TV tv=(TV)factory.getBean("tv");
		tv.powerOn();
		tv.volumeDown();
		tv.volumeUp();
		tv.powerOff();
		
		// 3. Spring Container 종료
		factory.close();
	}
}
