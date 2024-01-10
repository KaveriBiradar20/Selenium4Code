package web.Test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

	public static void main(String[] args)    
	{
		//Create Driver Session
		WebDriver driver=new ChromeDriver();
		
		//Open Application-get(url)
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		String title=driver.getTitle();
		System.out.println("Title is"+ title);
		//to get current URL
		String curl= driver.getCurrentUrl();
		System.out.println("Current URL is "+ curl);
		String psrc=driver.getPageSource();	
		System.out.println(psrc);
		
		//to close browser
		driver.quit();
		
	}

}
