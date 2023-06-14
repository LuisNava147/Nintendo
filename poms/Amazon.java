package poms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Amazon {
	WebDriver driver;
	

	public Amazon(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public void typeOnSearchBarAmazon(String value) {
	    
		String searchBarId = "twotabsearchtextbox";
		WebElement searchBar = driver.findElement(By.id(searchBarId));
	    searchBar.sendKeys(value);
	    searchBar.sendKeys(Keys.ENTER);
	  }
	public void clickOnSamsung() {
		String SamsungXpath = "//*[@id=\"p_89/SAMSUNG\"]/span/a/span";
		WebElement Sx = driver.findElement(By.xpath(SamsungXpath));
		Sx.click();
		
	}
}



