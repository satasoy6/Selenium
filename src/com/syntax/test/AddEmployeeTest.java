package com.syntax.test;

import org.openqa.selenium.By;

import com.syntax.pages.AddNewEmpPage;
import com.syntax.pages.AddemployeeElements;
import com.syntax.pages.LoginPage;
import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;

public class AddEmployeeTest extends CommonMethods{

	public static void main(String[] args) {
		
		setUp();
		//Login page

		LoginPage login=new LoginPage();
		sendText(login.username, ConfigsReader.getProperty("username"));
		
		//sending password
		
		sendText(login.password,ConfigsReader.getProperty("password"));
		login.loginBtn.click();
		//Add Employee page
		wait(2);
		AddNewEmpPage emp=new AddNewEmpPage();
		wait(2);
		click(driver.findElement(emp.pimLink));
	
		wait(2);
		click(driver.findElement(emp.addEmployeeLink));
	
		wait(2);
		
//		sendText(emp.firstName,ConfigsReader.getProperty("firstName"));
//		sendText(emp.firstName,ConfigsReader.getProperty("firstName"));
//		sendText(emp.lastName,ConfigsReader.getProperty("lastName"));
//		sendText(emp.empId,ConfigsReader.getProperty("empId"));

//		waitAndClick(emp.saveBtn);
		
		wait(3);
		driver.quit();
	}
}
