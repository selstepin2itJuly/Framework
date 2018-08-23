package com.Academy;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.internal.Utils;

public class BaseClass {    

	protected static WebDriver driver;


	public static WebDriver inti() throws Exception{
		
		Properties prop=new Properties();
		FileInputStream fn=new FileInputStream("C:\\Users\\nabhd\\eclipse-workspace\\framework\\src\\main\\java\\com\\Academy\\dataProperty");
		prop.load(fn);
		
		String browsername = prop.getProperty("browser");
		 String link = prop.getProperty("Url");
		 System.out.println(link);
		System.out.println(browsername);
		
		if(browsername.equals("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\nabhd\\Downloads\\chromedriver.exe");
			
			driver = new ChromeDriver();
		}else if(browsername.equals("firefox")) 
			
			{System.setProperty("webdriver.gecko.driver", "C:\\Users\\nabhd\\Downloads\\geckodriver.exe");
			driver= new FirefoxDriver();
		}
	else {
			System.out.println("browser not defined");
		}
		if(link.equals("facebook"))
			
		{driver.get("https://www.facebook.com");
		System.out.println("link");}
		else if (link.equals("QA")) {
			driver.get("http://qaclickacademy.com");
		}
		else {
		System.out.println("link is not present");}
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return driver;
		
	}
	public void takeascreenshot(String result) {
		
		File shot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Utils.copyFile(shot, new File("C:\\Users\\nabhd\\Desktop\\screenshot\\screenshot"+result+"screenshot.png"));
	}
	
}