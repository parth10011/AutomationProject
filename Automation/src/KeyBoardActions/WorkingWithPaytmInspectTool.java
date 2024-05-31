package KeyBoardActions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWithPaytmInspectTool 
{
	public static void main(String[] args) throws AWTException 
	{
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://paytm.com/");
		
		Actions a = new Actions(driver);
		
		a.contextClick(driver.findElement(By.className("GkeQS"))).perform();
		
		Robot r = new Robot();
		
		for(int i=0 ; i>12 ; i++)
		{
			
			
			
		}
		
		
		
	}
	
}
