package automation.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CRMApplicationLogin {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		//CRM Application 
		driver.get("https://automationplayground.com/crm/");
		//Sign-In Action
		driver.findElement(By.id("SignIn")).click();
		driver.findElement(By.id("email-id")).sendKeys("kaveribiradar178@gmail.com");
		driver.findElement(By.name("password-name")).sendKeys("test@123");
		//Selecting checkbox
		driver.findElement(By.id("remember")).click();
		driver.findElement(By.id("submit-id")).click();
		//Signout Action
		driver.findElement(By.className("nav-link")).click();
		//driver.findElement(By.cssSelector("a.nav-link")).click();
		
		

	}

}
