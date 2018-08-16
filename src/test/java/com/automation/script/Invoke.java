package com.automation.script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Invoke {

	@Test
	public void invokeBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\navin.kotamraju\\Desktop\\Jenkin_Git\\Integration\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com");
		System.out.println("url name...."+driver.getCurrentUrl());
		driver.quit();
	}

}
