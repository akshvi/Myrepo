package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Calender 
{
			static WebDriver driver;
			static String adult ="6";
			static String child ="1";
			static String infant ="0";
		
	
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://book.spicejet.com/");
		driver.manage().window().maximize();
		//RoundTrip	
		String fromplace="Hyderabad (HYD)";
		String toplace="Mumbai (BOM)";
			
		//clicked on RoundTrip
		driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_RoundTrip")).click();
		
		//clicked on departure
		driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT")).click();
		Thread.sleep(2000);

		//webelement for departure
		List<WebElement> depart=driver.findElements(By.xpath("//a"));
		
		for (WebElement select:depart)
		{
			//System.out.println(select.getSize());
			
			if(select.getText().equals(fromplace))
			{
				select.click();
				System.out.println(select.getText());

				break;
			}
		}
		
		//arrival
		List<WebElement> arrival=driver.findElements(By.xpath("//a"));
		for(WebElement select:arrival)
		{
			if(select.getText().equals(toplace))
			{
				select.click();
				System.out.println(select.getText());
				break;
			}
		}
	
	///////calender
		driver.findElement(By.id("custom_date_picker_id_1")).click();	

		for(int i=1;i<=10;i++)
		{
			String GoMonth="June 2023";
			String GoDate="15";
			String first= driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']/div/div")).getText();
			String last= driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-last']/div/div")).getText();

			if(first.equals(GoMonth))
				{
					System.out.println(first);
					List<WebElement> eachday=driver.findElements(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']//a[@class='ui-state-default']"));
					for(WebElement date:eachday)
					{
						if(date.getText().equals(GoDate))
						{
							date.click();
							System.out.println(date.getText());
						}
					}		
					break;
				}
			
				else if(last.equals(GoMonth))
				{	
					System.out.println(last);
					List<WebElement> eachday=driver.findElements(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-last']//a[@class='ui-state-default']"));
					for(WebElement date:eachday)
					{

						if(date.getText().equals(GoDate))
						{
							date.click();
							System.out.println(date.getText());
						}
					}						
					break;
				}
			
				else
				{				
					driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
				}
		}


		driver.findElement(By.id("custom_date_picker_id_2")).click();
		String BackMonth="September 2023";
		String BackDate="25";							
		
		for(int i=1;i<=10;i++)
		{
			String first= driver.findElement(By.xpath("//div[@class='ui-datepicker-header ui-widget-header ui-helper-clearfix ui-corner-left']/div")).getText();
			String last= driver.findElement(By.xpath("//div[@class='ui-datepicker-header ui-widget-header ui-helper-clearfix ui-corner-right']/div")).getText();
			
			if(first.equals(BackMonth))
				{
					System.out.println(first);
					List<WebElement> eachday=driver.findElements(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']//a[@class='ui-state-default']"));
					for(WebElement date:eachday)
					{

						if(date.getText().equals(BackDate))
						{
							System.out.println(date.getText());
							date.click();
							
						}
					}		
					break;
				}
			
			
				else if(last.equals(BackMonth))
				{	
					System.out.println(last);
					List<WebElement> eachday=driver.findElements(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-last']//a[@class='ui-state-default']"));
					for(WebElement date:eachday)
					{

						if(date.getText().equals(BackDate))
						{
							JavascriptExecutor executor1 = (JavascriptExecutor)driver;
							executor1.executeScript("arguments[0].click();",date);
							
				//			date.click();
							System.out.println(date.getText());
						}
					}						
					break;

				}
				else
				{				
					driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
				}
		}
	
		
		driver.findElement(By.id("divpaxinfo")).click();////passengers
		
		
		Select adultdrop= new Select(driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_ADT")));
		adultdrop.selectByValue(adult);
		System.out.println(adultdrop.getFirstSelectedOption().getText());
		
		Select childdrop= new Select(driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_CHD")));
		childdrop.selectByValue(child);
		System.out.println(childdrop.getFirstSelectedOption().getText());
		
		Select infantdrop= new Select(driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_INFANT")));
		childdrop.selectByValue(infant);
		System.out.println(infantdrop.getFirstSelectedOption().getText());
		
		
	}

}
