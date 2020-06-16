package com.syntax.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.drivers;

public class TC1 extends drivers{

	/*TC 1: JavaScript alert text verification
Open chrome browser
Go to “http://jiravm.centralus.cloudapp.azure.com:8081/index.html”
Click on “Alerts & Modals” links
Click on “Javascript Alerts” links
Click on button in “Java Script Alert Box” section
Verify alert box with text “I am an alert box!” is present
Click on button in “Java Script Confirm Box” section
Verify alert box with text “Press a button!” is present
Click on button in “Java Script Alert Box” section
Enter text in the alert box
Quit browser
	 * 
	 */
	public static void main(String[] args) throws InterruptedException {
		
		drivers("chrome");
		driver.get("http://jiravm.centralus.cloudapp.azure.com:8081/index.html");
		driver.manage().window().fullscreen();
		driver.findElement(By.linkText("Alerts & Modals")).click();
		driver.findElement(By.xpath("//ul[@class='dropdown-menu']//a[contains(text(),'Javascript Alerts')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
		Alert alertBox=driver.switchTo().alert();
		String text= alertBox.getText();
		Thread.sleep(2000);
		if(text.equals("I am an alert box!")) {
			System.out.println("Alert text is correct");
		}else {
			System.err.println("Alert text is NOT correct");
		}
		alertBox.accept();
		//Click on java Script Confirm Box
		driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg'][contains(text(),'Click me!')]")).click();
		Alert confirmAlert=driver.switchTo().alert();
		String confirmText=confirmAlert.getText();
		if(confirmText.equals("Press a button!")){
			System.out.println("Confirm box text is correct");
		}else {
			System.err.println("Confirm box text is NOT correct");
		}
		confirmAlert.dismiss();
		driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']")).click();
		Alert promptAlert=driver.switchTo().alert();
		
		Thread.sleep(3000);
		String myName="Seyma";
		promptAlert.sendKeys(myName);
		promptAlert.accept();
		if(promptAlert.equals(myName)) {
			System.out.println("Name sent successfully");
		}else {
			System.err.println("Name was NOT sent");
		}
			
		

		
		Thread.sleep(4000);
		driver.quit();
		
		
		
		
		
		
		
		
		
	}
}
