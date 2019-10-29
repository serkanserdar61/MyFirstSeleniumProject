package tests.day5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class findByLinkTest2 {


        public static void main(String[] args) throws InterruptedException {
            WebDriverManager.chromedriver().setup();
            ChromeDriver driver=new ChromeDriver();
            driver.manage().window().maximize();
            Thread.sleep(2000);
            driver.get("https://b2bcabinet.com/");
            Thread.sleep(2000);
           WebElement text= driver.findElement(By.linkText("<span class=\"hvr-underline-from-left-dark\">HOME</span>"));
            System.out.println(text.getText());
            driver.close();
//jbjkewkllwc;a/
}
}