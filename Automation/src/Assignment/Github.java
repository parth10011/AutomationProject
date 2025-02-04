package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Github 
{

	public static void main (String[] args)
		{

			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://github.com/new");
			
			driver.findElement(By.xpath("//input[@name='login']")).sendKeys("groverparth19");
			driver.findElement(By.name("password")).sendKeys("1234567890");
	
		}
}