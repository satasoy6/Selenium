package com.syntax.class08;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.BaseClass;

public class TC1 extends BaseClass {

	public static void main(String[] args) {
		/*
		 * TC 1: Table headers and rows verification 
		 * Open chrome browser Go to
		 * “http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.
		 * aspx” Login to the application Verify customer “Susan McLaren” is present in
		 * the table 
		 * Click on customer details Update customers last name and credit
		 * card info Verify updated customers name and credit card number is displayed
		 * in table Close browser
		 * 
		 */
		setUp();
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("tester");
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();
		
		List<WebElement> names=driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr"));
		
		Iterator<WebElement> name=names.iterator();
		while(name.hasNext()) {
			String nam=name.next().getText();
			if(nam.contains("Susan McLaren")) {
				//print details
				System.out.println(nam);
				//Click on the customer
				driver.findElement(By.xpath("//input[@id='ctl00_MainContent_orderGrid_ctl06_OrderSelector']")).click();
			}
		}
		
		//click to update details
		driver.findElement(By.xpath("div.content table.SampleTable tbody:nth-child(1) tr:nth-child(6) td:nth-child(13) > input:nth-child(1)")).click();
		List<WebElement>radioBox=driver.findElements(By.xpath("//table[@class='RadioList']"));
		System.out.println(radioBox.size());
		
		
		
	}

}
