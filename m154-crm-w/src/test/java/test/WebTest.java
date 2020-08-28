package test;



import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebTest {

	@Test
	public void test() {
		// System.setProperty("webdriver.ie.driver", "C:/dev/IEDriverServer.exe");
		// InternetExplorerOptions options = new InternetExplorerOptions();
		// WebDriver driver=new InternetExplorerDriver(options);

		System.setProperty("webdriver.chrome.driver", "C:/Tools/ChromeDriver/chromedriver_win32/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		WebDriver driver = new ChromeDriver(options);

		// driver.manage().window().maximize();

		driver.get("localhost:7070/products");

		WebElement searchText = driver.findElement(By.name("description"));
		searchText.sendKeys("Kiste");

		searchText.submit();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {

		}

		WebElement searchProduct = driver.findElement(By.name("id"));
		searchProduct.sendKeys("0");
		searchProduct.submit();

		boolean isProduct = driver.getPageSource().contains("Kiste");

		Assert.assertTrue(isProduct);

		driver.close();
	}

}
