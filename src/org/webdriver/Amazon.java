package org.webdriver;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\abi\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver. get("https://www.amazon.in/");
	
	driver.manage().window().maximize();
	//1 st window
	WebElement findElement = driver.findElement(By.xpath("//a[text()='Best Sellers']"));
	
	Actions a = new Actions(driver);
	a.contextClick(findElement).build().perform();
	
	Robot r= new Robot();
	r.keyPress(KeyEvent.VK_PAGE_DOWN);
	r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
	Thread.sleep(5000);
	// 2 nd window
	WebElement findElement2 = driver.findElement(By.xpath("//a[text()='Mobiles']"));
	Actions a1 = new Actions(driver);
	a1.contextClick(findElement2).build().perform();
	Thread.sleep(5000);
	
	Robot r1= new Robot();
	r1.keyPress(KeyEvent.VK_PAGE_DOWN);
	r1.keyRelease(KeyEvent.VK_PAGE_DOWN);
	
	r1.keyPress(KeyEvent.VK_ENTER);
	r1.keyRelease(KeyEvent.VK_ENTER);
	
	Thread.sleep(5000);
	// 3 window
	WebElement findElement3 = driver.findElement(By.xpath("//a[@tabindex=\"0\"][7]"));
	Actions a2 = new Actions(driver);
	a2.contextClick(findElement3).build().perform();
	Thread.sleep(5000);
	
	Robot r2= new Robot();
	r2.keyPress(KeyEvent.VK_PAGE_DOWN);
	r2.keyRelease(KeyEvent.VK_PAGE_DOWN);
	
	r2.keyPress(KeyEvent.VK_ENTER);
	r2.keyRelease(KeyEvent.VK_ENTER);
	
	Thread.sleep(5000);
	
	Set<String> windowHandles = driver.getWindowHandles();
	for (String allwind : windowHandles) {
		
		String title = driver.switchTo().window(allwind).getTitle();
		System.out.println(title);
	 	Thread.sleep(5000);
	 	
	}
	String actival_Title ="Mobile Phones: Buy New Mobiles Online at Best Prices in India | Buy Cell Phones Online - Amazon.in";

	for (String allwind : windowHandles) {
		driver.switchTo().window(allwind).getTitle().equals(actival_Title);
		break;
	}
	
	WebElement findElement4 = driver.findElement(By.id("twotabsearchtextbox"));
	findElement4.sendKeys("iphones");
	WebElement findElement5 = driver.findElement(By.id("nav-search-submit-button"));
	findElement5.click();
	driver.quit();
	
	
	
	
	

	}
	
	

}
