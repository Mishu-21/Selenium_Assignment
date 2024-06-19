
//Program to Launch the Mozilla Firefox browser, open the application, display title of the page and close the application

package Assignment;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment150_LaunchMozillaFirefox_OpenAmazon_Title_Close {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		System.out.println(driver.getTitle());
		
		driver.close();
	}
}
