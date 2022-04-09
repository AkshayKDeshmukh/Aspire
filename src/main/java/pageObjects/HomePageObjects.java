package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageObjects {

	
	public WebDriver driver;
	
	By  discuss=By.xpath("//a[@id='result_app_0']");
	By inventory=By.xpath("//a[@id='result_app_1']");
	By manufacturing=By.xpath("//a[@id='result_app_2']");
	
	public HomePageObjects(WebDriver driver)
	{
		this.driver=driver;
	}

	public WebElement getDiscuss() {
		return driver.findElement(discuss);
	}

	

	public WebElement getInventory() {
		return driver.findElement(inventory);
	}

	
	public WebElement getManufacturing() {
		return driver.findElement(manufacturing);
	}

	
}
