package org.selinium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "F:\\Users\\admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.redbus.in/");
	driver.close();
	
}
}
