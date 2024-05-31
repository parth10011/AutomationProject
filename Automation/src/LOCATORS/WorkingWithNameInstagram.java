package LOCATORS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithNameInstagram 
{

	public static void main(String[] args) 
	{
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		
		WebElement usernameTextField=driver.findElement(By.name("username"));
		usernameTextField.sendKeys("9833741103");
		
		WebElement passwordTextField=driver.findElement(By.name("password"));
		passwordTextField.sendKeys("Aman@123");
		
//		 clicking on search button
		WebElement searchButton=driver.findElement(By.className("_acap"));
		searchButton.click();
		
	}
	
}
