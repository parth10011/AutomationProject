package WorkingWithDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByIndex 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//a[@aria-current='page'])[1]")).click();
		
//		driver.findElement(By.xpath("//select[@id='select3']")).click();
		
		WebElement dropdown= driver.findElement(By.id("Select3"));
		
		Select s = new Select(dropdown);
		s.selectByIndex(4);
		
		
	}

}
