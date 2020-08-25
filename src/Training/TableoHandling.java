package Training;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TableoHandling {

	public static WebDriver driver=null;
	public static void main(String[] args) throws InterruptedException {
		
		//System.out.println("hi");
	
		WebDriverManager.chromedriver().setup();
		//System.setProperty("Webdriver.chrome.driver","C:\\Users\\Suyog\\Downloads\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/29053/eng-vs-wi-1st-test-west-indies-tour-of-england-2020");
		WebElement players=driver.findElement(By.xpath("//*[@id='innings_1']/div[1]/div[3]/div[1]/a"));
		//System.out.println(players.getText());
		int i=3;
		int j=i;
		WebElement runs=driver.findElement(By.xpath("//*[@id=\'innings_1\']/div[1]/div[3]/div[3]"));
		//System.out.println(runs.getText());
		while (! players.getText().contains("Stokes (c)")) {
			i++;
			j=i;
			
			players=driver.findElement(By.xpath("//*[@id='innings_1']/div[1]/div["+i+"]/div[1]/a"));
			runs=driver.findElement(By.xpath("//*[@id=\'innings_1\']/div[1]/div["+j+"]/div[3]"));
			
					}
		System.out.println(players.getText());
		System.out.println(runs.getText());
		

		

	}

}
