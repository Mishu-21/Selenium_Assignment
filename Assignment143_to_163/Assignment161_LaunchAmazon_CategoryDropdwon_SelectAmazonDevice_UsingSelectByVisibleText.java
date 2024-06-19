//Program to Launch the amazon, click the search the Category Dropdown and select the Amazon Devices using select by Visible text


package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment161_LaunchAmazon_CategoryDropdwon_SelectAmazonDevice_UsingSelectByVisibleText {
 

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement Category=driver.findElement(By.id("searchDropdownBox"));
		Select s=new Select(Category);
		Thread.sleep(1000);
		s.selectByVisibleText("Amazon Devices");

	}

}
