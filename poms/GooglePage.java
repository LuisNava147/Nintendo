package poms;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;


public class GooglePage {
  
  WebDriver driver;
  String searchBarId = "APjFqb";
  String firstResult = "//h3[text()='Nintendo - Wikipedia']";
  String titulo = "firstHeading";
  String resultsClass = "//h3[@class='LC20lb MBeuO DKV0Md']";
  String parrafo3 = "";
  String parrafo2 = "";
  String parrafo1 = "/html/body/script[1]/text()";
  String resultsClassP = "//*[@id=\"mw-content-text\"]/div[1]/p";
  
//LC20lb MBeuO DKV0Md
//h3[@class='LC20lb MBeuO DKV0Md']
  
  public GooglePage(WebDriver driver) {
    super();
    this.driver = driver;
  }
  
  public void typeOnSearchBar(String value) {
    
    WebElement searchBar = driver.findElement(By.id(searchBarId));
    searchBar.sendKeys(value);
    searchBar.sendKeys(Keys.ENTER);
  }
  
  public void clickFirstResult() {
    WebElement fr = driver.findElement(By.xpath(firstResult));
    fr.click();
  }
  
  public void printFirstResult() {
    WebElement fr = driver.findElement(By.id(titulo));
    System.out.println(fr.getText());
  }
  
  public void clickResultById(int result) {
	  List <WebElement> list = driver.findElements(By.xpath(resultsClass));
	    
	  list.get(result).click();
  }
  
  public void printTitle() {
	  System.out.println(driver.getTitle());
  }
  public void printResults() {
	  List <WebElement> list = driver.findElements(By.xpath(resultsClass));
	  for(WebElement element: list) {
		  System.out.println(element.getText());
	  }
  }
  public void printParrafo() {
      List <WebElement> list = driver.findElements(By.xpath(resultsClassP));
      
      int i = 3;
      for(i=0; i>0; i--) {
        System.out.println(list.get(i).getText());
      }
      
      
   }
  
}