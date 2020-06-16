package com.syntax.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.CommonMethods;

public class LoginPage extends CommonMethods{
	
	public WebElement username=driver.findElement(By.id("txtUsername"));
	public WebElement password=driver.findElement(By.id("txtPassword"));
	public WebElement loginBtn=driver.findElement(By.id("btnLogin"));
	public WebElement logo=driver.findElement(By.xpath("//div[@id='divLogo']/img"));
	
//	public WebElement pim=driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']"));
//	public WebElement addEmpList=driver.findElement(By.xpath("//a[contains(text(),'Add Employee')]"));
//
//	
	
}
