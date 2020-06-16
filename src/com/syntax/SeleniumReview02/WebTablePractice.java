package com.syntax.SeleniumReview02;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.drivers;

public class WebTablePractice extends drivers {

	public static void main(String[] args) {
		
		drivers("chrome");
		driver.get("http://testingpool.com/data-types-in-java/");
		
		List<WebElement> rows=driver.findElements(By.xpath("//div[contains(@class,'su-table')]/table/tbody/tr"));
		int size=rows.size();
		System.out.println("Total row number is "+size);
		
		List<WebElement> cols=driver.findElements(By.xpath("//div[contains(@class,'su-table')]/table/tbody/tr[1]/td"));
		int colsize=cols.size();
		System.out.println("Total number of columns "+colsize);
		
		for(int i=1;i<rows.size();i++) {//rows
			for(int j=1;j<=cols.size();j++) {//columns
			
				WebElement cellData	=driver.findElement(
					By.xpath("//div[contains(@class,'su-table')]/table/tbody/tr["+i+"]/td["+j+"]"));
				String cellDataText=cellData.getText();
				if(j==2) {
					System.out.println(cellDataText);
				}
			}
		}
	//to get a spesific column
		
		
		
		
	}
}
