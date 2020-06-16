package com.syntax.class05;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.BaseClass;

public class TC1 extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		WebElement department=driver.findElement(By.cssSelector("select#searchDropdownBox"));
		department.click();
		
		Select select= new Select(department);
		List<WebElement> category=select.getOptions();
		int count=0;
		for(WebElement categories : category) {
			String text=categories.getText();
			count++;
			
			if(text.equals("Computers")) {
				categories.click();
				String selection=categories.getText();
				if(selection.equals("Computers")) {
					System.out.println("Computer selected?:::"+categories.isSelected());
				}else {
					System.err.println("Computer is NOT selected");
				}
				System.out.println("********************");
			}
			System.out.println(text);
		}
		
//		Iterator<WebElement> list=category.iterator();
//		while(list.hasNext()) {
//			String text=list.next().getText();
//			System.out.println(text);
//		}
//		System.out.println(category.size());
		System.out.println("The number of category in Amazon is ::"+count);
		Thread.sleep(3000);
		select.selectByValue("search-alias=computers");
		
		Thread.sleep(20000);
		tearDown();
		
	}
}
