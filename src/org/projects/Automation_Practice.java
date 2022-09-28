package org.projects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Automation_Practice {


	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\abi\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
        WebDriver driver = new ChromeDriver();
        
        driver.get("http://automationpractice.com/index.php");
        
        driver.manage().window().maximize();
        
        Actions ac = new Actions(driver);
        
        
		WebElement elementfind = driver.findElement(By.xpath("(//a[text()='Women'])[1]"));
		ac.moveToElement(elementfind).build().perform();
		
		
		WebElement casualdress = driver.findElement(By.xpath("(//a[text()='Casual Dresses'])[1]"));
		casualdress.click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement imagefind = driver.findElement(By.xpath("(//img[contains(@class,'replace-2x')])[2]"));
		ac.moveToElement(imagefind).build().perform();
		
		WebElement addtocart = driver.findElement(By.xpath("//span[text()='Add to cart']"));
		addtocart.click();
		// 2nd page
	//	WebElement beforecheckout = driver.findElement(By.xpath("//div[@class='layer_cart_overlay']"));
	//	ac.moveToElement(beforecheckout).build().perform();
		
		WebElement proceedtocheckout = driver.findElement(By.xpath("//span[contains(text(),' checkout')]"));
		proceedtocheckout.click();
		
		// 3r page
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement addquantity = driver.findElement(By.xpath("//a[@title='Add']"));
		addquantity.click();
		
		//sign in
		
		WebElement signin = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		signin.sendKeys("raghavan0411@gmail.com");
		//summary
		WebElement createaccount = driver.findElement(By.xpath("//a[contains(@class,'button btn btn-default')]"));
		createaccount.click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement emailenter = driver.findElement(By.xpath("//input[@id='email_create']"));
		emailenter.sendKeys("rakhi435660@gmail.com");
		WebElement submitcreate = driver.findElement(By.id("SubmitCreate"));
		submitcreate.click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement Mr = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		Mr.click();
		WebElement username = driver.findElement(By.xpath("//input[@id='customer_firstname']"));
		username.sendKeys("vijay");
		WebElement lastname = driver.findElement(By.xpath("//input[@id='customer_lastname']"));
		lastname.sendKeys("ragavan");
		WebElement password = driver.findElement(By.id("passwd"));
		password.sendKeys("vijay0411");
		WebElement days = driver.findElement(By.id("days"));
		Select se = new Select(days);
		se.selectByIndex(5);
		WebElement months = driver.findElement(By.id("months"));
		Select se1 = new Select(months);
		se1.selectByIndex(6);
		WebElement years = driver.findElement(By.id("years"));
		Select se2 = new Select(years);
		se2.selectByIndex(8);
		//your address
		WebElement firstname = driver.findElement(By.id("firstname"));
		firstname.sendKeys("vijay");
		WebElement lastname1 = driver.findElement(By.id("lastname"));
		lastname1.sendKeys("raghavan");
		WebElement address = driver.findElement(By.xpath("//input[@name='address1']"));
		address.sendKeys("199,DVR mens hostel");
		WebElement city = driver.findElement(By.id("city"));
		city.sendKeys("chennai");
		WebElement state = driver.findElement(By.xpath("//select[@name='id_state']"));
		Select se3 = new Select(state);
		se3.selectByIndex(8);
		WebElement postcode = driver.findElement(By.id("postcode"));
		postcode.sendKeys("60000");
		WebElement country = driver.findElement(By.xpath("//select[@name='id_country']"));
		Select se4 = new Select(country);
		se4.selectByIndex(3);
		WebElement mobilenum = driver.findElement(By.xpath("//input[@name='phone_mobile']"));
		mobilenum.sendKeys("9876543210");
		WebElement alias = driver.findElement(By.id("alias"));
		alias.sendKeys("123,anna nagar, chennai");
		WebElement submitaccount = driver.findElement(By.id("submitAccount"));
		submitaccount.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
	//	WebElement checkout = driver.findElement(By.xpath("//a[contains(@class,'button btn btn-default')]"));
	//	checkout.click();
		
		//4th page
		
		WebElement aftrsigin = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		aftrsigin.click();
		
		
		
		
		

	
	
	
		
		
	
	}
	
}
