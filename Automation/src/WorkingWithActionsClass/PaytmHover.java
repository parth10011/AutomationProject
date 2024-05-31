package WorkingWithActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PaytmHover 
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://paytm.com/");
		Thread.sleep(3000);
		
		Actions a = new Actions(driver);
		
		WebElement mouseHover = driver.findElement(By.xpath("//a[text()='Paytm for Consumer']"));
				
		a.moveToElement(mouseHover).perform();
		Thread.sleep(2000);
		
		a.moveToElement(driver.findElement(By.linkText("Payments"))).perform();
		Thread.sleep(2000);
		
		a.click(driver.findElement(By.linkText("Online Payments"))).perform();
		
	}
	
}
