package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class helloSelenium {



    @Test
    public void testHello(){
        WebDriver driver = new FirefoxDriver();
         driver.get("https://www.google.com");


    }
}
