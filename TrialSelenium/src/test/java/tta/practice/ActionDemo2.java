package tta.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class ActionDemo2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.makemytrip.com/");

        Thread.sleep(5000);


        WebElement fromCity = driver.findElement(By.id("fromCity"));
        //fromCity.sendKeys("New Delhi");
        // move to element -> enter -> ul->li getText New -> select

        Actions actions = new Actions(driver);
        actions.moveToElement(fromCity).click().sendKeys("New Delhi,India").build().perform();
        List<WebElement> list = (List<WebElement>) driver.findElement(By.xpath("//ul[@class='react-autosuggest_suggestion-list']/li"));


        for (WebElement element : list){

            if(element.getText().contains("New Delhi")){
                 element.click();
                 break;


            }
        }


    }}