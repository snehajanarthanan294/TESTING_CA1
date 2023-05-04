package com.cia1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EX1 {
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
			System.out.println("TITLE MATCHED");
		}
		else {
			System.out.println("TITLE NOY MATCHED");
		}
		
		
		//Question 1
			//search for required item and enter
		WebElement searchbar = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[2]/div[1]/input"));
		searchbar.sendKeys("rice");
		driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[3]/div/span/input")).click();
			//click on add to cart
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div/div[2]/div[5]/span/div/div[1]/form/span/div/div/span/span/button")).click();
		Thread.sleep(4000);
			//click on the cart element
		driver.get("https://www.amazon.in/gp/cart/view.html?ref_=nav_cart");
			//click on quantity element
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div[5]/div/div[2]/div[1]/div/form/div[2]/div[3]/div[4]/div/div[3]/div[1]/span[1]/span/span[1]/span/span/span/span")).click();
			//increment the value
		driver.findElement(By.xpath("/html/body/div[5]/div/div/ul/li[5]/a")).click();
			//check if the price value has appeared as expected
		String costexpected = "  2,080.00";
		String cost=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div[5]/div/div[1]/div[1]/div/form/div/div[1]/div[1]/span[2]/span")).getText();
		if(cost.equals(costexpected))
		{
			System.out.println("Expected Cost Fulfilled");

		}
		else
		{
			System.out.println("Expected Cost Not Fulfilled");

		}

		
	}

}
