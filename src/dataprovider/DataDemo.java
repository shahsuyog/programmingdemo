package dataprovider;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import excel.ExcelRead;

public class DataDemo {
	
	public static WebDriver driver;
	

	@Test(dataProvider="data")
	public void m1(String fname, String lname,String email)throws IOException {
		
		System.out.println("hi");
		ExcelRead e= new ExcelRead();
		Object [][] obj=e.readdata();
/*		System.setProperty("webdriver.chrome.driver", "F:\\java\\PageObjectwithPageFactory-master\\src\\test\\java\\Exe_files\\chromedriver_Version83.exe");
		 driver= new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\'basicBootstrapForm\']/div[1]/div[1]/input")).sendKeys("fname");
		driver.findElement(By.xpath("//*[@id=\'basicBootstrapForm\']/div[1]/div[2]/input")).sendKeys("lname");
		driver.findElement(By.xpath("//*[@id=\"eid\"]/input")).sendKeys("email");
*/
	}
	@DataProvider 
	public Object[][] data() throws IOException {
		
		ExcelRead e= new ExcelRead();
		Object [][] obj=e.readdata();
		return obj;
		
	}
	
}
