package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZomatoSocialLinkedInClick 
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.zomato.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("a[href='https://in.linkedin.com/company/zomato']")).click();
		Thread.sleep(2000);
		
		
		
		
		
	}
	
}
