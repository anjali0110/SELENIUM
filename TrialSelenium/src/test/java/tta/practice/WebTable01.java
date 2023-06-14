package tta.practice;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class WebTable01 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver dr = new FirefoxDriver();
        String URL = "https://awesomeqa.com/webtable.html";
        dr.get(URL);
        dr.manage().window().maximize();

        //   //table[contains(@id,"cust")]/tbody/tr -Row-7(1 ignore -> header)
           //table[contains(@id,"cust")]/tbody/tr[2]/td - col-3
        int row = dr.findElements(By.xpath("//table[contains(@id,\"cust\")]/tbody/tr")).size();
        int col = dr.findElements(By.xpath("//table[contains(@id,\"cust\")]/tbody/tr[2]/td")).size();

        System.out.println(row);
        System.out.println(col);

        String part1 = "//table[contains(@id,\"cust\")]/tbody/tr[";
        String part2 = "]/td[";
        String part3 = "]";


        for (int i=2; i<= row ; i++){
            for (int j=1; j< col; j++){


                String dynamic_xpath = part1+i+part2+j+part3;
                String data = dr.findElement(By.xpath(dynamic_xpath)).getText();
                System.out.println(data+"\t");
                if(data.contains("Helen Bennett")){

                    String new_dynamic_path = dynamic_xpath+"/following-sibling::td";
                    String country_text = dr.findElement(By.xpath(new_dynamic_path)).getText();
                    System.out.println("----------------");
                    System.out.println("Helen Bennett is  In -" + country_text);

                }
            }
        }
        dr.get("https://awesomeqa.com/webtable.html");
        WebElement table = (WebElement) dr.findElements(By.xpath("//table[@summary=\"sample Table\"]/tbody"));
        List<WebElement> row_tables= table.findElements(By.tagName("tr"));
          for (WebElement rowTable : row_tables){
              List<WebElement> col_table = rowTable.findElements(By.tagName("td"));
                 for(WebElement element : col_table){
                    System.out.println(element.getText());
               }
        }

        Thread.sleep(1000);
        dr.close();



    }
}
