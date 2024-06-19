//using TaglName locator click "click to know more" link on HTML file given by manish

package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment188_UsingTagLocator_ClickKnowMore_HtmlFile{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//launch amazon.in
		driver.get("file:///C:/Users/UFL%20IT%202/Desktop/imp/Study_Himanshi/GroTechMinds/Study%20Material/learningHTML1.html");
		
		//click on the link using tagName
		driver.findElement(By.tagName("a")).click();
		
	}

}