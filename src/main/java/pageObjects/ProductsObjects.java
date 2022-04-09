package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsObjects {

	// TODO Auto-generated method stub
	public WebDriver driver;
	By createbtn = By.xpath("//button[@title='Create record']");
	By productName = By.xpath("//div[@class='d-flex']/input");
	By productType = By.xpath("//select[@id='o_field_input_80']");
	By unitMeasure = By.xpath("//input[@id='o_field_input_82']");
	By purchasedUoM = By.xpath("//input[@id='o_field_input_83']");
	By salePrice = By.xpath("//input[@id='o_field_input_84']");
	By cost = By.xpath("//input[@id='o_field_input_85']");
	By productCategory = By.xpath("//input[@id='o_field_input_86']");
	By internalReference = By.xpath("//input[@id='o_field_input_87']");
	By barCode = By.xpath("//input[@id='o_field_input_88']");
	By internalNotes = By.xpath("//div[@name='description']");
	By saveBtn = By.xpath("//button[@title='Save record']");

	public ProductsObjects(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getCreateBtn() {
		return driver.findElement(createbtn);
	}

	public WebElement getProductName() {
		return driver.findElement(productName);
	}

	public WebElement getProductType() {
		return driver.findElement(productType);
	}

	public WebElement getUnitMeasure() {
		return driver.findElement(unitMeasure);
	}

	public WebElement getPurchasedUoM() {
		return driver.findElement(purchasedUoM);
	}

	public WebElement getSalePrice() {
		return driver.findElement(salePrice);
	}

	public WebElement getCost() {
		return driver.findElement(cost);
	}

	public WebElement getProductCategory() {
		return driver.findElement(productCategory);
	}

	public WebElement getInternalReference() {
		return driver.findElement(internalReference);
	}

	public WebElement getBarCode() {
		return driver.findElement(barCode);
	}

	public WebElement getInternalNotes() {
		return driver.findElement(internalNotes);
	}

	public WebElement getsaveBtn() {
		return driver.findElement(saveBtn);
	}

}
