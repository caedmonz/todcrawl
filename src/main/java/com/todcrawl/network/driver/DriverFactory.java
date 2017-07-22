package com.todcrawl.network.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * Use selenium to control browser
 *
 * @author: zhangqinghua
 * @date: 2017/7/22
 */
@Service
public class DriverFactory {

    private static final String CHROME_DRIVER_PATH = "/driver/chromedriver";
    private static final String CHROME_DRIVER_SYSTEM_PROPERTY_NAME = "webdriver.chrome.driver";

    static {
        System.setProperty(CHROME_DRIVER_SYSTEM_PROPERTY_NAME, Class.class.getResource(CHROME_DRIVER_PATH).getPath());
    }

    /**
     * Instant a new driver of chrome
     * <p>
     * Chrome driver of platforms(mac, linux, windows) can be downloaded from
     * <a href="https://sites.google.com/a/chromium.org/chromedriver/downloads"
     * >ChromeDriver Website</a> The chromedriver address should be set as System
     * property <b>webdriver.chrome.driver</b>. And in this project, chrome driver
     * has been already acquired and locate in directory resources/driver
     *
     * @return webDriver instance
     */
    public WebDriver newChromeDriver() {
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return webDriver;
    }
}
