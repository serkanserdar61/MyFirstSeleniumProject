package tests.day8;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class dropdown2{


public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.united.com/en/us");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.id("bookFlightModel.passengers")).click();






/*int i=1;
while(i<6){
    driver.findElement(By.className("ui-spinner-button ui-spinner-up ui-corner-tr")).click();
    i++;*/
for(int i=1;i<5;i++){
    driver.findElement(By.id("NumOfAdults plusBtn")).click();
}

driver.close();


 }
}