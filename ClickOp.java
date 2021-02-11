package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","/home/dakshinkumartk/Documents/SEL/chromedriver");
		
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.leafground.com/pages/checkbox.html");
        driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div[1]/input")).click();
        
		WebElement check = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/input"));
		boolean onevalue = check.isSelected();
		System.out.println(onevalue);
		
		WebElement box1= driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div[2]/input"));
		
		if (box1.isSelected()) {
			box1.click();
		}
		
	//repeat for all box
	}

}
