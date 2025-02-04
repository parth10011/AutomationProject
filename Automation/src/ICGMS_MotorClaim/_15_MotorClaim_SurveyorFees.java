package ICGMS_MotorClaim;

import java.awt.AWTException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import ICGMS_Interface.BaseClassICGMS;

public class _15_MotorClaim_SurveyorFees extends BaseClassICGMS 
{

	@Test
	public void MotorClaim_SurvyeorFees() throws InterruptedException, AWTException
	{
		//Login
		driver.findElement(By.cssSelector("input[formcontrolname='email']")).sendKeys(Surveyor_Email1);
		driver.findElement(By.cssSelector("input[aria-label='Password']")).sendKeys(Admin_Pass);
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
		
		//Toaster Popup Click
		ToasterPopupClick();
		
		//Open View List
		WebElement claim_list = driver.findElement(By.xpath("//a[@href='/surveyor-claim-list']"));
		claim_list.click();

		//Open Surveyor Fess
		WebElement fees_button = driver.findElement(By.xpath("(//button[text()='Surveyor Fees'])[1]"));
		fees_button.click();
		Thread.sleep(500);
		
		//Upload Surveyor Bill
		WebElement surveyBill_upload = driver.findElement(By.xpath("(//input[@type='file'])[1]"));
		surveyBill_upload.sendKeys(Est_Report);
		
		//Upload Other Bill
		WebElement otherBill_upload = driver.findElement(By.xpath("(//input[@type='file'])[2]"));
		otherBill_upload.sendKeys(Est_Report);
		
		//Enter Remark
		WebElement remark = driver.findElement(By.xpath("//textarea[@placeholder='Enter Your Remark']"));
		remark.sendKeys("Fees Bill Uploaded Successfully");
		
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
	    
	    //Submit Customer Form
		WebElement submit = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		submit.click();
		Thread.sleep(1000);
		
		//Toaster Popup Click
		ToasterPopupClick();
		
	}
}
