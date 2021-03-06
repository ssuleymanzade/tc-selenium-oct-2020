package net.techcenture.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearningFindElement {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("http://automationpractice.com/");
		
		//Contact Us Button
//		WebElement e = driver.findElement(By.xpath("//*[@id=\"contact-link\"]/a"));
//		e.click();
		
		//Sign in button
//		WebElement e = driver.findElement(By.className("login"));
//		e.click();
		
		//Search textbox
//		WebElement searchbox = driver.findElement(By.id("search_query_top"));
//		searchbox.sendKeys("Summer Dress");
		
		WebElement phoneNumberElement = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/span/strong"));
		String phoneNumber = phoneNumberElement.getText();
		System.out.println(phoneNumber);
		
	}

}
