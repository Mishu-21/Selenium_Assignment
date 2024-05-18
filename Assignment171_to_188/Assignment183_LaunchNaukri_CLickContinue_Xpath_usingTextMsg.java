//Using (URL for nakuri registration shared by Manish)click on continue with Google with xpath using text message 

package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment183_LaunchNaukri_CLickContinue_Xpath_usingTextMsg {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		driver.manage().window().maximize();
		Thread.sleep(500);
		//using text xpath click on continue with google  
		driver.findElement(By.xpath("//span[.='Google']")).click();
	}

}