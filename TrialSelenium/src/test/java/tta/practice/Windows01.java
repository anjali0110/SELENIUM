package tta.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Set;

public class Windows01 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://the-internet.herokuapp.com/windows");
        //window->1

        String parentHandle = driver.getWindowHandle();
        System.out.println(parentHandle);


        driver.findElement(By.xpath("//a[text()=\"Click Here\"]")).click();
        Set<String> windowHandle = driver.getWindowHandles();

        for(String handle : windowHandle){

            driver.switchTo().window(handle);
            if(driver.getPageSource().contains("New Window")){
                System.out.println("found it");


            }
        }




        }


}
