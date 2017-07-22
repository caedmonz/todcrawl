package com.todcrawl.network.driver;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Test DriverFactory
 * @author: zhangqinghua
 * @date: 2017/7/22
 */
public class DriverFactoryTest extends TestCase {
    private static final DriverFactory DRIVER_FACTORY = new DriverFactory();

    private static final Logger logger = LoggerFactory.getLogger(DriverFactoryTest.class);

    @Test
    public void testNewChromeDriver() {
        WebDriver webDriver = DRIVER_FACTORY.newChromeDriver();
        webDriver.navigate().to("http://www.baidu.com");
        String title = webDriver.getTitle();
        webDriver.close();
        logger.info("http://www.baidu.com title 百度一下，你就知道");
        Assert.assertEquals("百度一下，你就知道", title);
    }
}