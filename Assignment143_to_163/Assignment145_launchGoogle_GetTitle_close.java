//Program to Launch the google application, open, display title of the page and close the application

package Assignment;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment145_launchGoogle_GetTitle_close {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		Thread.sleep(500);
		driver.close();

	}
	
}
