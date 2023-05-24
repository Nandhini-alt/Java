package Empcurd;

import java.sql.Connection;
import java.sql.PreparedStatement; // it will execute the SQL comments. 
import java.sql.ResultSet; // set of result from a database query.
import java.sql.Statement; // used to execute a static SQL statement.
 
// This is the implementation class for interface.

public class EmployeeDaoImpl implements  EmployeeDaoIntrf {
	Connection con;

// override the methods.
	@Override
	public void createEmployee(Employee emp) {
		con=DBConnection.createDBConnection();
		String query="insert into employee values(?,?,?,?)";
		try {
			PreparedStatement pstm=con.prepareStatement(query);
			pstm.setInt(1, emp.getId());
			pstm.setString(2, emp.getName());
			pstm.setString(3, emp.getDesignation());
			pstm.setDouble(4, emp.getSalary());
			int cnt=pstm.executeUpdate();
			if(cnt!=0)
				System.out.println("Employee Inserted Successfully !!!");
			
		}catch (Exception ex) {
			ex.printStackTrace();
		}
		
	}

	@Override
	public void showAllEmployee() {
		con=DBConnection.createDBConnection();
		String query="select * from employee";
		System.out.println("Employee Details :");
		System.out.println("------------------------------------------------------");
		
		System.out.format("%s\t%s\t%s\t%s\n","ID","Name","Designation","Salary");
		System.out.println("------------------------------------------------------");
		
		try {
			Statement stmt=con.createStatement();
			ResultSet result=stmt.executeQuery(query);
			while(result.next()) {
				System.out.format("%d\t%s\t%s\t%f\n",
						result.getInt(1),
						result.getString(2),
						result.getString(3),
						result.getDouble(4));
				System.out.println("------------------------------------------------------");
			}
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	
	}

	@Override
	public void showEmployeeBasedOnId(int id) {
		con=DBConnection.createDBConnection();
		String query="Select * from employee where id="+id;
		try {
			Statement stmt=con.createStatement();
			ResultSet result=stmt.executeQuery(query);
			while(result.next()) {
				System.out.format("%d\t%s\t%s\t%f\n",
						result.getInt(1),
						result.getString(2),
						result.getString(3),
						result.getDouble(4));
			}
			
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
	@Override
	public void updateEmployee(int id, String name) {
		con=DBConnection.createDBConnection();
		String query="update employee set name=? where id=?";
		try {
			PreparedStatement pstm=con.prepareStatement(query);
			pstm.setString(1, name);
			pstm.setInt(2, id);
			int cnt=pstm.executeUpdate();
			if(cnt!=0)
				System.out.println("Employee Details updated successfully !!");
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
		
	}

	@Override
	public void deleteEmployee(int id) {
		con=DBConnection.createDBConnection();
		String query="delete from employee where id=?";
		try {
			PreparedStatement pstm=con.prepareStatement(query);
			pstm.setInt(1, id);
			int cnt=pstm.executeUpdate();
			if(cnt!=0)
				System.out.println("Employee Deleted Successfully !!!"+id);
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}

		
	}
	
	

}
