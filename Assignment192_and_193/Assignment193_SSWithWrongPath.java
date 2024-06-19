//Try to take a Screenshot with wrong path
package Assignment;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Assignment193_SSWithWrongPath {

	
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Gmail")).click();
		
		Thread.sleep(1000);
		
		
		//To take screenshot
		
		TakesScreenshot t1=driver; 
	    File source =t1.getScreenshotAs(OutputType.FILE); 
	  File destination =new File("C:\\Users\\UFL IT 2\\eclipse-workspace\\src\\Assignment\\screenshot" + Math.random() +".png");
	    
	    FileHandler.copy(source, destination); 

	}	  
}

/*
 Output---------->
 Exception in thread "main" java.io.FileNotFoundException: C:\Users\UFL IT 2\eclipse-workspace\src\Assignment\screenshot0.7144367387026922.png (The system cannot find the path specified)
	at java.base/java.io.FileOutputStream.open0(Native Method)
	at java.base/java.io.FileOutputStream.open(FileOutputStream.java:293)
	at java.base/java.io.FileOutputStream.<init>(FileOutputStream.java:235)
	at java.base/java.io.FileOutputStream.<init>(FileOutputStream.java:184)
	at org.openqa.selenium.io.FileHandler.copyFile(FileHandler.java:131)
	at org.openqa.selenium.io.FileHandler.copy(FileHandler.java:110)
	at Assignment.Assignment193_SSWithWrongPath.main(Assignment193_SSWithWrongPath.java:34)

 */
