package p1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.*;


public class TestByDepInjConsAggr {
	public static void main(String args[]){
		Resource resource=new ClassPathResource("p1/appDepByConsAggr.xml");
		BeanFactory factory=new XmlBeanFactory(resource);
		EmpAddr s=(EmpAddr)factory.getBean("e");
		s.show();
	}
	
}
