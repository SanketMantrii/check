package org.example;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppTest {
    @Test
    public void abc() {
        System.setProperty("webdriver.chrome.driver", "/Users/sanketmantri/Downloads/chromedriver_mac_arm64/chromedriver");
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
