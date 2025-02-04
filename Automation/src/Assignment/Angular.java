package Assignment;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Angular 
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://test.korangle.com:4200/");
		
		
		driver.findElement(By.cssSelector("input[type='number']")).sendKeys("6135421133");
		
		driver.findElement(By.xpath("//a[text()='Submit']")).click();
		
		driver.findElement(By.cssSelector("a[routerlink='add-movie']")).click();
		
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Harry Potter");
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Movie About Wizards");
		
		WebElement date = driver.findElement(By.cssSelector("input[type='date']"));
		date.click();
		date.sendKeys(Keys.ARROW_LEFT , Keys.ARROW_LEFT ,"02032004");
		
		driver.findElement(By.xpath("//button[text()='Add Movie']")).click();
		Thread.sleep(3000);
	    driver.switchTo().alert().accept();
	    
	    driver.findElement(By.cssSelector("a[routerlink='movie-list']")).click();
	    Thread.sleep(1000);
	    
	    driver.findElement(By.cssSelector("a[href='/dashboard/6135421343/movie/8330']")).click();
	    
	    driver.findElement(By.xpath("//button[text()='Delete']")).click();
	    
	}
}
