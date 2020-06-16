package com.syntax.SeleniumReview02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.syntax.utils.BaseClass;

public class ExplicitWaitReview extends BaseClass {

	public static void main(String[] args) {
//url=https://www.seleniumeasy.com/test/jquery-download-progress-bar-demo.html
		setUp();
		WebElement startDownloadButton = driver.findElement(By.cssSelector("button[id='downloadButton']"));
		startDownloadButton.click();

		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Complete']")));
		WebElement completeStatus = driver.findElement(By.xpath("//div[text()='Close']"));

		String competeStatusText = completeStatus.getText();
		System.out.println(competeStatusText);
		WebElement closeButton = driver.findElement(By.xpath("//button[text() = 'Close']"));
		wait.until(ExpectedConditions.elementToBeClickable(closeButton));
		closeButton.click();

	}

}
