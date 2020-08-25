package Pack2;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class2 {
@BeforeTest
public void s1() {
		
		System.out.println("in class 2 s1 method");
	}
@Test
public void s2() {
	
	System.out.println("in class 2 s1 method");
}

@AfterTest
public void s3() {
	
	System.out.println("after test");
}


	
}
