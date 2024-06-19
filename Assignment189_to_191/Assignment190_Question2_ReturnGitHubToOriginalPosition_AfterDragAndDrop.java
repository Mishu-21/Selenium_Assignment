//2. Write a code to return GitHub to original position after drag and drop              


package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment190_Question2_ReturnGitHubToOriginalPosition_AfterDragAndDrop {

	
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/drag-and-drop/");
		driver.manage().window().maximize();
		
		
		WebElement dragableElement=driver.findElement(By.xpath("(//div[@id='div1'])[5]"));
		
		
		WebElement dropableElement=driver.findElement(By.xpath("(//div[@id='div2'])"));

		//perform drag and drop first
         Actions a1=new Actions(driver);  
		 a1.dragAndDrop(dragableElement,dropableElement).perform();
		 
		 Thread.sleep(2000);
		
		 //now returning  GitHub to original position after drag and drop
		 a1.dragAndDrop(dropableElement, dragableElement).perform();


	}

}
