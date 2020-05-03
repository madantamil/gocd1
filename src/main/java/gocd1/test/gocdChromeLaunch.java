package gocd1.test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class gocdChromeLaunch {
	
	public RemoteWebDriver driver;

	@Test
	public void execute() {

		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.gocd.org/");
		driver.manage().window().maximize();
		System.out.println("gocd site launch");
		

	}


}
