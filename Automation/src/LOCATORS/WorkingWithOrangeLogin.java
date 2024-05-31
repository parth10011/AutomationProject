package LOCATORS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithOrangeLogin 
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(5000);
		
		WebElement username = driver.findElement(By.cssSelector("input[name='username']"));
		username.sendKeys("Admin");
		
		WebElement password = driver.findElement(By.cssSelector("input[name='password']"));
		password.sendKeys("admin123");
		
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
	}
	
}
