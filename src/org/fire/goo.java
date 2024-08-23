package org.fire;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class goo {

	public static void main(String[] args) throws InterruptedException {

		//FirefoxDriver() is opened fireFox browser
		WebDriver driver = new FirefoxDriver();
		//navigate() method is used to  open the URL
		driver.navigate().to("http://google.com");
		//getCurrentUrl() method is used to get current URL
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		//used to maximize the window of the page
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		//refresh() method is used to refresh the page
		driver.navigate().refresh();
		//close() method is used to close the current browser
		driver.close();
		
	}

}
