package com.syntax.SeleniumReview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.BaseClass;

public class ClassTask extends BaseClass{
	
	public static void main(String[] args) {
		
		setUp();
		
		WebElement DD=driver.findElement(By.xpath("//select[@name='url']"));
		
		Select select=new Select(DD);
		select.selectByValue("Books");
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Harry Potter");
		driver.findElement(By.xpath("//input[@value='Go']")).click();
		driver.findElement(By.xpath("//span[@class='a-size-base a-color-base'][contains(text(),'Unofficial Cookbook')]"));
	}

}
