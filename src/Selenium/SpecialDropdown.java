package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpecialDropdown {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.airindia.in");
		driver.manage().window().maximize();

		//script to select origin
		String fromplace="Bangkok, Suvarnabhumi International Airport, BKK, Thailand, TH";
		String toplace="Ottawa, Ottawa Macdonald Cartier International Airport, YOW, Canada, CA";
		
		//for fromplace
		driver.findElement(By.id("from")).sendKeys("ban");
		Thread.sleep(2000);
		List<WebElement> fromoptions = driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));
			for (WebElement place:fromoptions)
			{
				System.out.println(place.getText());
				if(place.getText().equals(fromplace))
				{
					place.click();
					break;
				}

			}
			
		//for toplace
		driver.findElement(By.id("to")).sendKeys("can");
		Thread.sleep(5000);
		List<WebElement> tooptions=driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));
			for(WebElement destination:tooptions)
			{
				System.out.println(destination.getText());
				if(destination.getText().equals(toplace))
				{
					destination.click();
					break;
				}
			}
		
		
	}

}
