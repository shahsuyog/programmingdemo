package Pack2;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Class1 {

	@Test
	public void m1() {
		
		System.out.println("in class 1 m1 method");
	}
	
	@Test
public void m2() {
		
	System.out.println("in class 1 m2 method");
	}
	@Test
public void m3() {
	System.out.println("in class 1 m3 method");
	}
	@Test
	public void m4() {
		System.out.println("in class2 m4 method");
	}
	@AfterClass
public void m5() {
	System.out.println("after class");
	}
	@BeforeClass
public void m6() {
	System.out.println("before class");
	
	
}
	@BeforeMethod
	public void m7() {
		System.out.println("Running below tc");
		
		
	}
}
