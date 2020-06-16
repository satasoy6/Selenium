package SelfStudy;

import org.openqa.selenium.By;

import com.syntax.utils.drivers;

public class facebookxpath extends drivers{

	public static void main(String[] args) {
	
		drivers("chrome");
		String url="https://www.facebook.com/";
		driver.get(url);
		//tagname[@attribute='value]
//		driver.findElement(By.xpath("//*[@type='email")).sendKeys("myOwn xpath");
//		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("hello");
//		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		
//		//tagname[attribute='value']-->CSS		
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("myOwncss");
		driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("myCSS");
		driver.findElement(By.cssSelector("[value='Log In']")).click();
	
		
		
}
}
