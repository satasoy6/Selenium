package SelfStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chrome {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://facebook.com");//url in the browser
//		driver.findElement(By.className(className))
//		driver.findElement(By.id("email")).sendKeys("This is my first code");
//		driver.findElement(By.name("pass")).sendKeys("123456");
//		driver.findElement(By.linkText("Forgot account?")).click();
		
		driver.findElement(By.cssSelector("#email")).sendKeys("emailaddress");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id='login_form']/table/tbody/tr[3]/td[2]/div/a")).click();
		
	}
	
	
}
