package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginFlipkartPage
{
	@FindBy(xpath="/html/body/div[2]/div/div/button")
	WebElement clsbtn;
	
	@FindBy(xpath="//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[3]/div/div/div/a")
	WebElement lgnbtn;
	
	@FindBy(xpath="//*[@id=\"container\"]/div/div[2]/div/div/div[3]/a/div[1]/div/img")
	WebElement mobile;
	
	public LoginFlipkartPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void CloseButton() throws InterruptedException
	{
		clsbtn.click();
		Thread.sleep(2000);
	}
	
	public void LoginButton() throws InterruptedException
	{
         lgnbtn.click();
 		Thread.sleep(2000);

	}
	
	public void clickMobil() throws InterruptedException
	{
         lgnbtn.click();
 		Thread.sleep(2000);

	}
	
	

}
