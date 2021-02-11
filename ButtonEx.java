package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver","/home/dakshinkumartk/Documents/SEL/chromedriver");
		
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.leafground.com/pages/Button.html");
        WebElement place =driver.findElement(By.id("position"));
        Point xy=place.getLocation();
        int x= xy.getX();
        int y=xy.getY();
        System.out.println(x+"               "+y);
        
        String clorrr= driver.findElement(By.id("color")).getCssValue("background-color");
        System.out.println(clorrr);
       
        //next
        int height = driver.findElement(By.id("size")).getSize().height;
        System.out.println(height);
        int wei = driver.findElement(By.id("size")).getSize().width;
        System.out.println(wei);
	}

	
}
