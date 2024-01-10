package automation.Assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukariAppAutoTest {

	public static void main(String[] args) 
	{
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.naukri.com/");
		
		//Number of link available on page
		
		//Check whether the EXP String is available on the link
		
		String exp="https://www.naukri.com/fresher-jobs?src=gnbjobs_homepage_srch";
				
		
		List<WebElement> totallink=driver.findElements(By.tagName("a"));
		System.out.println("Total no. of links are "+ totallink.size());
		//compare whether exp string is prsent or not
		String expStr="https://www.naukri.com/fresher-jobs?src=gnbjobs_homepage_srch";
		//Iterate all links
		for(WebElement i: totallink)
		{
			System.out.println(i.getAttribute("href"));
			System.out.println(i.getText());  //if there is text written by dev for the link we will get it
		try
		{
			if(i.getAttribute("href").contains(expStr))
			{
				System.out.println("Link found..Test pass");
				break;
			}
		}
		catch(Exception e)
		{
			System.out.println("Attribyte 'href' value is null");
		}
		
		}
		
		

	}

}
