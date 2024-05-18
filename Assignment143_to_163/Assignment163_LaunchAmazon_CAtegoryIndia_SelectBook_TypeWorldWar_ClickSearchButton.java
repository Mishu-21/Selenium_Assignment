//Program to launch Amazon India from category dropdown select the books, type world war and click on search button

package Assignment;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Assignment163_LaunchAmazon_CAtegoryIndia_SelectBook_TypeWorldWar_ClickSearchButton {

	public static void main(String[] args) {
ChromeDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//launch amazon.in
		driver.get("https://www.amazon.in/");
		
		//select dropdown and choose Books option 
		WebElement dd =driver.findElement(By.id("searchDropdownBox"));
		
		//use select class to choose the drop-down
		Select s=new Select(dd);
		
		//select book from dropdown by using selectbyvalue option
		s.selectByValue("search-alias=stripbooks");
		
		//type world war book in search text tab
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("World war");
		
		//click on search button 
		driver.findElement(By.id("nav-search-submit-button")).click();
	}

}
