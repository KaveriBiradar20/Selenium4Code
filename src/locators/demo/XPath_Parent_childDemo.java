package locators.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath_Parent_childDemo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
		List<WebElement> list=driver.findElements(By.xpath("//div[@class='list-group']//a"));
		//total elements present are
		System.out.println("Total elements are :" +list.size());
		
		//iterate links
		for(WebElement i:list)
		{
			System.out.println(i.getText());
		}
		
		

	}

}
