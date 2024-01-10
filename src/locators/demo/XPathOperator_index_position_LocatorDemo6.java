package locators.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathOperator_index_position_LocatorDemo6 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
		
		driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("Milind");
		//and
		
		driver.findElement(By.xpath("//input[@name='lastname' and @class='form-control']")).sendKeys("Patil");
		
		driver.findElement(By.xpath("//input[@type='email' and @class='form-control']")).sendKeys("mkpatil123@gmail.com");
		//Index
		
		driver.findElement(By.xpath("(//input[@class='form-control'])[4]")).sendKeys("4582569");
		
		//Position
		
		driver.findElement(By.xpath("(//input[@class='form-control'])[position()=5]")).sendKeys("mk123");
		driver.findElement(By.xpath("//input[@name='confirm']")).sendKeys("mk123");
		
		//Click on Radio Button
		//driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
		//Get all radio buttons, and select radio button which is not selected by default
		//Thread.sleep(2000);
		List<WebElement> list=driver.findElements(By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[1]/input"));
		for(WebElement i:list)
		{
			if(!i.isSelected()) //element which is not selected do click on that
			{
				i.click();
				break;
			}
		}
		
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
		
	}

}
