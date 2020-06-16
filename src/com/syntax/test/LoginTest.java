package com.syntax.test;

import com.syntax.pages.LoginPage;
import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;

public class LoginTest extends CommonMethods{

	public static void main(String[] args) {
		
		/*
		 * As an admin user should be able to login to the
		 * application with valid with credentials
		 */
	
		setUp();
		LoginPage login=new LoginPage();
		sendText(login.username, ConfigsReader.getProperty("username"));
		
		//sending password
		
		sendText(login.password,ConfigsReader.getProperty("password"));
		
	
		
		if(login.logo.isDisplayed()) {
			System.out.println("Logo is displayed");
		}else {
			System.out.println("Logo is not displayed");
		}
		
		waitAndClick(login.loginBtn);
		wait(2);
		tearDown();
		
	}
}
