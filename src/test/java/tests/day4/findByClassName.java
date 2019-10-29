package tests.day4;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class findByClassName {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.get("http://practice.cybertekschool.com/multiple_buttons");
        Thread.sleep(2000);
        WebElement heading=driver.findElement(By.className("h3"));
        System.out.println(heading.getText());
        driver.close();

    }
}


