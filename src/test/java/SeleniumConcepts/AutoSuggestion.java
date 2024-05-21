package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class AutoSuggestion {

    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new FirefoxDriver();
        driver.get("https://jqueryui.com/demos/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@href=\"https://jqueryui.com/autocomplete/\"]")).click();

        //Switch to frame
        WebElement frame1 = driver.findElement(By.xpath("//iframe[@class=\"demo-frame\"]"));
        driver.switchTo().frame(frame1);

        driver.findElement(By.xpath("//input[@id=\"tags\"]")).sendKeys("a");
        Thread.sleep(2000);


        List<WebElement> suggestionList = driver.findElements(By.xpath("//ul[@class=\"ui-menu ui-widget ui-widget-content ui-autocomplete ui-front\"]/li"));

        for (WebElement list : suggestionList) {
            System.out.println(list.getText());

            if (list.getText().equalsIgnoreCase("Asp")) {
                list.click();
            }

        }
        driver.quit();
    }


}
//ul[@class="ui-menu ui-widget ui-widget-content ui-autocomplete ui-front"]/li