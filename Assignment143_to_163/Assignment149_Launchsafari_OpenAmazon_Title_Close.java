//Program to Launch the Safari browser, open the Amazon application, display title of the page and close the application

package Assignment;
import org.openqa.selenium.safari.SafariDriver;


public class Assignment149_Launchsafari_OpenAmazon_Title_Close {
	public static void main(String[] args) {
		SafariDriver driver = new SafariDriver();  
		driver.get("https://www.amazon.in/");
		System.out.println(driver.getTitle());
		
		driver.close();

	}
}
