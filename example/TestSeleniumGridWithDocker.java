package example;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class TestSeleniumGridWithDocker {
	RemoteWebDriver driver = null;	
	@Test
	public void setUpChrome() throws MalformedURLException {
		DesiredCapabilities cap = DesiredCapabilities.chrome();		
		driver = new RemoteWebDriver(new URL("http://172.25.33.21:8888/wd/hub"), cap);
		System.out.println("Started chrome browser");
		gmailTest(driver);
		driver.quit();
	}

	@Test
	public void setUpFirefox() throws MalformedURLException {
		DesiredCapabilities cap = DesiredCapabilities.firefox();
		driver = new RemoteWebDriver(new URL("http://172.25.33.21:8888/wd/hub"), cap);
		System.out.println("Started firefox browser");
		gmailTest(driver);
		driver.quit();
	}
	
	public void gmailTest(RemoteWebDriver driver) {
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Gmail']")).click();
		System.out.println(driver.getTitle());
	}

}
