package tests.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findById {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver=new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/forgot_password");
        String expectedTitle=driver.getTitle();

        WebElement button=driver.findElement(By.id("form_submit"));
        button.click();
        String actualTitle=driver.getTitle();
        if(actualTitle.equals((expectedTitle))){
            System.out.println("Test passed");
        }
        else{
            System.out.println("Test fail");
            System.out.println("Expected title is "+expectedTitle);
            System.out.println("Actual title is "+actualTitle);
        }
       Thread.sleep(2000);
        driver.close();




    }
}




