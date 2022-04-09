package functionalities;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import pageObjects.HomePageObjects;
import resources.Base;

public class HomePageFunctionality extends LoginFunctionality  {
	public WebDriver driver;
	@Test()
	public WebDriver HomePage() throws IOException
	{
		driver=login();
		HomePageObjects homePO=new HomePageObjects(driver);
		homePO.getInventory().click();
		
		return driver;

		
	}

}
