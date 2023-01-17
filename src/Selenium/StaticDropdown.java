package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown 
{
	
		static WebDriver driver;
	/*	static String adultvalue = "3";
		static String childvalue = "2";
		static String infantvalue= "3";
	*/	
		public void login()
		{
			ChromeOptions option=new ChromeOptions();//popup
			option.addArguments("--disable-noticification");

			System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
			driver = new ChromeDriver(option);
		
			driver.get("https://book.spicejet.com/");
			driver.manage().window().maximize();
		}
		
		public void method(String adultvalue,String childvalue,String infantvalue )
		{
			Select currencydropdown = new Select(driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListCurrency")));
			currencydropdown.selectByIndex(8);
			System.out.println(currencydropdown.getFirstSelectedOption().getText());
			
			driver.findElement(By.id("divpaxinfo")).click();
			Select adultdropdown = new Select(driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_ADT")));
			adultdropdown.selectByValue(adultvalue);
			//adultdropdown.selectByIndex(2);
			System.out.println(adultdropdown.getFirstSelectedOption().getText());
			
			//script for child dropdown
			Select childdropdown = new Select(driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_CHD")));
			childdropdown.selectByValue(childvalue);
			System.out.println(childdropdown.getFirstSelectedOption().getText());
			
			WebElement childelement = driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_INFANT"));
			Select infantdropdown = new Select(childelement);
			infantdropdown.selectByVisibleText(infantvalue);
			//infantdropdown.selectByValue(infantvalue);
			System.out.println(infantdropdown.getFirstSelectedOption().getText());

			//to get the Passengerdropdown value and validate it
			String Actualvalue = driver.findElement(By.id("divpaxinfo")).getText();
			System.out.println(Actualvalue);
			//3 Adult, 2 Child, 3 Infant
			String Expectedvalue= (adultvalue +" Adult"+", "+childvalue+" Child"+", "+infantvalue+" Infant");
			System.out.println(Actualvalue.equals(Expectedvalue));

		}
		
		public static void main(String[] args)
		{
		//Static Dropdown
		//If you find any dropdown with tagname Select, then selenium has a class to identify element.
		//we need to create an object for that select class
		//there is no tagname select, then we cant use the select method
		

		//Script to select the currency dropdown
		//create an object of select class
/*			
		Select currencydropdown = new Select(driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListCurrency")));
		//System.out.println(currencydropdown.getFirstSelectedOption().getText());
		//currencydropdown.selectByValue("EUR");
		//currencydropdown.selectByVisibleText("MYR");
		currencydropdown.selectByIndex(8);
		System.out.println(currencydropdown.getFirstSelectedOption().getText());
		

		//script to select Passenger information
		driver.findElement(By.id("divpaxinfo")).click();
		Select adultdropdown = new Select(driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_ADT")));
		adultdropdown.selectByValue(adultvalue);
		//adultdropdown.selectByIndex(2);
		System.out.println(adultdropdown.getFirstSelectedOption().getText());

		//script for child dropdown
		Select childdropdown = new Select(driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_CHD")));
		childdropdown.selectByValue(childvalue);
		System.out.println(childdropdown.getFirstSelectedOption().getText());

		WebElement childelement = driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_INFANT"));
		Select infantdropdown = new Select(childelement);
		infantdropdown.selectByVisibleText(infantvalue);
		System.out.println(infantdropdown.getFirstSelectedOption().getText());

		//to get the Passengerdropdown value and validate it
		String Actualvalue = driver.findElement(By.id("divpaxinfo")).getText();
		System.out.println(Actualvalue);
		//3 Adult, 2 Child, 3 Infant
		String Expectedvalue= (adultvalue +" Adult"+", "+childvalue+" Child"+", "+infantvalue+" Infant");
		System.out.println(Actualvalue.equals(Expectedvalue));

	*/	
			
		StaticDropdown mcall= new StaticDropdown();
		//mcall.switchTo().alert().dismiss();
		mcall.login();
		mcall.method("2","2","3");
		
			
	}
		
		
		
}
