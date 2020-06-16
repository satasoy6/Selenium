package com.syntax.class07;

import org.openqa.selenium.By;

import com.syntax.utils.drivers;

public class Recap extends drivers{
	
	public static void main(String[] args) {
		
		/*How do you know there is an inner frame?
		 * Search for iframe in the console, find the iframe and look for another iframe tag inside that tag
		 */
		
		drivers("chrome");
		driver.manage().window().fullscreen();
		
		/*Implicit wait is kind of global wait and it will wait for each and every element
		 * It waits on for element to be found, meaning it will work for findElement and findElements
		 * methods only. As soon as it is found, the remaining time will be ignored
		 */
		
	
	
	
	
	
	}

}
