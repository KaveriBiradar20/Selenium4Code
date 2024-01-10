package locators.demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath_Methods_Demo {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
		driver.get("https://www.amazon.in/");
		
		//text()-Amazon app BestSeller Link
		driver.findElement(By.xpath("(//a[text()='Best Sellers'])[1]")).click();
		System.out.println("Best Seller title "+ driver.getTitle());
		
		WebElement ele=driver.findElement(By.xpath("(//span[@class='a-carousel-page-count'])[1]"));
		
		System.out.println("Text of page count is "+ele.getText());
		
		//from the best Seller page of amazon app user wants to click on cart
		
		//normalize-space()
		
		driver.findElement(By.xpath("//span[normalize-space()='Cart']")).click();
		
		
		String carttext=driver.findElement(By.xpath("(//h2)[1]")).getText();
		System.out.println("Cart Text is "+carttext);
		
		//contains()---->from cart search for bags
		
		WebElement search=driver.findElement(By.xpath("//input[contains(@id,'searchtext')]"));
	    //search.sendKeys("bags",Keys.ENTER);
		//or you can write code in this way also
		search.sendKeys("bags");
		search.submit();
		
		//starts-with()--->
		driver.findElement(By.xpath("//input[starts-with(@id,'twotab')]")).clear();
		
		driver.findElement(By.xpath("//input[starts-with(@id,'twotab')]")).sendKeys("mobile",Keys.ENTER);
	

	}

}
