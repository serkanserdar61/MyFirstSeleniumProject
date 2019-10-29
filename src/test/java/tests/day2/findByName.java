package tests.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findByName {


        public static void main(String[] args) throws InterruptedException {


            WebDriverManager.chromedriver().setup();
            ChromeDriver driver=new ChromeDriver();
            driver.get("https://citiretailservices.citibankonline.com/RSnextgen/svc/launch/index.action?siteId=PLCN_HOMEDEPOT#signon");
            Thread.sleep(2000);
            driver.manage().window().maximize();
            Thread.sleep(2000);
            WebElement input=driver.findElement(By.name("userId"));
            input.sendKeys("serkanserdar61@gmail.com");
            Thread.sleep(2000);
            WebElement input2=driver.findElement(By.name("password"));
            input2.sendKeys("serkan615534");
            Thread.sleep(2000);
            WebElement button=driver.findElement(By.className("featured"));
            button.click();



        }
    }





