package poms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TAP {
	WebDriver driver;
	String alertButtonXpath = "//button[text()='Click Me']";
	String text = "//select[@name='files']";
	String speedXpath = "//select[@name='speed']";
	String index = "//*[@id=\"number\"]";
	String text0 = "//select[@name='files']" + "//select[@name='speed']"+"//*[@id=\\\"number\\\"]";

	public TAP(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public void ClickAlertButton() {
		WebElement button = this.driver.findElement(By.xpath(this.alertButtonXpath));
		button.click();
	}
	public void acceptArlet() {
		  this.driver.switchTo().alert().dismiss();;
	  }
	public void cancelArlet() {
		  this.driver.switchTo().alert().accept();
	  }
	public void printText() {
		WebElement fr = this.driver.findElement(By.xpath(this.text));
		System.out.println(fr.getText());
	}
	
	public String selectCheckBoxByValue(String option) {
		String value = "";
		Select cb = new Select(this.driver.findElement(By.xpath(text)));
		List<WebElement> options = cb.getOptions();
		for(WebElement element:options) {
			String auxValue = element.getAttribute("value");
			if(auxValue.equals(option)) {
				value = element.getText();
			}
		}
		cb.selectByValue(option);
		return value;
	}
	
	public String selectCheckBoxByText(String option) {
		String value = "";
		Select cb = new Select(this.driver.findElement(By.xpath(speedXpath)));
		List<WebElement> options = cb.getOptions();
		for(WebElement element:options) {
			String auxValue = element.getAttribute("value");
			if(auxValue.equals(option)) {
				value = element.getText();
			}
		}
		cb.selectByVisibleText(option);
		return value;
	}
	
	public String selectCheckBoxByIndex(String option) {
		String value = "";
		Select cb = new Select(this.driver.findElement(By.xpath(index)));
		List<WebElement> options = cb.getOptions();
		for(WebElement element:options) {
			String auxValue = element.getAttribute("value");
			if(auxValue.equals(option)) {
				value = element.getText();
			}
		}
		cb.selectByVisibleText(option);
		return value;
	}
	
	public void clickOnLogo() {
		String LogoXpath = "//*[@id=\"Wikipedia1_wikipedia-search-form\"]/div/span[1]/a/img";
		WebElement Lx = driver.findElement(By.xpath(LogoXpath));
		Lx.click();
	
	}
	
	public void clickOnGoogle() {
		String GoogleXpath = "Google";
		WebElement gg = driver.findElement(By.xpath(GoogleXpath));
		gg.click();
		
	}
	
	public void clickOnYouTube() {
		String YouTubeXpath = "YouTube";
		WebElement yy= driver.findElement(By.xpath(YouTubeXpath));
		yy.click();
		
	}
	
	/*public void typeOnSearchBar(String value) {
	    String searchBarId = "Google";
		WebElement searchBar = driver.findElement(By.id(searchBarId));
	    searchBar.sendKeys();
	    searchBar.sendKeys(Keys.ENTER);
	  }*/
	
}
