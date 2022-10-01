package com.AutomateWebApp2.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CartTest {
	 WebDriver driver;
		@Test
		public void FlipcartCartTest() {
			
			driver.get("https://www.flipkart.com/apple-iphone-11-black-128-gb/p/itm8244e8d955aba?pid=MOBFWQ6BKRYBP5X8&lid=LSTMOBFWQ6BKRYBP5X8IBG6BS&marketplace=FLIPKART&q=Apple+iphone&store=tyy%2F4io&srno=s_1_1&otracker=search&otracker1=search&fm=Search&iid=ee25f413-4209-4aaa-98cf-dd43894ebbb7.MOBFWQ6BKRYBP5X8.SEARCH&ppt=hp&ppn=homepage&ssid=tqyptedxi80000001664517670427&qH=fb6049026448a656");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button")).click();
		}
		@BeforeMethod
		public void beforeMethod() {
			
			System.setProperty("webdriver.chrome.driver", "D:\\\\\\\\Testing_1\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
			driver= new ChromeDriver();
		}
		@AfterMethod
		public void afterMethod() {
			//driver.close();
			driver=null;
		}
		
}
