package MessagingApp.MessagingApp;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.smarthealer.*;
import org.smarthealer.smartheal.SmartHealer;


public class App 
{
	
	
	
	        
	        
	        public static void main( String[] args ) throws Exception
	        {
	        	SmartHealer S=new SmartHealer();
	        	
				///INITIATE DRIVER
	        	System.out.println("launching Chrome browser"); 
	    	    System.setProperty("webdriver.chrome.driver","F:\\MyApp\\Q-MatePro Flask\\chromedriver.exe");
	    		WebDriver driver = new ChromeDriver();
	    		///driver=S.StartTraining(driver,"newname");
	    		
	    	    driver.get("file:///F:/MyApp/Q-DOCT/form_test.html");
	    	    
	    	    
	    	    
	    	    
	    	    String select_type_of_feedback="(//*[@id='bankform']//select)[1]";
	    	    Select dropdown1= new Select(driver.findElement(By.xpath(select_type_of_feedback)));
	    		dropdown1.selectByVisibleText("Suggestion");
	    		String select_type_enquiry="(//*[@id='bankform']//select)[2]";
	    		Select dropdown2= new Select( driver.findElement(By.xpath(select_type_enquiry)));
	    		dropdown2.selectByVisibleText("Credit and Debit Cards");
	    		String select_title="//*[@class='title-block']//select";
	    		Select dropdown3= new Select( driver.findElement(By.xpath(select_title)));
	    		dropdown3.selectByVisibleText("Mr");
	    		String input_firstname="//input[@name='First Name']";
	    	    driver.findElement(By.xpath(input_firstname)).sendKeys("Soorajit");
	    	    
	    	    String input_lastname="//input[@name='LastName']"; 
	    	    
	    	    
	    	    driver.findElement(By.xpath(input_lastname)).sendKeys("Mukherjee");
	    	    
	    	    
	    	    
	    	   
	    	    
	    	    
	    	    
	    	    String Email_address="(//*[@id='bankform']//*[@type='text'])[3]";
	    	    
	    		driver.findElement(By.xpath(Email_address)).sendKeys("soorajit@gmail.com");
	    		String phone_number="(//*[@id='bankform']//*[@type='text'])[4]";
	    		driver.findElement(By.xpath(phone_number)).sendKeys("9674495612");
	    		String submit_button="//button[@id='submit_form']";
	    		try {
	    			 
	    			 driver.findElement(By.xpath(submit_button)).click();
	    		}
	    		
	    		catch (NoSuchElementException e) {
	    	    	
	    	    	String Healed=S.Healthis(driver,submit_button,"newname");
	    	    	
	    	    	driver.findElement(By.xpath(Healed)).click();
	    	    	
	    	    }
	    		 
	    		
	    		
	    		
	    		
	    		
	    		 System.out.print("\n\n\n ===>>All Steps Executed.");
		    	    	
		    	    
	    		driver.quit();
	    		///S.StopTraining();
	        	
	        }
		  
		  
		  
		  
		  

		  }
		  
		  
	  
    	
    	
    

