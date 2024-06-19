//Launch flipkart application, hover over fashion and click mens-tshirt

package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment179_LaunchFlipkart_HoverFashion_ClickMensTShirt {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement we=	driver.findElement(By.className("_27h2j1"));
	    Actions A1=new Actions(driver);
	    A1.moveToElement(we).perform();
	    Thread.sleep(1000);
	    driver.findElement(By.linkText("Men's T-Shirts")).click();
	}
}
