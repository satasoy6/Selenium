package com.syntax.class07;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import com.syntax.utils.drivers;

public class SimpleWindowHandle extends drivers{

	public static void main(String[] args) {
		
		drivers("chrome");
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
		
		String signUpTitle=driver.getTitle();
		System.out.println("The main page title is::"+signUpTitle);
		
		driver.findElement(By.linkText("Help")).click();//help window opens automatically
		/*
		 * How to get window handles
		 * In Selenium we have 2 methods to get the hand of a window
		 * getWindowHandle();
		 * getWindowHandles();
		 * 
		 */
		
		Set<String> allWindowHandles=driver.getWindowHandles();
		//Returns set of string IDs of all windows currently opened by the current instance
		
		System.out.println("Number of windows open are::"+allWindowHandles.size());
		
		Iterator<String>it=allWindowHandles.iterator();
		String MainWindowHandle=it.next();//returns the id of the main window
		System.out.println("The id of the main Window is::"+MainWindowHandle);
		String childWindowHandle=it.next();//returns the id of the child window
		System.out.println("The id of the child window is ::"+childWindowHandle);
		
		//Using switch to method we switch to another window by passing the handle/ID of window
		driver.switchTo().window(childWindowHandle);
		String childWindowTitle=driver.getTitle();
		System.out.println("Child page Title is::"+childWindowTitle);
		
		
		
		
		
		
	}
}
