package tests.day10;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class ImplicitAndExplicitWait {

    public static void main(String[] args) throws InterruptedException {
        //implicit wait
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://alaskatrips.poweredbygps.com/g/pt/vacationpackages?MDPCID=ALASKA-US.TPS.BRAND.VACATIONPACKAGES.PACKAGE");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.id("FH-origin")).sendKeys("nyc");
        driver.findElement(By.id("FH-origin")).sendKeys(Keys.TAB);
        driver.findElement(By.id("FH-destination")).sendKeys("Disneyland");
        driver.findElement(By.id("FH-searchButtonExt1")).click();
        //explicit wait
        WebDriverWait wait=new WebDriverWait(driver,10);
        //if I use wait it is gonna wait until 10 second.cause wait releated with explicit wait
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id='result0']/a")))).click();
        //if I use driver it is gonna wait until 5 second.cause driver releated with implicit wait
        driver.findElement(By.xpath("//*[@id='result0']/a")).click();
        driver.close();
    }
}

