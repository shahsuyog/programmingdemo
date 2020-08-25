package javaProgramming;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MouseAction {

	public static void main(String[] args) throws Exception {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\SUYOG\\Desktop\\updated chrome\\chromedriver_win32 (3)\\chromedriver.exe");
			
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://www.google.com/?gws_rd=ssl");
//	        Thread.sleep(5000);
//	        Robot r =new Robot();
//	        //r.mouseMove(300,500); // mouse movement
////	        r.keyPress(KeyEvent.VK_ALT); // keyboard opertaions
////	        r.keyRelease(KeyEvent.VK_ALT);
////	        Thread.sleep(3000);
////	        r.keyPress(KeyEvent.VK_ALT);
////	        r.keyRelease(KeyEvent.VK_ALT);
//	        r.keyPress(KeyEvent.VK_CONTROL);
//	        r.keyPress(KeyEvent.VK_T);
//	        r.keyRelease(KeyEvent.VK_T); // new tab will open
	        
	        
	        

	}

}
