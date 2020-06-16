package com.syntax.class10;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;

public class ActionClassDemo extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
	/*
	 * navigate to HRMS application
	 * enter uid and pwd
	 * click on login using mouse
	 */
		
		setUp();
		//driver.get("http://166.62.36.207/humanresources/symfony/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebElement user=driver.findElement(By.xpath("//input[@id='txtUsername']"));
		user.clear();
		user.sendKeys(ConfigsReader.getProperty("userName"));
		WebElement pass=driver.findElement(By.xpath("//input[@id='txtPassword']"));
		pass.clear();
		pass.sendKeys(ConfigsReader.getProperty("pass"));
		Thread.sleep(2000);
		WebElement loginBtn=driver.findElement(By.xpath("//input[@id='btnLogin']"));
//		loginBtn.click();
		//To perform mouse or keyboard operation we need to have an object on the action class
		Actions act=new Actions(driver);
		//identify an element on which to perform mouse click
		
		//clicking on the mouse and to complete the action we need to call perform();

		//to perform double click
//		act.moveToElement(loginBtn).doubleClick().perform();
		//do the right click 
		act.moveToElement(loginBtn).contextClick().perform();
		act.moveToElement(loginBtn).click().perform();
		WebElement pimLink=driver.findElement(By.linkText("PIM"));
		act.moveToElement(pimLink).build().perform();
		//click on the AddEmployee link using actions class
		WebElement addEmp=driver.findElement(By.id("menu_pim_addEmployee"));
		act.moveToElement(addEmp).click().perform();
//		act.keyUp(Keys.SHIFT).sendKeys("hello")-->If you perform this on text box 
						//it willhold shift key and type hello in uppercase
		
		
		
		
		
//		driver.quit();
	}
}
