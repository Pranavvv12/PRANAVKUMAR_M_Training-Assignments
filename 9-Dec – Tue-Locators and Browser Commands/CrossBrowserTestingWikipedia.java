
import java.util.Scanner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CrossBrowserTestingWikipedia{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter browser name (Chrome/Firefox/Edge): ");
        String browser = sc.nextLine();

        WebDriver driver = null;

        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } 
        else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } 
        else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } 
        else {
            System.out.println("Invalid browser name");
            System.exit(0);
        }

        driver.manage().window().maximize();
        driver.get("https://www.wikipedia.org/");
        System.out.println("Page Title: " + driver.getTitle());

        driver.quit();
    }
}
