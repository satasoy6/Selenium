package com.syntax.class08;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.drivers;

public class DynamicTableDemo extends drivers {

	public static void main(String[] args) {

		drivers("chrome");

		driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/default.aspx");
		driver.findElement(By.xpath("//input[@id='ctl00_MainContent_username']")).sendKeys("Tester");
		driver.findElement(By.xpath("//input[@id='ctl00_MainContent_password']")).sendKeys("test");
		driver.findElement(By.xpath("//input[@id='ctl00_MainContent_login_button']")).click();
		
		List<WebElement> RowTable=driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr"));
	
		//Get Rows
		
		for(WebElement rowList:RowTable) {
			String textRowList=rowList.getText();
			if(textRowList.contains("VISA")) {
				System.out.println(textRowList);
			}
			
		}

		List<WebElement> ColTable = driver
				.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td"));

		Iterator<WebElement> cols = ColTable.iterator();
		while (cols.hasNext()) {
			String colText = cols.next().getText();
			System.out.println(colText);
		}
	}

}
