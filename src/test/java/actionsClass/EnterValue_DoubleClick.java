package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class EnterValue_DoubleClick {

	public static void main(String[] args) {
		WebDriver oBrowser = null;
		Actions oAction=null;
		
		try {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Library\\drivers\\chromedriver.exe");
			oBrowser= new ChromeDriver();
			oBrowser.manage().window().maximize();
			oBrowser.navigate().to("http://localhost:8080/login.do");
			Thread.sleep(2000);
			
			oAction= new Actions(oBrowser);
			WebElement objUserName = oBrowser.findElement(By.xpath("//input[@id='username']"));
			oAction.moveToElement(objUserName).perform();
			oAction.sendKeys(objUserName, "admin").perform();
			
			WebElement objPassword = oBrowser.findElement(By.xpath("//input[@type='password']"));
			oAction.moveToElement(objPassword).perform();
			oAction.sendKeys(objPassword, "manager").perform();
			
			oAction.doubleClick(objUserName).perform();
			
			oAction.contextClick(objUserName).perform();
			
			oAction.click(oBrowser.findElement(By.xpath("//a[@id='loginButton']"))).perform();
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
		finally {
		
			oBrowser=null;
		
		}

	}

}
