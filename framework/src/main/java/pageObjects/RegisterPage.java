package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage {
	WebDriver dr;

	By name=By.xpath("//*[@id='user_name']");
	By email =By.xpath("//*[@id='user_email']");	
	By password =By.xpath("//*[@id='user_password']");
	By confirm =By.xpath("//*[@id='user_password_confirmation']");	
	By agree =By.xpath("//*[@id='user_agreed_to_terms']");
	By signUp=By.xpath("//*[@id='new_user']/center/input");	
	By text=By.xpath("//li[text()='Email is already in use']");	
	
	
	
	public RegisterPage(WebDriver dr) {
	this.dr=dr;
	}
	public WebElement name() {
		return dr.findElement(name);
		
	}
	public WebElement email() {
		return dr.findElement(email);
		
	}
	public WebElement password() {
		return dr.findElement(password);
		}
	
	public WebElement confirm() {
		return dr.findElement(confirm);
		
	}
	
	public WebElement agree() {
		return dr.findElement(agree);
		
	}
	public WebElement signUp() {
		return dr.findElement(signUp);
		
	}
	
	public WebElement text() {
		return dr.findElement(text);
		
}
}
