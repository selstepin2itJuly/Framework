package pageObjects;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.internal.Utils;

public class HomePage {

	WebDriver driver;
	By cross=By.xpath("//*[@id='homepage']/div[5]/div[2]/div/div/div/span/div/div[7]/div/div/div[2]");
	By register=By.xpath("//*[@id='homepage']/header/div[1]/div/nav/ul/li[3]/a/span");
	
	
 By loginbutton = By.xpath("//*[@id='homepage']/header/div[1]/div/nav/ul/li[4]/a/span");

 public HomePage(WebDriver driver)
 {
	 
	this.driver=driver; 
}

 
 public WebElement logIn(){
	
	return driver.findElement(loginbutton);
	 
	 
 }
 
public WebElement cross()	{
	
	return driver.findElement(cross);
}

public WebElement register()	{
	
	return driver.findElement(register);
}



}
