package Scripts;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import poms.GooglePage;
import poms.TAP;

public class Sesion6 {
	private WebDriver driver; 
	  
    
	   @Before 
	   public void setUp() { 
	    ChromeOptions options = new ChromeOptions(); 
	    options.addArguments("--remote-allow-origins=*"); 
	    System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe"); 
	    driver = new ChromeDriver(options); 
	   
	    
	   } 
	    
	   @Test 
	    
	   public void test() throws InterruptedException { 
	   /* driver.get("https:/www.google.com"); 
	    GooglePage gp = new GooglePage(driver);
	    TAP tap = new TAP(driver);
	    Thread.sleep(3000); 
	    gp.typeOnSearchBar("test automation practice");
	    Thread.sleep(3000);

	    gp.clickResultById(1);
	    tap.clickOnLogo();*/
	    
	   driver.get("https://testautomationpractice.blogspot.com/");
	   
	   //driver.get("https://www.youtube.com/");
	   TAP tap = new TAP(driver);
	   tap.clickOnLogo();
	   tap.clickOnLogo();
	   tap.clickOnLogo();
	   tap.clickOnLogo();
	  // tap.clickOnGoogle();
	  // tap.clickOnYouTube();
	   //tap.typeOnSearchBar("Google");
	   ArrayList<String> tabs2= new ArrayList<String> (driver.getWindowHandles());
	   System.out.println(driver.getTitle());
	      driver.switchTo().window(tabs2.get(1));
	      driver.get("https://www.youtube.com/");
	      driver.switchTo().window(tabs2.get(2));
	      driver.get("https://www.google.com/");
	      driver.switchTo().window(tabs2.get(3));
	      driver.get("https://www.amazon.com.mx/");
	      driver.switchTo().window(tabs2.get(4));
	      driver.get("https://www.mercadolibre.com.mx/");
	    
	      for (int i=0; i< tabs2.size(); i++) {
	         Thread.sleep(1000); 
	         driver.switchTo().window(tabs2.get(i));
	         if(driver.getTitle().equals("YouTube")) {
	           System.out.println(driver.getTitle());
	           break;
	         }
	      }
	   
	   
	   /*System.out.println(driver.getTitle());
	   driver.switchTo().window(tabs2.get(1));
	   System.out.println(driver.getTitle());*/
	   
	   
	   /*TAP tap1 = new TAP (driver);
	   tap1.clickOnGoogle();
	   ArrayList<String> tabs3= new ArrayList<String> ();
	   System.out.println(driver.getTitle());
	   driver.switchTo().window(tabs3.get(2));
	   System.out.println(driver.getTitle());*/
	   
	       
	   }
	   @After 
	   public void teardown() { 
	     
	    //driver.quit(); 
	   } 
	}
