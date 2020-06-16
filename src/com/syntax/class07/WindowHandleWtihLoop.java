package com.syntax.class07;

import com.syntax.utils.drivers;

public class WindowHandleWtihLoop extends drivers{

	public static void main(String[] args) {
		
		drivers("chrome");
		driver.get("https://demoqa.com/automation-practice-switch-windows-2/");
		
		String signUpTitle=driver.getTitle();
		
		System.out.println("Main page title is "+signUpTitle);
		
		String parentWindowHandle=driver.getWindowHandle();
		System.out.println("What is the parent window handle?"+parentWindowHandle);
		
		for(int i=1;i<=3;i++) {
			
		}
		
		
	}
}
