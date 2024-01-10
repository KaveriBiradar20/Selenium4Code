package locators.demo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IteratingListOfElementFromGoogleSearch {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("testNG ");
		
		List<WebElement> list=driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li"));
		System.out.println("Total elements are: "+ list.size());
		
//		for(WebElement i:list)
//		{
//			System.out.println(i.getText());
//		
//		}
		
		//if you want to click on serched(testNg) name
		for(WebElement i:list)
			{
			System.out.println(i.getText());
			if(i.getText().contains("testng"))
			{
				i.click();
				break;
			}
			
		
			}
		
		

	}

}
