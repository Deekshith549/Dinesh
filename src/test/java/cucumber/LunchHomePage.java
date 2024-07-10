package cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LunchHomePage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", "C:/Users/Deekshith/eclipse-workspace/vedhandh_api/src/test/resources/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.discoveryplus.in/");
		Thread.sleep(10000);
		
		
		driver.findElement(By.xpath("//div[@id=\"#signIn\"]")).click();
		//driver.findElements(By.XPath("//input[@id=\"searchInput\"]")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@id=\"mobileNumber\"]")).sendKeys("8466025146");
		
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		Thread.sleep(5000);
		boolean  flag =driver.findElement(By.xpath("//span[contains(text(), '564763247839An OTP has been sent to')]")).isDisplayed();
	
		
		Assert.assertTrue(flag, "element not displayed");
		
	if(flag) {
		System.out.println("pass");
		}else {
		System.out.println("failed");
			
		}
		
		driver.close();
	
	}

}
