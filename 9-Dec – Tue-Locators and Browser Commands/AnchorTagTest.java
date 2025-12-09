package testngsamples;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AnchorTagTest {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.selenium.dev/");

        List<WebElement> links = driver.findElements(By.tagName("a"));

        System.out.println("Total Links: " + links.size());

        for (WebElement link : links) {
            System.out.println(link.getAttribute("href"));
        }

        driver.quit();
    }
}
