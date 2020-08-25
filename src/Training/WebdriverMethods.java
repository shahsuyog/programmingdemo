package Training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebdriverMethods {
	

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\SUYOG\\Downloads\\chromedriver.exe");
		WebDriverManager.chromedriver().setup(); // to exicute on all versions of chrome driver
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		int links=driver.findElements(By.tagName("a")).size();
		System.out.println(links);
	
	}

}
