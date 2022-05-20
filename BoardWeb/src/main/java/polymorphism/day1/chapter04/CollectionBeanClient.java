package polymorphism.day1.chapter04;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import polymorphism.day1.chapter04.CollectionBean;

public class CollectionBeanClient {
	public static void main(String[] args) {
		AbstractApplicationContext factory=new GenericXmlApplicationContext("applicationContext.xml");
		
		CollectionBean bean=(CollectionBean) factory.getBean("collectionBean");
		List<String> addressList=bean.getAddressList();
		for(String address:addressList) {
			System.out.println(address.toString());
		}
		factory.close();
	}
}
