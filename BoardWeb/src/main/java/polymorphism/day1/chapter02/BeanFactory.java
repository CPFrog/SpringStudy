package polymorphism.chapter02;

public class BeanFactory {
	public Object getBean(String beanName) {
		if(beanName.equalsIgnoreCase("Samsung")) { // 책에는 equals()를 썼지만 대소문자 구분 없는 응용코드를 써보고자 이런식으로 작성.
			return new SamsungTV();
		} else if(beanName.equalsIgnoreCase("LG")) {
			return new LGTV();
		}
		return null;
	}

}
