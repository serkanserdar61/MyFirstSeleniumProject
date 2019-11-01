package tests.day6;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class rediff {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("http://rediff.com");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@class='signin']")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("input[id*='login1']")).sendKeys("serkanserdar61@gmail.com");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[contains(@id,'passwo')]")).sendKeys("122345");
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("input[name*='proceed']")).click();
        driver.close();
    }
}
