class Emp{
	private String name;
	private int Id;
	private String Role;
	private static int totalEmployees = 0;
	
	
	Emp(String name, int Id, String Role){
		this.name = name;
		this.Id = Id;
		this.Role = Role;
	 totalEmployees++;
	}
	
	void display(){
		
		System.out.println("Employee Name: "+name);
		System.out.println("Employee Id: "+Id);
		System.out.println("Department: "+Role);
		// System.out.println()
	}
	
		static void display2(){
			System.out.println("Total no of employees: " + totalEmployees);
		}
			
	
	
	
	 public static void main(String[] args){
		
		Emp e1 = new Emp("John", 101, "Engineering");
		Emp e2 = new Emp("Jane Smith", 102, "Marketing");
		
		e1.display();
		e2.display();
		
		Emp.display2();
	}



}