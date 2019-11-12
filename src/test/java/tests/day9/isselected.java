package tests.day9;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class isselected {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.spicejet.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
        driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
        System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
        //isselected means did you marked it or not?
        System.out.println(driver.findElements(By.cssSelector("input[type*='checkbox']")).size());
    }
}
