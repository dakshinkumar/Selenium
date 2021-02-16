package selenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Scanner;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;


public class OpenGoo {

public static void main(String[] args) throws InterruptedException, Exception {
		System.setProperty("webdriver.chrome.driver","/home/dakshinkumartk/Videos/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);    
        driver.get("https://portal.urjanet.net");
        //search some
        driver.findElement(By.name("username")).sendKeys("dakshin.kumaran");
        driver.findElement(By.name("password")).sendKeys("*********"+Keys.ENTER);
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter Access channel");
        String userName = myObj.nextLine();
       // String strMain = "Strongroom_20443-ShifflettsWasteServicesVA_1,Goby_25010-CityOfBridgeportTX_1,RealPage_29943-NorthlandCommunications_1";
	    String strMain = userName;
	    String[] arrSplit = strMain.split(",");
	    for (int i=0; i < arrSplit.length; i++)
	    {
	           String[] brrSplit = arrSplit[i].split("_");
        
        driver.findElement(By.xpath("//*[@id=\'s2id_customerSelect\']/a")).click();
        driver.findElement(By.xpath("//*[@id='select2-drop']/div/input")).sendKeys(brrSplit[0]+Keys.ENTER);
        Thread.sleep(15000);
        if(i==0) {
        driver.findElement(By.linkText("manage")).click();
        driver.findElement(By.linkText("credentials")).click();
        Thread.sleep(15000);
        driver.findElement(By.xpath("(//*[@class='form-control'])")).click();
        driver.findElement(By.xpath("//*[@id=\'credentialTbl_wrapper\']/div[1]/div[1]/div/div/div[1]/div[2]/select/option[2]")).click();
        driver.findElement(By.xpath("(//*[@class='form-control'])[2]")).click();
        //Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@value='extractionChannelId']")).click();
        }
        WebElement names = driver.findElement(By.xpath("//*[@id=\"credentialTbl_wrapper\"]/div[1]/div[1]/div/div/div[2]/div[1]/div/div[3]/div[1]/input"));
        names.clear();
        names.sendKeys(arrSplit[i]);
        
        driver.findElement(By.xpath("//*[@class='glyphicon glyphicon-filter']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\'credentialTbl\']/tbody/tr/td[1]/input")).click();
        driver.findElement(By.id("editAccessChannelBtn")).click();
        
        //Thread.sleep(2000);
        WebElement sel = driver.findElement(By.xpath("//*[@id=\'staging_input\']"));
        boolean staging=sel.isSelected();
        System.out.println("Access channel is " +arrSplit[i]);
        System.out.println("Staging is "+staging);
        WebElement just = driver.findElement(By.xpath("//*[@id='production_input']"));
        boolean production = just.isSelected();
        System.out.println("Production is "+production);
        String name = driver.findElement(By.xpath("//*[@id=\'provider_select\']")).getAttribute("originalvalue");
        System.out.println("Provider name is "+name);
        
        Thread.sleep(2000);
             //Captured the home page of the website using Ashot
      		//Screenshot s = new AShot().takeScreenshot(driver);
      		
      		//call the screenshot method and save the captured Image in the given path
      		//ImageIO.write(s.getImage(),"PNG",new File("/home/dakshinkumartk/Videos/access.png"));
        driver.findElement(By.xpath("//*[@id=\'createOrUpdateCredentialModal\']/div/div/div[1]/button/span[1]")).click();
        if (i==0) {
      	driver.findElement(By.xpath("//*[@id=\'global-msgs\']/div/a")).click();	
        }
	}
driver.close();
}			
	}
