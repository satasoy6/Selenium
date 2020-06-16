package SelfStudy;

import org.openqa.selenium.By;

import com.syntax.utils.drivers;

public class SalesforceE2E extends drivers{
	
	public static void main(String[] args) {
		
		drivers("chrome");
		driver.get("https://www.rediff.com/");
		driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("hello");
		driver.findElement(By.cssSelector("input#password")).sendKeys("goodbye");
		driver.findElement(By.cssSelector("input.signinbtn")).click();//tagname.classname
			
	}

}
