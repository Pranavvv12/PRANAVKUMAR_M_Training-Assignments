import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioCheckBoxDemo {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.xpath("//input[@value='radio1']")).click();
        System.out.println("Radio Button 1 Selected");
        Thread.sleep(1000);
        driver.findElement(By.id("checkBoxOption1")).click();
        System.out.println("Checkbox 1 Selected");
        Thread.sleep(1000);
        driver.findElement(By.id("checkBoxOption2")).click();
        System.out.println("Checkbox 2 Selected");

        Thread.sleep(2000);

        // Close Browser
        driver.quit();
    }
}
