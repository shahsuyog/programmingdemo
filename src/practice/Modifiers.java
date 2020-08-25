package practice;

public class Modifiers  {
	
	 int a= 10;
	 static int b = 12;
	 static void disp(){
		System.out.println("static method");
		int a=5;
		System.out.println(a);
	}
	
	void show() {
		System.out.println("instance method");
		int a=25;
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		
		Modifiers m= new Modifiers();
		disp();             
		m.show();
		System.out.println(m.a + "instance variables");   
		System.out.println(b);
		Mod1 mm= new Mod1();
		mm.m1();
		mm.m2();
		
	
	}

}
