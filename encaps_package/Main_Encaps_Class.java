package encaps_package;

public class Main_Encaps_Class //main method here
{
public static void main(String[] args) 
	{
		Employee emp1 = new Employee();//object employee created
		Employee emp2 = new Employee();//object employee created
		System.out.println("We all work in "  + Employee.company);//* Static variable accessed using class name
		emp1.readData();
		emp2.readData();
		emp1.printData();
		emp2.printData();
	}

}
