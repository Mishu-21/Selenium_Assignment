//https://grotechminds.com/registration/    upload the file here

package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment58_UploadFile_GroTech {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registration/");
	
		WebElement choose_file=driver.findElement(By.xpath("//input[@id='file']"));
		Thread.sleep(1000);
		
		choose_file.sendKeys("C:\\Users\\UFL IT 2\\Downloads\\UploadFile.jpg"); 
	}
}
