package SelfStudy;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.drivers;

public class WebTablesTurkish extends drivers {

	public static void main(String[] args) {
		
		drivers("chrome");
		driver.get("https://www.seleniumeasy.com/test/table-search-filter-demo.html");
		
		//identifying the number of rows and columns
		//rows
		List<WebElement> rows=driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr"));
		System.out.println(rows.size());//7

		Iterator<WebElement> it=rows.iterator();
		while(it.hasNext()) {
			String text=it.next().getText();
		}
		
		//columns
		List<WebElement> cols=driver.findElements(By.xpath("//table[@id='task-table']/thead/tr/th"));
		System.out.println("Number of columns "+cols.size());//7
		
		
		
		
	}
}
