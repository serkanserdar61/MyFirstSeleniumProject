package tests.day9;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("/html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]/form/input")).click();
        Thread.sleep(2000);
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
        driver.switchTo().alert().dismiss();
        //for Alert pop up we have to use switchTo and Alert
        //Accept=ok,yes,done
        //dismiss=no
    }
}
