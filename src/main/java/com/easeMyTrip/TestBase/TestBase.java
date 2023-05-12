package com.easeMyTrip.TestBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	
	
	public TestBase() {
		prop=new Properties();
 			FileInputStream fs;
			try {
				fs = new FileInputStream("D:\\workspace1\\assignment\\HomeTest\\src\\main\\java\\com\\easeMyTrip\\config\\config.properties");
 					prop.load(fs);
				} catch (FileNotFoundException e) {
 					e.printStackTrace();
				

			} catch (IOException e) {
 				e.printStackTrace();
			}
 
	}	
	public static void initialization() throws InterruptedException {
		String browserName =prop.getProperty("browser");
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver=new ChromeDriver(options);
		driver.manage().window().maximize();
 		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(prop.getProperty("url"));
 		
 
 		
		
		
	}
	

}
