package ICGMS_MotorClaim;

import java.awt.AWTException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import ICGMS_Interface.BaseClassICGMS;
import ICGMS_Interface.login_ICGMS;

public class _05_MotorClaim_RepairerAppointment extends BaseClassICGMS
{

	@Test
	public void MotorClaim_RepairerAppointment() throws InterruptedException, AWTException
	{
		//Login
		login_ICGMS lp = new login_ICGMS(driver);
		lp.login(Cust_Email1, Cust_Pass);
		
		//Toaster Popup Click
		ToasterPopupClick();
		
		//Open Repairer Appointment
		WebElement appoint_button = driver.findElement(By.xpath("(//button[text()='Repairer Appointment'])[1]"));
		appoint_button.click();
		Thread.sleep(500);
		
		//Select Repairer Type
		WebElement Repair_Type = driver.findElement(By.xpath("//select[@formcontrolname='repairer_id']"));

		Select s = new Select(Repair_Type);
		s.selectByValue("2");
		Thread.sleep(500);
		
		//Enter Remark
		WebElement remark = driver.findElement(By.xpath("//textarea[@formcontrolname='repairer_remark']"));
		remark.sendKeys("Approval Done");
		Thread.sleep(500);
		
		//Click Appoint
		WebElement appoint = driver.findElement(By.xpath("//button[@type='submit']"));
		appoint.click();
		Thread.sleep(500);
		
		// Toaster Popup Click
		ToasterPopupClick();
		
	}
	
	
}
