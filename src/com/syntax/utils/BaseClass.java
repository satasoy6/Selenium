package com.syntax.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {

	public static String browser;
	public static WebDriver driver;
	
	public static void setUp() {//if you inherit your class to here you don't need to return.
		//if you use inheritance you can just extends BaseClass
		//Otherwise public static WebDriver, and return type will be driver;
		
		ConfigsReader.readProperties(Constants.CONFIGURATION_FILEPATH);//it is going to read our property file
		
		switch(ConfigsReader.getProperty("browser").toLowerCase()) {
		
		case "chrome":
			System.setProperty("webdriver.chrome.driver",Constants.CHROME_DRIVER_PATH);
			driver=new ChromeDriver();
			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver",Constants.GECKO_DRIVER_PATH);
			driver=new FirefoxDriver();
			break;
		default:
			throw new RuntimeException("Browser is not supported");
				
		}
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		driver.manage().deleteAllCookies();
		driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(Constants.IMPLICIT_WAIT_TIME, TimeUnit.SECONDS);
		driver.get(ConfigsReader.getProperty("url"));
//		
		
		}
	
	public static void tearDown() {
		if(driver!=null) {
			driver.quit();
		}
	}
	
	}

