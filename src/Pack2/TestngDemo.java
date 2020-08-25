package Pack2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestngDemo {

	public static WebDriver driver=null;
	
	@Parameters("Browser")
	@Test
	
	public void Register(String s) {
	if (s.contains("Chrome"))
	{
		WebDriverManager.chromedriver().setup();
		 driver= new ChromeDriver();
	}
	else if(s.contains("firefox"))
	{
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
	}
	
	else {
		WebDriverManager.iedriver().setup();
		driver=new InternetExplorerDriver();
	}
		driver.get("http://demo.automationtesting.in/Register.html");
		
		
	}
	
}
