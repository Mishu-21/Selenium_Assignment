//Take a Screenshot with class name and Current date

package Assignment;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Assignment192_SSWithClassNameAndCurrentDate {

public static void main(String[] args) throws IOException, InterruptedException {
	
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	driver.findElement(By.linkText("Gmail")).click();
	
	Thread.sleep(1000);
	//to have todays date month and year
	Date d=new Date(); 
	Date d1=new Date(d.getTime()); //giving us Human understandable time
	String currentTime=d1.toString();  //converted d1 in string 
	String month=currentTime.substring(4,7);
	String date=currentTime.substring(8,10);
	String year=currentTime.substring(currentTime.length()-4);
	
	//To take screenshot
	
	TakesScreenshot t1=driver; 
    File source =t1.getScreenshotAs(OutputType.FILE); 
  File destination =new File("C:\\Users\\UFL IT 2\\eclipse-workspace\\Selenium\\src\\Assignment" + new Assignment192_SSWithClassNameAndCurrentDate().getClass() +"Todays_Date"+ date.concat(month).concat(year)+Math.random()+ ".png");

    
    FileHandler.copy(source, destination); 

  
		
		
	  
		
}
}
