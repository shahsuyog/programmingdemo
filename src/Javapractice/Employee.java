package Javapractice;

//public class Employee {

	//String name;
	//int id;
	//public static void main(String[] args) {
		
		//Employee e1= new Employee();
		//Employee e2= new Employee();
		//System.out.println("emp1:"+e1.name+" " +e1.id);
		//System.out.println("emp2:"+e2.name+" " +e2.id);
	//}

//}
public class Employee {

	String name;
	int id;
	Employee(String name , int id)
	{
		this.name=name;
		this.id=id;
	
	}
	public static void main(String[] args) {
		
		Employee e1= new Employee("suyog",100);
		Employee e2= new Employee("raj", 101);
		System.out.println("emp1:"+e1.name+" " +e1.id);
		System.out.println("emp2:"+e2.name+" " +e2.id);// parametric constructor 
	}

}
