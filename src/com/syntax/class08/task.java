package com.syntax.class08;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.drivers;

public class task extends drivers{

	public static void main(String[] args) {
/*
 * 		TC 1: Table headers and rows verification
 * 		Open chrome browser
		Go to “http://166.62.36.207/syntaxpractice/”
		Click on “Table” link
		Click on “ITable Data Search” link
		Verify second table consist of 5 rows and 4 columns
		Print name of all column headers 
		Print data of all rows
		Quit Browser

 */
	drivers("chrome");
	driver.get("http://demo.guru99.com/test/web-table-element.php#");
	driver.manage().window().fullscreen();
	driver.findElement(By.xpath("//a[contains(text(),'All')]")).click();
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	WebElement centralBank=driver.findElement(By.xpath("//table[@class='dataTable']//a[contains(text(),'Central Bank')]"));
	centralBank.click();
	System.out.println(centralBank.getText());
	
	
	
	
		
	}
}
