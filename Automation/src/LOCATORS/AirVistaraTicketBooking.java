package LOCATORS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AirVistaraTicketBooking 
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.airvistara.com/in/en");
		Thread.sleep(4000);
		
		driver.findElement(By.cssSelector("input[id='onewaytrip']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("button[id='acceptAllBtn']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input[name='flightSearchFrom']")).sendKeys("Delhi(DEL)");
		Thread.sleep(2000);

		
		driver.findElement(By.cssSelector("input[name='flightSearchTo']")).sendKeys("Mumbai(BOM)");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input[name=\'depart\']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("div[monthname='Jun']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("a[data-date='27']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input[id='passengers']")).click();
	
		
//		driver.findElement(By.cssSelector("input[id='adult']")).sendKeys("2");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//button[text()='Done'])[2]")).click();
		Thread.sleep(5000);

		
		driver.findElement(By.cssSelector("button[id='book-flight-widget']")).click();
		
	}
	
}
