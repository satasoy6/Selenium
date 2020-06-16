package com.syntax.class05;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.BaseClass;

public class Task extends BaseClass{
/*TC 1: Facebook dropdown verification
Open chrome browser
Go to “https://www.facebook.com”
Verify:
month dd has 12 month options
day dd has 31 day options
year dd has 115 year options
Select your date of birth	
Quit browser
 * 
 */
	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
		Select select1=new Select(month);
		List<WebElement>monthList=select1.getOptions();

		Iterator<WebElement> it=monthList.iterator();
		
		while(it.hasNext()) {
			String text=it.next().getText();
			System.out.println(text);
		}
		System.out.println("There are "+monthList.size()+" options available in Month DropDown");
		System.out.println("**********************");
		
		WebElement day=driver.findElement(By.xpath("//select[@id='day']"));
		Select select2=new Select(day);
		List<WebElement>dayList=select2.getOptions();
		Iterator<WebElement> it2=dayList.iterator();
		
		while(it2.hasNext()) {
			String text=it2.next().getText();
			System.out.println(text);
		}
		System.out.println("There are "+dayList.size()+" options available in Day DropDown");
		System.out.println("**********************");
		
		
		WebElement year=driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select select3=new Select(year);
		List<WebElement>yearList=select3.getOptions();
		Iterator<WebElement> it3=yearList.iterator();
		
		while(it3.hasNext()) {
			String text=it3.next().getText();
	//		System.out.println(text);
		}
		System.out.println("There are "+yearList.size()+" options available in Year DropDown");
		System.out.println("**********************");
		
		
		Thread.sleep(5000);
		tearDown();
	}
}
