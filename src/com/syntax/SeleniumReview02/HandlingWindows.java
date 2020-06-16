package com.syntax.SeleniumReview02;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.BaseClass;

public class HandlingWindows extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		WebElement newBrowserTabButton=driver.findElement(By.xpath("//button[text(),'newBrwTab()']"));
		newBrowserTabButton.click();
		
		String parentWindow=driver.getWindowHandle();//getting parent window ID
		Thread.sleep(2000);
		driver.close();
		
		Set<String> allWindows=driver.getWindowHandles();
		Iterator<String> it= allWindows.iterator();//-->iterating through the windows
		
		while(it.hasNext()) {//-->checking if there is any other window handle coming up
			String childWindow=it.next();
			if(!parentWindow.equals(childWindow)) {
				driver.switchTo().window(childWindow);
			}
		}
		
		WebElement header = driver.findElement(By.xpath("//strong[contains(text(), 'Agile Testing')]"));
		String headerText = header.getText();
		System.out.println(headerText);  //NoSuchWindowException

	}
}
