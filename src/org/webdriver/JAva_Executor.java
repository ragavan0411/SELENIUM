package org.webdriver;

import java.awt.Window;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JAva_Executor {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\abi\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		WebElement findElement = driver.findElement(By.xpath("/html/body/app-root/app-home/div[1]/app-header/p-dialog[2]/div/div"));
		
		
		Alert a =driver.switchTo().alert();
		
		a.accept();
		
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		
//		js.executeScript("window.scroll (0,500)", "");
//		
//		Thread.sleep(5000);
//		
//		js.executeScript("window.scroll (0,0)", "");
//		
//		Thread.sleep(4000);
//		
//		js.executeScript("window.scroll(0,document.body.scrollHeight)", "");
//		
//		Thread.sleep(5000);
//		
		
		
		
		
	
	
	
	
	
	}

}
