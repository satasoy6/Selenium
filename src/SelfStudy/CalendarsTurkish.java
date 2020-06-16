package SelfStudy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.drivers;

public class CalendarsTurkish extends drivers {

	public static void main(String[] args) throws InterruptedException {
		
		drivers("chrome");
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		driver.findElement(By.id("btnLogin")).click();
		
		driver.findElement(By.linkText("Leave")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Leave List")).click();
		
		//click on calendar image
		//You can enter an input, image--->XPath
		driver.findElement(By.cssSelector("img[class='ui-datepicker-trigger']")).click();
		
		
		//select the desired month
		WebElement months=driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select selectM=new Select(months);
		selectM.selectByVisibleText("Sep");
		//select the desired year
		WebElement years=driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select selectY=new Select(years);
		selectY.selectByVisibleText("2019");
		//select the desired day
		List<WebElement> days=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
		for(WebElement day:days) {
			String dayText=day.getText();
			
			if(dayText.equals("16")) {
				day.click();
				break;
			}
		}
		
		
	}
}
