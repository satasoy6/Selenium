package com.syntax.class07;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import com.syntax.utils.drivers;

public class WindowHandle extends drivers{

	public static void main(String[] args) throws InterruptedException {
		//google sign up
		drivers("chrome");
		
		driver.get("http://166.62.36.207/syntaxpractice/window-popup-modal-demo.html");
		
		String signUpTitle=driver.getTitle();
		System.out.println("The main page title ::"+signUpTitle);
		String parentWindowHandle=driver.getWindowHandle();
		System.out.println("The id of the parent window handle::"+parentWindowHandle);
		
		
		driver.findElement(By.linkText("Follow On Instagram")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Like us On Facebook")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Follow Instagram & Facebook")).click();
		
		Set<String>allWindowHandles=driver.getWindowHandles();//iterate through all handles
		System.out.println("Number of windows opened ::"+allWindowHandles.size());
		
		Iterator<String> it=allWindowHandles.iterator();
		while(it.hasNext()) {
			String handle=it.next();//grabs the next window handle
//			driver.switchTo().window(handle);-->this way is not practical
			if(!handle.equals(parentWindowHandle)) {//switch to next window onlu if not same as parent
				driver.switchTo().window(handle);
				System.out.println(driver.getTitle());
				driver.close();
				Thread.sleep(1000);
			}
			

		}
		
		
		
		
	}
}
