package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver","/home/dakshinkumartk/Documents/SEL/chromedriver");
		
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.leafground.com/pages/Window.html");
        String oldwin = driver.getWindowHandle();
        driver.findElement(By.xpath("//*[@id='home']")).click();
        Set<String> newwin = driver.getWindowHandles();
        
        for (String anyname : newwin) {
        	//"for each" is  name of above string will happens for num of name present (i.e no of tab)
        	driver.switchTo().window(anyname);
        }
       			driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[1]/a/img")).click();
		driver.close();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
        int num = driver.getWindowHandles().size();     
        System.out.println(num);
    
         
       
        
        
    
	}
	

}
