package tests.day7;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class parentchildrelationship {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://login.salesforce.com/");
        Thread.sleep(3000);
        driver.findElement(By.id("username")).sendKeys("serkanserdar@gmail.com");
    }

}
