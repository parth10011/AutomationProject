package popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingPopUpUsingRobotClass 
{

	public static void main(String[] args) throws InterruptedException, AWTException 
	{
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("div[data-val='exp']")).click();
		Thread.sleep(2000);
		
		StringSelection ss = new StringSelection("C:\\Users\\parth\\OneDrive\\Desktop\\DTU\\ICGMS\\Screenshot for review.png"); 
      Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
      
      WebElement FileUpload = driver.findElement(By.xpath("//input[@type='file']"));
      Thread.sleep(2000);	
      FileUpload.click();
      Thread.sleep(2000);
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
//		FileUpload.sendKeys("C:\\Users\\parth\\OneDrive\\Desktop\\Jashith Sahota CV.pdf");
		
	}
	
}
