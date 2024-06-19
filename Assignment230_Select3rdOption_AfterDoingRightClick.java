package Assignment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment230_Select3rdOption_AfterDoingRightClick {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		//right click on gmail 
		Actions a1=new Actions(driver);
		a1.contextClick(driver.findElement(By.linkText("Gmail"))).perform();
	
		Robot r1=new Robot();  
		for(int i=0;i<=2;i++)
		{
			r1.keyPress(KeyEvent.VK_DOWN);  
			Thread.sleep(2000);
		}
		
		r1.keyPress(KeyEvent.VK_ENTER);
	}
	
}
