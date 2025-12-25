package week2.Day2.HW;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Delete_Lead {

	public static void main(String[] args) throws InterruptedException {

     ChromeDriver driver = new ChromeDriver();
     driver.get("http://leaftaps.com/opentaps/");
     driver.manage().window().maximize();
     driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
     
     driver.findElement(By.name("USERNAME")).sendKeys("DemoSalesManager");
     driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
     driver.findElement(By.className("decorativeSubmit")).click();
     driver.findElement(By.linkText("CRM/SFA")).click();
     
     //Click Leads
     driver.findElement(By.linkText("Leads")).click();
     driver.findElement(By.linkText("Find Leads")).click();
     driver.findElement(By.linkText("Phone")).click();
     driver.findElement(By.id("ext-gen270")).sendKeys("9655122602");
     driver.findElement(By.id("ext-gen334")).click();
     Thread.sleep(10000);
     String Lead_Id = driver.findElement(By.xpath("//td[contains(@class,'x-grid3-td-partyId')]//a[contains(@class,'linktext')]")).getText();
     System.out.println(Lead_Id);
     
     driver.findElement(By.xpath("//td[contains(@class,'x-grid3-td-partyId')]//a[contains(@class,'linktext')]")).click();
     driver.findElement(By.linkText("Delete")).click();
     driver.findElement(By.linkText("Find Leads")).click();
     driver.findElement(By.linkText("Phone")).click();
     driver.findElement(By.id("ext-gen270")).sendKeys("9655122602");
     driver.findElement(By.id("ext-gen334")).click();
     Thread.sleep(10000);
     boolean lead = driver.findElement(By.xpath("//div[text()='No records to display']")).isDisplayed();
     
     if(lead)
     {
    	 System.out.println("Lead is deleted");
     }
     else
     {
    	 System.out.println("Lead is not deleted");
     }
   
      driver.quit();
	}
     
}
