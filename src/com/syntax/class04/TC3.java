package com.syntax.class04;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC3 {
/*TC 3: Syntax Demo input boxes count: 
Open chrome browser
Go to “http://jiravm.centralus.cloudapp.azure.com:8081/index.html”
Click on “Input Forms” links
Click on “Simple Form Demo” links
Get all input boxes from the page
Enter “Hello” to each text box
Close browser
 * 
 */
	public static String url="http://jiravm.centralus.cloudapp.azure.com:8081/index.html";
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		driver.get(url);
		driver.findElement(By.className("dropdown-toggle")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Simple Form Demo")).click();
		Thread.sleep(3000);	
		
		List<WebElement>list=driver.findElements(By.tagName("input"));
		for(WebElement box : list) {
			box.sendKeys("hello");
			Thread.sleep(1999);
		}
		
//		Thread.sleep(1000);
//		//With iterator
//		Iterator<WebElement> it= list.iterator();
//		while(it.hasNext()) {
//			WebElement web=it.next();
//			web.sendKeys("hello");
//		}
//		//With Regular for loop
//		for(int i=0;i<list.size();i++) {
//			list.get(i).sendKeys("hello");
//		}
		Thread.sleep(5000);
		driver.quit();
		
	}
}
