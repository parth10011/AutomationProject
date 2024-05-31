package webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithGetPageSource
{

	public static void main(String[] args) 
	{
	
				//to launch chrome browser
				WebDriver driver= new ChromeDriver();
				
				// to maximize window
				driver.manage().window().maximize();
				
				//to launch web application
				driver.get("https://www.swiggy.com");
				
				//to get page source of web page
				String source = driver.getPageSource();
				System.out.println(source);
				
				// to close web page
				driver.close();
				
				
		
	}
	
}
