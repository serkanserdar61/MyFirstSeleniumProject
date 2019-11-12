package tests.day9;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestive {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.aircanada.com/ca/en/aco/home.html");
        driver.manage().window().maximize();
        WebElement element=driver.findElement(By.id("origin_R_0"));
        element.clear();
        element.sendKeys("Istanbul");
        Thread.sleep(2000);
        element.sendKeys(Keys.ENTER);
        WebElement element2=driver.findElement(By.id("destination_R_0"));
        element2.clear();
        element2.sendKeys("Atl");
        Thread.sleep(2000);
        element2.sendKeys(Keys.ARROW_DOWN);//when we enter "ATL" then 2 city pop up so we select second one.
        element2.sendKeys(Keys.ENTER);
    }
    }

