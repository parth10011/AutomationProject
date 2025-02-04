package ICGMS_MotorClaim;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import ICGMS_Interface.BaseClassICGMS;

public class _12_MotorClaim_ClaimFinancerAllocation extends BaseClassICGMS
{

	@Test
	public void MotorClaim_ClaimFinancerAllocation() throws InterruptedException, AWTException
	{
		//Login
		driver.findElement(By.cssSelector("input[formcontrolname='email']")).sendKeys(Repairer_Email1);
		driver.findElement(By.cssSelector("input[aria-label='Password']")).sendKeys(Admin_Pass);
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
		
		//Toaster Popup Click
		ToasterPopupClick();
		
		//Open View List
		WebElement claim_list = driver.findElement(By.xpath("//a[@href='/repairer-claim-list']"));
		claim_list.click();

		
		//Open Claim Financer Allocation
		WebElement financer_button = driver.findElement(By.xpath("(//button[text()='Claim Financer Allocation'])[1]"));
		financer_button.click();
		Thread.sleep(500);
		
		//Click on Claim Financier needed radio button
		WebElement Need_Radio_button = driver.findElement(By.xpath("//input[@formcontrolname='is_financier_required' and @value='yes']"));
		Need_Radio_button.click();
		
		//Select Claim Financier Type
		WebElement Financier_Type = driver.findElement(By.xpath("//select[@formcontrolname='financier_id']"));

		Select s = new Select(Financier_Type);
		s.selectByValue("9");
		Thread.sleep(500);
		
		//Upload Document Files
		WebElement doc_upload = driver.findElement(By.xpath("(//input[@type='file'])[1]"));
		doc_upload.sendKeys(Doc_Link);
		
		//Enter File Name
		WebElement file_name = driver.findElement(By.xpath("//input[@placeholder='Enter filename']"));
		file_name.sendKeys("DummyZeroGo");
		
		//Add more Button Click
		WebElement Add_button = driver.findElement(By.xpath("//button[@ngbtooltip='add row']"));
		Add_button.click();
		
		//View Customer Inspection Report
		WebElement view_button = driver.findElement(By.xpath("//button[text()=' View ']"));
		view_button.click();
		
		// Toaster Pdf Popup Click
        WebElement pdf_toaster = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='toast-container']")));
        pdf_toaster.click();
        
        //Close Button Click
        WebElement close_button = driver.findElement(By.xpath("//button[@aria-label='Close']"));
	    close_button.click();
	    Thread.sleep(1000);
	    
	    //Click Appoint
	    WebElement Appoint = driver.findElement(By.xpath("//span[text()='Appoint']"));
	    Appoint.click();
	    
	    //Toaster Popup Click
	    ToasterPopupClick();
	    
	    //Open View List
  		claim_list = driver.findElement(By.xpath("//a[@href='/repairer-claim-list']"));
  		claim_list.click();
	
	}	
}
