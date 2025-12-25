package week2.Day2.HW;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Account_SelectClass {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		
		//Enter UserName & PWD
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		
		//Click Account_SelectClass
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.className("inputBox")).sendKeys("Account_Test_"+System.currentTimeMillis());
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		
		//Locate the Field's
		WebElement IndustryDD = driver.findElement(By.name("industryEnumId"));
	    WebElement OwnerDD = driver.findElement(By.name("ownershipEnumId"));
	    WebElement dataSourceDD = driver.findElement(By.id("dataSourceId"));
	    WebElement marketingDD = driver.findElement(By.id("marketingCampaignId"));
	    WebElement StateDD = driver.findElement(By.name("generalStateProvinceGeoId"));
		
		//Instantiate the Industry Select Class
		Select sel = new Select(IndustryDD);
		sel.selectByVisibleText("Computer Software");
		
		//Instantiate the ownership Select Class
		Select sel1 = new Select(OwnerDD);
		sel1.selectByVisibleText("S-Corporation");
		
		//Instantiate the Source Select Class
		Select sel2 = new Select(dataSourceDD);
		sel2.selectByValue("LEAD_EMPLOYEE");
		
		//Instanitate the MarketingCampaign
		Select sel3 = new Select(marketingDD);
		sel3.selectByIndex(6);
		
		//Instanitate the StateProvince
		Select sel4 = new Select(StateDD);
		sel4.selectByValue("TX");
		
		//Click Create Account Button
		driver.findElement(By.className("smallSubmit")).click();
		
		//Print the Account Name
		System.out.println(driver.findElement(By.xpath("//span[contains(text(),'Account_Test_')]")).getText());
		driver.quit();
		
		
		
		
		
		

	}

}
