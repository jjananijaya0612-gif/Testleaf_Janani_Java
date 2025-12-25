package week2.Day2.HW;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_SelectClass {

	public static void main(String[] args) {

    ChromeDriver driver = new ChromeDriver();
    driver.get("https://en-gb.facebook.com/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    
    //Click Create new account
    driver.findElement(By.linkText("Create new account")).click();
    driver.findElement(By.name("firstname")).sendKeys("Kowsalya");
    driver.findElement(By.name("lastname")).sendKeys("K");
    driver.findElement(By.name("reg_email__")).sendKeys("Testleaf.2023@gmail.com");
    driver.findElement(By.name("reg_passwd__")).sendKeys("Tuna@321");
    //DDL for DOB
    WebElement daydd = driver.findElement(By.id("day"));
    WebElement monthdd = driver.findElement(By.name("birthday_month"));
    WebElement yeardd = driver.findElement(By.name("birthday_year"));
  
    
    //Instanitate the Day
    Select sel = new Select(daydd);
    sel.selectByIndex(5);
    
    Select sel1 = new Select(monthdd);
    sel1.selectByVisibleText("Dec");
    
    Select sel2 = new Select(yeardd);
    sel2.selectByValue("1990");
    
    driver.findElement(By.id("sex")).click();
    
    
    
    
    

	}

}

