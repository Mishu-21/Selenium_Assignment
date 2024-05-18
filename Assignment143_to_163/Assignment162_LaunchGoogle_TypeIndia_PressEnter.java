//Program to launch Google, type India and press Enter using Keys.ENTER

package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment162_LaunchGoogle_TypeIndia_PressEnter {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement search=driver.findElement(By.className("gLFyf"));
		search.sendKeys("India");
		search.sendKeys(Keys.ENTER);
	}

}