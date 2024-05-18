////Using (AN and AV) relative xpath in amazon application enter the text in the searchbox

package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment182_RelativeXpathAmazon_EnterTextSearchBox {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		Thread.sleep(500);
		//(AN and AV) relative xpath for search bar
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("shoes");
		Thread.sleep(1000);
driver.close();

	}

}