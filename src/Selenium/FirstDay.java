package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class FirstDay {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
		//System.setProperty("webdriver.ie.driver","C:\\IEdriverserver.exe");

		WebDriver d=new ChromeDriver();
	//	WebDriver d=new FirefoxDriver();
		//WebDriver d=new InternetExplorerDriver();

		d.get("https://accounts.google.com/ServiceLogin/signinchooser?service=mail&passive=1209600&osid=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&ifkv=AeAAQh58QsRYCu_3rj1v0ToB6sJ89uzP2bUrmWA8yKlo4o8DytRB9zR5xRDjnLDmf95cMv1tOB6F&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
		d.findElement(By.id("identifierId")).sendKeys("eswaravakarohini@gmail.com");

		d.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();

		d.findElement(By.name("password")).sendKeys("eswaravaka5.92");

		d.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/span]")).click();
		
		
		
	}

}
