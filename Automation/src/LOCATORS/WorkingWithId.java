package LOCATORS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithId 
{

	public static void main(String[] args)
	{
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		WebElement usernameTextField=driver.findElement(By.id("email"));
		usernameTextField.sendKeys("9833741103");
		
		
	}
	
}
