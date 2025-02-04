package Mock;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YoutubeAuto 
{

	public static int you () throws InterruptedException
	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.youtube.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input[name='search_query']")).sendKeys("dhruv rathi");
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("button[id='search-icon-legacy']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//a[@class='channel-link yt-simple-endpoint style-scope ytd-channel-renderer'])[1]")).click();
		
		driver.findElement(By.xpath("(//button[@class='ytp-mute-button ytp-button'])[2]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[text()='Videos']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[@class='yt-simple-endpoint focus-on-expand style-scope ytd-rich-grid-media'])[1]")).click();
		return 0;
	
		
	}
	public static void main(String[] args) throws InterruptedException 
	{
		
		you();
		
	}
	
		
		

	
}
