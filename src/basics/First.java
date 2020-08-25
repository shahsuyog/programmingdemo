package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SUYOG\\Desktop\\updated chrome\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		String a= driver.getCurrentUrl();
		System.out.println(a);
		String b= driver.getTitle();
		System.out.println(b);

	}

}
