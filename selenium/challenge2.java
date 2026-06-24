package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class challenge2 {
	 public static void main(String[] args) throws InterruptedException {      
	        WebDriver driver = new FirefoxDriver();	     
	        driver.get("https://amazon.in");     
	        System.out.println("Page title: " + driver.getTitle());   
	        WebElement checkbox = driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
	        
	        checkbox.sendKeys("iphone 17 pro");
	        Thread.sleep(2000);
	     
	        driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
	        String message = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div/span[1]/div[1]/div[5]/div/div/span/div/div/div/div[2]/div")).getText();
	        System.out.println(message);     
	    }
	}