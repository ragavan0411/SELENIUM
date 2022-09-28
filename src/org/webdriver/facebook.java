package org.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class facebook {


		public static void main(String[] args) throws InterruptedException {
			
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\abi\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
		
		driver.manage().window().maximize();
		 Thread.sleep(3000);
		 
		WebElement findElement = driver.findElement(By.id("email"));
		findElement.sendKeys("raghavan0411@gmail.com");
		Thread.sleep(3000);
		
		WebElement findElement2 = driver.findElement(By.name("pass"));
		findElement2.sendKeys("123455");
		Thread.sleep(3000);
		
		WebElement findElement3 = driver.findElement(By.name("login"));
		findElement3.click();
		Thread.sleep(5000);
		
		 
		 
		 
		
		
	}
	}