package Scripts;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import poms.Amazon;
import poms.GooglePage;
import poms.TAP;

public class Sesion5 {
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
	    driver.get("https:/www.google.com"); 
	    GooglePage gp = new GooglePage(driver);
	    Amazon ama = new Amazon(driver);
	    Thread.sleep(3000); 
	    gp.typeOnSearchBar("Amazon");
	    Thread.sleep(3000);
	    gp.clickResultById(0);
	    //busca celulares 
	    ama.typeOnSearchBarAmazon("Celulares");
	    //busca celulares samsung
	    ama.clickOnSamsung();
	   }
	   @After 
	   public void teardown() { 
	     
	    //driver.quit(); 
	   } 
	}
