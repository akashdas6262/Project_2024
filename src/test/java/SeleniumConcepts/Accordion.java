package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Accordion {


    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://jqueryui.com/demos/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@href=\"https://jqueryui.com/accordion/\"]")).click();
        driver.findElement(By.xpath("//a[text()='Collapse content']")).click();

        //Switch to frame
        WebElement frame1 = driver.findElement(By.xpath("//iframe[@class=\"demo-frame\"]"));
        driver.switchTo().frame(frame1);

        //Code------------------------------------------------------------
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
        int count = 0;

        List<WebElement> AccordList = driver.findElements(By.xpath("//div[@id=\"accordion\"]/h3"));
        while (AccordList.iterator().hasNext()) {
            Set<String> strings = new HashSet<>();
            for (WebElement object : AccordList) {
                String text = object.getText();
                if (!text.isEmpty())
                    strings.add(text);
                object.click();
            }
            System.out.println(strings);
        }
//        for (WebElement list : AccordList) {
//            list.click();
//
//            count++;
//            int number = count;
//            String s = String.valueOf(number);
//            String para = driver.findElement(By.xpath("//div[@class=\"ui-accordion-content ui-corner-bottom " +
//                    "ui-helper-reset ui-widget-content ui-accordion-content-active\"]")).getText();
//            System.out.println(s + " ---> " + para);
//        }

//        for (int i = 0; i <= AccordList.size(); i++) {
//            WebElement List = AccordList.get(i);
//            List.click();
//            count++;
//            int number = count;
//            String s = String.valueOf(number);
//            String para = driver.findElement(By.xpath("//div[@class=\"ui-accordion-content ui-corner-bottom " +
//                    "ui-helper-reset ui-widget-content ui-accordion-content-active\"]")).getText();
//            System.out.println(s + " ---> " + para);
//
//        }
        driver.quit();
        //Code------------------------------------------------------------

    }
}
