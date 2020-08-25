package javaProgramming;

import java.awt.List;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Driver;
import java.util.Set;
import java.util.TreeSet;
import java.util.logging.FileHandler;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Test {
	
//	private static WebElement Back;

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {

		
		
		
        System.setProperty("webdriver.chrome.driver","C:\\Users\\SUYOG\\Desktop\\updated chrome\\chromedriver_win32 (3)\\chromedriver.exe");
	
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/?gws_rd=ssl");
        Thread.sleep(3000);
        
        // screenshot
        
        TakesScreenshot ts= (TakesScreenshot)driver;
        File srcfile= ts.getScreenshotAs(OutputType.FILE);
        File destfile=new File("C:\\Users\\SUYOG\\Desktop\\screenshot\\ "+"screenshot1.jpg");
        //org.openqa.selenium.io.FileHandler.copy(srcfile, destfile);
        FileUtils.copyFile(srcfile, destfile);
        
       // Number of links
        
//        driver.get("https://www.google.com/?gws_rd=ssl");
// driver.navigate().to("https://accounts.google.com/ServiceLogin/signinchooser?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
//    java.util.List<WebElement> a = driver.findElements(By.xpath("//a"));
////     TreeSet T= new TreeSet();
//    int b= a.size();
//  System.out.println(b);
//   for (int i = 0; i <=b-1; i++) {
//	   //String c= a.get(i).getText();
//	   String d = a.get(i).getAttribute("href");
//	   System.out.println(d);
//   //System.out.println(c);  	   
//   }
        
        // number of links in assending
         
//       // driver.get("https://www.google.com/?gws_rd=ssl");
//        driver.navigate().to("https://accounts.google.com/ServiceLogin/signinchooser?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
//       java.util.List<WebElement> a = driver.findElements(By.xpath("//a"));
//       TreeSet T= new TreeSet();
//       int b= a.size();
//       System.out.println(b);
//       for (int i = 0; i <=b-1; i++) {
//    	   String c= a.get(i).getText();
//    	   T.add(c);
//		
//	}
//       
//       java.util.Iterator I= T.iterator();
//       
//       while(I.hasNext()){
//    	   System.out.println(I.next());
//       }
       
       // Auto suggession 
        
       
        
     // list box
        
//        driver.navigate().to("https://www.facebook.com/");
//        WebElement a= driver.findElement(By.xpath("//select[@id='month']"));
//        Actions b= new Actions(driver);
      //  b.moveToElement(a).perform();
       // b.click(a).perform();
     // b.sendKeys(Keys.ARROW_UP).perform();
//        b.sendKeys(Keys.ARROW_UP).perform();
//        b.sendKeys(Keys.ARROW_DOWN).perform();
//        b.sendKeys(Keys.ENTER).perform();
        //     or
        
//        a.sendKeys(Keys.ARROW_UP);
//        a.sendKeys(Keys.ARROW_UP);
//        a.sendKeys(Keys.ENTER);
        
//        for (int i = 0; i <=2; i++) {
//        	
//        	b.sendKeys(Keys.ARROW_UP).perform();
//        	Thread.sleep(2000);
//			
//		}
        
        
        
//        a.sendKeys(Keys.ARROW_UP);
//        a.sendKeys(Keys.ARROW_UP);
//        a.sendKeys(Keys.ENTER);
//        String d=a.getText();
//        System.out.println(d);        //  print all months
        
        
     // how to doubleclick on element  // instead of click().perform we use doubleClic().perform
        
        
        // right click
        
//        b.contextClick(a).perform();
//        b.sendKeys(Keys.ARROW_UP).perform();
//        Thread.sleep(2000);
//    
       
        
        
        //iframe
        
//        driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
//       
//        driver.switchTo().frame("iframeResult");
//       
//        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("suyog");
//       
//        //driver.switchTo().parentFrame();
//        driver.switchTo().defaultContent();
//        Thread.sleep(2000);
//        driver.close();
        
        
        //Pop up
        
//        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
//        driver.findElement(By.xpath("//input[@type='submit']")).click();
//        Alert alt=driver.switchTo().alert();
//       
//        String a= alt.getText();
//        System.out.println(a);
//        
//        alt.accept();
        
        
//        // child browser pop up
//        driver.get("https://www.hdfcbank.com/");
//        String id= driver.getWindowHandle();
//        System.out.println(id);
//       
//        driver.switchTo().window(id);
        
        
        //driver.findElement(By.xpath("//*[@id=\"primary-menu\"]/li[2]/ul/li[1]/a/span/span")).click();
		
		//Fetch data from excel sheet
		
//		FileInputStream f= new FileInputStream("C:\\Users\\SUYOG\\Desktop\\sss.xlsx");
//		//String a= WorkbookFactory.create(f).getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
//		//System.out.println(a);
//		double b= WorkbookFactory.create(f).getSheet("Sheet1").getRow(0).getCell(0).getNumericCellValue();
//		System.out.println(b);
		
		// fetch multiple data from excel sheet
		
//		FileInputStream f= new FileInputStream("C:\\Users\\SUYOG\\Desktop\\sss.xlsx");
//		int a= WorkbookFactory.create(f).getSheet("Sheet1").getLastRowNum();
//		//System.out.println(a);
//		
//        int b=WorkbookFactory.create(f).getSheet("Sheet1").getRow(0).getLastCellNum();
//       // System.out.println(b);
//        
//        for (int i=0;i<=a;i++)
//        {
//        	for (int j=0;j<=b;j++)
//        	{
//        		double d= WorkbookFactory.create(f).getSheet("Sheet1").getRow(i).getCell(j).getNumericCellValue();
//       		System.out.println(d);
//        	}
//        	System.out.println();
//        }
//		
		
//        driver.navigate().to("https://www.facebook.com/");
//        String text=driver.getTitle();
//        System.out.println(text);
//       
        // list box
//        WebElement day=driver.findElement(By.xpath("//select[@id='day']"));
//  Select a=new Select(day);
//  a.selectByIndex(25);
//        WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
//         Select b= new Select(month);
         // screen shot
         
//         File s=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//         
//         File d=new File ("C://Users//SUYOG//Desktop//screenshot//sss.jpg");
//         File.utils.copyFile(s,d);
         
//        b.selectByValue("3");
//        Thread.sleep(3000);
       // b.deselectByValue("3");
//        boolean s= b.isMultiple();
//        System.out.println(s);
//        WebElement c= b.getFirstSelectedOption();
//        System.out.println(c.getText());
        
//        WebElement d= a.getFirstSelectedOption();
//        System.out.println(d.getText());
//        
        
       // b.selectByVisibleText("Jan");
        //b.selectByIndex(2);
//        WebElement year= driver.findElement(By.xpath("//select[@id='year']"));
//        Select c=new Select(year);
//        c.selectByValue("1995");
        
        
        
//        WebElement fn = driver.findElement(By.xpath("// input[@name='firstname']"));
//        fn.sendKeys("SUYOG");
//        WebElement ln=driver.findElement(By.xpath("//input[@name='lastname']"));
//        ln.sendKeys("SHAH");
//        WebElement mob=driver.findElement(By.xpath("//*[@id=\"u_0_r\"]"));
//        boolean MN=mob.isEnabled();
//        System.out.println(MN);
//        boolean NEWMN=mob.isDisplayed();
//        System.out.println(NEWMN);
//        boolean sel=mob.isSelected();
//        System.out.println(sel);
        
      
//    
//		WebElement em=driver.findElement(By.xpath("//input[@type='email']"));
//     em.sendKeys("shahsuyog007@gmail.com");
//     WebElement next=driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/span/span"));
//     next.click();
//     Thread.sleep(3000);
//     WebElement  pass=driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input"));
//     pass.sendKeys("loveumom");
//     WebElement sub=driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/span/span"));
//     sub.click();
//    WebElement text=driver.findElement(By.xpath("//*[@id=\"profileIdentifier\"]"));
//    boolean a= text.isEnabled();
//    System.out.println(a);
//    // is enabled
//    boolean b= text.isSelected();
//    System.out.println(b);
//    sub.click();
//    driver.close();
    
    
//    String abs= driver.findElement(By.xpath("//id[contain(text(),'suyog')]")).getText();
//    System.out.println(abs);
     // functions of webelements
    
       
     
     
    
        // driver.navigate().to("https://www.google.com/");
        // to open the browser get or nevigate
        
        //Dimension d= new Dimension(300,400);
        //driver.manage().window().setSize(d);
        // to change the dimensions of browser
        
//        Point p = new Point(200,300);
//		driver.manage().window().setPosition(p);
		// to change the position of browser
//		String title=driver.getTitle();
//		System.out.println(title);
//		String url=driver.getCurrentUrl();
//		System.out.println(url);
		
		
		//driver.manage().window().maximize();
		// to maximize the browser
		//driver.close();
		// to close the browser current tab
		//driver.quit();
		// to close the browser all tabs
//		driver.navigate().to("https://www.google.com/");
//        driver.navigate().to("https://www.facebook.com/");
//		driver.navigate().back();
//		driver.navigate().forward();
//		String title = driver.getTitle();
//		String exp = "gmail.com";
//		if (title.equals(exp))
//		{
//			System.out.println("pass");
//		}
//		else
//		{
//			System.out.println("fail");
//		}
//		System.out.println(title);
		
		//driver.get("https://www.google.com")
//		driver.get("https://www.facebook.com/");
//		String title=driver.getTitle();
//		String url= driver.getCurrentUrl();
//		System.out.println(title);
//		System.out.println(url);
		//driver.navigate().to("https://www.facebook.com");
//		WebElement fn = driver.findElement(By.xpath("//input[@name='firstname']"));
//		fn.sendKeys("suyog");
//		WebElement ln= driver.findElement(By.xpath("//input[@name='lastname']"));
//		ln.sendKeys("shah");
//		WebElement mn= driver.findElement(By.xpath("//input[@name='reg_email__']"));
//		mn.sendKeys("8411009097");
//		
//		String title = driver.getTitle();
//		System.out.println(title);
//		String url= driver.getCurrentUrl();
//		System.out.println(url);
//		WebElement fn = driver.findElement(By.xpath("//input[@name='email']"));
//		fn.sendKeys("kamble.lahu143@gmail.com");
//		WebElement ln= driver.findElement(By.xpath("//input[@name='pass']"));
//		ln.sendKeys("lahu@123");
//		WebElement mn= driver.findElement(By.xpath("//input[@type='submit']"));
//		mn.click();
//		WebElement logout= driver.findElement(By.xpath("//div[@id='userNavigationLabel']"));
//     logout.click();
//		WebElement click= driver.findElement(By.xpath("//*[@id=\"js_4w\"]/div/div/ul/li[9]/a/span/span"));
//     click.click();
		
//	WebElement day= driver.findElement(By.xpath("//select[@id='day']"));
//
//		Select sc = new Select(day);
//	//	sc.selectByVisibleText("4");
//		sc.selectByValue("8");
	}
}


