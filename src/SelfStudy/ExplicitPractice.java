package SelfStudy;

import org.openqa.selenium.By;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.syntax.utils.drivers;

public class ExplicitPractice extends drivers{

	public static void main(String[] args) {
		
		drivers("chrome");
		driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");
		
		driver.findElement(By.xpath("//a[contains(text(),'Click to load get data via Ajax!')]")).click();
		
		WebDriverWait w= new WebDriverWait(driver,6);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='results']")));
		System.out.println(driver.findElement(By.id("results")).getText());
		boolean text=driver.findElement(By.xpath("//div[@id='results']")).isDisplayed();
		System.out.println(text);
	}
}
