package script;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.Lib;
import generic.WebBase;
import pom.LoginFlipkartPage;

public class LoginFlipkart extends WebBase
{
	@Test(priority=1)
	public void login() throws InterruptedException
	{
		try
		{
			String url =Lib.getProperty(CONFIG_PATH, "Flipkarturl");
			driver.get(url);
			Thread.sleep(3000);
			LoginFlipkartPage kart = new LoginFlipkartPage(driver);
			//kart.CloseButton();
	driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("hsrilaks@palcnetworks.com");
			//kart.clickMobil();
	
				Thread.sleep(2000);
			System.out.println("logged in to flipkart application");
			
		}catch(Exception e)
			{
				Reporter.log(e.getMessage(),true);
				Assert.fail();
			}}

}
