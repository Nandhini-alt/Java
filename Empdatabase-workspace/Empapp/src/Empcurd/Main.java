package Empcurd;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String name = null;
		int id;
		EmployeeDaoIntrf dao=new EmployeeDaoImpl();
		System.out.println("**Welcome to Employee management application**");
		
		Scanner sc=new Scanner(System.in);
		
		do {
			System.out.println("\n1. Add Employee\n" +
					"2. Show All Employee\n" +
					"3. Show EmployeeBasedOnId\n"+
					"4. Update the Employee\n" +
					"5. Delete the Employee\n");
			System.out.println("Enter choice: ");
			
			int ch=sc.nextInt();
			switch (ch) {
				case 1:
					Employee emp=new Employee();
					System.out.println("Enter ID:");
					id=sc.nextInt();
					System.out.println("Enter name:");
					name=sc.next();
					System.out.println("Enter designation:");
					String name1=sc.next();
					System.out.println("Enter salary:");
					double salary=sc.nextDouble();
					
					emp.setId(id);
					emp.setName(name);
					emp.setDesignation(name1);
					emp.setSalary(salary);
					
					dao.createEmployee(emp);
					break;
				
				case 2:
					dao.showAllEmployee();
					break;
					
				case 3:
					System.out.println("Enter Id to show the details:");
					int empid=sc.nextInt();
					dao.showEmployeeBasedOnId(empid);
					break;
					
				case 4:
					System.out.println("Enter id to update the details");
					int empid1=sc.nextInt();
					System.out.println("Enter the new name:");
					name=sc.next();
					
					dao.updateEmployee(empid1,name);
					break;
					
				
				case 5:
					System.out.println("Enter the id to delete:");
					id=sc.nextInt();
					dao.deleteEmployee(id);
					break;
					
				case 6:
				System.out.println("Thank you for using our application !!!");
				System.exit(0);
					default:
				System.out.println("Enter valid choice");
					break;
				
				
			}
		}while(true);
	}
}
		
		
			
			

	
