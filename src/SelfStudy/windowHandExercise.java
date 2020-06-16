package SelfStudy;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import com.syntax.utils.BaseClass;

public class windowHandExercise extends BaseClass{

	public static void main(String[] args){
		//url=https://the-internet.herokuapp.com/
		setUp();//It is a method for system.setProperty and Web driver and property class all together
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Multiple Windows")).click();
		
		driver.findElement(By.cssSelector("a[href*='window']")).click();
		
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> it=windows.iterator();
		String parentWindow=it.next();
		String childWindow=it.next();
		driver.switchTo().window(childWindow);
		System.out.println("Child window title is ::"+driver.getTitle());
		System.out.println(driver.findElement(By.xpath("//div/h3")).getText());
		
		driver.switchTo().window(parentWindow);
		System.out.println("Parent window title is ::"+driver.getTitle());
		System.out.println(driver.findElement(By.xpath("//div/h3")).getText());
		System.out.println(driver.findElement(By.xpath("//div[@id='content']/div/h3")).getText());
		
	}
	
	
}
