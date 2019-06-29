package com.mulugetaewnu;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Main {
    //change this
    private static final String USERNAME = "mulugetaewnu1@gmail.com";
    private static final String PASSWORD = "";

    public static void main(String[] args) throws InterruptedException {
// Create a new instance of the Chrome driver
        System.setProperty("webdriver.chrome.driver", "/home/Gecko/chromedriver");
        WebDriver driver;
        driver = new ChromeDriver();
        //Launch the some site
        driver.get("http://mail.google.com");
        // Print a Log In message to the screen
        driver.findElement(By.name("identifier")).clear();
        driver.findElement(By.name("identifier")).sendKeys(USERNAME, Keys.ENTER);
        Thread.sleep(1000);
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys(PASSWORD, Keys.ENTER);
        Thread.sleep(5000);
        String numb = driver.findElement(By.className("bsU")).getText();
        System.out.println("the unreadmessage is :" + numb);
        Thread.sleep(1000);
        // Close the driver
        driver.quit();
    }
}
