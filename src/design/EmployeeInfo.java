package design;

public  class EmployeeInfo implements Employee {
	static String companyName;
	private String name;
	private int employeeId;





 /*This class can be implemented from Employee interface then add additional methods in EmployeeInfo class.
 * Also, Employee interface can be implemented into an abstract class.So create an Abstract class
 * then inherit that abstract class into EmployeeInfo class.Once you done with designing EmployeeInfo class,
 * go to CnnEmployee class to apply all the fields and attributes.
 *
 * Important: YOU MUST USE the
 * OOP(abstraction,Encapsulation, Inheritance and Polymorphism) concepts in every level possible.
 * Use all kind of keywords(super,this,static,final........)
 *
 */

	/*
	 * declare few static and final fields and some non-static fields
	 */
	//static String companyName;

	/*
	 * You must implement the logic for below 2 methods and
	 * following 2 methods are prototype as well for other methods need to be design,
	 * as you will come up with the new ideas.
	 */

	/*
	 * you must have multiple constructor.
	 * Must implement below constructor.
	 */
	public EmployeeInfo(){

	}

	public EmployeeInfo(int employeeId){
		this.employeeId=employeeId;
	}


	/**
	 * @param name
	 * @param employeeId
	 */
	public EmployeeInfo(String name, int employeeId) {
		super();
		this.name = name;
		this.employeeId = employeeId;
	}

	public static String getCompanyName() {
		return companyName;
	}

	public static void setCompanyName(String companyName) {
		EmployeeInfo.companyName = companyName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	/*
	 * This methods should calculate Employee Pension based on salary and numbers of years with the company.
	 * Then it will return the total pension. So you need to implement the logic.
	 * Hints: pension will be 5% of the salary for 1 year, 10% for 2 years with the company and so on.
	 * So you probably need to send 2 arguments.
	 * int k = (int)(value*(percentage/100.0f));
	 */
	public static float calculateEmployeePension(int salary,int numofyears){
		salary=salary*12;
		float pension1=(int) (salary*(5.0f/100f));
		float pension2=(int) (salary*(10.0f/100f));
		float total_pension=pension1+pension2;
		System.out.println(total_pension);
		return total_pension;
	}
	/*
	 * This methods should calculate Employee bonus based on salary and performance.
	 * Then it will return the total yearly bonus. So you need to implement the logic.
	 * Hints: 10% of the salary for best performance, 8% of the salary for average performance and so on.
	 * You can set arbitrary number for performance.
	 * So you probably need to send 2 arguments.
	 *
	 */
	public static int calculateEmployeeBonus(int salary,int...performance){

		int totalyearlybonus=0;
		return totalyearlybonus;
	}
	@Override
	public int employeeId() {
		int id=30;
		System.out.println("employee id is: "+id);
		return id;
	}
	@Override
	public String employeeName() {
		//String name="jony";
		System.out.println("employee name is: "+name);
		return name;
	}
	@Override
	public void assignDepartment() {
		String dept="politics";
		System.out.println(name+" will assign to "+dept);

	}


	@Override
	public void benefitLayout() {
		System.out.println("benifit for employee is madicade and christmas bonus");

	}

	@Override
	public int calculateSalary() {
		int reg=4000;
		int overtime=2000;
		int tot=reg+overtime;
		System.out.println("my total salary is: "+tot);
		return tot;
	}
	//@Override
	public void employeeof_cnn_health_dept() {
		int numofemploy=500;
		System.out.println("Health department has "+numofemploy+"employee");

	}

	public void employeeof_cnn_travel_dept(){
		int numofemploy=600;
		System.out.println("Travel department has "+numofemploy+"employee");
	}
	public void employeeof_cnn_world_dept(){
		int numofemploy=700;
		System.out.println("World department has "+numofemploy+"employee");
	}
	public void employeeof_cnn_us_dept(){
		int numofemploy=300;
		System.out.println("U.S department has "+numofemploy+"employee");
	}
	public void employeeof_cnn_money_dept(){
		int numofemploy=550;
		System.out.println("Money department has "+numofemploy+"employee");
	}
}
