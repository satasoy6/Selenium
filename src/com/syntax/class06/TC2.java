package com.syntax.class06;

import org.openqa.selenium.By;

import com.syntax.utils.drivers;

public class TC2 extends drivers{

	public static void main(String[] args) throws InterruptedException {
		
		drivers("chrome");
		driver.get("http://jiravm.centralus.cloudapp.azure.com:8081/index.html");
		driver.findElement(By.xpath("//a[@class='dropdown-toggle'][contains(text(),'Others')]")).click();
		driver.findElement(By.linkText("Iframe")).click();
		driver.findElement(By.xpath("//iframe[@name='FrameOne']")).click();
		Thread.sleep(2000);
		driver.switchTo().frame("FrameOne");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Home")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//iframe[@name='FrameTwo']")).click();
		driver.switchTo().frame("FrameTwo");
		Thread.sleep(2000);
		
		Boolean display=driver.findElement(By.xpath("//img[contains(@src,'logo2.png')]")).isDisplayed();
		System.out.println("Is Syntax logo displayed:::"+display);
	}
}
