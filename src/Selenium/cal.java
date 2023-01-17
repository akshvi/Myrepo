package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cal {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://book.spicejet.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_RoundTrip")).click();
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();",driver.findElement(By.id("custom_date_picker_id_1")));
	//	Thread.sleep(2000);
	//	driver.findElement(By.id("custom_date_picker_id_1")).click();	
		
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
		String GoMonth="September 2023";
		String GoDate="25";							
		
		for(int i=1;i<=10;i++)
		{
			String first= driver.findElement(By.xpath("//div[@class='ui-datepicker-header ui-widget-header ui-helper-clearfix ui-corner-left']/div")).getText();
			String last= driver.findElement(By.xpath("//div[@class='ui-datepicker-header ui-widget-header ui-helper-clearfix ui-corner-right']/div")).getText();
			
			if(first.equals(GoMonth))
				{
					System.out.println(first);
					List<WebElement> eachday=driver.findElements(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']//a[@class='ui-state-default']"));
					for(WebElement date:eachday)
					{

						if(date.getText().equals(GoDate))
						{
							System.out.println(date.getText());
							date.click();
							
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
	}
}
