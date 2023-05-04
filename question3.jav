package com.cia1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EX3 {
public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
		//url of the page
		driver.get("https://www.amazon.in/");
		
		//maximise the window
		driver.manage().window().maximize();
		
		//enter username and password
		
			//click on all button

			//click on the sign in button
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div/div[2]/span/span/a")).click();
			//fill in the phone number
		WebElement phonenumber = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div[1]/form/div/div/div/div[1]/input[1]"));
		phonenumber.sendKeys("9962230004");
			//click submit
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div[1]/form/div/div/div/div[2]/span/span/input")).click();
		WebElement password = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div[1]/div/div/form/div/div[1]/input"));
		password.sendKeys("SnehaMaanas200310");
		//click submit
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div[1]/div/div/form/div/div[2]/div/div/label/div/label/input")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div[1]/div/div/form/div/div[1]/input")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div[1]/div/div/form/div/div[2]/span/span/input")).click();
		
		
		String currentTitle=driver.getTitle();
		System.out.println(currentTitle);
		String expectedTitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		if(currentTitle.equals(expectedTitle)) {
			System.out.println("TITLES MATCHED");
		}
		else {
			System.out.println("TITLES NOT MATCHED");
		}
		
		
		
		//click on my account
		driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/a[2]")).click();
		
		//click on my orders
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div[1]/a/div/div")).click();
		
		
		//check if any orders have been made
		
		char expectedchar = '0';
		String charfound=driver.findElement(By.xpath("/html/body/div[1]/section/div/div[4]/form/label")).getText();
		
		if(expectedchar == charfound.charAt(0))
		{
			System.out.println("NO ORDERS HAVE BEEN MADE");
		}
  
}
}

		
