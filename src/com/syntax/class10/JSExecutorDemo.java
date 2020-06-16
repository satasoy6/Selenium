package com.syntax.class10;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.syntax.utils.drivers;

public class JSExecutorDemo extends drivers{
	
	public static void main(String[] args) throws InterruptedException {
		
		drivers("chrome");
		driver.get("http://166.62.36.207/humanresources/symfony/web/index.php/dashboard");
//		syntax hrms login
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		WebElement pass=driver.findElement(By.id("txtPassword"));
		pass.sendKeys(("Hum@nhrm123"));
		WebElement loginBtn=driver.findElement(By.className("button"));
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		//change the background color
		js.executeScript("arguments[0].style.backgroundColor='yellow'", pass);
		Thread.sleep(2000);
		//click on login btn using js
		js.executeScript("arguments[0].click()", loginBtn);
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0.250");//scroll up
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0.-250");//scroll down
		
		
	
		
		
		js.executeScript("arguments[0].scrollIntoView(true);", loginBtn);
		
		
		
		
	}

}
