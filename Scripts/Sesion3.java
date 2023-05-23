package Scripts;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import poms.GooglePage;
import poms.TAP;

public class Sesion3 {
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
	    TAP tap = new TAP(driver);
	    Thread.sleep(3000); 
	    gp.typeOnSearchBar("test automation practice");
	    Thread.sleep(3000);

	    gp.clickResultById(0);
	    
	    tap.ClickAlertButton();
	    Thread.sleep(3000);
	    tap.acceptArlet();
	    tap.printText();
	    
	    Thread.sleep(3000);
	    tap.ClickAlertButton();
	    Thread.sleep(3000);
	    tap.cancelArlet();
	    tap.printText();
	    //gp.printTitle();
	    //gp.printResults();
	    //gp.printParrafo();
	   }
	   @After 
	   public void teardown() { 
	     
	    //driver.quit(); 
	   } 
	}

