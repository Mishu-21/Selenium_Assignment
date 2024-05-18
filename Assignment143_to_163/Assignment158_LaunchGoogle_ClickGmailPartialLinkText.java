////Program to launch the google and click on Gmail link partial link text

package Assignment;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment158_LaunchGoogle_ClickGmailPartialLinkText {

	public static void main(String[] args) {
		
ChromeDriver driver=new ChromeDriver();
		
		//launch google
		driver.get("https://www.google.com/");
		//Max window
		driver.manage().window().maximize();
		
		//Click on gmail link 
		//as inspect kiya toh 'a' hai iska tagname so ismai text hoga he
		
		//so mainly iss time always try to use LinkText or PartialLINKtexT locator
		
		driver.findElement(By.partialLinkText("Gma")).click();
	}

}