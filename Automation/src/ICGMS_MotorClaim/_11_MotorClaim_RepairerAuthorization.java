package ICGMS_MotorClaim;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import ICGMS_Interface.BaseClassICGMS;

public class _11_MotorClaim_RepairerAuthorization extends BaseClassICGMS 
{

	@Test
	public void MotorClaim_RepairerAuthorization() throws InterruptedException, AWTException
	{
		//Login
		driver.findElement(By.cssSelector("input[formcontrolname='email']")).sendKeys(Insurer_Email1);
		driver.findElement(By.cssSelector("input[aria-label='Password']")).sendKeys(Admin_Pass);		
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
				
		// Toaster Popup Click
		ToasterPopupClick();
		
		//Repairer Authorization Button Click
		driver.findElement(By.xpath("(//button[text()='Repairer Authorization'])[1]")).click();
		
		//Enter Pre Approved Amount
		WebElement Pre_Amount = driver.findElement(By.xpath("//input[@placeholder='Enter Amount']"));
		Pre_Amount.sendKeys("5123");
		
		//Enter Pre Approved Amount
		WebElement remark = driver.findElement(By.xpath("//textarea[@placeholder='Enter Your Remark']"));
		remark.sendKeys("Repairer Authorized Successfully");
		
		//Upload Document
		WebElement Document_Upload = driver.findElement(By.xpath("(//input[@type='file'])[1]"));
		Document_Upload.sendKeys(Doc_Link);
		
		//Enter File Name
		WebElement File_Name = driver.findElement(By.xpath("//input[@placeholder='Enter filename']"));
		File_Name.sendKeys("Dummydotpdf");
		Thread.sleep(500);
		get_screenshot();
		
		//Click Submit
		WebElement Submit_Button = driver.findElement(By.xpath("//span[text()='Submit']"));
		Submit_Button.click();
		Thread.sleep(1000);
		
		//Open View List
		driver.findElement(By.xpath("//a[@href='/insurer-claim-list']")).click();
		Thread.sleep(500);
		
		//Toaster Popup Click
		ToasterPopupClick();
	}
}
