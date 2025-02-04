package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class ICGMSauthent implements details
{	
	public static void main(String[] args) throws InterruptedException 
	{
		
		Dimension Mobile_View = new Dimension (375 , 812);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(url);
		driver.findElement(By.cssSelector("input[formcontrolname='email']")).sendKeys(SuperAdmin);
		
		driver.findElement(By.cssSelector("input[aria-label='Password']")).sendKeys(Pass);
		
		
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
		
		driver.findElement(By.xpath("//a[@href='/claim']")).click();
		
		driver.findElement(By.xpath("//div[@style='opacity: 1;']")).click();
		
		WebElement Product = driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div[1]/div/app-claim-intimation/div[1]/div/div/div[2]/div/div/select"));

		
				Select s1 = new Select(Product);
				s1.selectByValue("1");
				Thread.sleep(200);
			
		WebElement Insurer = driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div[1]/div/app-claim-intimation/div[1]/div/div/div[3]/div/div/select"));
			
				Select s2 = new Select(Insurer);
				s2.selectByValue("1");
				
			
			driver.findElement(By.cssSelector("input[formcontrolname='customer_email']")).sendKeys(Cust2);
			driver.findElement(By.cssSelector("input[formcontrolname='customer_mobile_no']")).sendKeys("9651424155");
			driver.findElement(By.cssSelector("input[formcontrolname='policy_number']")).sendKeys("36584125");
			driver.findElement(By.xpath("(//input[@type='date'])[1]")).sendKeys("12032024");
			driver.findElement(By.xpath("(//input[@type='date'])[2]")).sendKeys("12032025");
			driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("Name");				
			driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("Honda");
			
			
			driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("City");
			driver.findElement(By.xpath("(//input[@type='text'])[6]")).sendKeys("Sedan");
			driver.findElement(By.xpath("(//input[@type='text'])[7]")).sendKeys("Black");
			driver.findElement(By.xpath("(//input[@type='text'])[8]")).sendKeys("DL99AQ0119");
			driver.findElement(By.xpath("(//input[@type='number'])[2]")).sendKeys("2020");
			driver.findElement(By.xpath("//div[@style='opacity: 1;']")).click();
			System.out.println("Details Filled Successfully");
			
			Thread.sleep(1000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
					
			Thread.sleep(2000);
			
			WebElement submit = driver.findElement(By.xpath("/html/body/app-root/app-full-layout/div/div[1]/div/app-claim-intimation/div[2]/form/div[2]/button[1]"));
			System.out.println("XPath detected");
			Thread.sleep(1000);
//			submit.click();
			System.out.println("Submit Button Clicked Successfully");
			driver.findElement(By.xpath("//a[@href='/claim-details']")).click();
			
			// Logout
			driver.findElement(By.xpath("//a[@data-toggle='dropdown']")).click();
			driver.findElement(By.xpath("//a[@style='cursor: pointer;']")).click();
			
			driver.findElement(By.xpath("//div[@style='opacity: 1;']")).click();
			
			
			driver.findElement(By.cssSelector("input[formcontrolname='email']")).sendKeys(Cust2);
			driver.findElement(By.cssSelector("input[aria-label='Password']")).sendKeys(Pass);
			driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
			
			driver.findElement(By.xpath("//div[@style='opacity: 1;']")).click();
			
			
			WebElement view_details = driver.findElement(By.xpath("(//button[@class='btn btn-transparent btn-sm m-0 font-14 text-nowrap d-flex align-items-center gap-1'])[1]"));
			view_details.click();
			
			driver.findElement(By.xpath("//input[@placeholder='Enter Date of inward']")).sendKeys("12122024");
			driver.findElement(By.xpath("(//input[@placeholder='dd/mm/yyyy'])[3]")).sendKeys("12122024");
			driver.findElement(By.xpath("//input[@placeholder='Enter Policy No./Cover No']")).sendKeys("OLAUBERRAPIDODRIVEIN");
			driver.findElement(By.xpath("//input[@placeholder='Enter Insured Name']")).sendKeys("Rajat Dalal");
			driver.findElement(By.xpath("//textarea[@placeholder='Enter Address for Communication']")).sendKeys("Villa Rd, Delhi 110033");
			driver.findElement(By.xpath("//input[@placeholder='Enter Pincode']")).sendKeys("110033");
			driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']")).sendKeys("6534362327");
			driver.findElement(By.xpath("//input[@placeholder='Enter PAN Number']")).sendKeys("ABCTY1234D");
			driver.findElement(By.xpath("//input[@placeholder='Enter Email']")).sendKeys("abc@new.cc");
			driver.findElement(By.xpath("(//input[@placeholder='dd/mm/yyyy'])[4]")).sendKeys("12122024");
			
			driver.findElement(By.xpath("//input[@type='address_map']")).click();
//			Thread.sleep(100);
			driver.findElement(By.xpath("//button[@aria-label='Close']")).click();
			
			driver.manage().window().setSize(Mobile_View);
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//label[@for='frontimage']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='frontimage']")).sendKeys("C:\\Users\\parth\\OneDrive\\Desktop\\DTU\\ICGMS\\Status Report - Pagination.png");
			
			driver.findElement(By.xpath("//label[@for='backimage']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='backimage']")).sendKeys("C:\\Users\\parth\\OneDrive\\Desktop\\DTU\\ICGMS\\Status Report - Pagination.png");
			
			driver.findElement(By.xpath("//label[@for='topimage']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='topimage']")).sendKeys("C:\\Users\\parth\\OneDrive\\Desktop\\DTU\\ICGMS\\Status Report - Pagination.png");
			
			driver.findElement(By.xpath("//label[@for='leftimage']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='leftimage']")).sendKeys("C:\\Users\\parth\\OneDrive\\Desktop\\DTU\\ICGMS\\Status Report - Pagination.png");
			
			driver.findElement(By.xpath("//label[@for='rightimage']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='rightimage']")).sendKeys("C:\\Users\\parth\\OneDrive\\Desktop\\DTU\\ICGMS\\Status Report - Pagination.png");
			
			driver.findElement(By.xpath("//label[@for='bottomimage']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='bottomimage']")).sendKeys("C:\\Users\\parth\\OneDrive\\Desktop\\DTU\\ICGMS\\Status Report - Pagination.png");
	}
	
	
}