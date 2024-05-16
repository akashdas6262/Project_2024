import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class test {




@Test
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.myntra.com/");
        driver.manage().window().maximize();
        String s = driver.getTitle();
        System.out.println(s);
        System.out.println("okok");
        driver.quit();
        System.out.println("Git Test");
    }

}
