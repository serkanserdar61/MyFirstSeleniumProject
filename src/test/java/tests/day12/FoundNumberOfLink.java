package tests.day12;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class FoundNumberOfLink {
    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.qaclickacademy.com/practice.php");
      //it runs and print every link on the page
        System.out.println(driver.findElements(By.tagName("a")).size());
        //it represent footer part at the end of page
        WebElement footer=  driver.findElement(By.id("gf-BIG"));
        //its show us all link in the footer
        System.out.println(footer.findElements(By.tagName("a")).size());

          //find first column in the footer
        WebElement countelementinthefirstcoulumn= footer.findElement(By.xpath("//td[1]//ul[1]"));
        //get size for first column in the footer
        System.out.println(countelementinthefirstcoulumn.findElements(By.tagName("a")).size());

        for(int i=1;i<countelementinthefirstcoulumn.findElements(By.tagName("a")).size();i++) {
            //its click each clickable button with new tab
            String clickeachone = Keys.chord(Keys.CONTROL, Keys.ENTER);
            countelementinthefirstcoulumn.findElements(By.tagName("a")).get(i).sendKeys(clickeachone);
            Thread.sleep(3);
        }

            Set<String> abc=driver.getWindowHandles();
            Iterator<String>it=abc.iterator();

            while(it.hasNext()){//has next means while next window present or not
                driver.switchTo().window(it.next());//switch window
                System.out.println(driver.getTitle());//print each title for each link
            }
        }
        }
