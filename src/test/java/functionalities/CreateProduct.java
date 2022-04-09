package functionalities;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.netty.handler.timeout.TimeoutException;
import pageObjects.ProductsObjects;

public class CreateProduct extends InventoryFunctionality {

	public WebDriver driver;

	@Test
	public void productcreate() throws IOException, InterruptedException {
		driver = productsMenu();
		ProductsObjects po = new ProductsObjects(driver);
		po.getCreateBtn().click();
		
		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(10));
		w.until(ExpectedConditions.visibilityOf((po.getProductName())));
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		
		po.getProductName().sendKeys("MCD burger");
		WebElement productTypedrp = po.getProductType();
		Select s = new Select(productTypedrp);
		s.selectByIndex(3);
		po.getUnitMeasure().click();
		driver.findElement(By.xpath("//ul[@id='ui-id-13']/li[2]")).click();
		po.getPurchasedUoM().click();
		driver.findElement(By.xpath("//ul[@id='ui-id-14']/li[2]")).click();
		po.getSalePrice().sendKeys("100");
		po.getProductCategory().click();
		driver.findElement(By.xpath("//ul[@id='ui-id-15']/li[2]")).click();
		po.getInternalReference().sendKeys("Akshay Deshmukh");
		po.getBarCode().sendKeys("785");
		po.getInternalNotes().sendKeys("This is trial product");
		po.getsaveBtn().click();
	}

	
	
}
