package polymorphism.day1.chapter02;

import org.springframework.context.support.*;

public class User {
	public static void main(String[] args) {
//		SamsungTV tv = new SamsungTV();
//		TV tv = new SamsungTV(); // TV 인터페이스 타입의 변수로 SamsungTV 객체를 참고하고 있음.
		// 1. Spring 컨테이너 구동
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml"); // ApplicationContext를 이용해 컨테이너 구동. (즉시로딩방식)

		// 2. Spring 컨테이너로부터 필요한 객체 요청
		TV tv1=(TV)factory.getBean("tv");
		TV tv2=(TV)factory.getBean("tv");
		TV tv3=(TV)factory.getBean("tv");
		tv1.powerOn();
		tv2.volumeDown();
		tv3.volumeUp();
		tv3.powerOff();
		
		// 3. Spring Container 종료
		factory.close();
	}
}
