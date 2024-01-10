package locators.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo2 {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		//login with Tutorialsninja Appln
		driver.findElement(By.id("input-email")).sendKeys("test@gmail.com");
		driver.findElement(By.name("password")).sendKeys("test123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
		
		

	}

}
