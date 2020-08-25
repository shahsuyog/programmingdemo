package Training;




import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lockdown {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "F:\\java\\ChromeDriver.exe");
//		WebDriverManager.iedriver().setup();
//		WebDriver driver=new InternetExplorerDriver();
		//Thread.sleep(3000);
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//driver.get("http://demo.automationtesting.in/Register.html");
		driver.get("https://www.amazon.in/");
		//WebElement mobile=driver.findElement(By.xpath("//*[@id=\'nav-xshop\']/a[1]"));
		//mobile.click();
		
		//WebElement accountlist=driver.findElement(By.id("nav-link-accountList"));
		//  .........Mouse action 
		/*Actions act= new Actions(driver);
		act.moveToElement(accountlist).build().perform();
		act.moveToElement(driver.findElement(By.xpath("//*[@id=\'nav-al-your-account\']/a[1]/span"))).click().build().perform();
		driver.navigate().back();
		WebElement prime=driver.findElement(By.xpath("//*[@id=\'nav-link-prime\']"));
		act.moveToElement(prime).build().perform();
		//act.moveToElement(driver.findElement(By.xpath("//*[@id=\'multiasins-img-link\']"))).click().build().perform();
		
		
		
		
		// drop down.....*/
		/*WebElement devices= driver.findElement(By.xpath("//*[@id=\"searchDropdownBox\"]"));
		
	Select s=new Select(devices);
	Thread.sleep(3000);
	
    s.selectByIndex(2);
    Thread.sleep(3000);
    s.selectByValue("search-alias=fashion");
    s.selectByVisibleText("Baby");
    s.selectByVisibleText("Electronics");
    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobile");
    driver.findElement(By.xpath("//*[@id=\'nav-search\']/form/div[2]/div")).click();
   
    WebElement d = driver.findElement(By.xpath("//*[@id='searchDropdownBox']"));

	List<WebElement> l = d.findElements(By.tagName("option"));
	System.out.println(l.size());

	for (WebElement e : l) {
		System.out.println(e.getText()); //     print all options using for each 
	}
	
	
	
	
//   WebElement b=s.getFirstSelectedOption();
//   System.out.println(b.getText());
//   driver.close();
   
//<WebElement> a= devices.findElements(By.tagName("option"));// to get all options on drop down
//    List<WebElement> a =devices.findElements(By.tagName("option"));
// for (int i = 0; i < a.size(); i++) 
//  {
//	 System.out.println(a.size());
//	String x= a.get(i).getText();
//	System.out.println(x);
//}
//    
//    int z=a.size();
//    		System.out.println("tottal options are ="+ z);
//
// WebElement setting=driver.findElement(By.id("nav-hamburger-menu"));
//setting.click();
//Thread.sleep(3000);
//driver.findElement(By.xpath("//*[@id=\'hmenu-content\']/ul[1]/li[2]/a/div")).click();
//driver.navigate().back();

 
//		
		
		
		/*Options opt= driver.manage();
		Window w= opt.window();
		w.maximize();*/
		//driver.manage().window().maximize();
		//driver.close();
		/*System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
        WebElement register=driver.findElement(By.xpath("//*[@id=\'header\']/nav/div/div[2]/ul/li[3]/a"));
        register.click();*/
        
       // driver.navigate().back();
      //  driver.quit();
//        Thread.sleep(3000);
//        driver.navigate().forward();
		
		// click using actions class 
		
		/*WebElement menu= driver.findElement(By.id("nav-hamburger-menu"));
		menu.click();
		
		WebElement alex = driver.findElement(By.xpath("//*[@id=\'hmenu-content\']/ul[1]/li[2]/a"));
		Actions act= new Actions(driver);
		act.moveToElement(alex).click().build().perform();*/
		
		// Total links pesent on web page
		
		List<WebElement> a=driver.findElements(By.xpath("//a"));
		int b= a.size();
		System.out.println(b);      // Total=340 links
		
		// print those links 
		
		for (int i = 0; i < 10; i++) {
			String c = a.get(i).getText();
			System.out.println(c);
					
		}
	}

}
