package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","/home/dakshinkumartk/Documents/SEL/chromedriver");
		
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.leafground.com/pages/Alert.html");
     WebElement clickone =   driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/button"));
		clickone.click();
		Alert once = driver.switchTo().alert();
		once.accept();
		WebElement confirmcancel=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
		confirmcancel.click();
		Alert cancell= driver.switchTo().alert();
		Thread.sleep(3000);
		cancell.dismiss();//cancel is dismiss
		
		driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/button")).click();
		Alert enterdata = driver.switchTo().alert();//important line
		enterdata.sendKeys("hisfsfsaf");
		Thread.sleep(3000);
		enterdata.accept();
	}

}
