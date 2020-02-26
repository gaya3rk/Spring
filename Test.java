package p1;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
	public static void main(String args[]){
		Resource resource=new ClassPathResource("p1/aplicationContext.xml");
		BeanFactory factory=new XmlBeanFactory(resource);
		Student student=(Student)factory.getBean("studentbean");
		student.setName("gayathri");
		student.displayInfo();
		Student objB=(Student)factory.getBean("studentbean");
		objB.displayInfo();
	}

}
