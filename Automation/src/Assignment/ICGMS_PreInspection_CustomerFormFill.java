package Assignment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ICGMS_PreInspection_CustomerFormFill implements details
{

	public static void main(String[] args) throws InterruptedException, AWTException 
	{
	
		WebDriver driver = new ChromeDriver();
		Dimension d = new Dimension (375 , 812);
		driver.manage().window().maximize();;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get(url);
		driver.findElement(By.cssSelector("input[formcontrolname='email']")).sendKeys(Cust1);
		
		driver.findElement(By.cssSelector("input[aria-label='Password']")).sendKeys(Pass);
		
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div[1]/div/app-customer-claim-list/div/div/div[2]/table/tbody/tr[4]/td[7]/button")).click();
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//div[@style='opacity: 1;']")).click();
		
		driver.manage().window().setSize(d);
		
		Robot r = new Robot();
   
    	Thread.sleep(1000);
    	
    	WebElement label = driver.findElement(By.xpath("//label[@for='front_view_selfie']"));
    	System.out.println("Upload Label Detected Successfully");
    	
    	label.click();
    	System.out.println("Upload Label Clicked Successfully");
    	
    	Thread.sleep(1000);
    	
    	r.keyPress(KeyEvent.VK_ESCAPE);
    	r.keyRelease(KeyEvent.VK_ESCAPE);
    	
    	Thread.sleep(1000);    	
        
    	WebElement ImageUpload = driver.findElement(By.xpath("/html/body/app-root/app-full-layout/div/div[1]/div/app-claim-workflow/div/div/div/app-customer-claim-form/div[1]/div[2]/form/div[8]/div/div[1]/div/div[1]/input"));
    	
    	Thread.sleep(1000);

    	ImageUpload.sendKeys("C:\\Users\\parth\\Downloads\\Screenshot (44).png");
    	
    	driver.findElement(By.xpath("//a[@data-toggle='dropdown']")).click();
		driver.findElement(By.xpath("//a[@style='cursor: pointer;']")).click();
		
	}
	
}
