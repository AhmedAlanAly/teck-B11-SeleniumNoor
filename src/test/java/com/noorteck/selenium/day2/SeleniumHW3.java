package com.noorteck.selenium.day2;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utils.Hooks;

public class SeleniumHW3 extends Hooks {

	public static void main(String[] args) throws InterruptedException {

		setUp();

		// Navigate hyperlink:>>>>
		driver.get("https://demo.nopcommerce.com/");
		Thread.sleep(1000);

		// Click REGISTER link
		WebElement registerBtn = driver.findElement(By.linkText("Register"));
		Thread.sleep(1000);

		registerBtn.click();
		Thread.sleep(1000);

		// Fill out Your Personal Details Section
		// Gender
		WebElement gender = driver.findElement(By.id("gender-male"));
		gender.click();
		Thread.sleep(1000);

		// First name
		WebElement firstName = driver.findElement(By.id("FirstName"));
		firstName.sendKeys("Ahmed");
		Thread.sleep(1000);

		// Last name

		WebElement lastName = driver.findElement(By.id("LastName"));
		lastName.sendKeys("Aly");
		Thread.sleep(1000);

		// Dob day
		WebElement dayDropDown = driver.findElement(By.name("DateOfBirthDay"));
		Select selectObj = new Select(dayDropDown);
		selectObj.selectByValue("14");
		Thread.sleep(1000);

		// Dob month
		WebElement monthDropDown = driver.findElement(By.name("DateOfBirthMonth"));
		Select selectObj1 = new Select(monthDropDown);
		selectObj1.selectByValue("2");
		Thread.sleep(1000);

		// Dob year
		WebElement yearDropDown = driver.findElement(By.name("DateOfBirthYear"));
		Select selectObj2 = new Select(yearDropDown);
		selectObj2.selectByValue("1986");
		Thread.sleep(1000);

		// Email
		WebElement email = driver.findElement(By.id("Email"));
		email.sendKeys("ahmed.raslan1402@gmail.com");
		Thread.sleep(1000);

		// Company name
		WebElement coName = driver.findElement(By.id("Company"));
		coName.sendKeys("NewsLetter");
		Thread.sleep(1000);

		// Uncheck newsletter check box
		WebElement uncheck = driver.findElement(By.id("NewsLetter"));
		uncheck.click();
		Thread.sleep(1000);

		// Enter password
		WebElement password = driver.findElement(By.id("Password"));
		password.sendKeys("123456789");
		Thread.sleep(1000);

		// Enter confirm password
		WebElement confirmpass = driver.findElement(By.id("ConfirmPassword"));
		confirmpass.sendKeys("123456789");
		Thread.sleep(1000);

		// Click register button

		WebElement registerbttn = driver.findElement(By.id("resgister-button"));
		registerbttn.click();
		Thread.sleep(2000);

		// Retrieve the confirmation text message and check if the confirmation text
		// message equals to

		// Verify registration completed. If message says: "Your registration
		// completed!!!"
		// if yes, print TESTCASE PASSED
		// If no, print TESTCASE FAILED
		WebElement confirmationText = driver
				.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]"));

		String register = confirmationText.getText();

		if (register.contains("Your registration completed!!!")) {
			System.out.println("TESTCASE PASSED");
		} else {
			System.out.println("TESTCASE FAILED");
		}

		Thread.sleep(2000);
		tearDown();

	}

}
