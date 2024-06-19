//Program to Launch the Microsoft Edge, open the Flipkart application, display title of the page and close the application 



package Assignment;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment147_LaunchMicrosoft_OpenFlipkart_title_close {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeDriver driver= new EdgeDriver();
		driver.get("https://www.flipkart.com/");
		System.out.println(driver.getTitle());
		
		driver.close();
	}
}
