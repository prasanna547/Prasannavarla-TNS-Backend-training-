package mypack;

public class EmployeeMain {

	public static void main(String[] args) {
				 // Creating objects of Employee class
		        Employee Employee1 = new Employee();
		        Employee Employee2 = new Employee();
		        
		        // values for Employee1
		        Employee1.name = "gouthami";
		        Employee1.empId = 1056;
		        Employee1.salary = 20000;

		        // values for employee2
		        Employee2.name = "Harshitha";
		        Employee2.empId = 1078;
		        Employee2.salary = 102;

		        // Displaying information for both Employees
		        System.out.println("Employee1 Information:");
		        Employee1.displayInfo();
		        
		        System.out.println("\nEmployee2 Information:");
		        Employee2.displayInfo();
	}

}
