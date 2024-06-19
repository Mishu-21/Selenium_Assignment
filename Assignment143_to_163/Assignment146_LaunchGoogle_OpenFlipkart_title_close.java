//Program to Launch the google chrome, open Flipkart application, display title of the page and close the Flipkart application


package Assignment;
import org.openqa.selenium.chrome.ChromeDriver;


public class Assignment146_LaunchGoogle_OpenFlipkart_title_close {

public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		System.out.println(driver.getTitle());
		Thread.sleep(500);
		driver.close();

	}
}
