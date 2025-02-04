package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginAndVerify 
{

	@Test
	public void app() throws InterruptedException
	{
		
		String email = "testemailproject000@gmail.com";
		String pswd = "Testproject@000";
		//launch browser and maximise window
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//open gmail website
		driver.get("https://mail.google.com/mail/u/0/");
		Thread.sleep(1000);
	
/////////////////////////////////STEP-1 :  Login to Gmail/////////////////////////////////////////////
		
		//input login id
		WebElement id_input = driver.findElement(By.xpath("//input[@type='email']"));
		id_input.sendKeys(email);

		
		//click on next
		WebElement next_button1 = driver.findElement(By.xpath("//span[text()='Next']"));
		next_button1.click();
		Thread.sleep(1000);
		
		//input password
		WebElement pwd_input = driver.findElement(By.name("Passwd"));
		pwd_input.sendKeys(pswd);
		Thread.sleep(1000);
		
		//click on next
		WebElement next_button2 = driver.findElement(By.xpath("//button[@class='VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc LQeN7 BqKGqe Jskylb TrZEUc lw1w4b']"));
		next_button2.click();
		Thread.sleep(1000);
		
//////////////////////////////STEP 2 : Compose an Email///////////////////////////////////////////////////////////////////		
		
		//find and click on compose email
		WebElement compose_opt = driver.findElement(By.xpath("//div[text()='Compose']"));
		compose_opt.click();
		Thread.sleep(1000);
		
		//input in subject
		WebElement subject = driver.findElement(By.xpath("//input[@name='subjectbox']"));
		subject.sendKeys("Test Mail");

		
		//input in body
		WebElement body = driver.findElement(By.cssSelector("div[aria-label='Message Body']"));
		body.sendKeys("Test Email Body");

		
////////////////////////////STEP 3 : Label the Email///////////////////////////////////////////////////////////////////////////////////////		
		
		//click on more options
		WebElement more_opt = driver.findElement(By.cssSelector("div[aria-label='More options']"));
		more_opt.click();
		Thread.sleep(1000);
		
		//click on labels
		WebElement label = driver.findElement(By.xpath("//div[text()='Label']"));
		label.click();
		
		//click on social
		WebElement check_social = driver.findElement(By.xpath("(//div[@class='J-LC-Jo J-J5-Ji'])[1]"));
		check_social.click();
		WebElement apply = driver.findElement(By.xpath("//div[text()='Apply']"));
		apply.click();
		
/////////////////////////////STEP 4 : Send the Email//////////////////////////////////////////////////////////////////////		
		
		//add recipients email
		WebElement click_email = driver.findElement(By.cssSelector("div[class='aoD hl']"));
		click_email.click();
		WebElement add_rec_email = driver.findElement(By.cssSelector("input[class='agP aFw']"));
		add_rec_email.sendKeys(email,Keys.ENTER);
		Thread.sleep(1000);
		
		//send email
		WebElement send_button = driver.findElement(By.cssSelector("div[class='T-I J-J5-Ji aoO v7 T-I-atl L3']"));
		send_button.click();
		
/////////////////////////////STEP 5 : Wait for the Email to Arrive////////////////////////////////////////////////////////////////////////
		
		Thread.sleep(4000);
		
/////////////////////////////STEP 6 : Mark the Email as Starred///////////////////////////////////////////////////////////////////////////		
		
		//click on social
		WebElement click_social = driver.findElement(By.xpath("//div[text()='Social']"));
		click_social.click();
		
		//click on starred
		WebElement star = driver.findElement(By.cssSelector("span[class='aXw T-KT']"));
		star.click();
		Thread.sleep(1000);
		
/////////////////////////////STEP 7 : Open the Received Email//////////////////////////////////////////////////////////////////////////////		
		
		//open mail
		WebElement open_mail = driver.findElement(By.cssSelector("div[aria-labelledby=':1u']"));
		open_mail.click();
		
/////////////////////////////STEP 8 :  Verify the Email////////////////////////////////////////////////////////////////////////////////////		
		
		//verify email is labeled as social
		WebElement three_dots = driver.findElement(By.xpath("(//div[@aria-label='More email options'])[2]"));
		three_dots.click();
		WebElement label_as = driver.findElement(By.xpath("//div[text()='Label as']"));
		label_as.click();
		
		WebElement social_box = driver.findElement(By.cssSelector("div[title='Social']"));
		String social_att = social_box.getAttribute("aria-checked");
		
		if(social_att.equals("true"))
		{
			System.out.println("Email is labeled as 'Social'");
		}
		else
			System.out.println("Email is not labeled as 'Social'");
		driver.findElement(By.cssSelector("div[class='ha']")).click();
		
		//verify subject of the received email is Test Mail
		String subject_att = driver.findElement(By.cssSelector("h2[jsname='r4nke']")).getText();
		
		if(subject_att.equals("Test Mail"))
		{
			System.out.println("Subject of Email is 'Test Mail'");
		}
		else
		{
			System.out.println("Subject of Email is NOT 'Test Mail'");
		}
		
		//verify body of the received email is Test Mail
		String body_att = driver.findElement(By.xpath("//div[@dir='ltr']/ancestor::div[@class='a3s aiL ']")).getText();
		
		if(body_att.equals("Test Email Body"))
		{
			System.out.println("Body of Email is 'Test Email Body'");
		}
		else
		{
		System.out.println("Body of Email is NOT 'Test Email Body'");
		}
		
		driver.quit();
		
	}
	
}
