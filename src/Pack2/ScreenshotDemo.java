package Pack2;


import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshotDemo {
	public static WebDriver driver=null;
	@Test
	public void demo() throws InterruptedException, IOException {
		
		WebDriverManager.chromedriver().setup();
		 driver= new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		
		ScreenShot("lounching");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		ScreenShot("maximizing");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\'basicBootstrapForm\']/div[1]/div[1]/input")).sendKeys("suyog");
		driver.findElement(By.xpath("//*[@id=\'basicBootstrapForm\']/div[1]/div[2]/input")).sendKeys("shah");
		ScreenShot("sendkeys");
		
	}
	  // With time and date as a file name
	/*public static void ScreenShot() throws IOException
	{
		String s=new SimpleDateFormat("yyyy-dd-mm-hh-mm-ss").format(new Date());
		File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File ("C:\\Users\\SUYOG\\eclipse-workspace\\programming\\src\\Pack2\\Screenshot\\"+s+".jpg"));
		
		
		
	}*/
	
	// with specific file name
	
	public static void ScreenShot(String name) throws IOException
	{
		
		File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File ("F:\\java\\screenshot\\"+name+".jpg"));
		
		
		
	}

}
