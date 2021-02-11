package selenium;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JiraTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","/home/dakshinkumartk/Documents/SEL/chromedriver");
		
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.leafground.com/pages/Link.html");
        //search some
        //driver.findElement(By.linkText("Verify am I broken?")).click();
        driver.findElement(By.partialLinkText("broken")).click();
        
        
	}
	}

