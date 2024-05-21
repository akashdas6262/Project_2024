package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.Iterator;
import java.util.List;

public class Selectable {




    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://jqueryui.com/demos/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@href=\"https://jqueryui.com/selectable/\"]")).click();
        //Switch to frame
        WebElement frame1 = driver.findElement(By.xpath("//iframe[@class=\"demo-frame\"]"));
        driver.switchTo().frame(frame1);

        //Code------------------------------------------------------------

        List<WebElement> list = driver.findElements(By.xpath("//ol[@class=\"ui-selectable\"]/li"));

        for (WebElement webElement : list) {
            String names= webElement.getAttribute("textContent");
            System.out.println(names);
            webElement.click();
        }
        //Code------------------------------------------------------------
        driver.quit();
    }


}
