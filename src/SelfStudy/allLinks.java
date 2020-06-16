package SelfStudy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class allLinks {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.costco.com/");
		
		List<WebElement> allLink=driver.findElements(By.tagName("a"));//find elements using tag name
		
		System.out.println("Size of all links on costco::"+allLink.size());
		
		int count=0;
		for(WebElement link:allLink) {
			String text=link.getText();
			if(!text.isEmpty()) {
				System.out.println(text);
				count++;
			}
		}
		System.out.println("Total number of link with text is ::"+count);
		
		Thread.sleep(1800);
		
		driver.quit();
	}
}
