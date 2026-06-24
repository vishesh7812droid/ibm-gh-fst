package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hello_Selenium {

    public static void main(String[] args) {

        // If geckodriver is NOT in PATH, uncomment and set path
        // System.setProperty("webdriver.gecko.driver", "C:\\drivers\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();

        try {
            // Open Google
            driver.get("https://www.google.com");

            // Find search box
            WebElement element = driver.findElement(By.name("q"));

            // Print some info
            System.out.println("Tag name: " + element.getTagName());
            System.out.println("Is displayed: " + element.isDisplayed());

            // Type something
            element.sendKeys("Hello Selenium");

        } finally {
            // Close browser
            driver.quit();
        }
    }
}