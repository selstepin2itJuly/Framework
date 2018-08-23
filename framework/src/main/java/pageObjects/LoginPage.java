package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	WebDriver dr;
	public LoginPage(WebDriver dr){
		
		this.dr=dr;
	}
	
	
By email1=By.xpath("//*[@id='user_email']");
By pass=By.xpath("//*[@id='user_password']");
By LogInButton=By.xpath("//*[@id='new_user']/div[3]/input");
By text=By.xpath("/html/body/div/div[1]/div/div/div/div/div[1]/div/div");
By contact=By.xpath("//*[@id='navbar']/div/div/div/ul/li[6]/a");
By home=By.xpath("//*[@id='navbar']/div/div/div/ul/li[1]/a");

public WebElement email1()
{
	return dr.findElement(email1);

}
public WebElement pass()
{
	return dr.findElement(pass);

}
public WebElement LogInButton()
{
	return dr.findElement(LogInButton);

}
public WebElement home()
{
	return dr.findElement(home);

}

public WebElement getext() {
	
	
	return dr.findElement(text);
}

public WebElement contact()
{
	return dr.findElement(contact);

}
}
