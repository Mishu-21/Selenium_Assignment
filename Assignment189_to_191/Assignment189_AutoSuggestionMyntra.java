//Handle Autosuggestion for Myntra application(search box)


package Assignment;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment189_AutoSuggestionMyntra {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		
		//xpath for search bar
		driver.findElement(By.xpath("//div[@class='desktop-bound']/div/input")).sendKeys("shoe");
		
		Thread.sleep(1000);  
		
		//xpath for autosuggestion
		
		List<WebElement> e1 =driver.findElements(By.xpath("//div[@class=' desktop-autoSuggest desktop-showContent']/ul/li"));
       int count=e1.size();	
       System.out.println(count); //print total  element present in autosuggestion
       
       
       //click on second last element from the autosuggestion
       e1.get(count-2).click();
	}

}
