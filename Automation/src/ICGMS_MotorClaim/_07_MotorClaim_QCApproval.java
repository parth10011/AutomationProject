package ICGMS_MotorClaim;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import ICGMS_Interface.BaseClassICGMS;
import ICGMS_Interface.login_ICGMS;

public class _07_MotorClaim_QCApproval extends BaseClassICGMS
{

	@Test
	public void MotorClaim_QCApproval() throws InterruptedException, AWTException
	{
		//Login
		login_ICGMS lp = new login_ICGMS(driver);
		lp.login(SuperAdmin_Email1, Admin_Pass);
		
		// Toaster Popup Click
		ToasterPopupClick();
		
		//Open View List
		driver.findElement(By.xpath("//a[@href='/claim-details']")).click();
		
		//QC Approval Button Click
		driver.findElement(By.xpath("(//button[text()='QC Approval'])[1]")).click();
		
		//Enter Remark
		WebElement remark = driver.findElement(By.xpath("//textarea[@placeholder='Enter Your Remark']"));
		remark.sendKeys("Approval Done");
		
		//Click Submit
		WebElement submit = driver.findElement(By.xpath("//span[text()='Approve']"));
		submit.click();
		Thread.sleep(1000);
		
		//Open View List
		driver.findElement(By.xpath("//a[@href='/claim-details']")).click();
		
	}
}
