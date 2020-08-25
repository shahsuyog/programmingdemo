package Javapractice;

public class Overloading2 extends Overloading1 {
	void add()
	{
		System.out.println("yes");
	}
	
	void add(int a)
	{
		System.out.println("yes without");
	}

	public static void main(String[] args) {
		Overloading2 obj=new Overloading2();
		obj.add();
		//obj.add();
		//Overloading1 t=new Overloading1();
		//t.add();
		obj.add(2);
		
	}

}
