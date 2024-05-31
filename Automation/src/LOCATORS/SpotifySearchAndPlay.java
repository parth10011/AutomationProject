package LOCATORS;

import java.util.Scanner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpotifySearchAndPlay 
{

	public static void main(String[] args) throws InterruptedException 
	{
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter Your Choice Of Song : ");
//		String s=sc.next();
	
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		
		driver.get("https://open.spotify.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("button[data-testid='login-button']")).click();
		Thread.sleep(2000);
		
		WebElement username = driver.findElement(By.cssSelector("input[id='login-username']"));
		username.sendKeys("yetagodd@digdig.org");
		Thread.sleep(2000);
		
		WebElement password = driver.findElement(By.cssSelector("input[id='login-password']"));
		password.sendKeys("yetagodd@digdig.org");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("button[id='login-button']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.cssSelector("button[class='onetrust-close-btn-handler onetrust-close-btn-ui banner-close-button ot-close-icon']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.cssSelector("a[class='link-subtle hNvCMxbfz7HwgzLjt3IZ']")).click();
		Thread.sleep(3000);
		
		WebElement search = driver.findElement(By.cssSelector("input[data-testid='search-input']"));
		search.sendKeys("Sin");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//a[@class='btE2c3IKaOXZ4VNAb8WQ'])[1]")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//button[@data-testid='play-button'])[2]")).click();
		Thread.sleep(20000);
		
//		driver.quit();
				
	}
	
}
