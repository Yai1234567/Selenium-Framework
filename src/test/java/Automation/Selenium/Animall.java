package Automation.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Animall{
	
	@Test
	public void animallWebsite() {
		
		System.setProperty("webdriver.chrome.driver","/Users/yaiheikrujan/Documents/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://animall.in/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.id("googlePlay-logo")).click();
		System.out.println(driver.getCurrentUrl());
		driver.close();
	}

}
