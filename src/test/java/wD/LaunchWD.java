package wD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchWD {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		Thread.sleep(2000);
		driver.get("https://www.kopykitab.com/index.php?route=account/login");
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("rlpawar");
		
		driver.quit();

	}

}
