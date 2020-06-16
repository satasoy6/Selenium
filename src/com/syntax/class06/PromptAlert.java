package com.syntax.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.syntax.utils.drivers;

public class PromptAlert extends drivers{
	
	public static void main(String[] args) throws InterruptedException {
		
		drivers("chrome");
		driver.get("https://www.toolsqa.com/handling-alerts-using-selenium-webdriver/");
		driver.manage().window().fullscreen();
		driver.findElement(By.xpath("//button[text()='Prompt Pop up']")).click();
		
		//handling prompt alert
		Alert alert=driver.switchTo().alert();
		
		String alertTxt=alert.getText();
		System.out.println(alertTxt);
	//	if(alertTxt.equals("Do you like toolsqa?")) {
			alert.sendKeys("Yes");
			Thread.sleep(3000);
	//	}else {
			alert.dismiss();
	
		
	
		
		
		
	}

}
