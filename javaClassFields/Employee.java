package javaClassFields;

public class Employee 
{
	private int employeeId;
	private String employeeName;
	private String employeeRole;
	private String employeeDepartment;
	
	public static String organizationName;
	
	//default/zero-parameterized constructor
	public Employee()
	{
		employeeId = 1111;
		employeeName = "Pradnya Varade";
		employeeRole = "Java Developer";
		employeeDepartment = "Development";
	}
	
	//parameterized constructor
	public Employee(int employeeId)
	{
		this.employeeId = employeeId;
	}
	
	
	
	public Employee(int employeeId, String employeeName) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}

	public Employee(int employeeId, String employeeName, String employeeRole) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeRole = employeeRole;
	}

	

	public Employee(int employeeId, String employeeName, String employeeRole, String employeeDepartment) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeRole = employeeRole;
		this.employeeDepartment = employeeDepartment;
	}



	//static blocks
	static
	{
		organizationName = "Fusion Software";
	}
	
	
	public void getEmployeeDetails()
	{
		System.out.println(employeeId);
		System.out.println(employeeName);
		System.out.println(employeeRole);
		System.out.println(employeeDepartment);
	}

	public static void getEmployeeOrganizationDetails()
	{
		System.out.println(organizationName);
	}
	
}

//fields

/**
 * non-static fields: the fields which are not declared with 'static' keyword, those are non-static fields
 * =================
 * 
 * Note: to access/invoke/call these fields, we need to create an object/instance.
 * 
 */

/**
 * static fields: the fields which are declared with 'static' keyword, those are static fields
 * =============
 * 
 * Note: to access/invoke/call these fields, we no need to create an object/instance.
 *       by using class name we can access static fields.
 * 
 */
//methods

	/**
	 * non-static methods: the methods which not declared with 'static' keyword, those are non-static methods
	 * =================
	 * 
	 * Note: to access/invoke/call these methods, we need to create an object/instance.
	 */

/**
 * static methods: the methods which are declared with 'static' keyword, those are static methods
 * ==============
 * 
 * Note: to access/invoke/call these methods, we no need to create an object/instance.
 * 		 by using class name we can access static methods.
 */