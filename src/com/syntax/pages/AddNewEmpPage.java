package com.syntax.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.CommonMethods;

public class AddNewEmpPage extends CommonMethods{
	
	public By pimLink = By.linkText("PIM");
	public By addEmployeeLink = By.linkText("Add Employee");
//	public WebElement pim = driver.findElement(By.linkText("PIM"));
//	public WebElement addEmpList = driver.findElement(By.linkText("Add Employee"));
//	
	public By firstName=By.id("firstName");
	public By lastName=By.id("lastName");
	
	public By empId=By.id("employeeId");
	public By file=By.id("photofile");
	public By createDetails=By.id("chkLogin");
	public By saveBtn=By.id("btnSave");
	
	public By getElement(String idName) {
		By idElement=By.id(idName);
		return idElement;
	}
	
}
