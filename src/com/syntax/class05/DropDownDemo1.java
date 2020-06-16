package com.syntax.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.BaseClass;

public class DropDownDemo1 extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		WebElement weekDropDown=driver.findElement(By.xpath("//select[@id='select-demo']"));
		
		Select select=new Select(weekDropDown);
		/*Selenium provides 3 different ways to select a value from a DD.
		 * 1.index
		 * 2.byVisibleText(String str);
		 * 3.byValue(
		 */
		List<WebElement> options=select.getOptions();//return list of web elements
		System.out.println("Number of options in the dropdown:::"+options.size());
		//select.selectByIndex(3); We can use a for loop
		
		for (int i=0;i<options.size();i++) {
			select.selectByIndex(i);//How do you get the size of the dropdown
			Thread.sleep(1000);
		}
		
		select.selectByVisibleText("Friday");
		
		
		Thread.sleep(3000);
		tearDown();
	}
}
