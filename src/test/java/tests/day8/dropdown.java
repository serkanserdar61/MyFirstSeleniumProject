package tests.day8;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.aa.com/homePage.do");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        Select option=new Select(driver.findElement(By.id("flightSearchForm.adultOrSeniorPassengerCount")));
        option.selectByValue("2");
        option.selectByIndex(5);

        //option.deselectByVisibleText();if there is any string inside you can use this one.

    }
}
