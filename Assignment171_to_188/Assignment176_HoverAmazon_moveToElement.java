//Launch Amazon login to the application using hoverovering functionality and proceed login

package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment176_HoverAmazon_moveToElement {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Actions a1=new Actions(driver); 
		a1.moveToElement(driver.findElement(By.id("nav-link-accountList"))).perform();
		
		driver.findElement(By.linkText("Sign in")).click();
	}

}
