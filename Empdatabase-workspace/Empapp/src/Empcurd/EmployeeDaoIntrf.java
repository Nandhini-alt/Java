package Empcurd;

// which defines the methods to be implemented by any class that implements this interface.

public interface EmployeeDaoIntrf {
	
	//create employee
	public void createEmployee(Employee emp);
	
	//show all employee
	public void showAllEmployee();
	
	//show employee based on name
	public void showEmployeeBasedOnId(int id);
	
	//update employee
	public void updateEmployee(int empid, String name);
	
	//delete employee
	public void deleteEmployee(int empid1);

}
