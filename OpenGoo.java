package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;



public class OpenGoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/home/dakshinkumartk/Documents/SEL/chromedriver");
		


        WebDriver driver = new ChromeDriver();
        driver.get("https://portal.urjanet.net");
        //search some
        driver.findElement(By.name("username")).sendKeys("dakshin.kumaran");
        driver.findElement(By.name("password")).sendKeys("*********"+Keys.ENTER);
        
        //driver.findElement(By.xpath("//*[@id=\'global-msgs\']/div/a")).click();
        driver.findElement(By.xpath("//*[@id=\'s2id_customerSelect\']/a")).click();
        driver.findElement(By.xpath("//*[@id='select2-drop']/div/input")).sendKeys("goby"+Keys.ENTER);
        
       // driver.navigate().to("https://portal.urjanet.net/credentialmanager");
        
        driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
        driver.navigate().to("https://portal.urjanet.net/credentialmanager");
        //WebElement drop = driver.findElement(By.className("dropdown-toggle"));
        	//Select select = new Select(drop);
        //select.selectByVisibleText("credentials");
        //driver.close();
        //driver.findElement(By.xpath("//*[@id=\'searchBarFirstRow\']/input[1]")).clear();
	}
	////*[@id='searchBarFirstRow']/input[1]
	

}
