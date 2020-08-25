package Pomdemo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomdemo.Facebooklogin;

public class TestClass {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\SUYOG\\Desktop\\updated chrome\\chromedriver_win32 (3)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Facebooklogin login=new Facebooklogin(driver);
		login.FacebookloginUsername();
		login.FacebookloginPassward();
		Thread.sleep(300);
		login.Facebookloginbutton();

	}

}
