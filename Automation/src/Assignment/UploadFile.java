package Assignment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.time.Duration;

import org.dataloader.impl.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile 
{
	public static void main(String[] args) throws AWTException, InterruptedException
	{
			
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	driver.get("https://demoapps.qspiders.com/ui/fileUpload/custom?sublist=1");
	StringSelection ss = new StringSelection("C:\\Users\\parth\\OneDrive\\Desktop\\DTU\\ICGMS\\Screenshot for review.png"); 
    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
//    File uploadFile = new File("C:\\Users\\parth\\OneDrive\\Desktop\\DTU\\ICGMS\\Acknowledgement - button not visible to clientsuperadmin 2.png");
Thread.sleep(2000);
    WebElement fileInput = driver.findElement(By.xpath("//div[text()='Upload File']"));
    fileInput.click();
    
    Thread.sleep(4000);
    Robot r = new Robot();
	
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_V);
	
	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyRelease(KeyEvent.VK_V);
	
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);

    
	}
	
}
