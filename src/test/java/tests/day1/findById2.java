package tests.day1;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class findById2 {
    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/multiple_buttons");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        WebElement button=driver.findElement(By.id("disappearing_button"));
        button.click();
        Thread.sleep(2000);
        WebElement result=driver.findElement(By.id("result"));
        System.out.println(result.getText());
        Thread.sleep(2000);
        driver.close();

    }

}


