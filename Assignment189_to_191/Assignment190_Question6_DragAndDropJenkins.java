//6 Write a code to drag and drop Jenkins           


package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment190_Question6_DragAndDropJenkins {

	
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/drag-and-drop/");
		driver.manage().window().maximize();
		
		
		WebElement dragableElement=driver.findElement(By.xpath("(//div[@id='div1'])[3]"));
		
		
		WebElement dropableElement=driver.findElement(By.xpath("(//div[@id='div2'])"));

         Actions a1=new Actions(driver);  
		
		
		a1.dragAndDrop(dragableElement,dropableElement).perform();


	}
}
