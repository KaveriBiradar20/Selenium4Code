package locators.demo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName_LocatorDemo3 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//Number of inuput tag elements
		List<WebElement> textbox=driver.findElements(By.tagName("input"));
		
		System.out.println("Total elements "+ textbox.size());
		
		
		//number of images
		
		int count= driver.findElements(By.tagName("img")).size();
		System.out.println("Number of images are " + count);
		
		
	    //number of links
		String exp="https://www.youtube.com/c/OrangeHRMInc";
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		System.out.println("Total Links are "+ allLinks.size());
		
		
		
		for(WebElement e:allLinks)
		{
			
			System.out.println(e.getAttribute("href"));
			System.out.println(e.getText());
			if(e.getAttribute("href").contains(exp))
                {
				  System.out.println("Link found and test passed");
                   e.click();
                   break; 
                }
			
		}
		
		
		
		//driver.quit();
		
		
		

	}

}
