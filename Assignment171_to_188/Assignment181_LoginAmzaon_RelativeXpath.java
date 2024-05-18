//signin amazon using relative xpath 


package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment181_LoginAmzaon_RelativeXpath {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();
		
		Thread.sleep(500);
		
		//enter email /phone number
		driver.findElement(By.xpath("(//input)[7]")).sendKeys("9667203182");
		Thread.sleep(500);
		
		//enter continue button 
		driver.findElement(By.xpath("(//input)[10]")).click();
		Thread.sleep(500);
		
		//enter pswd 
		driver.findElement(By.xpath("(//input)[9]")).sendKeys("Himanshi21@");
		Thread.sleep(500);
		
		//enter sign in button 
				driver.findElement(By.xpath("(//input)[11]")).click();
				Thread.sleep(500);
		
	}

}