package functionalities;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import pageObjects.InventoryObjects;

public class InventoryFunctionality extends HomePageFunctionality {

	public WebDriver driver;

	@Test
	public WebDriver productsMenu() throws IOException {
		
		driver = HomePage();
		InventoryObjects io = new InventoryObjects(driver);
		WebElement productsMenu = io.getProductsMenu();
		Actions a = new Actions(driver);
		a.moveToElement(productsMenu).click().build().perform();
		io.getProductsOption().click();
		
		
	return driver;

	}

}
