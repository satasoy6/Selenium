package SelfStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.syntax.utils.BaseClass;

public class actionsDemo extends BaseClass{

	public static void main(String[] args) {
		//url=amazon.com
		setUp();
		
		Actions a=new Actions(driver);//You need to pass the driver object
		//After performing your action, you need to build that entire action
		WebElement move=driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
		//WHEN YOU SAY build() ->it's ready, not yet executed, Once you say perform(); it hovers over
		
		
		//Holding the Shift to type Capital letters. When there is action there is build and perfom needed to be written to work properly
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("Hello").doubleClick().build().perform();
		//How to select the word you type in the search box
		//.sendKeys("Hello").doubleClick().build().perform();

		
		a.moveToElement(move).contextClick().build().perform();//right click
		
		
		
	}
}
