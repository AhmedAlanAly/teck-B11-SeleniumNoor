package com.noorteck.selenium.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.Hooks;

public class SeleniumHW2 extends Hooks {
	
	public static void main(String[] args) throws InterruptedException {
		
	setUp();
	
	//Navigate to hyperlink>>>
	driver.get("https://demo.guru99.com/test/newtours/");
	Thread.sleep(2000);
	
	//Click REGISTER link
	WebElement registerBtn = driver.findElement(By.linkText("REGISTER"));
	Thread.sleep(2000);
	
	registerBtn.click();
	Thread.sleep(2000);
	
	//Verify title page is Mercury Tours//escapped
	
	
	Thread.sleep(2000);
	
	//Enter first name
	WebElement firstName = driver.findElement(By.name("firstName"));
	firstName.sendKeys("Ahmed");
	Thread.sleep(2000);
	

	
	//Enter last name
	WebElement lastName = driver.findElement(By.name("lastName"));
	lastName.sendKeys("Aly");
	Thread.sleep(2000);
	
	//Enter phone number
	WebElement phoneNumber = driver.findElement(By.name("phone"));
	phoneNumber.sendKeys("8323966044");
	Thread.sleep(2000);
	
	//Enter email
	WebElement email = driver.findElement(By.name("userName"));
	email.sendKeys("ahmed.raslan1402@gmail.com");
	Thread.sleep(2000);
	
	//Enter address
	WebElement address = driver.findElement(By.name("address1"));
	address.sendKeys("2525 old farm road");
	Thread.sleep(2000);
	
	//Enter City
	WebElement city = driver.findElement(By.name("city"));
	city.sendKeys("Houston");
	Thread.sleep(2000);
	
	//Enter state
	WebElement state = driver.findElement(By.name("state"));
	state.sendKeys("Texas");
	Thread.sleep(2000);
	
	// Enter zip code
	WebElement postalcode = driver.findElement(By.name("postalCode"));
	postalcode.sendKeys("77063");
	Thread.sleep(2000);
	
	// Enter username
	
	WebElement username = driver.findElement(By.name("email"));
	username.sendKeys("ahmed.raslan1402@gmail.com");
	Thread.sleep(2000);
	
	
	// Enter password
	WebElement password = driver.findElement(By.name("password"));
	password.sendKeys("Raslan711");
	Thread.sleep(2000);
	
	// Re-Enter password in confirm password field
	WebElement confirmPassword = driver.findElement(By.name("confirmPassword"));
	confirmPassword.sendKeys("Raslan711");
	Thread.sleep(2000);
      	
	
// Click Submit
	WebElement submit = driver.findElement(By.name("submit"));
	submit.click();
	Thread.sleep(2000);
	
	
	WebElement confirmationmssg = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[2]/font"));
	
	String mssg = confirmationmssg.getText();
	 Thread.sleep(2000);
	
		
		//Verify if text message says "Thank you for registering"
				if(mssg.contains("Thank you for registering")) {
					System.out.println("TESTCASE PASSED");
				}else {
					System.out.println("TESTCASE FAILED");
					 Thread.sleep(2000);
					 
					 tearDown();

				}
		
				
				

	}


}
