package locators.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector_LocatorDemo {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://automationplayground.com/crm/login.html");
		//tagName with id
		driver.findElement(By.cssSelector("input#email-id")).sendKeys("test1@gmail.com");
		
		//tagname with attribute
		
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("test123");
		
		driver.findElement(By.cssSelector("input[type='checkbox']")).click();
		
		//tagname with className
		
		//driver.findElement(By.cssSelector("button.btn.btn-default.btn-primary")).click();
		
		//tagName.ClassName and attibute
		
		driver.findElement(By.cssSelector("button.btn[type='submit']")).click();
		
		
		

	}

}
