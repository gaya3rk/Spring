package p1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test2 {
	public static void main(String args[]){
		ApplicationContext context=new ClassPathXmlApplicationContext("p1/appcontext.xml");
		A a=(A)context.getBean("a");
		a.msg();
	}

}
