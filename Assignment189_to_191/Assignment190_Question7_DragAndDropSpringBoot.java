//7 Write a code to drag and drop Spring Boot            


package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment190_Question7_DragAndDropSpringBoot {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/drag-and-drop/");
		driver.manage().window().maximize();
		
		
		WebElement dragableElement=driver.findElement(By.xpath("(//div[@id='div1'])[10]"));
		
		
		WebElement dropableElement=driver.findElement(By.xpath("(//div[@id='div2'])"));

         Actions a1=new Actions(driver);  
		
		
		a1.dragAndDrop(dragableElement,dropableElement).perform();


	}
}
