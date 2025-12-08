package com.example.selenium_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextExample {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.wikipedia.org/");
        driver.findElement(By.linkText("English")).click();
        System.out.println("Clicked using LinkText: English");

        Thread.sleep(2000);
        driver.findElement(By.partialLinkText("Donate")).click();
        System.out.println("Clicked using PartialLinkText: Donate");

        Thread.sleep(2000);

        driver.quit();
    }
}
