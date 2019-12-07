package tests.day11;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class handleWindows {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://accounts.google.com/signup");
        driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div[1]/p/a")).click();
        System.out.println(driver.getTitle());
        Set<String> ids = driver.getWindowHandles();
        Iterator<String> it = ids.iterator();
        String parentid = it.next();
        String childid = it.next();
        driver.switchTo().window(childid);
        System.out.println(driver.getTitle());
    }
}
