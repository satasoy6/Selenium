package SelfStudy;

import org.openqa.selenium.By;

import com.syntax.utils.drivers;

public class Alert extends drivers{

	public static void main(String[] args) {
		
		String url="https://rahulshettyacademy.com/AutomationPractice/";
		
		drivers("chrome");
		driver.get(url);
	
		driver.findElement(By.id("name")).sendKeys("Seyma");
		
		
	}
}
