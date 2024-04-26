//Program to launch the google and click on Images link

package Selenium_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment13_LaunchGoogle_ClickImageLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		//click on image link 
		driver.findElement(By.className("lnXdpd")).click();
	}

}
