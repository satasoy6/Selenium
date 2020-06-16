package com.syntax.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.syntax.utils.drivers;

public class HandleAlerts extends drivers{
	
	public static void main(String[] args) throws InterruptedException {
		
		drivers("chrome");
		driver.get("https://www.rediff.com");
		//click on sign in link
		driver.findElement(By.cssSelector("a.signin")).click();
		//click on sign in button
		
		 driver.findElement(By.cssSelector("input.signinbtn")).click();
		 Thread.sleep(2000);
		 //an alert pops up
		 //handling alert
		 Alert alert=driver.switchTo().alert();//this line returns the alert
		 String alertText=alert.getText();
		 System.out.println("Text on alert is :"+alertText);
		 
		 Thread.sleep(2000);
		 alert.accept();
		 
		 driver.quit();
		 
	}

}
