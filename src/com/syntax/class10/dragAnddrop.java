package com.syntax.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import com.syntax.utils.drivers;

public class dragAnddrop extends drivers {

	public static void main(String[] args) throws InterruptedException {

		drivers("chrome");
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));

		Actions act = new Actions(driver);
		// drag a file and drop it in the source---Longer Way---
//		act.clickAndHold(drag).moveToElement(drop).release().perform();
		Thread.sleep(2000);
//		driver.navigate().refresh();
		Thread.sleep(2000);

		act.dragAndDrop(drag, drop).perform();// act.clickAndHold(drag).moveToElement(drop).release().perform();
		// this also works

		Thread.sleep(5000);
		driver.quit();
		
		//staleElementException--->Whenever when you perform multiple actions on the same element,
		//First time when you perform the action the element gets jammed in the DOM, it gets detached from the DOM
	}
}
