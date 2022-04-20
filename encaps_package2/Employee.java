package encaps_package2;

//import java.util.Scanner;

public class Employee 
	{
		//three variables
	// variables are  made private because variables are meant to be accessed by methods only inside the class.They are meant not be accessed outside the class  
		private int id; //public int id;
		private String name;//public String name;
		private int salary;	//public int salary;
		public  static String company ="Microsoft";//common variable for all objects, so it is Static and is directly accessed using class name
		public Employee (int id, String name,int salary)	//constructor created:method name same as class name:
															//constructor has no return type not even void
															//constructor helps to initilize a variable while creating an object 
		{
			//id= eid;    //not class variable now but parameters of a constructor
			//name=ename;
			//salary= esalary;
			this.id=id; //this.x belongs to class variables
			this.name=name;
			this.salary=salary;
		}
		
		/*//two methods (methods are public)
		public void readData() // reads from user 
		{
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter id:");
			//id= //sc.nextInt()
			id=Integer.parseInt(sc.nextLine());
			System.out.println("Enter name:");
			name=sc.nextLine();
			System.out.println("Enter salary:");
			//salary= sc.nextInt();
			salary=Integer.parseInt(sc.nextLine());
			//sc.close();
		}*/
		public void printData()
		{
			System.out.println("id:"+id);
			System.out.println("name:"+name);
			System.out.println("salary:"+salary);//*
			//System.out.println("company:"+company); company variable is same for every objects,so we need to print it everytime.Go to main method * 
		}
		
	}




