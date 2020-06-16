package com.syntax.class07;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.FluentWait;

import com.syntax.utils.drivers;

public class waitDemo extends drivers{

	public static void main(String[] args) {
		
		drivers("chrome");
		driver.get("http://uitestpractice.com/Students/Contact");
		boolean isHomeDis=driver.findElement(By.xpath("//a{@href='./index.html/']")).isDisplayed();
		System.out.println("Is home link displayed?"+isHomeDis);
		
		driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);//anyone who uses driver,wait
		driver.findElement(By.linkText("This is AJax link text")).click();
		
		String text=driver.findElement(By.className("ContactUs")).getText();
		System.out.println(text);
	
		
		//Fluent Wait
		
		FluentWait wait = new FluentWait(driver);
		
		wait.withTimeout(Duration.ofSeconds(30));
		wait.pollingEvery(Duration.ofSeconds(1));
		wait.ignoring(NoSuchElementException.class);
	
	}
}
