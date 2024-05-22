//Automate SBI New User registration page ( https://retail.onlinesbi.sbi/retail/userdrivenregdetails.htm )

package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment191_SbiNewUserRegistration_RightClickNotWorkTOInspect {
public static void main(String[] args) throws InterruptedException {
	
	 ChromeDriver driver=new ChromeDriver();
     
     driver.get("https://retail.onlinesbi.sbi/retail/newuserreg.htm");
     driver.manage().window().maximize();
     //as right click is not working click f12 and than inspect 
     driver.findElement(By.id("nextStep")).click();
     
     //enter Account Number 
     driver.findElement(By.id("accountNo")).sendKeys("123467");
     Thread.sleep(500);
     
     //enter cif code
     driver.findElement(By.id("cifNo")).sendKeys("123467");
     Thread.sleep(500);
     
     //enter branch code
     driver.findElement(By.id("branchCode")).sendKeys("123");
     Thread.sleep(500);
     
    //from dropdown choose country 
     Select s1=new Select(driver.findElement(By.id("selCountry")));
     s1.selectByVisibleText("India");
     Thread.sleep(500);
     
     //enter register mobile number 
     driver.findElement(By.id("mobileNo")).sendKeys("708079797979");
     Thread.sleep(2000);
     
     //from dropdown choose option from facility Required 
     Select s2=new Select(driver.findElement(By.id("txnRights")));
     s2.selectByVisibleText("Limited Transaction Rights");
     Thread.sleep(2000);
     
     
     //Click on I agree
     driver.findElement(By.id("iAgreeconsent")).click();
     
}
}
