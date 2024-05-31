package launchbrowser;

import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class LaunchingChromeBrowser 
{

   public static void main(String[] args) 
   
   {
	
	   
	   
	     System.out.print("Enter the browser name : ");
	     Scanner sc = new Scanner(System.in);
	     String a = sc.next();
	     if(a.equals("edge")|| a.equals("Edge"))
	     {
	    	 EdgeDriver driver = new EdgeDriver();
	     }
	     else if (a.equals("chrome")|| a.equals("Chrome"))
	     {
	    	 ChromeDriver driver1 = new ChromeDriver();
	     }
	     else if (a.equals("firefox"))
	     {
	    	 FirefoxDriver driver1 = new FirefoxDriver();
	     }
	     else
	     {
	    	System.out.println("Invalid Input");
	     }
	     
   }
	  
}
