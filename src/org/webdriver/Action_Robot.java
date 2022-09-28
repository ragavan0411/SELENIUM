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

public class Action_Robot {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
	
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\abi\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver= new ChromeDriver();
	
	driver.get("https://www.google.com/");
	
	driver.manage().window().maximize();
	Thread.sleep(3000);
	 
	WebElement findElement = driver.findElement(By.xpath("//a[text()='Images']"));
	 Actions a = new Actions(driver);
	 a.contextClick(findElement).build().perform();
	 Thread.sleep(3000);
	
	 Robot r = new Robot();
	 r.keyPress(KeyEvent.VK_PAGE_DOWN);
	 r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	 
	 r.keyPress(KeyEvent.VK_ENTER);
	 r.keyPress(KeyEvent.VK_ENTER);
	 
	 String windowHandle = driver.getWindowHandle();       //id of parent tab
	 System.out.println(windowHandle);                     

	 int size = driver.getWindowHandles().size();          //total no size of tab
	 System.out.println(size);
	 
	 Thread.sleep(4000);
	 
	 Set<String> windowHandles = driver.getWindowHandles();  // id of all tab
	 for (String string : windowHandles) {
		System.out.println(string);
		 
	}
	Thread.sleep(4000);
	
	 Set<String> windowHandles2 = driver.getWindowHandles();
	 for (String allwindow : windowHandles2) {
		
		 String title = driver.switchTo().window(allwindow).getTitle();    // all window title
		 System.out.println(title);
		 
	}
	 Thread.sleep(4000);
	 driver.quit();
	 
	
	
}
}