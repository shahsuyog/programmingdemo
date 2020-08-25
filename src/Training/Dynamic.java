package Training;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dynamic {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		
		/*driver.findElement(By.id("checkbox1")).click(); // static way of handling
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\'basicBootstrapForm\']/div[5]/div/label[1]/input")).click();*/
	
		// Dynamic way of handling webelements
		
		//List<WebElement> listlabel= driver.findElements(By.xpath("//*[@id=\'basicBootstrapForm\']/div[6]/div/div/label"));
	//	List<WebElement> listclick= driver.findElements(By.xpath("//*[@id=\'basicBootstrapForm\']/div[6]/div/div/input"));
	    
		
		//System.out.println(list.size());
		/*int i=0,j=0;
	    for(  WebElement l:listlabel) {
	    	//System.out.println(i.getText());
	    	if (l.getText().contains("Movies")) {
	    		listclick.get(j).click();
				
			}
	    	
	    	
	    	i++;
	    	j=i;
	    	
	    }*/
		
		
		// switch to another window 
		
		WebElement w= driver.findElement(By.xpath("//*[@id=\'header\']/nav/div/div[2]/ul/li[4]/a"));
		Actions act= new Actions(driver);
		act.moveToElement(w).build().perform();
		act.moveToElement(driver.findElement(By.xpath("//*[@id=\'header\']/nav/div/div[2]/ul/li[4]/ul/li[2]/a"))).click().build().perform();
		String parent=driver.getWindowHandle();
		System.out.println(parent);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\'Tabbed\']/a/button")).click();
		String S1= driver.getWindowHandle();
		System.out.println(S1);
		
	Set<String>all=driver.getWindowHandles();
		
		
		for ( String a:all) {
			
			if(!parent.equals(a)){
				driver.switchTo().window(a);
			driver.findElement(By.xpath("//*[@id=\'container\']/header/div/div/div[2]/ul/li[4]/a")).click();
				
				
			}
		}
		
		
		
				
	}

}
