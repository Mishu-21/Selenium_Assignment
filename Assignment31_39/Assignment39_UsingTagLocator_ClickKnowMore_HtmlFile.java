//using TaglName locator click "click to know more" link on HTML file given by manish

package Selenium_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment39_UsingTagLocator_ClickKnowMore_HtmlFile{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//launch amazon.in
		driver.get("file:///C:/Users/Administrator/Desktop/imp/Study_Himanshi/GroTechMinds/Study%20Material/learningHTML1.html");
		
		//click on the link using tagName
		driver.findElement(By.tagName("a")).click();
		
	}

}
