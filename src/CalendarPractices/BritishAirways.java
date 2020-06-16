package CalendarPractices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.syntax.utils.drivers;

public class BritishAirways extends drivers{

	public static void main(String[] args) throws InterruptedException {
		
		drivers("chrome");
		driver.get("https://www.united.com/en/us");
		
		//Select Departure City
		
		WebElement from=driver.findElement(By.xpath("//input[@id='bookFlightOriginInput']"));
		from.click();
		driver.findElement(By.cssSelector("button[class*='clearButton']")).click();//clear the pre-written area

		Thread.sleep(2000);
		from.sendKeys("SFO");

		//Select Arrival City
		driver.findElement(By.cssSelector("input[id*='DestinationInput']")).sendKeys("Adana");
		driver.findElement(By.cssSelector("input[id*='DepartDate']")).click();
		
		//open the calendar
		driver.findElement(By.cssSelector("div[class*='DateRangePickerInput__withBorder_2']")).click();
		
	}
}
