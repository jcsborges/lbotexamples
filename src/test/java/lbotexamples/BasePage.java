package lbotexamples;

import org.openqa.selenium.chrome.ChromeDriver;

public abstract class BasePage {
	
	private ChromeDriver driver = null;
	
	public BasePage() {
		System.setProperty("webdriver.chrome.driver", "/Users/zeca/projetos/testePython/chromedriver");
	}

	public ChromeDriver getDriver() {
		if(driver == null)
			driver = new ChromeDriver();  
		
		return driver;
	}
	
	public void quit() {
		driver.quit();
	}
	public abstract String getURL();
}
