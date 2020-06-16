package com.syntax.class09;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.CommonMethods;
import com.syntax.utils.drivers;

public class SimpleCalendarsDemo extends drivers{

	/*
	 * Step 1- Click on calendar
	 * 
	 * Step 2- Get all td of table using findElements method
	 * 
	 * Step 3- using for loop get text of all td elements
	 * 
	 * Step 4- using if else condition we will check specific date
	 * 
	 * Step 5- If date is matched then click and break the loop.
	 */

	public static void main(String[] args) throws InterruptedException {
		//Syntax HRM login
		drivers("chrome");
		driver.get("http://166.62.36.207/humanresources/symfony/web/index.php/auth/login");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
		
		
		driver.findElement(By.id("btnLogin")).click();
		
		//Navigate to leave list
				CommonMethods.waitForClickability(driver.findElement(By.linkText("Leave")));
				driver.findElement(By.linkText("Leave")).click();
				driver.findElement(By.linkText("Leave List")).click();
				
				//click on the calendar 
				CommonMethods.waitForClickability(driver.findElement(By.id("calFromDate")));
			//	ele.click();
				
				WebElement mDD=driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
				CommonMethods.selectDdValue(mDD, "Apr");
				
				WebElement yDD=driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
				CommonMethods.selectDdValue(yDD, "2021");
				
				//select day from the calendar
				List<WebElement> fromDate=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
				
				for(WebElement fromDay: fromDate) {
					Thread.sleep(2000);
					if(fromDay.getText().equals("15")) {
						fromDay.click();
						break;
					}
				}
				
				
				Thread.sleep(5000);
	//		tearDown();	
		
		
		
	}
}


