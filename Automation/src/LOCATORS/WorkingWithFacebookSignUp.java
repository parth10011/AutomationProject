package LOCATORS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithFacebookSignUp
{
	public static void main(String[] args) throws InterruptedException 
	{
	
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		
		
		WebElement SignUpButton = driver.findElement(By.className("_4jy2"));
		SignUpButton.click();
		
		Thread.sleep(3000);
		
		WebElement firstName= driver.findElement(By.name("firstname"));
		firstName.sendKeys("Raman");
		
		
		WebElement lastName= driver.findElement(By.name("lastname"));
		lastName.sendKeys("Sharma");
		
		WebElement Mob= driver.findElement(By.name("reg_email__"));
		Mob.sendKeys("fji@abc.web");
		
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("fji@abc.web");
		
		WebElement Pass= driver.findElement(By.name("reg_passwd__"));
		Pass.sendKeys("Aman#112");
		
		driver.findElement(By.cssSelector("input[value='2']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("websubmit")).click();
		
		
	}
	
	
}
