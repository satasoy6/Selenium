package com.syntax.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.syntax.utils.BaseClass;

public class AlertDemo extends BaseClass{
	
	public static void main(String[] args) throws InterruptedException {
		
		setUp();//url=http://uitestpractice.com/Students/Switchto
		System.out.println("-----------SIMPLE ALERT-----------");
		
		driver.findElement(By.xpath("//button[@id='alert']")).click();
		
//		driver.findElement(By.id("confirm")).click();//You can't go the next alert without handling the first one, you will get exception
		//only one alert will open at a time
		
		Alert simpleAlert=driver.switchTo().alert();
		//how do i know the alert was open?
		String simpleAlertText=simpleAlert.getText();
		System.out.println("This is the Simple alert text ="+simpleAlertText);
		
		simpleAlert.accept();//any positive action you want to perform on alert ->.accept();
		//if I dont have further actions with the alert i can basically go with::driver.switchTo().alert().accept();
		
		
		System.out.println("----------CONFIRM ALERT----------");
		driver.findElement(By.id("confirm")).click();
		Alert confirmAlert=driver.switchTo().alert();
		Thread.sleep(1000);
		String confirmAlertText=confirmAlert.getText();
		Thread.sleep(1000);
		System.out.println("This is the Confirm alert text ="+confirmAlertText);
		confirmAlert.dismiss();//any negative action you want to perform
		//how do i make sure it has the right text?
		
		System.out.println("---------PROMPT ALERT---------");
		//Handling prompt alerts/confirmation alerts by providing some confirmation message
		driver.findElement(By.id("prompt")).click();
		Alert promptAlert=driver.switchTo().alert();
		Thread.sleep(2000);
		System.out.println("This is the Confirm alert text ="+promptAlert.getText());
		Thread.sleep(2000);
		String name="Alex";
		promptAlert.sendKeys(name);
		Thread.sleep(2000);
		promptAlert.accept();
		
		String text=driver.findElement(By.xpath("//div[@id='demo']")).getText();
		System.out.println(text);
		System.out.println("Text added to alert box::"+text);
		
		if(text.contains(name)) {
			System.out.println("Text was succesfully added");
		}else {
			System.err.println("Text was not entered");
		}
		
		
		
		
		
		Thread.sleep(4000);
		tearDown();
		
		
		
		
	}

}
