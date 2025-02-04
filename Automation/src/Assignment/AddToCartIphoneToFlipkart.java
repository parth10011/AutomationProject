package Assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCartIphoneToFlipkart 
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.flipkart.com/");
//		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input[name='q']")).sendKeys("Iphone",Keys.ENTER);
//		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[text()='Apple iPhone 15 (Black, 128 GB)']")).click();
//		Thread.sleep(2000);
		
		String parentId = driver.getWindowHandle();
		System.out.println("Parent Window session Id is : "+parentId);
		
		Set<String> AllId = driver.getWindowHandles();
		for(String id:AllId)
		{
			driver.switchTo().window(id);
		}
		
		
		driver.findElement(By.xpath("//button[@class='QqFHMw vslbG+ In9uk2']")).click();
	}
	
}
