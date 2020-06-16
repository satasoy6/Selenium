package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC4 {

	/*
	 * TC 4: Radio Buttons Practice  
Open chrome browser
Go to “http://jiravm.centralus.cloudapp.azure.com:8081/index.html”
Click on “Input Forms” links
Click on “Radio Buttons Demo” links
Click on any radio button in “Radio Button Demo” section.
Verify correct radio is clicked
Click on any radio button in “Group Radio Buttons Demo” section.
Verify correct checkbox is clicked
Quit browser
	 */
	public static String url="http://jiravm.centralus.cloudapp.azure.com:8081/index.html";
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		driver.get(url);
		driver.findElement(By.className("dropdown-toggle")).click();  
		Thread.sleep(3000);
		driver.findElement(By.linkText("Radio Buttons Demo")).click();
		WebElement femaleRadio=driver.findElement(By.xpath("//input[@value='Female']"));
//		System.out.println(femaleRadio.isDisplayed());
//		System.out.println(femaleRadio.isEnabled());
		femaleRadio.click();
		System.out.println("Female Radio button is selected:::"+femaleRadio.isSelected());
		WebElement AgeGroupRadio=driver.findElement(By.xpath("//input[@value='15 - 50']"));
		AgeGroupRadio.click();
		if(AgeGroupRadio.isSelected()) {
			System.out.println("Age group 15-50 selected, Test passed");
		}else {
			System.out.println("Age group NOT selected, Test failed");
		}
		
	}
	
}
