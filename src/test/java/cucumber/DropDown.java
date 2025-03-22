package cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/Deekshith/eclipse-workspace/vedhandh_api/src/test/resources/chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement usernameElement= driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[13]/td[1]/font/b"));
		
		js.executeScript("arguments[0].scrollIntoView({ behavior: 'smooth', block: 'center' });", usernameElement);

       Select dd= new Select(driver.findElement(By.xpath("//select[@name='country']")));
       
       dd.selectByVisibleText("HAITI");
		
		
	}

}
