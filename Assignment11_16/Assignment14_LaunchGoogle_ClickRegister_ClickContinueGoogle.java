//Launch Naukri.com click on Register and After that click on continue with Google

package Selenium_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment14_LaunchGoogle_ClickRegister_ClickContinueGoogle {

	public static void main(String[] args) {
		
ChromeDriver driver=new ChromeDriver();
		
		//launch naukri.com
		driver.get("https://www.naukri.com/");
		
		//Max window
				driver.manage().window().maximize();
				
		//Click on Register link
				driver.findElement(By.linkText("Register")).click();
				
		//Click on Continue with google
				driver.findElement(By.className("google-text")).click();	
	}

}
