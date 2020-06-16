package com.syntax.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.BaseClass;
import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;

public class LoginWithAdvancedXpath extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		
		//syntax hrms login webpage
		setUp();
//		"http://166.62.36.207/humanresources/symfony/web/index.php/auth"
		setUp();
		//identify username based on the parent
		WebElement username=driver.findElement(By.xpath("//div[@id='divUsername']/input"));
		sendText(username, ConfigsReader.getProperty("username"));
		
		//identify password based on the following sibling
		WebElement password=driver.findElement(By.xpath("//span[text()='Password']/preceding-sibling::input"));
		sendText(password, ConfigsReader.getProperty("password"));
		
		//identify login based on parents previous sibling
//		WebElement loginBtn=driver.findElement(By.xpath("//div[@id='divLoginHelpLink']/following-sibling::div/input"));
//		click(loginBtn);
		
		//identify login btn based on grandparent 
		wait(2);
		WebElement loginBtn=driver.findElement(By.xpath("//form[@id='frmLogin']/div[5]/input"));
		click(loginBtn);								
		
		Thread.sleep(6000);
		tearDown();

	}
}
