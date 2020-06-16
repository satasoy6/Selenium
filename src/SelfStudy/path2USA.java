package SelfStudy;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.drivers;

public class path2USA extends drivers {

	public static void main(String[] args) {

		drivers("chrome");
		driver.get("https://www.path2usa.com/travel-companions");
		driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='travel_date']")).click();

	//	String month = 
		while (!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("January")) {// while keeps on iterating until it becomes false
			driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();// click next
			
		
		}

		// This is a list of classnames has day in it. Grab common attribute put into
		// list and iterate
		List<WebElement> dates = driver.findElements(By.className("day"));// or cssSelector(".day") because the tag name
																			// is class
		int count = dates.size();
		// find the common atrribute name
		for (int i = 0; i < count; i++) {
			String text = driver.findElements(By.className("day")).get(i).getText();// this will give the day in the
																					// calenday in text
			if (text.equalsIgnoreCase("23")) {
				driver.findElements(By.className("day")).get(i).click();
				break;
			}

		}
	}
}
