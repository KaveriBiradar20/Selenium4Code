package web.Test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		System.out.println(driver.getTitle());
		
		driver.navigate().to("https://www.facebook.com");
		 
		System.out.println(driver.getTitle());
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		driver.navigate().forward();
		
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		
		

	}

}
