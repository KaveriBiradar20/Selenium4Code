package locators.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText_Locator_Demo 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://automationplayground.com/crm/");
		
		driver.findElement(By.linkText("Sign In")).click();
		
		driver.findElement(By.id("email-id")).sendKeys("test@gmail.com");
		
		driver.findElement(By.id("password")).sendKeys("test123");
		
		driver.findElement(By.id("remember")).click();
		
		driver.findElement(By.name("submit-name")).click();
		
		driver.findElement(By.partialLinkText("Out")).click();
		
		//driver.findElement(By.tagName("p")).getText();
		
		WebElement ele=driver.findElement(By.tagName("p"));
		System.out.println("Test is :"+ ele.getText());
		
		
	}

}
