package com.syntax.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.drivers;

public class TC3 extends drivers{
	
	public static void main(String[] args) {
		
		drivers("chrome");
		
		//identify username based on the parent
		driver.get("http://166.62.36.207/humanresources/symfony/web/index.php/auth");
		WebElement username=driver.findElement(By.xpath("//div[@id='divUsername']/input")); //sendKeys("Admin");
		driver.findElement(By.xpath("//div[@id='divPassword']/input")).sendKeys("Hum@nhrm123");
		driver.findElement(By.xpath("//div[@id='divLoginButton']/input")).click();
		
	}

}
