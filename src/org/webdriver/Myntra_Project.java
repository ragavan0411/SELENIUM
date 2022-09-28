package org.webdriver;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra_Project {
	
	static WebDriver driver;
	
	public   static void BrowserLaunch (){
	
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\abi\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		 driver= new ChromeDriver();
		
		driver.get("https://www.myntra.com/kids?f=Categories%3ATshirts%3A%3AGender%3Aboys%2Cboys%20girls&plaEnabled=false");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public  static void getproducts (){
		
		List<WebElement>LEASTPRICE = driver.findElements(By.xpath("//span[@class='product-discountedPrice']"));
		
		for (WebElement allprice : LEASTPRICE) {
				
			
			String  TEXTOFALLPRODUCTS = allprice.getText();
			System.out.println(TEXTOFALLPRODUCTS);
			
			int sizeOFALLPRODUCTS = LEASTPRICE.size();         //doubt
			System.out.println(sizeOFALLPRODUCTS);	
			
			
		}

	}
	
	private static void minvalueofprdct() {
		
		List<WebElement> allprice = driver.findElements(By.xpath("\"//span[@class='product-discountedPrice']\"));\r\n"));
        List<Integer>allpriceList = new ArrayList<Integer>();
         for (WebElement price : allprice) {
        	 
        	 String textofproduct = price.getText().replaceAll("Rs", "");
        	 System.out.println(textofproduct);
        	 
        	 Integer pricevalue = Integer.valueOf(textofproduct);
        	 
              
			
		}
         
	}
         public static void main(String[] args) {
        	 
        	 BrowserLaunch();
        	 getproducts();
        	 
	 
        	 
}
}
