package com.syntax.class09;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.Keys;

import com.syntax.utils.drivers;

public class Task extends drivers {

	public static void main(String[] args) throws InterruptedException {

		drivers("chrome");
		driver.get("https://www.aa.com/homePage.do");
		//driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		WebElement fromCity = driver.findElement(By.xpath("//input[@id='reservationFlightSearchForm.originAirport']"));
		fromCity.clear();
		fromCity.sendKeys("JFK");

		WebElement toCity = driver
				.findElement(By.xpath("//input[@id='reservationFlightSearchForm.destinationAirport']"));
		toCity.clear();
		toCity.sendKeys("MIA",Keys.TAB);

//		driver.findElement(By.xpath("(//button[@class='ui-datepicker-trigger'])[1]")).click();
		driver.findElement(By.xpath("//input[@id='aa-leavingOn']")).click();
		// select departure date
		while (!driver.findElement(By.xpath("(//span[@class='ui-datepicker-month'])[1]")).getText().contains("July")) {
			driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/div/a")).click();// go to the next month
		}
		List<WebElement> days = driver.findElements(By.xpath("//*[contains(@data-handler,'selectDay')]"));

		for (WebElement day : days) {
			if (day.getText().equals("8")) {
				day.click();
				break;
			}
		}
		// Select return date
		driver.findElement(By.xpath("(//button[@class='ui-datepicker-trigger'])[2]")).click();// this element is not
																								// interactable
		while (!driver.findElement(By.xpath("(//span[@class='ui-datepicker-month'])[1]")).getText()
				.contains("November")) {
			driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/div/a")).click();// go to the next month
		}
		List<WebElement> returnDay = driver.findElements(By.xpath("//*[contains(@data-handler,'selectDay')]"));

		for (WebElement retD : returnDay) {
			String retText = retD.getText();
			if (retText.equals("8")) {
				retD.click();
				break;
			}
		}
		Thread.sleep(15000);
		driver.close();

		// day icin //table[@class='ui-datepicker-calendar']/tbody/tr/td
	}
}
