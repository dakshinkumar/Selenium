package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Texting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","/home/dakshinkumartk/Documents/SEL/chromedriver");
		
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.leafground.com/pages/Edit.html");
        //search some
     WebElement hi=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/input"));
   hi.sendKeys("HI"+Keys.TAB);
   
    // String valuee =   driver.findElement(By.name("username")).getAttribute("value");
   //converting with webelement
   //last function type need to been given find element is webelement,get attribude is string like that.
   WebElement val= driver.findElement(By.name("username"));
   String valuee =val.getAttribute("value");
   System.out.println(valuee);
   
   WebElement name= driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[5]/div/div/input"));
   String prin= name.getAttribute("disabled");
   System.out.println(prin);
   //or
   Boolean st= name.isEnabled();
   System.out.println(st);
   }

}
