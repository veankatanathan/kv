package org.selinium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TodayClass {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Users\\admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get(" http://www.flipkart.com/");
	String url = driver.getCurrentUrl();
	System.out.println(url);
	String title = driver.getTitle();
	System.out.println(title);
	driver.close(); ;;
	
	}

	
}
