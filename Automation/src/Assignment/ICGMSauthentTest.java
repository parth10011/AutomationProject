package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ICGMSauthentTest {

  @Test
  public void mainTest() throws InterruptedException {
	  WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://release.icgms.sharajman.com/");
		driver.findElement(By.cssSelector("input[formcontrolname='email']")).sendKeys("superadmnphase1@owleyes.ch\n"
				+ "");
		
		driver.findElement(By.cssSelector("input[aria-label='Password']")).sendKeys("Admin123");
		
//		for(int i=0 ; i<=100 ; i++)
		
		{driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();}
		
		driver.findElement(By.xpath("//a[@href='/claim']")).click();
		
		WebElement dpdn = driver.findElement(By.xpath("(//select[@class='form-select ng-untouched ng-pristine ng-valid'])[1]"));

//			Thread.sleep(500);
		
			Select s = new Select(dpdn);
			
				s.selectByValue("1");
				Thread.sleep(1000);
			
			WebElement dpdn2 = driver.findElement(By.xpath("//select[@class='form-select ng-untouched ng-pristine ng-valid']"));
			
				Select s2 = new Select(dpdn2);
				s2.selectByIndex(1);
			
			
			driver.findElement(By.cssSelector("input[formcontrolname='customer_email']")).sendKeys("hamjot687@mirai.re");
			driver.findElement(By.cssSelector("input[formcontrolname='customer_mobile_no']")).sendKeys("9651424155");
			driver.findElement(By.cssSelector("input[formcontrolname='policy_number']")).sendKeys("36584125");
			driver.findElement(By.xpath("(//input[@type='date'])[1]")).sendKeys("12032002");
			driver.findElement(By.xpath("(//input[@type='date'])[2]")).sendKeys("12032012");
			Thread.sleep(1000);
			
			WebElement dpdn3 = driver.findElement(By.xpath("(//select[@class='form-select cst-input ng-untouched ng-pristine ng-invalid ng-star-inserted'])[1]"));
			
				Select s3 = new Select(dpdn3);
				s3.selectByIndex(1);
			
			WebElement dpdn4 = driver.findElement(By.xpath("(//select[@class='form-select cst-input ng-untouched ng-pristine ng-invalid ng-star-inserted'])[1]"));
			
				Select s4 = new Select(dpdn4);
				s4.selectByIndex(1);
			
			WebElement dpdn5 = driver.findElement(By.xpath("//select[@class='form-control cst-input ng-untouched ng-pristine ng-invalid ng-star-inserted']"));
			
				Select s5 = new Select(dpdn5);
				s5.selectByIndex(1);
			
			driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("Name");
			driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("Black");
			driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("DL087G8654");
			driver.findElement(By.cssSelector("input[class='form-select cst-input ng-untouched ng-pristine ng-invalid ng-star-inserted']")).sendKeys("02082020");
			System.out.println("Details Filled Successfully");
			driver.findElement(By.xpath("//button[text()='Submit']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//a[@href='/claim-details']")).click();
  }
}
