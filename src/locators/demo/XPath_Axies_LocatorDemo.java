package locators.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath_Axies_LocatorDemo {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://automationplayground.com/crm/customers.html?email-name=test%40gmail.com&password-name=test123&submit-name=");
		
		//get the ancestors from jhon
		
//		WebElement ele=driver.findElement(By.xpath("//td[text()='john']//ancestor::tbody"));
//		System.out.println("Text of element "+ele.getText());
		
		System.out.println("*********Get ancestor from jhon**********");
		WebElement ele1=driver.findElement(By.xpath("//td[text()='John']//ancestor::tbody"));
		System.out.println(ele1.getText());
		
		System.out.println("**********get parents from jhon************");
		
		WebElement ele2=driver.findElement(By.xpath("//td[text()='John']//parent::tr"));
		System.out.println(ele2.getText());
		
		System.out.println("******get child from jhon*******");
	    List<WebElement> ele3=driver.findElements(By.xpath("(//tbody//tr)[4]//child::td"));
	    System.out.println("total child elements are "+ ele3.size());
	    for(WebElement i:ele3)
	    {
	    	System.out.println(i.getText());
	    }
	    
	    System.out.println("get all preceding or previous elements of jhon");
	    List<WebElement> preData=driver.findElements(By.xpath("//td[text()='John']//preceding::td"));
		System.out.println("Total Match: "+preData.size());
		
		System.out.println("****get the preceding sibling of John********");
		String text1=driver.findElement(By.xpath("//td[text()='John']//preceding-sibling::td")).getText();
		System.out.println("Preceding sibling for John is: "+text1);
		
		
		
		System.out.println("****get the all elements after the John********");

		List<WebElement> follData=driver.findElements(By.xpath("//td[text()='John']//following::td"));//13
		System.out.println("Total Match: "+follData.size());
		
		System.out.println("****get the following sibling of John********");
		
		List<WebElement> list=driver.findElements(By.xpath("//td[text()='John']//following-sibling::td"));
		
		System.out.println("Following siblings are: "+list.size());

		for(WebElement i: list)
		{
			System.out.println(i.getText());
		}
		
		
		
	    
	    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
