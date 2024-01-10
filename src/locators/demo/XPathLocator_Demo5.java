package locators.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathLocator_Demo5 {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.findElement(By.xpath("//textarea[@type='search']")).click();
	

	}

}
