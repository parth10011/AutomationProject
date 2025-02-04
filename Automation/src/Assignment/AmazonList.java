package Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonList 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Iphone" , Keys.ENTER);
		Thread.sleep(2000);
		
//		List<WebElement> list = driver.findElements(By.xpath("//span[contains(text(),'Apple iPhone')]"));
//		
//		System.out.println(list.size());
//		
//		for(WebElement s : list)
//		{
//			
//			System.out.println(s.getText());
//		}
		
//		driver.quit();		
		
		
	}

}
