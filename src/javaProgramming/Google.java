package javaProgramming;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SUYOG\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.navigate().to("https://www.facebook.com/");
		WebElement fn =driver.findElement(By.xpath("//*[@id=\"u_0_m\"]"));
		fn.sendKeys("yogesh");
		driver.navigate().back();
		driver.quit();
		
		// find webelements by using different locators
		
		WebElement user = driver.findElement(By.id("u_0_m"));
        user.sendKeys("suyoo");
        
        Thread.sleep(3000);
        
        WebElement ln = driver.findElement(By.name("lastname"));
        ln.sendKeys("shah");
        
        Thread.sleep(3000);
        
        WebElement mn= driver.findElement(By.id("u_0_r"));
        
        mn.sendKeys("1234");
        
        WebElement pass= driver.findElement(By.xpath("//input[@id='u_0_w']"));
        pass.sendKeys("abs");
        
        Thread.sleep(3000);
        
        pass.clear();
        Thread.sleep(1000);
        mn.clear();
        
        ln.clear();
        
        user.clear();
        driver.close();
        
        
        
        

	}

}
