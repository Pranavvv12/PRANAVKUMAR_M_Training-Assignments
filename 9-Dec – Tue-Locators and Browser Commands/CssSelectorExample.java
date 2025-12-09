package testngsamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorExample {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.automationtesting.in/Register.html");
        driver.findElement(By.cssSelector("#firstpassword")).sendKeys("mypassword");
        driver.findElement(By.cssSelector(".form-control")).sendKeys("Pranav");
        System.out.println("CSS Selector Execution Completed");
        driver.quit();
    }
}
