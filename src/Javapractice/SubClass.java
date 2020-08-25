package Javapractice;

public class SubClass extends SuperClass  {
	
	public void test2() {
		System.out.println("hii");
		int a=10;
		System.out.println(a);
	}
	public static void main(String[] args) {
		
		SubClass t1=new SubClass();
		t1.test2();
		t1.test1();
		System.out.println('a');
		
		
	}

}
