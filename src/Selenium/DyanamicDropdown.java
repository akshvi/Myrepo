package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DyanamicDropdown 
{
	static WebDriver driver;

	public void Destination(String from,String to)
	{
	driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT")).click();
	
	driver.findElement(By.xpath("//a[@value='"+from+"']")).click();
	driver.findElement(By.xpath("//a[@value='"+to+"']")).click();
	
	String Actual=driver.findElement(By.cssSelector("input.select_CTXT")).getText();
	System.out.println(Actual);

	String Actual1=	driver.findElement(By.xpath("//a[@value='"+from+"']")).getText();
	System.out.println(Actual1);

	String Expected="Bhopal ("+from+")";
	System.out.println(Expected);

	System.out.println(Actual1.equals(Expected));
	
	
	}

	public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	driver = new ChromeDriver();

	driver.get("https://book.spicejet.com/");
	driver.manage().window().maximize();

	DyanamicDropdown dropdown = new DyanamicDropdown();
	dropdown.Destination("BHO","MAA");

	/*//Script to forcible click on webelement
	driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT")).click();
	driver.findElement(By.xpath("//a[@value='BLR']")).click();
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//a[@value='COK']")));
*/
	//dropdown.Destination();



	}

}
