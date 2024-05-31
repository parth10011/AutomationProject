package LOCATORS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithName 
{

	public static void main(String[] args) 
	{
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		//search books
		WebElement searchTextField = driver.findElement(By.tagName("input"));
		searchTextField.sendKeys("Books");
		
		WebElement searchButton=driver.findElement(By.className("search-box-button"));
		searchButton.click();
		
		
	}
	
}
