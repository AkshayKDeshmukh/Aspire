package functionalities;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageObjects.HomePageObjects;
import pageObjects.LoginObjects;
import resources.Base;

public class LoginFunctionality extends Base{
public WebDriver driver;
	
	
	@Test()
	public WebDriver login() throws IOException
	{
		driver=intializeDriver();
		driver.get(URL);
		LoginObjects loginobject=new LoginObjects(driver);
		loginobject.getEmail().sendKeys("user@aspireapp.com");
		loginobject.getPassword().sendKeys("@sp1r3app");
		loginobject.getLoginBtn().click();
		return driver;
		
	}
	

}
