package SelfStudy;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import com.syntax.utils.BaseClass;

public class windowHandling extends BaseClass{

	//How to handle window that opens in a different tab
	//How can you handle multiple windows in selenium is a 
	//Very famous interview question
	
	public static void main(String[] args) {
		
		setUp();
		
		driver.findElement(By.xpath("//a[contains(text(),'Help')]")).click();
		
		System.out.println(driver.getTitle());//Parent window title
		
		
		//Switch to the child window
		Set<String>ids=driver.getWindowHandles();//Bring out all windows open, and it throws into Id's Set
		Iterator<String>it=ids.iterator();
		String parentId=it.next();
		String childId=it.next();
		System.out.println("Parent id before switching to child "+driver.getTitle());
		driver.switchTo().window(childId);//switching to child window
		System.out.println("Child window title "+driver.getTitle());
		
		driver.switchTo().window(parentId);//going back to parent window
		System.out.println("Parent window title "+driver.getTitle());
	
	}
}
