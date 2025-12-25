package week2.Day1.HW;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		
		//get URL
		driver.get("http://leaftaps.com/opentaps/control/main/");
		
		//Maximize the window
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		
		//Enter the Email_Id
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		
		//Enter the PWD
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//Click the loginbutton
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Click Crmsfalink
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		
		
		
		//Click Lead
		driver.findElement(By.linkText("Leads")).click();
		
		//Click Create Account 
	    driver.findElement(By.linkText("Create Lead")).click();
		
		//Enter FirstName
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Janani");
		
		//Enter LastName
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kamesh");
		
		//Enter CompanyName
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		
		//Enter Title
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Software_Testing");
		
		//Add PhoneNumber
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9655122602");
		
		//Click LeadButton
		driver.findElement(By.className("smallSubmit")).click();
		
		//Print the Title
		System.out.println(driver.getTitle());
		
		//Close the Browser
	    driver.quit();	

	}

}
