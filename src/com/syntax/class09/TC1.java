package com.syntax.class09;

import com.syntax.utils.drivers;

public class TC1 extends drivers{

	public static void main(String[] args) {
		
//		TC 1: Calendar headers and rows verification
//		Open chrome browser
//		Go to “https://www.aa.com/homePage.do”
//		Enter From and To
//		Select departure as July 14 of 2020
//		Select arrival as November 8 of 2020
//		Close browser
//		Depart Month Year Xpath: "//div[contains(@class, 'ui-corner-left')]/div"
//		Depart Month Days Xpath: //div[contains(@class, 'ui-corner-left')]/following-sibling::table/tbody/tr/td
//		Next Button Xpath: //a[@title='Next']
//		Return Month Xpath: //span[@class='ui-datepicker-month']
//		Return Days Xpath: //table[@class='ui-datepicker-calendar']/tbody/tr/td
//		You can put the logic the way you want.

		drivers("chrome");
		driver.get("https://www.aa.com/homePage.do");
		
		
	}
}
