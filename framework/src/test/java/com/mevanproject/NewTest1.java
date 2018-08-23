package com.mevanproject;

import org.testng.annotations.Test;

import com.Academy.BaseClass;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.RegisterPage;

import org.testng.annotations.BeforeTest;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class NewTest1 extends BaseClass{
	WebDriver dr;
@Test
  public void f() {
	  
	  RegisterPage Rs=new RegisterPage(dr);
	 Rs.name().sendKeys("deepika");
	  Rs.email().sendKeys("deepika.dhr@gmail.com");
	  Rs.password().sendKeys("sahej2212");
	  Rs.confirm().sendKeys("sahej2212");
	  Rs.agree().click();
	  Rs.agree().isSelected();
	Rs.signUp().click();
	String text = Rs.text().getText();
	Assert.assertEquals(text, "Email is already in use");


	  
	 
  }
@Test
public void login() throws InterruptedException {
	dr.navigate().back();
	dr.navigate().back();
	HomePage hm=new HomePage(dr);
	hm.logIn().click();
	
	LoginPage ln=new LoginPage(dr);
	
	

    ln.email1().sendKeys("deepika.dhr@gmail.com");
	ln.pass().sendKeys("sahej2212");
	Thread.sleep(3000);
	ln.LogInButton().click();
	
	
	
}
  @BeforeTest
  public void beforeTest() throws Exception {
	 dr= BaseClass.inti();
	 dr.manage().window().maximize();
	 HomePage hm=new HomePage(dr);	
	 hm.cross().click();
	 hm.register().click();
	 
	 
 }

}
