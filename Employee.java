class Employee{
	int empid;
	String name;
	static String Company = "GG";
	Employee(int empid, String name){
		this.empid = empid;
		this.name = name;
	}
	void show(){
		System.out.println(name + " " + empid + " " + Company);
	}
	public static void main(String[] args){
		Employee emp1 = new Employee(104, "Gourab");
		emp1.show();
		Employee emp2 = new Employee(105, "Rakesh");
		emp2.show();
	}
}