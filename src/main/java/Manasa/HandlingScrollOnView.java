package Manasa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingScrollOnView {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pc\\eclipse-workspace\\cts-selenium-project\\src\\test\\resources\\binaries\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();


		/*JavascriptExecutor js=(JavascriptExecutor)driver;

		WebElement element=driver.findElement(By.xpath("//div[@id='mCSB_3_container']//p[contains(text(),'Excepteur sint occaecat cupidatat non proident, su')]"));

		Thread.sleep(1000);

		js.executeScript("arguments[0].scrollIntoView(true);", element);

		System.out.println(element.getText());
		}
*/
	}
}
