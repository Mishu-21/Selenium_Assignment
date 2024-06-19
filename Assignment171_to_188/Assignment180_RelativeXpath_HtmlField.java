////Write an Absolute xpath and relative xpath for the html file(shared my Manish) for all the fields

package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment180_RelativeXpath_HtmlField {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		ChromeDriver driver1=new ChromeDriver();
		driver1.get("file:///C:/Users/Administrator/Desktop/imp/Study_Himanshi/GroTechMinds/Study%20Material/learningHTML1.html");
		driver1.manage().window().maximize();
		Thread.sleep(500);
		
		//userfield
		driver1.findElement(By.xpath("(//input)[1]")).sendKeys("Himanshi21");
		Thread.sleep(500);
		
		//hint field
		driver1.findElement(By.xpath("(//input)[2]")).sendKeys("Mishu*");
		Thread.sleep(500);
		
		//pswd field
				driver1.findElement(By.xpath("(//input)[3]")).sendKeys("mypswd");
				Thread.sleep(500);
				
		//first name field
		driver1.findElement(By.xpath("(//input)[4]")).sendKeys("Himanshi");
		Thread.sleep(500);
		
		//last name field
		/*
		 * driver.findElement(By.xpath("((//input)[5]")).sendKeys("Chauhan"
		 * ); Thread.sleep(500); as this field is disable so when we try to send any
		 * text into it It will show
		 * "org.openqa.selenium.ElementNotInteractableException" Exception
		 */
		
		//submit button 
		//driver.findElement(By.xpath("(/html/body/form/input)[3]")).click();
		//when we are  click on it it will show us "Your file cannot be accessed so lets dont click it "
		driver1.findElement(By.xpath("(//input)[6]"));
		Thread.sleep(500);
		
		//I have a boy checkbox
		driver1.findElement(By.xpath("(//input)[7]")).click();
		Thread.sleep(500);
		
		//I Have a girl checkbox and dont click on it 
		driver1.findElement(By.xpath("(//input)[8]"));
		Thread.sleep(500);
		
		//i have a baby check box 
		driver1.findElement(By.xpath("(//input)[9]")).click();
		Thread.sleep(500);
		
		//submit button 
				//driver.findElement(By.xpath("(/html/body/form/input)[3]")).click();
				//when we are  click on it it will show us "Your file cannot be accessed so lets dont click it "
				driver1.findElement(By.xpath("(//input)[10]"));
				Thread.sleep(500);
				
				//who are u? male or female field select checkbox
				driver1.findElement(By.xpath("(//input)[11]")).click(); //male field select 
				Thread.sleep(500);
				driver1.findElement(By.xpath("(//input)[12]"));  //female field select 
				Thread.sleep(500);
				
				//Are you ready to relocate to bangalore? field checkbox
				driver1.findElement(By.xpath("(//input)[13]")).click();  //female field select 
				Thread.sleep(500);
				
				//from the dropdown select religion
				WebElement religion=driver1.findElement(By.xpath("(//select)"));
				Select s=new Select(religion);
				s.selectByValue("3");
				
				//signup button field--> as when click so not going anywhere
				driver1.findElement(By.xpath("(//input)[14]")).click(); 
				Thread.sleep(500);
				
				
				//Click to know about us --> it will take us to another website 
				driver1.findElement(By.xpath("//a")).click(); 
				Thread.sleep(1000);
				
				//relaunching 
				driver1.get("file:///C:/Users/Administrator/Desktop/imp/Study_Himanshi/GroTechMinds/Study%20Material/learningHTML1.html");
				Thread.sleep(2000);
				driver1.close();
	}

}