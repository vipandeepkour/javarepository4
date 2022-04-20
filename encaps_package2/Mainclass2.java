package encaps_package2;
public class Mainclass2 {
public static void main(String[] args) 
{
	/*Employee emp1 = new Employee();//object employee created
	Employee emp2 = new Employee();//object employee created
	System.out.println("We all work in "  + Employee.company);//* Static variable accessed using class name
	emp1.readData();
	emp2.readData();
	emp1.printData();
	emp2.printData();*/
	
	Employee emp1 = new Employee(101,"Tam",60000); //not reading from user, instead initalized here 
	
	Employee emp2 = new Employee(102,"John",60005);
	System.out.println("Employee 1");
	emp1.printData();// since we are not asking data from user , only print data is required. this is done by using constructor
	System.out.println("Employee 2");
	emp2.printData();
}

}


