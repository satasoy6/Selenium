package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.syntax.utils.BaseClass;

public class TC2 {
	
	/*TC 2: HRMS Application Negative Login: 
	Open chrome browser
	Go to “http://166.62.36.207/humanresources/symfony/web/index.php/auth/login”
	Enter valid username
	Leave password field empty
	Verify error message with text “Password cannot be empty” is displayed.
	 * 
	 */

	public static String url="http://166.62.36.207/humanresources/symfony/web/index.php/auth/login";
	public static String userName="Admin";
	public static String password="Hum@nhrm123";
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		driver.get(url);
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(userName);
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		WebElement element=driver.findElement(By.xpath("//span[@id='spanMessage']"));
		String message=element.getText();
		if(element.isDisplayed()) {
			System.out.println(message);
		}else {
			System.out.println("Password cannot be empty");
		}
	}
}
