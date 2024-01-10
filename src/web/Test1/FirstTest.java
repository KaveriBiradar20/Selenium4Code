package web.Test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTest {

	public static void main(String[] args)
	{
		System.out.println("Launching Chrome Driver");
		WebDriver driver=new ChromeDriver();
		System.out.println("Launching the Firefox Browser");
		WebDriver driver1=new FirefoxDriver();
		System.out.println("Launching Edge Browser");
		WebDriver driver2=new EdgeDriver();
		

	}

}
