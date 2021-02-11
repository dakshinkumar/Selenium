package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/home/dakshinkumartk/Documents/SEL/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		//select will be present for dropdown
	
WebElement dropss=driver.findElement(By.id("dropdown1"));
	Select newone =new Select(dropss);
	newone.selectByIndex(1);
	Thread.sleep(3000);
	newone.selectByValue("3");
	Thread.sleep(3000);
	newone.selectByVisibleText("Selenium");
	Thread.sleep(3000);//3sec sleep for this throw exception added
	List<WebElement> listofitem= newone.getOptions();
	//list is collection of data <WebElement> 
	//it is present <> means it doesnt include any other items n it is called generics
	int numbers =listofitem.size();
    System.out.println(numbers);	
    
    dropss.sendKeys("loadrunner"); 
   WebElement multibox= driver.findElement(By.xpath("//*[@id='contentblock']/section/div[6]/select"));
    Select multiselect = new Select(multibox);
    multiselect.selectByValue("2");
    multiselect.selectByValue("2");// not deselecting
    multiselect.selectByIndex(1);
    multiselect.selectByIndex(4);
	}

}
