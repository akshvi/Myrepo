package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Demosite {

	public static void main(String[] args) 
	{
		WebDriver driver;
		
		System.setProperty("Webdriver.chrome.driver","C://chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/");
		driver.manage().window().maximize();
		
			
		driver.findElement(By.xpath("//div[@class='col-xs-7 col-xs-offset-4 ']//a")).click();
		driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[1]/div[1]/input")).sendKeys("ashu");
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).sendKeys("birelliwar");
		
		driver.findElement(By.xpath("//textarea[@class='form-control ng-pristine ng-untouched ng-valid']")).sendKeys("ward no 1234");
		
		driver.findElement(By.xpath("//input[@class='form-control ng-pristine ng-untouched ng-valid-email ng-invalid ng-invalid-required']")).sendKeys("adbire@gmail.com");

		driver.findElement(By.xpath("//input[@class='form-control ng-pristine ng-untouched ng-invalid ng-invalid-required ng-valid-pattern']")).sendKeys("1234");

		
									///// GENDER	////	

		String gender="Female";

		if(gender.equals("male"))
		{
			driver.findElement(By.xpath("//input[@class='ng-pristine ng-untouched ng-invalid ng-invalid-required']")).click();
			System.out.println(gender);

		}
		else
		{
			driver.findElement(By.xpath("//input[@class='ng-pristine ng-untouched ng-valid']")).click();
			System.out.println(gender);

		}
		
		
								///// HOBBIES	////	

		String hob="Movies";
		String hobcheck="checkbox2";
		
		List<WebElement> hobbies=driver.findElements(By.xpath("//div[@class='form-group']/div[@class='col-md-4 col-xs-4 col-sm-4']/div"));
		for(WebElement h:hobbies)
		{
		
			if(h.getText().equals(hob))
			{
				h.findElement(By.xpath("//div[@class='col-md-4 col-xs-4 col-sm-4']/div/input[@id='"+hobcheck+"']")).click();
				System.out.println(h.getText());

			}
			
		}
		
										///// LANGUAGE	////	
		String lang="English";
		String lang1="Urdu";
		driver.findElement(By.id("msdd")).click();
		
		List<WebElement> languages=driver.findElements(By.xpath("//div[@style='display: block;']/ul/li/a"));
System.out.println(languages.size());
		for(int i=1;i<=languages.size();i++)
		{
		for(WebElement select:languages)
		{
/*
			if(select.getText().equals(lang))
			{
				select.click();
			}
	*/
			
			switch(select.getText())
		{
			case "English" : System.out.println(select.getText());
								select.click();
								break;
							 
							 
			case "Urdu": System.out.println(select.getText());
							select.click();
							break;
							
			case "Thai": System.out.println(select.getText());
							select.click();
							break;
						
			}
		}
			
			
			
		}
		
	/*	WebElement option1=driver.findElement(By.xpath("//li[@class='ng-scope'][8]"));
		WebElement option2=driver.findElement(By.xpath("//li[@class='ng-scope'][24]"));
		WebElement option3=driver.findElement(By.xpath("//li[@class='ng-scope'][40]"));

		driver.findElement(By.id("msdd")).click();

		Actions lang=new Actions(driver);
		lang.moveToElement(option3).click().perform();
		System.out.println(option3);
		
		lang.moveToElement(option1).click().perform();
		System.out.println(option1);

		lang.moveToElement(option2).click().perform();
		System.out.println(option2);
*/
		
		
		/////skillss
		String skill="Microsoft Office";
		
		
		Select skills= new Select(driver.findElement(By.id("Skills")));
		skills.selectByValue(skill);	
		System.out.println(skill);
		
		
	}

}
