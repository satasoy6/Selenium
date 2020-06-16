package SelfStudy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.drivers;

public class TC11 extends drivers{

	public static String url="http://amazon.com/";
	public static void main(String[] args) {
		
		drivers("chrome");
		
		driver.get(url);
		WebElement dropDown=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		Select select=new Select(dropDown);
		List<WebElement>depList=select.getOptions();
		for(WebElement selection:depList) {
			String ddText=selection.getText();
			System.out.println(ddText);
			if(ddText.equals("Books")) {
				System.out.println();
			}
		}
		System.out.println("Size::"+depList.size());
		select.selectByValue("search-alias=mobile-apps");
		
		
	}
}
