//Launch the Chrome browser, and close the browser 

package Assignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment144_ChromeBrowser_closeBrowser {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/intl/en_in/chrome/");
		Thread.sleep(500);
		driver.close();
	}
}
