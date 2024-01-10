package web.Test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTitleValidation {

	public static void main(String[] args) 
	{
		//Create Driver Session
		WebDriver driver =new ChromeDriver();
		//open goggle application in Browser
		driver.get("https://www.google.com");
		
		String actTitle=driver.getTitle();
		System.out.println("Title is "+ actTitle);
		
		if(actTitle.equalsIgnoreCase("google"))
		{
			System.out.println("Test pass ..title matches");
		}
		else
		{
			System.out.println("Test fail...Title mismatches");
		}
		
		
			
		
		//driver.close();
		driver.quit();
		
	}	

	}


