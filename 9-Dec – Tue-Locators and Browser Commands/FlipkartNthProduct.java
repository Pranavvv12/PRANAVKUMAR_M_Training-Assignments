
import java.time.Duration;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlipkartNthProduct {

    public static void main(String[] args) throws InterruptedException {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product name (Laptop / TV / Smart Phone): ");
        String productName = sc.nextLine();

        System.out.println("Enter Nth product number: ");
        int n = sc.nextInt();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.flipkart.com/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//span[contains(text(),'✕') or contains(text(),'Login')]/ancestor::button"))).click();
        } catch (Exception e) {
            System.out.println("Popup not displayed");
        }

        WebElement searchBox = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[placeholder*='Search']")));

        searchBox.sendKeys(productName + Keys.ENTER);

        Thread.sleep(3000);

        List<WebElement> products = driver.findElements(By.cssSelector("div._4rR01T, a.s1Q9rs"));

        System.out.println("\nTotal products found: " + products.size());

        if (n > products.size()) {
            System.out.println("Requested product number not available.");
        } else {
            System.out.println("\n🔹 The " + n + "th product for '" + productName + "' is:");
            System.out.println("➡ " + products.get(n - 1).getText());
        }

        driver.quit();
    }
}
