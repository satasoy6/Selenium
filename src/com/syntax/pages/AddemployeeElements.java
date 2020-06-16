package com.syntax.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.syntax.utils.BaseClass;

public class AddemployeeElements {

	@FindBy(xpath="//a[@id='menu_pim_viewPimModule']")
	public WebElement pim;
	
	@FindBy(id = "menu_pim_addEmployee")
	public WebElement addEmpList;
	
	@FindBy(id = "firstName")
	public WebElement firstName;
	
	@FindBy(id = "lastName")
	public WebElement lastName;
	
	@FindBy(id = "employeeId")
	public WebElement empId;
	
	@FindBy(id = "btnSave")
	public WebElement saveEmp;
	
	public AddemployeeElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
}
	

