package tta.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDemo {
    public static void main(String[] args) {


//        ChromeOptions options = new ChromeOptions();
//        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.spicejet.com");

        Actions actions = new  Actions(driver);
        actions.moveToElement(driver.findElement((By.xpath("//div[@data-testid=\"to-testID-origin\"]/div/div/input")))).click().perform();

    }
}
