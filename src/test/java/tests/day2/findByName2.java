package tests.day2;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class findByName2 {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/sign_up");

        WebElement input=driver.findElement(By.name("full_name"));
        input.sendKeys("serkan");
        //driver.findElement(By.name("full_name")).sendKeys("serkan");
        Thread.sleep(2000);
        WebElement input2=driver.findElement(By.name("email"));
        input2.sendKeys("serkanserdar61@gmail.com");
        //driver.findElement(By.name("email")).sendKeys("serkanserdar61@gmail.com");
        Thread.sleep(2000);
        WebElement input3=driver.findElement(By.name("wooden_spoon"));
        input3.click();
    }
}


