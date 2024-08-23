package org.wi;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wiki {

	public static void main(String[] args) {

		WebDriver chromeDriver = new ChromeDriver();
		chromeDriver.navigate().to("https://www.wikipedia.org/");
		chromeDriver.manage().window().maximize();
		chromeDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Searching Artificial Intelligence 
		chromeDriver.findElement(By.cssSelector("input#searchInput")).sendKeys("Artificial Intelligence",Keys.ENTER);
		//Clicking on History from the section
		chromeDriver.findElement(By.xpath("//span[text()='History']")).click();
		//Getting the tile of the section and printing
		String text = chromeDriver.findElement(By.id("History")).getText();
		System.out.println(text);
	}

}
