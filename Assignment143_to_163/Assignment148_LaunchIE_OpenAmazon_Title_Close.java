//Program to Launch the Internet Explore browser, open the Amazon application, display title of the page and close the application


package Assignment;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class Assignment148_LaunchIE_OpenAmazon_Title_Close {

	public static void main(String[] args) {
		InternetExplorerDriver driver = new InternetExplorerDriver(); 
		driver.get("https://www.amazon.in/");
		System.out.println(driver.getTitle());
		
		driver.close();
	}
}
