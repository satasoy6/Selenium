package SelfStudy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.syntax.utils.drivers;

public class waitDemo extends drivers{

	public static void main(String[] args) throws InterruptedException {
		
		
		drivers("chrome");
		driver.get("http://uitestpractice.com/Students/Contact");
		driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		//Thread.sleep(15000);
		driver.findElement(By.xpath("//a[contains(text(),'This is a Ajax link')]")).click();
		
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//a[contains(text(),'This is a Ajax link')]")));
		
			}
}
