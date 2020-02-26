package p1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Tester {
	public static void main(String args[]){
		Resource resource=new ClassPathResource("p1/applicationcontext.xml");
		BeanFactory factory=new XmlBeanFactory(resource);
		Question q=(Question)factory.getBean("q");
		q.displayInfo();
	}

}
