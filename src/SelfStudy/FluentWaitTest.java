package SelfStudy;

import org.openqa.selenium.By;

import com.syntax.utils.drivers;

public class FluentWaitTest extends drivers {

	public static void main(String[] args) {
		
		drivers("chrome");
		
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		driver.findElement(By.cssSelector("[id='start'] button"));
		
		//Fluent 
//	Wait<WebDriver> wait=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
//		.pollingEvery(DurationOfSeconds)
				
	
		//FluentWait example udemy Rahul class 81.
		
	}
}
