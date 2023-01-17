package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckbox {

	public static void main(String[] args)
	{
		//Script to Execute the code in Chrome
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://book.spicejet.com/");
		driver.manage().window().maximize();

		int countcheckbox = driver.findElements(By.xpath("//input[@type='checkbox']")).size();
		System.out.println(countcheckbox);

		//script to select an option

		/* System.out.println(driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_Student")).isSelected());
		driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_Student")).click();
		System.out.println(driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_Student")).isSelected());

		*/
		String discountvalue =  "Family & Friends";
		List<WebElement>  discounts = driver.findElements(By.xpath("//div[@id='divdiscountcheckbox']/div/div/p"));
		
		for (WebElement singleoption : discounts )
		{
			String singlevalue=singleoption.getText();
			
			if (singlevalue.equals(discountvalue))
				{
					singleoption.findElement(By.xpath("//*[@id=\"ControlGroupSearchView_AvailabilitySearchInputSearchView_FamilyAndFriends\"]")).click();
					System.out.println(singleoption.getText());
					
				}
		}
	}

}
