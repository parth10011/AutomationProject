package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingOnDream11Website 
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.dream11.com");
		Thread.sleep(1000);
				
		WebElement frame1 = driver.findElement(By.cssSelector("iframe[id='send-sms-iframe']"));
		
		driver.switchTo().frame(frame1);
		
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys("8810443099");
		driver.findElement(By.cssSelector("a[class='getAppBtn']")).click();
		
	}
	
}
