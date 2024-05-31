package webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.sdk.metrics.internal.exemplar.AlwaysOffFilter;

public class WorkingWithGetMethod 
{

	public static void main(String[] args) 
	{
		//to launch chrome browser
		WebDriver driver= new ChromeDriver();
		
		// to maximize window
		driver.manage().window().maximize();
		
		//to launch web application
		driver.get("https://www.amazon.in");
		
		//to use Title
		String actual_title = driver.getTitle();
		String expected_title = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		
		if(actual_title.equals(expected_title))
		{
			
			System.out.println("Title is correct ");
			
		}
		else
		{
			System.out.println("Title is incorrect  ");
		}
		System.out.println("Title is : "+actual_title);
		
		// to get url of web page
		String url =driver.getCurrentUrl();
		System.out.print("Get URL : "+url);
		
		// to close web page
		driver.close();
		
		
	}
	
}
