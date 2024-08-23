package org.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {

			WebDriver driver = new ChromeDriver();
			driver.get("https://www.demoblaze.com/");
			driver.manage().window().maximize();
			
			String title = driver.getTitle();
			String tit="STORE";
			if (tit.equals(title))
				System.out.println("Page landed on correct website");
			else
				System.out.println("Page not landed on correct website");
	}

}
