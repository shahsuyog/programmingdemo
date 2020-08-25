package pomdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebooklogin {

	@FindBy (xpath="//input[@name='email']") private WebElement em;
	@FindBy (name="pass")private WebElement pass ;
	@FindBy (id="u_0_b")private WebElement login ;
	
	public Facebooklogin (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void FacebookloginUsername()
	{
		em.sendKeys("sarthakshah048@gmail.com");
	}
	
	public void FacebookloginPassward()
	{
		pass.sendKeys("sarthak123");
	}
	
	public void Facebookloginbutton()
	{
			login.click();
	}
	
}
