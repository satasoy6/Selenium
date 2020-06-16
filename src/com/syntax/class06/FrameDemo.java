package com.syntax.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.BaseClass;

public class FrameDemo extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		String text=driver.findElement(By.xpath("//h3[text()='click on the below link: ']")).getText();
		System.out.println(text);
		
		/*We can switch to a frame using three different methods
		 * 1.By index
		 * 2.NameOrId
		 * 3.By WebElement
		 */
	
		//By index
		driver.switchTo().frame(0);
		WebElement name=driver.findElement(By.id("name"));
		name.sendKeys("Seyma");
		driver.switchTo().defaultContent();//going back to main default content
		Thread.sleep(2000);
		
		//By NameOrId
		driver.switchTo().frame("iframe_a");
		name.clear();
		WebElement name2=driver.findElement(By.id("name"));
		name2.sendKeys("Sermed");
		Thread.sleep(2000);
		
		Thread.sleep(3000);
		tearDown();
		
	}

	
	
}
