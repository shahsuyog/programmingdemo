package javaProgramming;

import java.awt.List;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ListBox {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SUYOG\\Desktop\\updated chrome\\chromedriver_win32 (3)\\chromedriver.exe");
		
        WebDriver driver = new ChromeDriver();
                
        driver.get("https://www.google.com/?gws_rd=ssl");
        driver.navigate().to("https://www.facebook.com/");
        
//     // list box with screenshot
//        
////        WebElement day= driver.findElement(By.xpath("//select[@id='day']"));
////        Select a= new Select(day);
////        a.selectByIndex(5);
////        TakesScreenshot ts=(TakesScreenshot)driver;
////        File srcfile=ts.getScreenshotAs(OutputType.FILE);
////        File destfile=new File("C:\\Users\\SUYOG\\Desktop\\screenshot\\"+"screen2.jpg");
////        FileUtils.copyFile(srcfile, destfile);
//
//        //  custumize list box
////        driver.navigate().to("https://www.facebook.com/");//use different list box where tag is div
////        WebElement a=driver.findElement(By.xpath("//select[@id='month']"));
////        Actions b= new Actions((WebDriver) a);
////        b.moveToElement(a).perform();
////       // b.click();
////        b.sendKeys(Keys.ARROW_UP).perform();
//        
//        
//        // print total options present in list
//        
//       WebElement month= driver.findElement(By.xpath("//select[@id='month']"));
//      Select s= new Select(month);
////        //s.selectByIndex(3);
////       java.util.List<WebElement> b=s.getOptions();
////       
////       for(int i=0;i<=b.size()-1;i++)
////       {
////    	   String str=b.get(i).getText();
////    	   System.out.println(str);
////       }
////       
////       int c=b.size();
////       System.out.println(c);
//       
//        
//        // check the given list is single selectable or multiselectable
//        
//      //boolean d= s.isMultiple();
//      //System.out.println(d);
//      
        
        
        
        
	}

}
