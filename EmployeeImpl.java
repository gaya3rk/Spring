package p1;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.sql.DataSource;

public class EmployeeImpl implements EmployeeDAO {
	private DataSource datasource;
	public void setDataSource(DataSource datasource) {
		this.datasource=datasource;
	}
	@Override
	public Employe findEmployeById(int empId) {
		Employe emp=null;
		String query="select * from employee where ename=?";
		Connection conn=null;
		PreparedStatement prepStmt=null;
		ResultSet rsltSet=null;
		try
		{
			conn=datasource.getConnection();
			prepStmt=conn.prepareStatement(query);
			prepStmt.setString(1,"arya");
			rsltSet=prepStmt.executeQuery();
			emp=new Employe();
			while(rsltSet.next())
			{
				emp.setEmpId(empId);
				emp.setName(rsltSet.getString("ename"));
				emp.setSalary(rsltSet.getFloat("esal"));
				emp.setDept(rsltSet.getInt("eage"));
			}
		}
			catch(SQLException e) 
		{
				e.printStackTrace();
		}
		finally
		{
				try
				{
					if(rsltSet!=null)rsltSet.close();
					if(prepStmt!=null)prepStmt.close();
				}
				catch(Exception ex) {}
		}
		return emp;	
	}
}
