package com.syntax.class09;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.drivers;

public class Task11 extends drivers{

	public static void main(String[] args) throws InterruptedException {
		/*
		 * TC 1: Table headers and rows verification
		 *  Open chrome browser Go to
		 * “https://www.aa.com/homePage.do” 
		 * Enter From and To Select departure as May 14
		 * of 2020 Select arrival as November 8 of 2020 Click on search Close browser
		 */
		
		String url="https://www.aa.com/homePage.do";
		drivers("chrome");
		driver.get(url);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement fromCity=driver.findElement(By.xpath("//input[@id='reservationFlightSearchForm.originAirport']"));
        fromCity.clear();
        fromCity.sendKeys("JFK");
        WebElement toCity=driver.findElement(By.xpath("//input[@id='reservationFlightSearchForm.destinationAirport']"));
        toCity.clear();
        toCity.sendKeys("MIA");
        driver.findElement(By.xpath("(//button[@class='ui-datepicker-trigger'])[1]")).click();
//      driver.findElement(By.cssSelector("[class='ui-datepicker-title'] [class='ui-datepicker-month']")).getText();
        String month=driver.findElement(By.xpath("//div[@class='ui-datepicker-title'] /span[@class='ui-datepicker-month']")).getText();
        while(!month.equals("September")) {
        	driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/div/a")).click();//go to the next month
    //      month=driver.findElement(By.xpath("//span[@class='ui-datepicker-month'])[1]")).getText();
            month=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
        }
        List<WebElement> days = driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr/td"));
        for(WebElement day:days) {
            String d=day.getText();{
             if(d.equals("3")) {
                 day.click();
             }
            }
        }
        Thread.sleep(2000);
        driver.quit();
	}
}
