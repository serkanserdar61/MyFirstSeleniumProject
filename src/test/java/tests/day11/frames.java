package tests.day11;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class frames {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");
        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));//big frame
        driver.findElement(By.id("draggable")).click();//small frame
        Actions a=new Actions(driver);
        WebElement source=driver.findElement(By.id("draggable"));
        WebElement target=driver.findElement(By.id("droppable"));

        a.dragAndDrop(source,target).build().perform();

    }
}
