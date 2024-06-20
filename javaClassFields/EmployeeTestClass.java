package javaClassFields;

public class EmployeeTestClass {

	public static void main(String[] args) {
		
		
		Employee employee1 = new Employee();
		employee1.getEmployeeDetails();
		
		System.out.println("-----------------------------");
		
		Employee.getEmployeeOrganizationDetails();
		
		System.out.println("-----------------------------");
		
		Employee employee2 = new Employee(1234, "Mukund", "Software Engineer", "Developer");
		employee2.getEmployeeDetails();
		

	}

}
