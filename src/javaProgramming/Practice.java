package javaProgramming;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice {

	public static void main(String[] args) throws Exception {
	//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUYOG\\Desktop\\chromedriver.exe");

		//WebDriver driver=new ChromeDriver();
		
		//driver.get("https://opensource-demo.orangehrmlive.com/");
		
	//	WebElement un = driver.findElement(By.xpath("//input[@name='txtUsername']"));
		//un.sendKeys("admin");
	//	WebElement pa = driver.findElement(By.xpath("//input[@name='txtPassword']"));
	//	pa.sendKeys("admin123");
	//	WebElement clicl= driver.findElement(By.xpath("//input[@name='Submit']"));
	//	clicl.click();
	//WebElement admin= driver.findElement(By.xpath("//a[text()='Welcome Admin']"));
	//admin.click();
	//WebElement lougout = driver.findElement(By.xpath("//a[text()='Logout']"));
  //lougout.click();
	
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\SUYOG\\Desktop\\updated chrome\\chromedriver_win32 (3)\\chromedriver.exe");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://accounts.google.com/signin/v2/sl/pwd?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=AddSession&cid=0&navigationDirection=forward");
		WebElement email= driver.findElement(By.xpath("//input[@ type='email']"));
		email.sendKeys("shahsuyog007");
		WebElement next = driver.findElement(By.xpath("//span[@ class='RveJvd snByac']"));
		next.click();
		Thread.sleep(200);
		WebElement pass = driver.findElement(By.xpath("//[@id='password']/div[1]/div/div[1]/input"));
		pass.sendKeys("loveumom");
	}

}
