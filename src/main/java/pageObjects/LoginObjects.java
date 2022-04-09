package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.Base;

public class LoginObjects {

	
	public WebDriver driver;
	By email=By.xpath("//input[@id='login']");
	By password=By.xpath("//input[@id='password']");
	By loginBtn=By.xpath("//button[@type='submit']");
	public LoginObjects(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement getEmail()
	{
		return driver.findElement(email);
	}
	public WebElement getPassword()
	{
		return driver.findElement(password);
	}
	public WebElement getLoginBtn()
	{
		return driver.findElement(loginBtn);
	}
}
