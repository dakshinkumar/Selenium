package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TrySky {

	public static void main(String[] args)   {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","/home/dakshinkumartk/Documents/SEL/chromedriver");
		 WebDriver driver = new ChromeDriver();
		driver.get("https://skylight.urjanet.net/login");
		driver.findElement(By.id("username")).sendKeys("dakshin.kumaran");
		driver.findElement(By.id("password")).sendKeys("Dakshin*0010"+Keys.ENTER);
		
		
		
		WebElement cust = driver.findElement(By.xpath("//*[@id=\'searchBarFirstRow\']/button[2]/span[1]"));
		cust.click();
		driver.findElement(By.xpath("/html/body/ul[2]/li[6]")).click();
		//cust.sendKeys("timewarner");
		
		
		
		driver.findElement(By.xpath("//*[@id=\'searchBarFirstRow\']/button[1]")).click();
		
		WebElement ame= driver.findElement(By.xpath("/html/body/ul[1]/li[10]/a"));
		ame.click();
	}

}
