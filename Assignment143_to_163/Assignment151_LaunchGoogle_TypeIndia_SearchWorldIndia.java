//Program to launch the Google search and type as India and search the word India


package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment151_LaunchGoogle_TypeIndia_SearchWorldIndia {

	public static void main(String[] args) {
ChromeDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("India");
		search.sendKeys(Keys.ENTER);

	}

}
