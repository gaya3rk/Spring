package p1;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class JdbcDemo {
	public static void main(String args[])
	{
		String confFile="p1/applicon.xml";
		ConfigurableApplicationContext context=new ClassPathXmlApplicationContext(confFile);
		EmployeeDAO empDao=(EmployeeDAO)context.getBean("employeeDAO");
		Employe emp=empDao.findEmployeById(1);
		System.out.println(emp.getName()+"|"+emp.getSalary()+"|"+emp.getDept());
	}

}
