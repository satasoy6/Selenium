package com.syntax.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class FileUploadDemo{

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "true");
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/");
		//click on file upload link
		driver.findElement(By.linkText("File Upload")).click();
		//click on choose File
//		driver.findElement(By.id("file-upload")).click();
		//We can't switch to computer's system as pop-up alert
		driver.findElement(By.id("file-upload")).sendKeys("/Users/seymaatasoy/Desktop/myFile.png");
		driver.findElement(By.id("file-submit")).click();
		WebElement upload=driver.findElement(By.id("uploaded-files"));
		String text=upload.getText();
		if(text.contains("myFile")) {
			System.out.println("MyFile is displayed??? "+upload.isDisplayed());
		}else
		{
			System.out.println("Test failed");
		}
		Thread.sleep(3000);
		driver.quit();
		
		
	}
}
