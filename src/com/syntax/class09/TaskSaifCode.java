package com.syntax.class09;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.syntax.utils.drivers;

public class TaskSaifCode extends drivers {
	
	public static void main(String[] args) throws InterruptedException {
		
		String url = "https://www.aa.com/homePage.do";
		drivers("chrome");
		driver.get(url);
		driver.findElement(By.xpath("(//button[@class='ui-datepicker-trigger'])[1]")).click();
		String month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		String year = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		while (!month.equalsIgnoreCase("July") && !year.equalsIgnoreCase("2020")) {
			driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/div/a")).click();
			Thread.sleep(2000);
			month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			year = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		}
		// Loop Through td and grab the text.
		List<WebElement> day = driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr/td"));
		for (WebElement daySelect : day) {
			String date = daySelect.getText();
			if (date.contentEquals("14")) {
				daySelect.click();
				break;
			}
		}
		System.out.println("===Selecting Return Date======");
		driver.findElement(By.xpath("(//button[@class='ui-datepicker-trigger'])[2]")).click();
		String returnMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		String returnYear = driver.findElement(By.xpath("(//span[@class='ui-datepicker-year'])[1]")).getText();
		while (!returnMonth.equalsIgnoreCase("November")) {
			driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/div/a")).click();
			Thread.sleep(2000);
			returnMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		}
		// Loop Through td and grab the date.
		List<WebElement> Returnday = driver
				.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
		for (WebElement daySelect : Returnday) {
			String date = daySelect.getText();
			if (date.contentEquals("8")) {
				daySelect.click();
				break;
			}
		}
		driver.findElement(By.id("flightSearchForm.button.reSubmit")).click();
		Thread.sleep(3000);
		String departDate = driver.findElement(By.id("segments0.travelDate")).getAttribute("value");
		String returnDate = driver.findElement(By.id("segments1.travelDate")).getAttribute("value");
		System.out.println("Selected Travel Date is Departure = " + departDate + " and Return date is " + returnDate);
		
		driver.quit();
	}

}
