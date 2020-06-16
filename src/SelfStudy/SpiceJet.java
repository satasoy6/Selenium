package SelfStudy;

import org.openqa.selenium.By;

import com.syntax.utils.drivers;

public class SpiceJet extends drivers{

	public static void main(String[] args) {
		
		drivers("chrome");
		driver.get("https://book.spicejet.com/");
		//click Round Trip
		driver.findElement(By.xpath("//input[@id='ControlGroupSearchView_AvailabilitySearchInputSearchView_RoundTrip']")).click();
		//Select from city
		driver.findElement(By.xpath("//input[@id='ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT']")).click();
		
		
		//to City
		driver.findElement(By.xpath("//a[@text='Delhi (DEL)']")).click();
		driver.findElement(By.cssSelector("a.ui-state-default.ui-state-highlight.ui-state-active"));//to select the current date
		
		
		
	}
}
