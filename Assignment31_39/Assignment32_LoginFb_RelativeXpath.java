//Login to facebook application using relative xpath

package Selenium_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment32_LoginFb_RelativeXpath {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(500);
		
		//relative xpath for email /phone field
		WebElement username =driver.findElement(By.xpath("(//input)[3]"));
        username.sendKeys("9667203182");
        Thread.sleep(500);
     
        //relative xpath for password field
      		WebElement password =driver.findElement(By.xpath("(//input)[4]"));
      		password.sendKeys("mypassword");
              Thread.sleep(500);
              
        //relative xpath to click login buton 
              driver.findElement(By.xpath("(//button)[1]")).click();
              Thread.sleep(500);
	}

}
