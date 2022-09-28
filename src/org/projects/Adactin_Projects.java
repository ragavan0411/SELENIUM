package org.projects;



import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactin_Projects {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\abi\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		//login page
		
		
		driver.get("https://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("vijay0411");
		
		WebElement PASSWORD = driver.findElement(By.id("password"));
		PASSWORD.sendKeys("vijayBME178");
		
		WebElement LOGIN = driver.findElement(By.id("login"));
        LOGIN.click();
        
       //booking page 
        
        WebElement dropdown = driver.findElement(By.id("location"));
        Select se = new Select(dropdown);
        se.selectByValue("Sydney");
        WebElement hotel = driver.findElement(By.id("hotels"));
		Select se1 = new Select(hotel);
		se1.selectByIndex(1);
		
		WebElement roomtype = driver.findElement(By.id("room_type"));
		Select se2 = new Select(roomtype);
		se2.selectByIndex(1);
		WebElement roomno = driver.findElement(By.id("room_nos"));
		Select se3 = new Select(roomno);
		se3.selectByIndex(1);
		
		WebElement datepick = driver.findElement(By.xpath("//input[@name='datepick_in']"));
		datepick.sendKeys("28/09/2022");
		
		WebElement checkout = driver.findElement(By.xpath("//input[@name='datepick_out']"));
		checkout.sendKeys("30/09/2022");
		
		WebElement noofpeople = driver.findElement(By.xpath("//select[@name='adult_room']"));
		Select se4 = new Select(noofpeople);
		se4.selectByIndex(1);
		
		WebElement search = driver.findElement(By.id("Submit"));
		
		search.click();
		
		WebElement confirm = driver.findElement(By.xpath("//input[@name='radiobutton_0']"));
		confirm.click();
		
		WebElement continueto = driver.findElement(By.id("continue"));
		continueto.click();
		
		
		WebElement firstname = driver.findElement(By.xpath("//input[@name='first_name']"));
		firstname.sendKeys("vijay");
		
		WebElement lastname = driver.findElement(By.xpath("//input[@id='last_name']"));
		lastname.sendKeys("ragavan");
		
		WebElement address = driver.findElement(By.id("address"));
		address.sendKeys("199/299,chennai,644400");
		
		WebElement cardno = driver.findElement(By.xpath("//input[@name='cc_num']"));
		cardno.sendKeys("1234567899876543");
		
		WebElement cardtype = driver.findElement(By.xpath("//select[@name='cc_type']"));
		Select se6 = new Select(cardtype);
		se6.selectByIndex(2);
		
		WebElement month = driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
		Select se7 = new Select(month);
		se7.selectByIndex(3);
		
		WebElement expiryyear = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
		Select se8 = new Select(expiryyear);
		se8.selectByIndex(4);
		
		WebElement findcvv = driver.findElement(By.xpath("//input[@id='cc_cvv']"));
		findcvv.sendKeys("089");
		
		WebElement booknow = driver.findElement(By.xpath("//input[@id='book_now']"));
		booknow.click();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement confirming = driver.findElement(By.xpath("//input[@name='my_itinerary']"));
		confirming.click();
		
		WebElement booking = driver.findElement(By.xpath("(//input[@name='ids[]'])[2]"));
		booking.click();
		
		TakesScreenshot tS = (TakesScreenshot) driver ;
		File s = tS.getScreenshotAs(OutputType. FILE);
		File des = new File("C:\\Users\\abi\\eclipse-workspace\\Selenium\\screenshot//adactin.png");
		FileUtils.copyFile(s, des);
		
		WebElement logout = driver.findElement(By.id("logout"));
		logout.click();
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
