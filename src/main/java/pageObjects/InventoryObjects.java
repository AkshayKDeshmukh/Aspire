package pageObjects;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InventoryObjects {

	public WebDriver driver;
	By productsMenu=By.xpath("//button[@title='Products']");
	By productsOptions=By.xpath("//a[text()='Products']");
	
	
	public InventoryObjects(WebDriver driver) {
		this.driver=driver;
	}
	public WebElement getProductsMenu()
	{
		return driver.findElement(productsMenu);
	}
	public WebElement getProductsOption()
	{
		return driver.findElement(productsOptions);
	}
	
}
