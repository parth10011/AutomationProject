package Assignment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ICGMS_PreInspection_InitiateNewProcess implements details
{

	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		
		
		WebDriver driver = new ChromeDriver();
		Dimension d = new Dimension (375 , 812);
		driver.manage().window().maximize();;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		
		
		driver.get(url);
		
		//Login
		driver.findElement(By.cssSelector("input[formcontrolname='email']")).sendKeys(SuperAdmin);
		driver.findElement(By.cssSelector("input[aria-label='Password']")).sendKeys(Pass);	
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
		Thread.sleep(500);
		
		//Toaster Popup Click
		driver.findElement(By.xpath("//div[@style='opacity: 1;']")).click();
		
		//Initiate Claim
		driver.findElement(By.xpath("//a[@href='/claim']")).click();
		
		
		//Select Product
		WebElement Product = driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div[1]/div/app-claim-intimation/div[1]/div/div/div[2]/div/div/select"));

		
				Select s1 = new Select(Product);
				s1.selectByValue("20");
				Thread.sleep(200);
				
		//Select Insurer	
		WebElement Insurer = driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div[1]/div/app-claim-intimation/div[1]/div/div/div[3]/div/div/select"));
			
				Select s2 = new Select(Insurer);
				s2.selectByValue("30");			
			
				
			//Fill the required details	
			driver.findElement(By.cssSelector("input[formcontrolname='customer_email']")).sendKeys(SuperAdmin);
			driver.findElement(By.cssSelector("input[formcontrolname='customer_mobile_no']")).sendKeys("9651424155");
			driver.findElement(By.xpath("//input[@placeholder='Enter Vehicle Number']")).sendKeys("HR09AG8654");
			driver.findElement(By.xpath("//input[@placeholder='Enter State']")).sendKeys("Delhi");
			driver.findElement(By.xpath("//input[@placeholder='Enter Rreference number']")).sendKeys("POLOOKK");			
			driver.findElement(By.xpath("//input[@placeholder='Enter Branch Name']")).sendKeys("CP Place");
			
			//Toaster Popup Click
			driver.findElement(By.xpath("//div[@style='opacity: 1;']")).click();
			
			System.out.println("Details Filled Successfully");
//			WebElement Submit = driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div[1]/div/app-claim-intimation/div[2]/form/div[2]/button[1]"));
//			Submit.click();
			
			Thread.sleep(500);
			driver.findElement(By.xpath("//a[@href='/claim-details']")).click();
			Thread.sleep(1000);
			
			//Logout
			driver.findElement(By.xpath("//a[@data-toggle='dropdown']")).click();
			driver.findElement(By.xpath("//a[@style='cursor: pointer;']")).click();
			Thread.sleep(500);
			
			//Toaster Popup Click
			driver.findElement(By.xpath("//div[@style='opacity: 1;']")).click();
			
		
	}
	
} 