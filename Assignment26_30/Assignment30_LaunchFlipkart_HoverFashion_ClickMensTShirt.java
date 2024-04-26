//Launch flipkart applicatio, hover over fashion and click mens-tshirt

package Selenium_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Assignment30_LaunchFlipkart_HoverFashion_ClickMensTShirt {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		
		//hower over fashion and click on mens fashion use Action Class
		//Actions a1=new Actions(driver);
	//	a1.moveToElement(driver.findElement(By.className("_1wE2Px"))).perform();  ..isse nhi ho raha 
		
		//try with xpath 
	//	a1.moveToElement(driver.findElement(By.xpath("//div[@class='_1wE2Px']"))).perform();
	/*
	 * WebElement Fashion=driver.findElement(By.partialLinkText("Fashion")); Actions
	 * a2=new Actions(driver); a2.moveToElement(Fashion).perform();
	 * Thread.sleep(500); //Select s1=new Select(Fashion);
	 * driver.findElement(By.linkText("Men's T-Shirts")).click();
	 * Thread.sleep(2000);
	 */
  //nhi hua yeh sab se
//div[@class="_1wE2Px"]
  WebElement Fashion=driver.findElement(By.xpath("//div[@class='_1wE2Px']"));
	Actions a2=new Actions(driver);
	a2.moveToElement(Fashion).perform();
	
	Thread.sleep(500);
  driver.findElement(By.xpath("//a[.='All']")).click();
  //driver.close();
	}
}
