package Javapractice;

public class Constuctor {

	int i;
	String s;
	Constuctor()
	{
	System.out.println("no argument const");
	//System.out.println(a);
		s=null;
		i=0;
	}
	
	Constuctor(int a,String b)
	{
	System.out.println("Parametrised");
	//System.out.println(a);
		s=b;
		i=a;
	}
	
	
	void studentdetails()
	{
		System.out.println(i);
		System.out.println(s);
	}
	public static void main(String[] args) {
		
	Constuctor t = new Constuctor ();
	t.studentdetails();
	Constuctor t1=new Constuctor(2,"abc");
	
	t1.studentdetails();
	Constuctor t2= new Constuctor(3, "sss");
			t2.studentdetails();
	//System.out.println(t.i);
	// dafault value =o intialise ( default constructor)
	//System.out.println(t.s);
	
	// dafault value =null intialise ( default constructor)

	}

}
