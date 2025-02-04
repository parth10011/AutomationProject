package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginActiTimeAndDeleteCustomer 
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("http://parthdellg15/login.do");
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("admin");
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
		
		driver.findElement(By.cssSelector("a[id='loginButton']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("a[href='/tasks/otasklist.do']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("a[href='/project/customers_projects.do']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[contains(text(),'All')]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("input[value='Delete Selected']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("input[id='deleteButton']")).click();
		
		driver.close();
	}
	
}
