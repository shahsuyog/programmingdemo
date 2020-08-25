package Training;

public class ConstuctChange {

	 int a=0;
	
	public static void main(String[] args) {
		
		ConstuctChange a1=new ConstuctChange();
		
	}
	
	ConstuctChange ()
	{
		this(10);
		
		System.out.println("is default const");
		
	}

	ConstuctChange (int a)
	{
		this(1,2);
		System.out.println("is parameterised const");
		
	}

	ConstuctChange (int a,int b)
	{
		System.out.println("is parameterised const 2");
	}
	
}
