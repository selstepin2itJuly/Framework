/*author deepika
 * 
 */

package com.mevanproject;

import org.testng.annotations.Test;

import com.Academy.BaseClass;

import pageObjects.HomePage;
import pageObjects.LoginPage;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class NewTest extends BaseClass{
	
	

	WebDriver driver;
	
	
	
  @Test(dataProvider="getdata")
  public void f(String emaile, String pass) throws Exception {
	
	  LoginPage log=new LoginPage(driver);
	
      log.email1().sendKeys(emaile);
	log.pass().sendKeys(pass);
	Thread.sleep(3000);
	log.LogInButton().submit();
	log.email1().clear();
Thread.sleep(3000);
String text = log.getext().getText();
	Assert.assertEquals(text, "Invalid email or password.");
  }
  @BeforeTest
  public void beforeTest() throws Exception 
 {
	  
	driver=  BaseClass.inti();

	
	driver.manage().window().maximize();

	
	  HomePage ln=new HomePage(driver);
	  ln.cross().click();
	  Thread.sleep(3000);
	  ln.logIn().click();
	
	
	
  }

  @AfterTest
  public void afterTest() {
	
  }
  
  @Test
  public void nav() {
	  
	  LoginPage log=new LoginPage(driver);
	 
	  driver.navigate().back();
boolean con = log.contact().isDisplayed();
Assert.assertTrue(con);
	  
  }
  @DataProvider
  public Object[][] getdata(){
  Object[][] list=new Object[2][2];
  
  list [0][0]="dee@gmail.com";
  list[0][1]="23444";
 
  list[1][0]="sahye@hdsks.com";
  list[1][1]="364674";
  
  return list;
		  
		  
		  }
		  


}
