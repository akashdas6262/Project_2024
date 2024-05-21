package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Dropable {


    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://jqueryui.com/demos/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@href=\"https://jqueryui.com/droppable/\"]")).click();
        //Switch to frame
        WebElement frame1 = driver.findElement(By.xpath("//iframe[@class=\"demo-frame\"]"));
        driver.switchTo().frame(frame1);




        //Code------------------------------------------------------------

        WebElement Item1 = driver.findElement(By.id("draggable"));
        Actions action = new Actions(driver);
        action.moveToElement(Item1).build().perform();
        WebElement Item2 = driver.findElement(By.id("droppable"));
        action.dragAndDrop(Item1, Item2).build().perform();
        System.out.println("Successfully draged");
        driver.quit();
        //Code------------------------------------------------------------
    }


}
