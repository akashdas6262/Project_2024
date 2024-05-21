package SeleniumConcepts;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class DatePicker {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://jqueryui.com/demos/");
        driver.manage().window().maximize();
        Thread.sleep(2000);


        WebElement scroll = driver.findElement(By.xpath("//a[@href=\"https://jqueryui.com/tooltip/\"]"));//u can use By.xpath or By.id here
        Actions actions = new Actions(driver);
        actions.moveToElement(scroll);

        driver.findElement(By.xpath("//a[@href=\"https://jqueryui.com/datepicker/\"]")).click();

        //Switch to frame
        WebElement frame1 = driver.findElement(By.xpath("//iframe[@class=\"demo-frame\"]"));
        driver.switchTo().frame(frame1);


        //Using sendkeys
//        driver.findElement(By.xpath("//input[@id=\"datepicker\"]")).sendKeys("05/22/2024");

//        Using While loop

        String Year = "2025";
        String Month = "September";
        String Date = "3";

        driver.findElement(By.xpath("//input[@id=\"datepicker\"]")).click();
        while (true) {
            String currentMonth = driver.findElement(By.xpath("//span[@class=\"ui-datepicker-month\"]")).getText();
            String currentYear = driver.findElement(By.xpath("//span[@class=\"ui-datepicker-year\"]")).getText();

            if (currentYear.equals(Year) && currentMonth.equals(Month)) {
                break;
            }
            driver.findElement(By.xpath("//span[@class=\"ui-icon ui-icon-circle-triangle-e\"]")).click();
        }


        List<WebElement> dates = driver.findElements(By.xpath("//table[@class=\"ui-datepicker-calendar\"]//tr//td//a"));

        for (WebElement inputdate : dates) {
            if (inputdate.getText().equals(Date)) {
                inputdate.click();
                break;
            }
        }


    }

}
