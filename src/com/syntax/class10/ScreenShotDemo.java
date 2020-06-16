package com.syntax.class10;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.syntax.utils.BaseClass;
import com.syntax.utils.drivers;

public class ScreenShotDemo extends drivers {

	public static void main(String[] args) throws InterruptedException {
		
		drivers("chrome");
		driver.get("http://166.62.36.207/humanresources/symfony/web/index.php/dashboard");
//		syntax hrms login
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys(("Hum@nhrm123"));
		driver.findElement(By.className("button")).click();
		String userName="Admin";
		Thread.sleep(2000);
		String welcomeText=driver.findElement(By.className("panelTrigger")).getText();
		
		if(welcomeText.contains(userName)) {
			System.out.println("Test Pass");
		}else {
			System.out.println("Test Fail");
		}
		//How to take screenshots using selenium?
	//	step1:We can use TakeScreenshot interface to the type of TakeScreenshot
		TakesScreenshot ts=(TakesScreenshot) driver;//downcasting. it means driver and takesscreenshot has a relationship so we are able to downcast
	//	Call method getScreenshotAs adn specify output type
		File screen=ts.getScreenshotAs(OutputType.FILE);//output type of the screenshot will be file
		//When driver takes the screenshot it's being saved in the clipboard
		try {
			//copy file to the specified destination and give name and extension
			FileUtils.copyFile(screen, new File("screenshots/HRMS/AdminLogin.png"));//jpg or png for image
			//it will take a screenshot once it is passed
		}
		catch(IOException e){
			e.printStackTrace();
			
		}
		//don't forget to refresh project explorer to see the screenshot
		Thread.sleep(4000);
		driver.quit();
	
		//jpg, png
		
		
		
}
}