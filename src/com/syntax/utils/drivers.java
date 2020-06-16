package com.syntax.utils;

	import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;
	
	public class drivers {
		
		public static WebDriver driver;
		
		public static void 	drivers(String browser){
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
				 driver = new ChromeDriver ();
			} else if ( browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "drivers/geckodriver");
				 driver = new FirefoxDriver();
			
				 driver.manage().window().maximize();
					driver.manage().timeouts().implicitlyWait(Constants.IMPLICIT_WAIT_TIME, TimeUnit.SECONDS);
					driver.get(ConfigsReader.getProperty("url"));
					System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
					driver.manage().deleteAllCookies();
			
			}
			
			
			
}
		
	}
