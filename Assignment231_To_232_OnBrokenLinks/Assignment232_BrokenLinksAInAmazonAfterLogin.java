package Assignment;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment233_BrokenLinksAInAmazonAfterLogin {
	public static void verify_each_Link(String url) throws 
	IOException
		{
		
		try
		{
			URL url1=new URL(url); 
			HttpsURLConnection url2=(HttpsURLConnection) url1.openConnection(); // can upcaste only explicilty as implicity mai error aayega 
			
			url2.connect();
			
			
			if(url2.getResponseCode()==200)
			{ 
				System.out.println("Link is valid ---->"+ url2.getResponseCode() +" --->  "+ url2.getResponseMessage() +" --->  " +url); //we can also get response message--> which means get the msg as Ok for 200 status code   and agar  401 ke liye check krte toh milta msg bad request and so on................ 
			} 
			else
			{
				System.out.println("Not Valid ---->"+ url2.getResponseCode() +" --->  "+ url2.getResponseMessage() +"  ---> " + url);
			}
		}
		catch(NullPointerException a1)
		{
			System.out.println("since url was null it was handled");
		}
		catch(MalformedURLException a1) //import its package also
		{
			System.out.println("Managed MalformedURLException too");
		}
	}
		
		public static void main(String[] args) throws IOException {
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26useRedirectOnSuccess%3D1%26signIn%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
			driver.manage().window().maximize();
			
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			//Click on email tab and enter ur emailor phone number 
	        driver.findElement(By.name("email")).sendKeys("+917834898482");
	        
	        //click on continue button
	        driver.findElement(By.id("continue")).click();
	        
	      //Click onpswd tab and enter ur  pswd
	        driver.findElement(By.name("password")).sendKeys("Himanshi21@Chauhan");
	        
	      
	        //click on sign-in button
	        driver.findElement(By.className("a-button-input")).click();
		
			List<WebElement> allLinks=driver.findElements(By.tagName("a"));
			 System.out.println(allLinks.size());  
			 
			
			 for(int i=0;i<=allLinks.size()-1;i++)
			 {
				 WebElement a1=allLinks.get(i);
			     String url =a1.getAttribute("href"); 
			     verify_each_Link(url); 
		     }
	   }
}


/*
------------------------------------------------OUTPUT-------------------------------------------------------------
May 30, 2024 4:22:53 PM org.openqa.selenium.devtools.CdpVersionFinder findNearestMatch
WARNING: Unable to find CDP implementation matching 125
May 30, 2024 4:22:53 PM org.openqa.selenium.chromium.ChromiumDriver lambda$new$5
WARNING: Unable to find version of CDP to use for 125.0.6422.112. You may need to include a dependency on a specific version of the CDP using something similar to `org.seleniumhq.selenium:selenium-devtools-v86:4.19.1` where the version ("v86") matches the version of the chromium-based browser you're using and the version number of the artifact is the same as Selenium's.
86
Managed MalformedURLException too
Managed MalformedURLException too
Link is valid ---->200 --->  OK --->  https://www.amazon.in/ref=nav_logo
Managed MalformedURLException too
Link is valid ---->200 --->  OK --->  https://www.amazon.in/customer-preferences/edit?ie=UTF8&preferencesReturnUrl=%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26useRedirectOnSuccess%3D1%26signIn%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&ref_=topnav_lang
Not Valid ---->403 --->  Forbidden  ---> https://www.amazon.in/gp/css/homepage.html?ref_=nav_youraccount_btn
Not Valid ---->503 --->  Service Unavailable  ---> https://www.amazon.in/gp/flex/sign-out.html?path=%2Fgp%2Fyourstore%2Fhome&useRedirectOnSuccess=1&signIn=1&action=sign-out&ref_=nav_signout
Not Valid ---->503 --->  Service Unavailable  ---> https://www.amazon.in/gp/css/order-history?ref_=nav_orders_first
Link is valid ---->200 --->  OK --->  https://www.amazon.in/gp/cart/view.html?ref_=nav_cart
Managed MalformedURLException too
Not Valid ---->404 --->  Not Found  ---> https://www.amazon.in/fresh?ref_=nav_cs_grocery
Link is valid ---->200 --->  OK --->  https://www.amazon.in/minitv?ref_=nav_avod_desktop_topnav
Link is valid ---->200 --->  OK --->  https://www.amazon.in/b/32702023031?node=32702023031&ld=AZINSOANavDesktop_T3&ref_=nav_cs_sell_T3
Link is valid ---->200 --->  OK --->  https://www.amazon.in/gift-card-store/b/?ie=UTF8&node=3704982031&ref_=nav_cs_gc
Link is valid ---->200 --->  OK --->  https://www.amazon.in/gp/sva/dashboard?ref_=nav_cs_apay
Not Valid ---->503 --->  Service Unavailable  ---> https://www.amazon.in/gp/buyagain?ie=UTF8&ref_=nav_cs_buy_again
Link is valid ---->200 --->  OK --->  https://www.amazon.in/coupons?ref_=nav_cs_coupons
Link is valid ---->200 --->  OK --->  https://www.amazon.in/health-and-personal-care/b/?ie=UTF8&node=1350384031&ref_=nav_cs_hpc
Link is valid ---->200 --->  OK --->  https://www.amazon.in/Books/b/?ie=UTF8&node=976389031&ref_=nav_cs_books
Link is valid ---->200 --->  OK --->  https://www.amazon.in/gcx/-/gfhz/?ref_=nav_cs_giftfinder
Link is valid ---->200 --->  OK --->  https://www.amazon.in/b/?node=6637738031&ref_=nav_cs_amazonbasics
Link is valid ---->200 --->  OK --->  https://www.amazon.in/deals?ref_=nav_cs_gb
Link is valid ---->200 --->  OK --->  https://www.amazon.in/gp/history?ref_=nav_cs_timeline
Link is valid ---->200 --->  OK --->  https://www.amazon.in/Home-Improvement/b/?ie=UTF8&node=4286640031&ref_=nav_cs_hi
Not Valid ---->403 --->  Forbidden  ---> https://www.amazon.in/gp/help/customer/display.html?nodeId=200507590&ref_=nav_cs_help
Link is valid ---->200 --->  OK --->  https://www.amazon.in/gp/yourstore/home?ref_=nav_cs_ys
Link is valid ---->200 --->  OK --->  https://www.amazon.in/gp/new-releases/?ref_=nav_cs_newreleases
Link is valid ---->200 --->  OK --->  https://www.amazon.in/gp/bestsellers/?ref_=nav_cs_bestsellers
Link is valid ---->200 --->  OK --->  https://www.amazon.in/Home-Kitchen/b/?ie=UTF8&node=976442031&ref_=nav_cs_home
Link is valid ---->200 --->  OK --->  https://www.amazon.in/Toys-Games/b/?ie=UTF8&node=1350380031&ref_=nav_cs_toys
Link is valid ---->200 --->  OK --->  https://www.amazon.in/gp/browse.html?node=6648217031&ref_=nav_cs_fashion
Not Valid ---->429 --->  Too Many Requests  ---> https://www.amazon.in/prime?ref_=nav_cs_primelink_nonmember
Link is valid ---->200 --->  OK --->  https://www.amazon.in/beauty/b/?ie=UTF8&node=1355016031&ref_=nav_cs_beauty
Link is valid ---->200 --->  OK --->  https://www.amazon.in/computers-and-accessories/b/?ie=UTF8&node=976392031&ref_=nav_cs_pc
Link is valid ---->200 --->  OK --->  https://www.amazon.in/auto-deliveries/landing?ref_=nav_cs_sns
Link is valid ---->200 --->  OK --->  https://www.amazon.in/Sports/b/?ie=UTF8&node=1984443031&ref_=nav_cs_sports
Link is valid ---->200 --->  OK --->  https://www.amazon.in/electronics/b/?ie=UTF8&node=976419031&ref_=nav_cs_electronics
Link is valid ---->200 --->  OK --->  https://www.amazon.in/Pet-Supplies/b/?ie=UTF8&node=2454181031&ref_=nav_cs_pets
Not Valid ---->503 --->  Service Unavailable  ---> https://www.amazon.in/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles
Link is valid ---->200 --->  OK --->  https://www.amazon.in/Kindle-eBooks/b/?ie=UTF8&node=1634753031&ref_=nav_cs_kindle_books
Link is valid ---->200 --->  OK --->  https://www.amazon.in/Car-Motorbike-Store/b/?ie=UTF8&node=4772060031&ref_=nav_cs_automotive
Link is valid ---->200 --->  OK --->  https://www.amazon.in/video-games/b/?ie=UTF8&node=976460031&ref_=nav_cs_video_games
Link is valid ---->200 --->  OK --->  https://www.amazon.in/gp/yourstore/home/?ie=UTF8&ref_=topnav_storetab_ys
Link is valid ---->200 --->  OK --->  https://www.amazon.in/gp/history/?ie=UTF8&ref_=sv_ys_1
Link is valid ---->200 --->  OK --->  https://www.amazon.in/gp/yourstore/recs/?ie=UTF8&ref_=sv_ys_2
Not Valid ---->503 --->  Service Unavailable  ---> https://www.amazon.in/gp/yourstore/iyr/?ie=UTF8&ref_=sv_ys_3
Not Valid ---->404 --->  Not Found  ---> https://www.amazon.in/gp/pdp/profile/?ie=UTF8&ref_=sv_ys_4
Not Valid ---->403 --->  Forbidden  ---> https://www.amazon.in/gp/help/customer/display.html/?ie=UTF8&nodeId=200522750&ref_=sv_ys_5
Managed MalformedURLException too
Link is valid ---->200 --->  OK --->  https://www.amazon.in/gp/history
Managed MalformedURLException too
Link is valid ---->200 --->  OK --->  https://www.aboutamazon.in/?utm_source=gateway&utm_medium=footer
Link is valid ---->200 --->  OK --->  https://amazon.jobs/
Link is valid ---->200 --->  OK --->  https://press.aboutamazon.in/?utm_source=gateway&utm_medium=footer
Link is valid ---->200 --->  OK --->  https://www.amazon.science/
Link is valid ---->200 --->  OK --->  https://www.amazon.in/gp/redirect.html/ref=footer_fb?location=http://www.facebook.com/AmazonIN&token=2075D5EAC7BB214089728E2183FD391706D41E94&6
Link is valid ---->200 --->  OK --->  https://www.amazon.in/gp/redirect.html/ref=footer_twitter?location=http://twitter.com/AmazonIN&token=A309DFBFCB1E37A808FF531934855DC817F130B6&6
Link is valid ---->200 --->  OK --->  https://www.amazon.in/gp/redirect.html?location=https://www.instagram.com/amazondotin&token=264882C912E9D005CB1D9B61F12E125D5DF9BFC7&source=standards
Link is valid ---->200 --->  OK --->  https://www.amazon.in/b/?node=2838698031&ld=AZINSOANavDesktopFooter_C&ref_=nav_footer_sell_C
Link is valid ---->200 --->  OK --->  https://accelerator.amazon.in/?ref_=map_1_b2b_GW_FT
Link is valid ---->200 --->  null --->  https://brandservices.amazon.in/?ref=AOINABRLGNRFOOT&ld=AOINABRLGNRFOOT
Link is valid ---->200 --->  OK --->  https://sell.amazon.in/grow-your-business/amazon-global-selling.html?ld=AZIN_Footer_V1&ref=AZIN_Footer_V1
Link is valid ---->200 --->  OK --->  https://affiliate-program.amazon.in/?utm_campaign=assocshowcase&utm_medium=footer&utm_source=GW&ref_=footer_assoc
Not Valid ---->404 --->  Not Found  ---> https://services.amazon.in/services/fulfilment-by-amazon/benefits.html/ref=az_footer_fba?ld=AWRGINFBAfooter
Link is valid ---->200 --->  OK --->  https://advertising.amazon.in/?ref=Amz.in
Link is valid ---->200 --->  OK --->  https://www.amazonpay.in/merchant
Not Valid ---->403 --->  Forbidden  ---> https://www.amazon.in/gp/help/customer/display.html?nodeId=GDFU3JS5AL6SYHRD&ref_=footer_covid
Not Valid ---->403 --->  Forbidden  ---> https://www.amazon.in/gp/css/homepage.html?ref_=footer_ya
Not Valid ---->503 --->  Service Unavailable  ---> https://www.amazon.in/gp/css/returns/homepage.html?ref_=footer_hy_f_4
Not Valid ---->403 --->  Forbidden  ---> https://www.amazon.in/gp/help/customer/display.html?nodeId=201083470&ref_=footer_swc
Link is valid ---->200 --->  OK --->  https://www.amazon.in/gp/browse.html?node=6967393031&ref_=footer_mobapp
Not Valid ---->403 --->  Forbidden  ---> https://www.amazon.in/gp/help/customer/display.html?nodeId=200507590&ref_=footer_gw_m_b_he
Not Valid ---->503 --->  Service Unavailable  ---> https://www.amazon.in/ref=footer_logo
Link is valid ---->200 --->  OK --->  https://www.amazon.in/customer-preferences/edit?ie=UTF8&preferencesReturnUrl=%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26useRedirectOnSuccess%3D1%26signIn%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&ref_=footer_lang
Link is valid ---->200 --->  OK --->  https://www.amazon.in/customer-preferences/country?ie=UTF8&preferencesReturnUrl=%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26useRedirectOnSuccess%3D1%26signIn%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&ref_=footer_icp_cp
Link is valid ---->200 --->  OK --->  https://www.abebooks.com/
Link is valid ---->200 --->  null --->  https://aws.amazon.com/what-is-cloud-computing/?sc_channel=EL&sc_campaign=IN_amazonfooter
Link is valid ---->200 --->  OK --->  https://www.audible.in/
Not Valid ---->403 --->  Forbidden  ---> https://www.imdb.com/
Link is valid ---->200 --->  OK --->  https://www.shopbop.com/
Link is valid ---->200 --->  OK --->  https://www.amazon.in/business?ref=footer_aingw
Link is valid ---->200 --->  OK --->  https://www.amazon.in/now?ref=footer_amznow
Link is valid ---->200 --->  OK --->  https://www.amazon.in/music/prime?ref=footer_apm
Not Valid ---->403 --->  Forbidden  ---> https://www.amazon.in/gp/help/customer/display.html?nodeId=200545940&ref_=footer_cou
Not Valid ---->403 --->  Forbidden  ---> https://www.amazon.in/gp/help/customer/display.html?nodeId=200534380&ref_=footer_privacy
Not Valid ---->403 --->  Forbidden  ---> https://www.amazon.in/gp/help/customer/display.html?nodeId=202075050&ref_=footer_iba

*/