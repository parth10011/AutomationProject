package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class netflix 
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.netflix.com");
		driver.findElement(By.cssSelector("a[id='signIn']")).click();
		
		for(int i=0 ; i<5 ; i++)
		{
		driver.findElement(By.cssSelector("input[autocomplete='email']")).sendKeys("random@random.ra");
		driver.findElement(By.cssSelector("input[autocomplete='password'")).sendKeys("daddydarth@1323");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input[autocomplete='email']")).clear();
		driver.findElement(By.cssSelector("input[autocomplete='password'")).clear();
		Thread.sleep(2000);
		}
	}
	
}
