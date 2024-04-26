//Write A Code To Select Demo2 Using Select By Visible Text.

package Selenium_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment23_SelectDemo2_ByVisibleText {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/dropdown/");
		WebElement Choice=driver.findElement(By.id("Choice1"));
		Select s=new Select(Choice);
		s.selectByVisibleText("Demo2");

	}

}
