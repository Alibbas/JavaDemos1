public class Main {

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.lastName="BA�";
		
		Customer customer = new Customer();
		customer.email="alibas611@gmail.com";
		
		EmployeeManager employeeManager = new EmployeeManager();
		CustomerManager customerManager = new CustomerManager();
		employeeManager.List();
	}

}
