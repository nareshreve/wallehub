package com.len.workspace.ws;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Test_Facebook extends Facebook{

	@Test
	public void login() throws InterruptedException
	{
		ChromeOptions options = new ChromeOptions();

		
		options.addArguments("--disable-notifications");
		
		String textbox_email="//input[@name='email']";
		String textbox_password="//input[@name='pass']";
		String button_login="//button[@name='login']";
		String button_profile="//div[@class='qzhwtbm6 knvmm38d']";
		String image="//div[@class='q9uorilb l9j0dhe7 pzggbiyp du4w35lb']";
		String button_Edit="//div[contains(text(),'Add Bio')]";
		String textbox_status="//textarea[@placeholder='Describe who you are']";
		String button_save="//span[contains(text(),'Save')]";
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(textbox_email)).sendKeys("tradeviewpre@gmail.com");
		driver.findElement(By.xpath(textbox_password)).sendKeys("tradeview123");
		driver.findElement(By.xpath(button_login)).click();
		WebDriverWait wait = new WebDriverWait(driver,30);


        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(image))).click();

   
	//	Thread.sleep(5000);
		driver.findElement(By.xpath(image)).click();
		System.out.println("Login into facebook");
		Thread.sleep(5000);
		 // wait.until(ExpectedConditions.elementToBeClickable(By.xpath(button_Edit))).click();
		driver.findElement(By.xpath(button_Edit)).click();
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath(textbox_status))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(textbox_status)).sendKeys("Hello World");
		driver.findElement(By.xpath(button_save));
		//driver.findElement();
		System.out.println("Login into facebook");
		driver.close();
		
	}
}
