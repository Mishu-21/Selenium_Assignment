//Launch Grotech registration page https://grotechminds.com/registration/ and enter your first name select and copy it and paste ur firstname in lastnamr tab

package Selenium_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment37_LaunchGrotechRegistration_SelectFirst_CopyLast {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//launch registration form 
		driver.get("https://grotechminds.com/registration/");
		
		//selct first name tab n enter ur name 
		WebElement First_name=driver.findElement(By.id("fname"));
		First_name.sendKeys("Himanshi");
		
		//Select ur name and copy it 
		First_name.sendKeys(Keys.CONTROL+"a");
		Thread.sleep(1000);
		First_name.sendKeys(Keys.CONTROL+"c");
		Thread.sleep(1000);
		
		//select lastname tab and paste ur first name which u have copied 
		WebElement last_name=driver.findElement(By.id("lname"));
		Thread.sleep(1000);
		last_name.sendKeys(Keys.CONTROL+"v"); //paste ur name in lastname tab 
		Thread.sleep(2000);
		driver.close();
	}

}
