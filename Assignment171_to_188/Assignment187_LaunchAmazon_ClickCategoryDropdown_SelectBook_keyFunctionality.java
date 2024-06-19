//Launch amazon.in and click on catrgory dropdown  and sekect books using keys funcyionality 

package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment187_LaunchAmazon_ClickCategoryDropdown_SelectBook_keyFunctionality {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//launch amazon.in
		driver.get("https://www.amazon.in/");
		
				WebElement select_book=driver.findElement(By.id("searchDropdownBox"));
		
				select_book.click();
		for(int i=0;i<=11;i++)
		{
			select_book.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(1000);
		}
		select_book.sendKeys(Keys.ENTER);
		
	}

}