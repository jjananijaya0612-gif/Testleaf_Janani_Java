package week2.Day2.HW;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Edit_Lead {

	public static void main(String[] args) {

       ChromeDriver driver = new ChromeDriver();
       driver.get("http://leaftaps.com/opentaps/");
       driver.manage().window().maximize();
       driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
       
       driver.findElement(By.name("USERNAME")).sendKeys("DemoSalesManager");
       driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
       driver.findElement(By.className("decorativeSubmit")).click();
       driver.findElement(By.linkText("CRM/SFA")).click();
       driver.findElement(By.linkText("Leads")).click();
       driver.findElement(By.linkText("Create Lead")).click();
       
       //Xpath
       driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TestLeaf");
       driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Jhon");
       driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Smith");
       driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Raman");
       driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("Selenium_Automation");
       driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester");
       WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
       
       //Instantiate the state
       Select sel= new Select(state);
       sel.selectByVisibleText("New York");
       
       driver.findElement(By.className("smallSubmit")).click();
       driver.findElement(By.linkText("Edit")).click();
       driver.findElement(By.name("description")).clear();
      driver.findElement(By.name("importantNote")).sendKeys("Please ensure all required details are validated before submission");
      driver.findElement(By.className("smallSubmit")).click();
      System.out.println(driver.getTitle());
      driver.quit();
	}

}
